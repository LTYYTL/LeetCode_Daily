package com.leetcode.L701_800.L0779;

public class KSymbolGrammarTest {
    public static void main(String[] args) {
        KSymbolGrammar kSymbolGrammar = new KSymbolGrammar();
        /*
          示例 1:
          输入: n = 1, k = 1
          输出: 0
          解释: 第一行：0
         */
        System.out.println(kSymbolGrammar.kthGrammar(1, 1));
        /*
          示例 2:
          输入: n = 2, k = 1
          输出: 0
          解释:
          第一行: 0
          第二行: 01
         */
        System.out.println(kSymbolGrammar.kthGrammar(2, 1));
        /*
          示例 3:
          输入: n = 2, k = 2
          输出: 1
          解释:
          第一行: 0
          第二行: 01
         */
        System.out.println(kSymbolGrammar.kthGrammar(2, 2));
    }
}
