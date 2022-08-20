package com.offerII.L001;

public class DivideTwoIntegersTest {
    public static void main(String[] args) {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        /*
          示例 1:
          输入: dividend = 10, divisor = 3
          输出: 3
          解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
         */
        System.out.println(divideTwoIntegers.divide(10, 3));
        /*
          示例 2:
          输入: dividend = 7, divisor = -3
          输出: -2
          解释: 7/-3 = truncate(-2.33333..) = -2
         */
        System.out.println(divideTwoIntegers.divide(7, -3));
    }
}
