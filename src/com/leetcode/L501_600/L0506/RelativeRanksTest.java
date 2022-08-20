package com.leetcode.L501_600.L0506;

import java.util.Arrays;

public class RelativeRanksTest {
    public static void main(String[] args) {
        RelativeRanks relativeRanks = new RelativeRanks();
        /*
          示例 1：
          输入：score = [5,4,3,2,1]
          输出：["Gold Medal","Silver Medal","Bronze Medal","4","5"]
          解释：名次为 [1st, 2nd, 3rd, 4th, 5th] 。
         */
        System.out.println(Arrays.toString(relativeRanks.findRelativeRanks(new int[]{5, 4, 3, 2, 1})));
        /*
          示例 2：
          输入：score = [10,3,8,9,4]
          输出：["Gold Medal","5","Bronze Medal","Silver Medal","4"]
          解释：名次为 [1st, 5th, 3rd, 2nd, 4th] 。
         */
        System.out.println(Arrays.toString(relativeRanks.findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
    }
}
