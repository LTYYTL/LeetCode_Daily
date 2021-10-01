package com.offerII.L002;

public class AddBinaryTest {
    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        /**
         * 示例 1:
         * 输入: a = "11", b = "10"
         * 输出: "101"
         */
        System.out.println(addBinary.addBinary("11", "10"));
        System.out.println(addBinary.addBinary_fun("11", "10"));
        /**
         * 示例 2:
         * 输入: a = "1010", b = "1011"
         * 输出: "10101"
         */
        System.out.println(addBinary.addBinary("1010", "1011"));
        System.out.println(addBinary.addBinary_fun("1010", "1011"));
    }
}
