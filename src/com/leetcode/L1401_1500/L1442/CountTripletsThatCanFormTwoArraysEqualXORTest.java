package com.leetcode.L1401_1500.L1442;

public class CountTripletsThatCanFormTwoArraysEqualXORTest {
    public static void main(String[] args) {
        CountTripletsThatCanFormTwoArraysEqualXOR countTripletsThatCanFormTwoArraysEqualXOR = new CountTripletsThatCanFormTwoArraysEqualXOR();
        /*示例 1：
          输入：arr = [2,3,1,6,7]
          输出：4
          解释：满足题意的三元组分别是 (0,1,2), (0,2,2), (2,3,4) 以及 (2,4,4)
         */
        System.out.println(countTripletsThatCanFormTwoArraysEqualXOR.countTriplets(new int[]{2, 3, 1, 6, 7}));
        /*
          示例 2：
          输入：arr = [1,1,1,1,1]
          输出：10
         */
        System.out.println(countTripletsThatCanFormTwoArraysEqualXOR.countTriplets(new int[]{1, 1, 1, 1, 1}));
        /*
          示例 3：
          输入：arr = [2,3]
          输出：0
         */
        System.out.println(countTripletsThatCanFormTwoArraysEqualXOR.countTriplets(new int[]{2, 3}));
        /*
          示例 4：
          输入：arr = [1,3,5,7,9]
          输出：3
         */
        System.out.println(countTripletsThatCanFormTwoArraysEqualXOR.countTriplets(new int[]{1, 3, 5, 7, 9}));
        /*
          示例 5：
          输入：arr = [7,11,12,9,5,2,7,17,22]
          输出：8
         */
        System.out.println(countTripletsThatCanFormTwoArraysEqualXOR.countTriplets(new int[]{7, 11, 12, 9, 5, 2, 7, 17, 22}));
    }
}
