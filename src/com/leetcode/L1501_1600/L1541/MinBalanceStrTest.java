package com.leetcode.L1501_1600.L1541;

public class MinBalanceStrTest {
    public static void main(String[] args) {
        MinBalanceStr minBalanceStr = new MinBalanceStr();
        /*
          示例 1：
          输入：s = "(()))"
          输出：1
          解释：第二个左括号有与之匹配的两个右括号，但是第一个左括号只有一个右括号。我们需要在字符串结尾额外增加一个 ')' 使字符串变成平衡字符串 "(())))" 。
         */
        System.out.println(minBalanceStr.minInsertions("(()))"));
        /*
          示例 2：
          输入：s = "())"
          输出：0
          解释：字符串已经平衡了。
         */
        System.out.println(minBalanceStr.minInsertions("())"));
        /*
          示例 3：
          输入：s = "))())("
          输出：3
          解释：添加 '(' 去匹配最开头的 '))' ，然后添加 '))' 去匹配最后一个 '(' 。
         */
        System.out.println(minBalanceStr.minInsertions("))())("));
        /*
          示例 4：
          输入：s = "(((((("
          输出：12
          解释：添加 12 个 ')' 得到平衡字符串。
         */
        System.out.println(minBalanceStr.minInsertions("(((((("));
        /*
          示例 5：
          输入：s = ")))))))"
          输出：5
          解释：在字符串开头添加 4 个 '(' 并在结尾添加 1 个 ')' ，字符串变成平衡字符串 "(((())))))))" 。
         */
        System.out.println(minBalanceStr.minInsertions(")))))))"));
    }
}
