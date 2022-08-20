package com.interview.L0506;

public class ConvertIntegerTest {
    public static void main(String[] args) {
        ConvertInteger convertInteger = new ConvertInteger();
        /*
          示例1:
           输入：A = 29 （或者0b11101）, B = 15（或者0b01111）
           输出：2
         */
        System.out.println(convertInteger.convertInteger(29, 15));
        /*
          示例2:
           输入：A = 1，B = 2
           输出：2
         */
        System.out.println(convertInteger.convertInteger(1, 2));
    }
}
