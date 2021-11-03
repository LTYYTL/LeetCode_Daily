package com.offerII.L098;

public class UniquePathsTest {
    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        /**
         * 示例 1：
         * 输入：m = 3, n = 7
         * 输出：28
         */
        System.out.println(uniquePaths.uniquePaths(3, 7));
        System.out.println(uniquePaths.uniquePaths_math(3, 7));
        /**
         * 示例 2：
         * 输入：m = 3, n = 2
         * 输出：3
         * 解释：
         * 从左上角开始，总共有 3 条路径可以到达右下角。
         * 1. 向右 -> 向下 -> 向下
         * 2. 向下 -> 向下 -> 向右
         * 3. 向下 -> 向右 -> 向下
         */
        System.out.println(uniquePaths.uniquePaths(3, 2));
        System.out.println(uniquePaths.uniquePaths_math(3, 2));
        /**
         * 示例 3：
         * 输入：m = 7, n = 3
         * 输出：28
         */
        System.out.println(uniquePaths.uniquePaths(7, 3));
        System.out.println(uniquePaths.uniquePaths_math(7, 3));
        /**
         * 示例 4：
         * 输入：m = 3, n = 3
         * 输出：6
         */
        System.out.println(uniquePaths.uniquePaths(3, 3));
        System.out.println(uniquePaths.uniquePaths_math(3, 3));
    }
}
