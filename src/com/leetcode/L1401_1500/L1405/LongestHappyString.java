package com.leetcode.L1401_1500.L1405;

import java.util.PriorityQueue;

/**
 * 1405. 最长快乐字符串
 * 如果字符串中不含有任何 'aaa'，'bbb' 或 'ccc' 这样的字符串作为子串，那么该字符串就是一个「快乐字符串」。
 * 给你三个整数 a，b ，c，请你返回 任意一个 满足下列全部条件的字符串 s：
 * (1)s 是一个尽可能长的快乐字符串。
 * (2)s 中 最多 有a 个字母 'a'、b 个字母 'b'、c 个字母 'c' 。
 * (3)s 中只含有 'a'、'b' 、'c' 三种字母。
 * 如果不存在这样的字符串 s ，请返回一个空字符串 ""。
 *
 * 示例 1：
 * 输入：a = 1, b = 1, c = 7
 * 输出："ccaccbcc"
 * 解释："ccbccacc" 也是一种正确答案。
 *
 * 示例 2：
 * 输入：a = 2, b = 2, c = 1
 * 输出："aabbc"
 *
 * 示例 3：
 * 输入：a = 7, b = 1, c = 0
 * 输出："aabaa"
 * 解释：这是该测试用例的唯一正确答案。
 *
 * 提示：
 * 0 <= a, b, c <= 100
 * a + b + c > 0
 */
public class LongestHappyString {
    /**
     * 方法：贪心算法
     * @param a
     * @param b
     * @param c
     * @return
     */
    public String longestDiverseString(int a, int b, int c) {
        //大根堆
        PriorityQueue<int[]> queue = new PriorityQueue<>((x,y)->y[1]-x[1]);
        if (a > 0)
            queue.add(new int[]{'a',a});
        if (b > 0)
            queue.add(new int[]{'b',b});
        if (c > 0)
            queue.add(new int[]{'c',c});
        //结果
        StringBuilder str = new StringBuilder(a+b+c);
        //遍历
        while (!queue.isEmpty()){
            //队首元素，即个数最多的字母
            int[] cur = queue.poll();
            //长度
            int n = str.length();
            //查看结尾的两个字母是否和最多的字母相同
            if (n >= 2 && str.charAt(n-1) == cur[0] && str.charAt(n-2) == cur[0]){
                //队列不为空，就取次大的字母
                if (!queue.isEmpty()){
                    //次大的字母
                    int[] mid = queue.poll();
                    //加入结果
                    str.append((char)mid[0]);
                    //次数没有用尽就放回队列
                    if (--mid[1] > 0)
                        queue.add(mid);
                    //最大的加入
                    queue.add(cur);
                }
            }else {
                //不相同的情况
                str.append((char)cur[0]);
                //次数没有用尽就放回队列
                if (--cur[1] > 0)
                    queue.add(cur);
            }
        }
        return str.toString();
    }
}
