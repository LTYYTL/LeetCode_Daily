package com.leetcode.L1701_1800.L1705;

public class MaxEatenApplesTest {
    public static void main(String[] args) {
        MaxEatenApples maxEatenApples = new MaxEatenApples();
        /* *
          示例 1：
          输入：apples = [1,2,3,5,2], days = [3,2,1,4,2]
          输出：7
          解释：你可以吃掉 7 个苹果：
          - 第一天，你吃掉第一天长出来的苹果。
          - 第二天，你吃掉一个第二天长出来的苹果。
          - 第三天，你吃掉一个第二天长出来的苹果。过了这一天，第三天长出来的苹果就已经腐烂了。
          - 第四天到第七天，你吃的都是第四天长出来的苹果。
         */
        System.out.println(maxEatenApples.eatenApples(new int[]{1, 2, 3, 5, 2}, new int[]{3, 2, 1, 4, 2}));
        /*
          示例 2：
          输入：apples = [3,0,0,0,0,2], days = [3,0,0,0,0,2]
          输出：5
          解释：你可以吃掉 5 个苹果：
          - 第一天到第三天，你吃的都是第一天长出来的苹果。
          - 第四天和第五天不吃苹果。
          - 第六天和第七天，你吃的都是第六天长出来的苹果。
         */
        System.out.println(maxEatenApples.eatenApples(new int[]{3, 0, 0, 0, 0, 2}, new int[]{3, 0, 0, 0, 0, 2}));
    }
}
