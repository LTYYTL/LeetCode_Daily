package com.leetcode.L501_600.L0564;

import java.util.ArrayList;
import java.util.List;

/**
 * 564. 寻找最近的回文数
 * 给定一个表示整数的字符串 n ，返回与它最近的回文整数（不包括自身）。如果不止一个，返回较小的那个。
 * “最近的”定义为两个整数差的绝对值最小。
 *
 * 示例 1:
 * 输入: n = "123"
 * 输出: "121"
 *
 * 示例 2:
 * 输入: n = "1"
 * 输出: "0"
 * 解释: 0 和 2是最近的回文，但我们返回最小的，也就是 0。
 *
 * 提示:
 * 1 <= n.length <= 18
 * n 只由数字组成
 * n 不含前导 0
 * n 代表在 [1, 1018 - 1] 范围内的整数
 */
public class FindClosestPalindrome {
    /**
     * 方法：模拟
     * @param n
     * @return
     */
    public String nearestPalindromic(String n) {
        //当前数
        long selfNum = Long.parseLong(n);
        //存储可能回文的数
        List<Long> candidates = getCandidates(n);
        //结果
        long res = -1;
        //遍历
        for (Long candidate : candidates) {
            //不允许是本身
            if (candidate == selfNum)
                continue;
            //res == -1：没有结果的情况
            //Math.abs(candidate - selfNum) < Math.abs(res - selfNum)：当前结果的差值比当前数的差值大
            //Math.abs(candidate - selfNum) == Math.abs(res - selfNum) && res > candidate)：//差值相等但结果比当前数大
            if (res == -1 ||
                    Math.abs(candidate - selfNum) < Math.abs(res - selfNum) ||
                    (Math.abs(candidate - selfNum) == Math.abs(res - selfNum) && res > candidate))
                    res = candidate;
        }
        return Long.toString(res);
    }

    /**
     * 寻找回文数
     * @param n
     * @return
     */
    private List<Long> getCandidates(String n) {
        //长度
        int len = n.length();
        //回文结果集
        List<Long> candidates = new ArrayList<>(){{
            add((long) (Math.pow(10,len-1)-1));//少一位的最大回文数
            add((long) (Math.pow(10,len)+1));//多一位饿最小回文数
        }};
        //取前一半的数字
        long prev = Long.parseLong(n.substring(0,(len+1)/2));
        //范围：前一半数-1~前一半数+1
        //如：123的前一半为12,范围[11,12,13]
        for (long i = prev - 1; i <= prev + 1; ++i) {
            //当前字符串
            //加入前一半
            StringBuilder last = new StringBuilder().append(i).reverse();
            String sb = i +
                    //获取后一半
                    //获取len一半长度的字符串，做为后一半
                    last.substring(len & 1);
            //加入集合
            candidates.add(Long.valueOf(sb));
        }

        return candidates;
    }


}
