package com.leetcode.L901_1000.L0942;

/**
 * 942. 增减字符串匹配
 * 由范围 [0,n] 内所有整数组成的 n + 1 个整数的排列序列可以表示为长度为 n 的字符串 s ，其中:
 * (1)如果 perm[i] < perm[i + 1] ，那么 s[i] == 'I'
 * (2)如果 perm[i] > perm[i + 1] ，那么 s[i] == 'D'
 * 给定一个字符串 s ，重构排列 perm 并返回它。如果有多个有效排列perm，则返回其中 任何一个 。
 * <p>
 * 示例 1：
 * 输入：s = "IDID"
 * 输出：[0,4,1,3,2]
 * <p>
 * 示例 2：
 * 输入：s = "III"
 * 输出：[0,1,2,3]
 * <p>
 * 示例 3：
 * 输入：s = "DDI"
 * 输出：[3,2,0,1]
 * <p>
 * 提示：
 * 1 <= s.length <= 105
 * s 只包含字符 "I" 或 "D"
 */
public class DIStringMatch {
    /**
     * 方法：数学
     *
     * @param s
     * @return
     */
    public int[] diStringMatch(String s) {
        //最小值
        int min = 0;
        //最大值
        int max = s.length();

        //结果
        int[] arr = new int[max + 1];

        //遍历
        for (int i = 0; i < s.length(); i++) {
            //当前字符
            char c = s.charAt(i);
            //增加字符当前放最小值，最小值增加
            if (c == 'I') {
                arr[i] = min;
                min++;
            } else {
                //减小字符当前放最大值，最大值增加
                arr[i] = max;
                max--;
            }
        }
        //放最后一个值
        arr[s.length()] = max;

        return arr;
    }
}
