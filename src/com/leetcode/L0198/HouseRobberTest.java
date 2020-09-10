package com.leetcode.L0198;

public class HouseRobberTest {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        /**
         * 示例 1：
         * 输入：[1,2,3,1]
         * 输出：4
         * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
         *      偷窃到的最高金额 = 1 + 3 = 4 。
         */
        int[] nums = {1,2,3,1};
        //方法一：动态规划
        System.out.println(houseRobber.rob(nums));
        //方法二：动态规划 + 空间优化（原地修改）
        System.out.println(houseRobber.rob_zeroStructure(nums));

        /**
         * 示例 2：
         * 输入：[2,7,9,3,1]
         * 输出：12
         * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
         *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
         */
        int[] nums2 = {2,7,9,3,1};
        //方法一：动态规划
        System.out.println(houseRobber.rob(nums2));
        //方法二：动态规划 + 空间优化（原地修改）
        System.out.println(houseRobber.rob_zeroStructure(nums2));
    }
}
