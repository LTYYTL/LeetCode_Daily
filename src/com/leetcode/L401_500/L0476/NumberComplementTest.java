package com.leetcode.L401_500.L0476;

public class NumberComplementTest {
    public static void main(String[] args) {
        NumberComplement numberComplement = new NumberComplement();
        /*
          示例 1：
          输入：num = 5
          输出：2
          解释：5 的二进制表示为 101（没有前导零位），其补数为 010。所以你需要输出 2 。
         */
        System.out.println(numberComplement.findComplement(5));
        /*
          示例 2：
          输入：num = 1
          输出：0
          解释：1 的二进制表示为 1（没有前导零位），其补数为 0。所以你需要输出 0 。
         */
        System.out.println(numberComplement.findComplement(1));
    }
}
