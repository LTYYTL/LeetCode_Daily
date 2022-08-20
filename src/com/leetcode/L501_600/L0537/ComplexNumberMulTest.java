package com.leetcode.L501_600.L0537;

public class ComplexNumberMulTest {
    public static void main(String[] args) {
        ComplexNumberMul complexNumberMul = new ComplexNumberMul();
        /*
          示例 1：
          输入：num1 = "1+1i", num2 = "1+1i"
          输出："0+2i"
          解释：(1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。
         */
        System.out.println(complexNumberMul.complexNumberMultiply("1+1i", "1+1i"));
        /*
          示例 2：
          输入：num1 = "1+-1i", num2 = "1+-1i"
          输出："0+-2i"
          解释：(1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i ，你需要将它转换为 0+-2i 的形式。
         */
        System.out.println(complexNumberMul.complexNumberMultiply("1+-1i", "1+-1i"));
    }
}
