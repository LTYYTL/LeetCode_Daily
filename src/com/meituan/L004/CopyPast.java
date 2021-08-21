package com.meituan.L004;

import java.io.*;

/**
 * meituan-004. 小团的复制粘贴
 * 小团是一个莫得感情的 CtrlCV 大师，他有一个下标从 1 开始的序列 A 和一个初始全部为 -1 序列 B ，两个序列的长度都是 n 。
 * 他会进行若干次操作，每一次操作，他都会选择 A 序列中一段连续区间，将其粘贴到 B 序列中的某一个连续的位置，在这个过程中他也会查询 B 序列中某一个位置上的值。
 * 我们用如下的方式表示他的粘贴操作和查询操作：
 * 粘贴操作：1 k x y，表示把 A 序列中从下标 x 位置开始的连续 k 个元素粘贴到 B 序列中从下标 y 开始的连续 k 个位置上。
 * 原始序列中的元素被覆盖。（数据保证不会出现粘贴后 k 个元素超出 B 序列原有长度的情况）
 * 查询操作：2 x，表示询问B序列下标 x 处的值是多少。
 *
 * 格式：
 * 输入：
 * - 输入第一行包含一个正整数 n ，表示序列 A 和序列 B 的长度。
 * - 输入第二行包含 n 个正整数，表示序列 A 中的 n 个元素，第 i 个数字表示下标为 i 的位置上的元素，每一个元素保证在 10^9 以内。
 * - 输入第三行是一个操作数 m ，表示进行的操作数量。
 * - 接下来 m 行，每行第一个数字为 1 或 2 ，具体操作细节详见题面。
 * 输出：
 * - 对于每一个操作 2 输出一行，每行仅包含一个正整数，表示针对某一个询问的答案。
 *
 * 示例 1：
 * 输入：
 *      5
 *      1 2 3 4 5
 *      5
 *      2 1
 *      2 5
 *      1 2 3 4
 *      2 3
 *      2 5
 * 输出：
 *      -1
 *      -1
 *      -1
 *      4
 * 示例 2：
 *
 * 输入：
 *      5
 *      1 2 3 4 5
 *      9
 *      1 2 3 4
 *      2 3
 *      2 5
 *      1 2 2 3
 *      2 1
 *      2 2
 *      2 3
 *      2 4
 *      2 5
 * 输出：
 *      -1
 *      4
 *      -1
 *      -1
 *      2
 *      3
 *      4
 * 提示：
 * 1 <= n <= 2000
 * 1 <= m <= 2000
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class CopyPast {

    /**
     * 方法：模拟
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //输入输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        //输入数组长度
        int n = Integer.parseInt(reader.readLine());
        //输入A的数
        String[] data = reader.readLine().split(" ");
        int[] a = new int[200005];
        int[] b = new int[200005];
        //存入A、B中
        for (int i = 0; i < 200005; i++) {
            a[i] = i < n ? Integer.parseInt(data[i]) : -1;
            b[i] = -1;
        }
        //操作次数
        int m = Integer.parseInt(reader.readLine());
        //操作
        for (int i = 0; i < m; i++) {
            String[] row = reader.readLine().split(" ");
            //操作2
            if (row[0].equals("2")){
                //获取索引位置的值
                writer.write("" + b[Integer.parseInt(row[1]) - 1]);
                writer.newLine();
            }else {//操作1
                //复制长度
                int l = Integer.parseInt(row[1]);
                //arraycopy（原数组，开始的索引，目的数组，开始索引，长度）
                System.arraycopy(a, Integer.parseInt(row[2]) - 1, b, Integer.parseInt(row[3]) - 1, l);
            }
        }
        //关闭输入输出流
        writer.close();
        reader.close();
    }

}
