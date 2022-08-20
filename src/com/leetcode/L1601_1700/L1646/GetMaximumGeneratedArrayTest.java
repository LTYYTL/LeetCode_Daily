package com.leetcode.L1601_1700.L1646;

public class GetMaximumGeneratedArrayTest {
    public static void main(String[] args) {
        GetMaximumGeneratedArray getMaximumGeneratedArray = new GetMaximumGeneratedArray();
        /*
          示例 1：
          输入：n = 7
          输出：3
          解释：根据规则：
            nums[0] = 0
            nums[1] = 1
            nums[(1 * 2) = 2] = nums[1] = 1
            nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
            nums[(2 * 2) = 4] = nums[2] = 1
            nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
            nums[(3 * 2) = 6] = nums[3] = 2
            nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
          因此，nums = [0,1,1,2,1,3,2,3]，最大值 3
         */
        System.out.println(getMaximumGeneratedArray.getMaximumGenerated(7));
        /*
          示例 2：
          输入：n = 2
          输出：1
          解释：根据规则，nums[0]、nums[1] 和 nums[2] 之中的最大值是 1
         */
        System.out.println(getMaximumGeneratedArray.getMaximumGenerated(2));
        /*
          示例 3：
          输入：n = 3
          输出：2
          解释：根据规则，nums[0]、nums[1]、nums[2] 和 nums[3] 之中的最大值是 2
         */
        System.out.println(getMaximumGeneratedArray.getMaximumGenerated(3));
    }
}
