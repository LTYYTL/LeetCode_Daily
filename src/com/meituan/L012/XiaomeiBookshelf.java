package com.meituan.L012;

import java.io.*;

/**
 * meituan-012. 小美的书架
 * 小美的书架上有很多书。小美是个爱读书的新时代好青年。
 * 小团虽然也喜欢看书，但小团大多数时候都更喜欢来小美家蹭书读。
 * 这就导致小美的书架上很多书都会被小团借走。
 * 小美很烦这一点，就想出了一个招数，小美的书架是一行一行的，他会对一些行加锁，这样小团就借不走了。
 * 现在小团想要借书，请你帮忙看看小团能不能借到书，如果可以借到的话在哪一行书架上有这本书。
 * 为了简单起见，每本书将用一个正整数进行编号，小美的书架一共有 N 行。
 *
 * 格式：
 * 输入：
 * - 第一行两个正整数 N，M，Q，表示小美书架有 N 行编号 1 到 N ，书本编号从 1 到 M ，接下来有 Q 个操作
 * - 接下来 Q 行，每行是下列操作中的一种：
 *   1. x y : x 是书本的编号，y 是书架的行编号，代表小美将编号为 x 的书本放置到 y 行上。
 *      （1）若该书本在小团手上则放置无效，
 *      （2）若原来该书在书架上且原行上锁则放置无效，
 *      （3）若该书被放置到一个锁了的行上则放置无效。
 *   2. y : y 是书架的行编号，代表小美将行编号为 y 的书架加锁，对已经上锁的书架行该操作无效。
 *   3. y : y 是书架的行编号，代表小美将行编号为 y 的书架锁去掉，对无锁的书架行该操作无效。
 *   4. x : x 是书本的编号，代表小团想借编号为 x 的书本，对该操作若可以借到输出一行正整数在哪一行，借不到输出一行 -1
 *   5. x : x 是书本的编号，代表小团还回来编号为 x 的书本。若该书本不在小团手上该操作无效。
 * 输出：
 * - 对于每个操作 4 ，若可以借到输出一行正整数在哪一行，借不到输出一行 -1 。
 *
 * 示例：
 * 输入：
 *      5 5 10
 *      1 1 4
 *      1 2 3
 *      1 3 1
 *      2 1
 *      4 1
 *      5 2
 *      4 3
 *      4 5
 *      3 1
 *      4 2
 * 输出：
 *      4
 *      -1
 *      -1
 *      3
 * 提示：
 * 对于 30% 的数据有 N<=10, M<=10, Q<=20
 * 对于 80% 的数据有 N<=1000, M<=1000, Q<=100000
 * 对于 100% 的数据有 N<=10000, M<=10000, Q<=100000
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class XiaomeiBookshelf {
    static boolean[] lock;
    static int[] mei;
    static boolean[] tuan;
    public static void main(String[] args) throws IOException {
        //输入输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = reader.readLine().split(" ");
        //行号
        int N = Integer.parseInt(data[0]);
        //书号
        int M = Integer.parseInt(data[1]);
        //操作数
        int Q = Integer.parseInt(data[2]);

        //对行进行锁定
        lock = new boolean[N+1];
        //记录书对应的行号
        mei = new int[M+1];
        //小团有的书
        tuan = new boolean[M+1];

        for (int i = 0; i < Q; i++) {
            String[] s = reader.readLine().split(" ");
            //操作编号
            int opt = Integer.parseInt(s[0]);
            switch (opt) {
                case 1 -> put(Integer.parseInt(s[1]), Integer.parseInt(s[2]));
                case 2 -> addLock(Integer.parseInt(s[1]));
                case 3 -> delLock(Integer.parseInt(s[1]));
                case 4 -> {
                    writer.write(" " + borrow(Integer.parseInt(s[1])));
                    writer.newLine();
                }
                case 5 -> get(Integer.parseInt(s[1]));
                default -> {
                }
            }
        }

        //关闭输入输出流
        reader.close();
        writer.close();
    }

    private static void put(int x, int y) {
        /*
          （1）若该书本在小团手上则放置无效，
          （2）若原来该书在书架上且原行上锁则放置无效，
          （3）若该书被放置到一个锁了的行上则放置无效。
         */
        if (!tuan[x] && !lock[y] && mei[x] == 0)
            mei[x] = y;
    }

    //y 是书架的行编号，代表小美将行编号为 y 的书架加锁，对已经上锁的书架行该操作无效。
    private static void addLock(int y) {
        lock[y] = true;
    }

    //y 是书架的行编号，代表小美将行编号为 y 的书架锁去掉，对无锁的书架行该操作无效。
    private static void delLock(int y){
        lock[y] = false;
    }

    //x 是书本的编号，代表小团想借编号为 x 的书本，对该操作若可以借到输出一行正整数在哪一行，借不到输出一行 -1
    private static int borrow(int x){
        int y = mei[x];
        if (!lock[y] && y != 0){
            mei[x] = 0;
            tuan[x] = true;
            return y;
        }

        return -1;
    }

    //x 是书本的编号，代表小团还回来编号为 x 的书本。若该书本不在小团手上该操作无效。
    private static void get(int x){
        if (tuan[x]){
            tuan[x] = false;
        }
    }
}
