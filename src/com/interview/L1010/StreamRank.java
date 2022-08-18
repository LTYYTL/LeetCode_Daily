package com.interview.L1010;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 10.10. 数字流的秩
 * 假设你正在读取一串整数。每隔一段时间，你希望能找出数字 x 的秩(小于或等于 x 的值的个数)。请实现数据结构和算法来支持这些操作，也就是说：
 * (1)实现 track(int x) 方法，每读入一个数字都会调用该方法；
 * (2)实现 getRankOfNumber(int x) 方法，返回小于或等于 x 的值的个数。
 * 注意：本题相对原题稍作改动
 *
 * 示例:
 * 输入:
 * ["StreamRank", "getRankOfNumber", "track", "getRankOfNumber"]
 * [[], [1], [0], [0]]
 * 输出:
 * [null,0,null,1]
 *
 * 提示：
 * x <= 50000
 * track 和 getRankOfNumber 方法的调用次数均不超过 2000 次
 */
public class StreamRank {
    //存储数据
    private final List<Integer> list;
    //初始化
    public StreamRank() {
        list = new ArrayList<>();
    }

    public void track(int x) {
        //加入集合
        list.add(x);
    }

    public int getRankOfNumber(int x) {
        int res = 0;
        for (Integer i : list) {
            if (i <= x)
                res++;
        }
        return res;
    }
}
