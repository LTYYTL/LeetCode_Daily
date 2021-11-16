package com.leetcode.L301_400.L0391;

public class PerfectRectangleTest {
    public static void main(String[] args) {
        PerfectRectangle perfectRectangle = new PerfectRectangle();
        /**
         * 示例 1：
         * 输入：rectangles = [[1,1,3,3],[3,1,4,2],[3,2,4,4],[1,3,2,4],[2,3,3,4]]
         * 输出：true
         * 解释：5 个矩形一起可以精确地覆盖一个矩形区域。
         */
        System.out.println(perfectRectangle.isRectangleCover(new int[][]{
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {3, 2, 4, 4},
                {1, 3, 2, 4},
                {2, 3, 3, 4},
        }));
        /**
         * 示例 2：
         * 输入：rectangles = [[1,1,2,3],[1,3,2,4],[3,1,4,2],[3,2,4,4]]
         * 输出：false
         * 解释：两个矩形之间有间隔，无法覆盖成一个矩形。
         */
        System.out.println(perfectRectangle.isRectangleCover(new int[][]{
                {1, 1, 2, 3},
                {1, 3, 2, 4},
                {3, 1, 4, 2},
                {3, 2, 4, 4},
        }));
        /**
         * 示例 3：
         * 输入：rectangles = [[1,1,3,3],[3,1,4,2],[1,3,2,4],[3,2,4,4]]
         * 输出：false
         * 解释：图形顶端留有空缺，无法覆盖成一个矩形。
         */
        System.out.println(perfectRectangle.isRectangleCover(new int[][]{
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {1, 3, 2, 4},
                {2, 3, 3, 4},
        }));
        /**
         * 示例 4：
         * 输入：rectangles = [[1,1,3,3],[3,1,4,2],[1,3,2,4],[2,2,4,4]]
         * 输出：false
         * 解释：因为中间有相交区域，虽然形成了矩形，但不是精确覆盖。
         */
        System.out.println(perfectRectangle.isRectangleCover(new int[][]{
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {1, 3, 2, 4},
                {2, 2, 4, 4},
        }));
    }
}
