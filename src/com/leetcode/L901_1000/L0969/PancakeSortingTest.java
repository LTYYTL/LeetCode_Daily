package com.leetcode.L901_1000.L0969;

public class PancakeSortingTest {
    public static void main(String[] args) {
        PancakeSorting pancakeSorting = new PancakeSorting();
        /*
          示例 1：
          输入：[3,2,4,1]
          输出：[4,2,4,3]
          解释：
          我们执行 4 次煎饼翻转，k 值分别为 4，2，4，和 3。
          初始状态 arr = [3, 2, 4, 1]
          第一次翻转后（k = 4）：arr = [1, 4, 2, 3]
          第二次翻转后（k = 2）：arr = [4, 1, 2, 3]
          第三次翻转后（k = 4）：arr = [3, 2, 1, 4]
          第四次翻转后（k = 3）：arr = [1, 2, 3, 4]，此时已完成排序。
         */
        System.out.println(pancakeSorting.pancakeSort(new int[]{3, 2, 4, 1}));
        /*
          示例 2：
          输入：[1,2,3]
          输出：[]
          解释：
          输入已经排序，因此不需要翻转任何内容。
          请注意，其他可能的答案，如 [3，3] ，也将被判断为正确。
         */
        System.out.println(pancakeSorting.pancakeSort(new int[]{1, 2, 3}));
    }
}
