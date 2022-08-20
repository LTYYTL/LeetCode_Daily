package com.offerII.L080;

public class CombinationTest {
    public static void main(String[] args) {
        Combination combination = new Combination();
        /*
          示例 1:
          输入: n = 4, k = 2
          输出:
          [
            [2,4],
            [3,4],
            [2,3],
            [1,2],
            [1,3],
            [1,4],
          ]
         */
        System.out.println(combination.combine(4, 2));
        /*
          示例 2:
          输入: n = 1, k = 1
          输出: [[1]]
         */
        System.out.println(combination.combine(1, 1));
    }
}
