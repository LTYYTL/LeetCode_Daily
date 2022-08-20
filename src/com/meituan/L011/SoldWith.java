package com.meituan.L011;

import java.io.*;
import java.util.PriorityQueue;

/**
 * meituan-011. 搭配出售
 * 服装店新进了 a 条领带，b 条裤子，c 个帽子，d 件衬衫，
 * 现在要把这些搭配起来售卖。有三种搭配方式，一条领带和一件衬衫，一条裤子和一件衬衫，一个帽子和一件衬衫。
 * 卖出一套领带加衬衫可以得到 e 元，卖出一套裤子加衬衫可以得到 f 元，卖出一套帽子加衬衫可以得到 g 元。现在你需要输出最大获利。
 *
 * 格式：
 * 输入：
 * - 一行 7 个整数分别表示 a, b, c, d, e, f, g 。
 * 输出：
 * - 最大获利。
 *
 * 示例：
 * 输入：2 3 4 5 6 7 8
 * 输出：39
 * 解释：4 个帽子加 4 件衬衫获利 32 元，1 条裤子加 1 件衬衫获利 7 元，一共得到 39 元。
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class SoldWith {
    /**
     * 方法：贪心算法
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //输入输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        //获取数据
        String[] data = reader.readLine().split(" ");
        long a = Long.parseLong(data[0]);
        long b = Long.parseLong(data[1]);
        long c = Long.parseLong(data[2]);
        long d = Long.parseLong(data[3]);
        long e = Long.parseLong(data[4]);
        long f = Long.parseLong(data[5]);
        long g = Long.parseLong(data[6]);

        //将数量和价格绑定
        PriorityQueue<long[]> queue = new PriorityQueue<>((o1, o2) -> (int) (o2[0] - o1[0]));
        queue.add(new long[]{e,a});
        queue.add(new long[]{f,b});
        queue.add(new long[]{g,c});

        //结果
        long max = 0;
        //衬衫都没有退出或者其他的都没有
        while (d > 0 && !queue.isEmpty()){
            //与衬衫组合价格最高的
            long[] cur = queue.poll();
            //查看当前的数量是否超过衬衫的数量
            if (d < cur[1])
                max += d * cur[0];//超过就是衬衫数量决定价格
            else
                max += cur[1] * cur[0];//没超过就有当前商品决定
            d -= cur[1];//组合后剩余的衬衫
        }

        writer.write(""+max);

        reader.close();
        writer.close();
    }
}
