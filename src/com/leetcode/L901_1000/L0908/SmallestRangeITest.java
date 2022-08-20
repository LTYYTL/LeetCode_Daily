package com.leetcode.L901_1000.L0908;

public class SmallestRangeITest {
    public static void main(String[] args) {
        SmallestRangeI smallestRangeI = new SmallestRangeI();
        /*
          示例 1：
          输入：nums = [1], k = 0
          输出：0
          解释：分数是 max(nums) - min(nums) = 1 - 1 = 0。
         */
        System.out.println(smallestRangeI.smallestRangeI(new int[]{1}, 0));
        /*
          示例 2：
          输入：nums = [0,10], k = 2
          输出：6
          解释：将 nums 改为 [2,8]。分数是 max(nums) - min(nums) = 8 - 2 = 6。
         */
        System.out.println(smallestRangeI.smallestRangeI(new int[]{0, 10}, 2));
        /*
          示例 3：
          输入：nums = [1,3,6], k = 3
          输出：0
          解释：将 nums 改为 [4,4,4]。分数是 max(nums) - min(nums) = 4 - 4 = 0。
         */
        System.out.println(smallestRangeI.smallestRangeI(new int[]{1, 3, 6}, 3));
    }
}
