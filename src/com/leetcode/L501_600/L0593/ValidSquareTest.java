package com.leetcode.L501_600.L0593;

public class ValidSquareTest {
    public static void main(String[] args) {
        ValidSquare validSquare = new ValidSquare();
        /**
         * 示例 1:
         * 输入: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
         * 输出: True
         */
        System.out.println(validSquare.validSquare(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 1}));
        /**
         * 示例 2:
         * 输入：p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,12]
         * 输出：false
         */
        System.out.println(validSquare.validSquare(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 12}));
        /**
         * 示例 3:
         * 输入：p1 = [1,0], p2 = [-1,0], p3 = [0,1], p4 = [0,-1]
         * 输出：true
         */
        System.out.println(validSquare.validSquare(new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{0, -1}));
    }
}
