package com.leetcode.L1001_1100.L1051;

public class HeightCheckerTest {
    public static void main(String[] args) {
        HeightChecker heightChecker = new HeightChecker();
        /*
          示例：
          输入：heights = [1,1,4,2,1,3]
          输出：3
          解释：
          高度：[1,1,4,2,1,3]
          预期：[1,1,1,2,3,4]
          下标 2 、4 、5 处的学生高度不匹配。
         */
        System.out.println(heightChecker.heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
        /*
          示例 2：
          输入：heights = [5,1,2,3,4]
          输出：5
          解释：
          高度：[5,1,2,3,4]
          预期：[1,2,3,4,5]
          所有下标的对应学生高度都不匹配。
         */
        System.out.println(heightChecker.heightChecker(new int[]{5, 1, 2, 3, 4}));
        /*
          示例 3：
          输入：heights = [1,2,3,4,5]
          输出：0
          解释：
          高度：[1,2,3,4,5]
          预期：[1,2,3,4,5]
          所有下标的对应学生高度都匹配。
         */
        System.out.println(heightChecker.heightChecker(new int[]{1, 2, 3, 4, 5}));
    }
}
