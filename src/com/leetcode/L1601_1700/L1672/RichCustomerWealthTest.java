package com.leetcode.L1601_1700.L1672;

public class RichCustomerWealthTest {
    public static void main(String[] args) {
        RichCustomerWealth richCustomerWealth = new RichCustomerWealth();
        /*
          示例 1：
          输入：accounts = [[1,2,3],[3,2,1]]
          输出：6
          解释：
          第 1 位客户的资产总量 = 1 + 2 + 3 = 6
          第 2 位客户的资产总量 = 3 + 2 + 1 = 6
          两位客户都是最富有的，资产总量都是 6 ，所以返回 6 。
         */
        System.out.println(richCustomerWealth.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        /*
          示例 2：
          输入：accounts = [[1,5],[7,3],[3,5]]
          输出：10
          解释：
          第 1 位客户的资产总量 = 6
          第 2 位客户的资产总量 = 10
          第 3 位客户的资产总量 = 8
          第 2 位客户是最富有的，资产总量是 10
         */
        System.out.println(richCustomerWealth.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        /*
          示例 3：
          输入：accounts = [[2,8,7],[7,1,3],[1,9,5]]
          输出：17
         */
        System.out.println(richCustomerWealth.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
    }
}
