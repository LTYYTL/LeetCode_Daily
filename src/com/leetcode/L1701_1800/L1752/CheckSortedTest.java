package com.leetcode.L1701_1800.L1752;

public class CheckSortedTest {
    public static void main(String[] args) {
        CheckSorted checkSorted = new CheckSorted();
        /*
          示例 1：
          输入：nums = [3,4,5,1,2]
          输出：true
          解释：[1,2,3,4,5] 为有序的源数组。
          可以轮转 x = 3 个位置，使新数组从值为 3 的元素开始：[3,4,5,1,2] 。
         */
        System.out.println(checkSorted.check(new int[]{3, 4, 5, 1, 2}));
        /*
          示例 2：
          输入：nums = [2,1,3,4]
          输出：false
          解释：源数组无法经轮转得到 nums 。
         */
        System.out.println(checkSorted.check(new int[]{2, 1, 3, 4}));
        /*
          示例 3：
          输入：nums = [1,2,3]
          输出：true
          解释：[1,2,3] 为有序的源数组。
          可以轮转 x = 0 个位置（即不轮转）得到 nums 。
         */
        System.out.println(checkSorted.check(new int[]{1, 2, 3}));
    }
}
