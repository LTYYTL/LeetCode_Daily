package com.leetcode.L2001_2100.L2013;


public class DetectSquaresTest {
    public static void main(String[] args) {
        /**
         * 示例：
         * 输入：
         * ["DetectSquares", "add", "add", "add", "count", "count", "add", "count"]
         * [[], [[3, 10]], [[11, 2]], [[3, 2]], [[11, 10]], [[14, 8]], [[11, 2]], [[11, 10]]]
         * 输出：
         * [null, null, null, null, 1, 0, null, 2]
         * 解释：
         * DetectSquares detectSquares = new DetectSquares();
         * detectSquares.add([3, 10]);
         * detectSquares.add([11, 2]);
         * detectSquares.add([3, 2]);
         * detectSquares.count([11, 10]); // 返回 1 。你可以选择：
         *                                //   - 第一个，第二个，和第三个点
         * detectSquares.count([14, 8]);  // 返回 0 。查询点无法与数据结构中的这些点构成正方形。
         * detectSquares.add([11, 2]);    // 允许添加重复的点。
         * detectSquares.count([11, 10]); // 返回 2 。你可以选择：
         *                                //   - 第一个，第二个，和第三个点
         *                                //   - 第一个，第三个，和第四个点
         */
         DetectSquares detectSquares = new DetectSquares();
         detectSquares.add(new int[]{3, 10});
         detectSquares.add(new int[]{11, 2});
        detectSquares.add(new int[]{3, 2});
        System.out.println(detectSquares.count(new int[]{11, 10}));
        //   - 第一个，第二个，和第三个点
        System.out.println(detectSquares.count(new int[]{14, 8}));
        detectSquares.add(new int[]{11, 2});    // 允许添加重复的点。
        System.out.println(detectSquares.count(new int[]{11, 10}));

    }
}
