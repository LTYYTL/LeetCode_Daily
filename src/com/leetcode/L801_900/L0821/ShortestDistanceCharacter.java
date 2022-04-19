package com.leetcode.L801_900.L0821;

/**
 * 821. 字符的最短距离
 * 给你一个字符串 s 和一个字符 c ，且 c 是 s 中出现过的字符。
 * 返回一个整数数组 answer ，其中 answer.length == s.length 且 answer[i] 是 s 中从下标 i 到离它 最近 的字符 c 的 距离 。
 * 两个下标 i 和 j 之间的 距离 为 abs(i - j) ，其中 abs 是绝对值函数。
 *
 * 示例 1：
 * 输入：s = "loveleetcode", c = "e"
 * 输出：[3,2,1,0,1,0,0,1,2,2,1,0]
 * 解释：字符 'e' 出现在下标 3、5、6 和 11 处（下标从 0 开始计数）。
 * 距下标 0 最近的 'e' 出现在下标 3 ，所以距离为 abs(0 - 3) = 3 。
 * 距下标 1 最近的 'e' 出现在下标 3 ，所以距离为 abs(1 - 3) = 2 。
 * 对于下标 4 ，出现在下标 3 和下标 5 处的 'e' 都离它最近，但距离是一样的 abs(4 - 3) == abs(4 - 5) = 1 。
 * 距下标 8 最近的 'e' 出现在下标 6 ，所以距离为 abs(8 - 6) = 2 。
 *
 * 示例 2：
 * 输入：s = "aaab", c = "b"
 * 输出：[3,2,1,0]
 *
 * 提示：
 * 1 <= s.length <= 104
 * s[i] 和 c 均为小写英文字母
 * 题目数据保证 c 在 s 中至少出现一次
 */
public class ShortestDistanceCharacter {
    /**
     * 方法：双指针
     * @param s
     * @param c
     * @return
     */
    public int[] shortestToChar(String s, char c) {
        //长度
        int n = s.length();
        //结果
        int[] res = new int[n];
        //转换成字符数组
        char[] chars = s.toCharArray();

        //遍历
        for (int i = 0; i < n; i++) {
            //左右索引
            int left = i;
            int right = i;
            //当前位置不为目标字符
            if (chars[i] != c){
                //在不超过范围的情况查找当前字符左边的目标字符的索引
                while (left >= 0 && chars[left] != c)
                    left--;
                //在不超过范围的情况查找当前字符右边的目标字符的索引
                while (right < n && chars[right] != c)
                    right++;
            }
            //左边没有符合条件的索引，直接变成最大值
            if (left == -1)
                left = Integer.MAX_VALUE;
            //右边没有符合条件的索引，直接变成最大值
            if (right == n)
                right = Integer.MAX_VALUE;
            //计算最小索引
            res[i] = Math.min(Math.abs(i-left),Math.abs(right-i));
        }

        return res;
    }
}
