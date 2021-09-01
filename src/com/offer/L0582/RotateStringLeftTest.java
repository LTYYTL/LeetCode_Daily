package com.offer.L0582;

public class RotateStringLeftTest {
    public static void main(String[] args) {
        RotateStringLeft rotateStringLeft = new RotateStringLeft();
        /**
         * 示例 1：
         * 输入: s = "abcdefg", k = 2
         * 输出: "cdefgab"
         */
        System.out.println(rotateStringLeft.reverseLeftWords("abcdefg", 2));
        /**
         * 示例 2：
         * 输入: s = "lrloseumgh", k = 6
         * 输出: "umghlrlose"
         */
        System.out.println(rotateStringLeft.reverseLeftWords("lrloseumgh", 6));
    }
}
