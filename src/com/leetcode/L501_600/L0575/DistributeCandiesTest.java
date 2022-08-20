package com.leetcode.L501_600.L0575;

public class DistributeCandiesTest {
    public static void main(String[] args) {
        DistributeCandies distributeCandies = new DistributeCandies();
        /*
          示例 1:
          输入: candies = [1,1,2,2,3,3]
          输出: 3
          解析: 一共有三种种类的糖果，每一种都有两个。
               最优分配方案：妹妹获得[1,2,3],弟弟也获得[1,2,3]。这样使妹妹获得糖果的种类数最多。
         */
        System.out.println(distributeCandies.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        /*
          示例 2 :

          输入: candies = [1,1,2,3]
          输出: 2
          解析: 妹妹获得糖果[2,3],弟弟获得糖果[1,1]，妹妹有两种不同的糖果，弟弟只有一种。这样使得妹妹可以获得的糖果种类数最多。
         */
        System.out.println(distributeCandies.distributeCandies(new int[]{1, 1, 2, 3}));
    }
}
