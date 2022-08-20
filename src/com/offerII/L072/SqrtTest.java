package com.offerII.L072;

public class SqrtTest {
    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        /* 示例 1：
          输入：x = 4
          输出：2
         */
        System.out.println(sqrt.mySqrt(4));
        /*
          示例 2：
          输入：x = 8
          输出：2
          解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
         */
        System.out.println(sqrt.mySqrt(8));
    }
}
