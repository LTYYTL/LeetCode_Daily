package com.leetcode.L201_300.L0213;

public class HouseRobberIITest {
    public static void main(String[] args) {
        HouseRobberII houseRobberII = new HouseRobberII();
        /*
          示例 1：
          输入：nums = [2,3,2]
          输出：3
          解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
         */
        System.out.println(houseRobberII.rob(new int[]{2, 3, 2}));
        /*
          示例 2：
          输入：nums = [1,2,3,1]
          输出：4
          解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
               偷窃到的最高金额 = 1 + 3 = 4 。
         */
        System.out.println(houseRobberII.rob(new int[]{1, 2, 3, 1}));
        /*
          示例 3：
          输入：nums = [0]
          输出：0
         */
        System.out.println(houseRobberII.rob(new int[]{0}));
    }
}
