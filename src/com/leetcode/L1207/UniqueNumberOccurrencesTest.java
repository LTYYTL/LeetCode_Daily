package com.leetcode.L1207;

public class UniqueNumberOccurrencesTest {
    public static void main(String[] args) {
        UniqueNumberOccurrences uniqueNumberOccurrences = new UniqueNumberOccurrences();
        /*** 示例 1：
         * 输入：arr = [1,2,2,1,1,3]
         * 输出：true
         * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
         */
        System.out.println(uniqueNumberOccurrences.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        /**
         * 示例 2：
         * 输入：arr = [1,2]
         * 输出：false
         */
        System.out.println(uniqueNumberOccurrences.uniqueOccurrences(new int[]{1,2}));
        /**
         * 示例 3：
         * 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
         * 输出：true
         */
        System.out.println(uniqueNumberOccurrences.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
