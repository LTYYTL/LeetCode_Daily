package com.leetcode.L1101_1200.L1190;

public class ReverseSubstringsBetweenEachPairParenthesesTest {
    public static void main(String[] args) {
        ReverseSubstringsBetweenEachPairParentheses reverseSubstringsBetweenEachPairParentheses = new ReverseSubstringsBetweenEachPairParentheses();
        /* 示例 1：
         输入：s = "(abcd)"
         输出："dcba"
         */
        System.out.println(reverseSubstringsBetweenEachPairParentheses.reverseParentheses("(abcd)"));
        /*
          示例 2：
          输入：s = "(u(love)i)"
          输出："iloveu"
         */
        System.out.println(reverseSubstringsBetweenEachPairParentheses.reverseParentheses("(u(love)i)"));
        /*
          示例 3：
          输入：s = "(ed(et(oc))el)"
          输出："leetcode"
         */
        System.out.println(reverseSubstringsBetweenEachPairParentheses.reverseParentheses("(ed(et(oc))el)"));
        /*
          示例 4：
          输入：s = "a(bcdefghijkl(mno)p)q"
          输出："apmnolkjihgfedcbq"
         */
        System.out.println(reverseSubstringsBetweenEachPairParentheses.reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }
}
