package com.leetcode.L801_900.L0825;

public class FriendsAppropriateAgesTest {
    public static void main(String[] args) {
        FriendsAppropriateAges friendsAppropriateAges = new FriendsAppropriateAges();
        /*
          示例 1：
          输入：ages = [16,16]
          输出：2
          解释：2 人互发好友请求。
         */
        System.out.println(friendsAppropriateAges.numFriendRequests(new int[]{16, 16}));
        /*
          示例 2：
          输入：ages = [16,17,18]
          输出：2
          解释：产生的好友请求为 17 -> 16 ，18 -> 17 。
         */
        System.out.println(friendsAppropriateAges.numFriendRequests(new int[]{16, 17, 18}));
        /*
          示例 3：
          输入：ages = [20,30,100,110,120]
          输出：3
          解释：产生的好友请求为 110 -> 100 ，120 -> 110 ，120 -> 100 。
         */
        System.out.println(friendsAppropriateAges.numFriendRequests(new int[]{20, 30, 100, 110, 120}));
    }
}
