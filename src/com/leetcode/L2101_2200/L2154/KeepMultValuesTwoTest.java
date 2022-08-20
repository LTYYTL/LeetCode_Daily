package com.leetcode.L2101_2200.L2154;

public class KeepMultValuesTwoTest {
    public static void main(String[] args) {
        KeepMultValuesTwo keepMultValuesTwo = new KeepMultValuesTwo();
        /*
          示例 1：
          输入：nums = [5,3,6,1,12], original = 3
          输出：24
          解释：
          - 3 能在 nums 中找到。3 * 2 = 6 。
          - 6 能在 nums 中找到。6 * 2 = 12 。
          - 12 能在 nums 中找到。12 * 2 = 24 。
          - 24 不能在 nums 中找到。因此，返回 24 。
         */
        System.out.println(keepMultValuesTwo.findFinalValue(new int[]{5, 3, 6, 1, 12}, 3));
        /*
          示例 2：
          输入：nums = [2,7,9], original = 4
          输出：4
          解释：
          - 4 不能在 nums 中找到。因此，返回 4 。
         */
        System.out.println(keepMultValuesTwo.findFinalValue(new int[]{2, 7, 9}, 4));
    }
}
