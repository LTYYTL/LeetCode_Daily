package com.offerII.L089;

public class HouseRobberTest {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        /*示例 1：
          输入：nums = [1,2,3,1]
          输出：4
          解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
               偷窃到的最高金额 = 1 + 3 = 4 。
         */
        System.out.println(houseRobber.rob(new int[]{1, 2, 3, 1}));
        /*
          示例 2：
          输入：nums = [2,7,9,3,1]
          输出：12
          解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
               偷窃到的最高金额 = 2 + 9 + 1 = 12 。
         */
        System.out.println(houseRobber.rob(new int[]{2, 7, 9, 3, 1}));
    }
}
