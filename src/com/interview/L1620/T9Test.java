package com.interview.L1620;

public class T9Test {
    public static void main(String[] args) {
        T9 t9 = new T9();
        /**
         * 示例 1:
         * 输入: num = "8733", words = ["tree", "used"]
         * 输出: ["tree", "used"]
         */
        System.out.println(t9.getValidT9Words("8733", new String[]{"tree", "used"}));
        /**
         * 示例 2:
         * 输入: num = "2", words = ["a", "b", "c", "d"]
         * 输出: ["a", "b", "c"]
         */
        System.out.println(t9.getValidT9Words("2", new String[]{"a", "b", "c", "d"}));
    }
}
