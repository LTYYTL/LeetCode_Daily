package com.leetcode.L101_200.L0135;

public class CandyTest {
    public static void main(String[] args) {
        Candy candy = new Candy();
        /*
          示例 1:
          输入: [1,0,2]
          输出: 5
          解释: 你可以分别给这三个孩子分发 2、1、2 颗糖果。
         */
        System.out.println(candy.candy(new int[]{1, 0, 2}));
        /*
          示例 2:
          输入: [1,2,2]
          输出: 4
          解释: 你可以分别给这三个孩子分发 1、2、1 颗糖果。
               第三个孩子只得到 1 颗糖果，这已满足上述两个条件。
         */
        System.out.println(candy.candy(new int[]{1, 2, 2}));
    }
}
