package com.leetcode.L801_900.L0875;

public class KokoEatingBananasTest {
    public static void main(String[] args) {
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        /*
          示例 1：
          输入: piles = [3,6,7,11], H = 8
          输出: 4
         */
        System.out.println(kokoEatingBananas.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        /*
          示例 2：
          输入: piles = [30,11,23,4,20], H = 5
          输出: 30
         */
        System.out.println(kokoEatingBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        /*
          示例 3：
          输入: piles = [30,11,23,4,20], H = 6
          输出: 23
         */
        System.out.println(kokoEatingBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }
}
