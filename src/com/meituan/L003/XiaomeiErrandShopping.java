package com.meituan.L003;

import java.io.*;
import java.util.PriorityQueue;

/**
 * meituan-003. 小美的跑腿代购
 * 小美的一个兼职是美团的一名跑腿代购员，她有 n 个订单可以接，订单编号是 1~n ，
 * 但是因为订单的时效性，他只能选择其中 m 个订单接取，精明的小美当然希望自己总的获利是最大的，
 * 已知，一份订单会提供以下信息，跑腿价格 v ，商品重量 w kg，商品每重 1kg ，代购费用要加 2 元，而一份订单可以赚到的钱是跑腿价格和重量加价之和。
 * 小美可是开兰博基尼送货的人，所以自然不会在意自己会累这种事情。请问小美应该选择哪些订单，使得自己获得的钱最多。
 * 请你按照选择的订单编号的从小到大顺序，如果存在多种方案，输出订单编号字典序较小的方案。
 *
 * 格式：
 * 输入：
 * - 输入第一行包含两个正整数 n，m，表示订单的数量和小美可以接的订单数量。
 * - 接下来有 n 行，第 i 行表示 i-1 号订单的信息。每行有两个正整数 v 和 w  ，表示一个订单的跑腿价格和商品重量。
 * 输出：
 * - 输出包含 m 个 1~n 之间的正整数，中间用空格隔开，表示选择的订单编号。
 *
 * 示例：
 * 输入：
 *      5 2
 *      5 10
 *      8 9
 *      1 4
 *      7 9
 *      6 10
 * 输出：2 5
 *
 * 提示：
 * 1 <= n, m <= 10000
 * 1 <= v, w <= 1000
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class XiaomeiErrandShopping {
    /**
     * 方法：堆
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //输入、输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        //输入n，m。n为订单数，m为可接订单
        String[] data = reader.readLine().split(" ");
        int n = Integer.parseInt(data[0]), m = Integer.parseInt(data[1]);

        //优先队列，按照总金额从小到大排序，当金额相等时，按照编号排序
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1[0] == o2[0])
                return o1[1] - o2[1];
            return o2[0] - o1[0];
        });

        //输入订单金额和重量
        for (int i = 1; i <= n; i++) {
            String[] row = reader.readLine().split(" ");
            //金额
            int v = Integer.parseInt(row[0]);
            //重量
            int w = Integer.parseInt(row[1]);
            //总金额
            int price = v + w * 2;
            //加入队列
            queue.add(new int[]{price,i});
        }

        //获取前m个订单
        for (int i = 0; i < m; i++) {
            int[] res = queue.poll();
            writer.write(res[1] +" ");
        }

        //关闭输入输出流
        writer.close();
        reader.close();

    }
}
