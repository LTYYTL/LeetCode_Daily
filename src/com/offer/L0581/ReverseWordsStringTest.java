package com.offer.L0581;

public class ReverseWordsStringTest {
    public static void main(String[] args) {
        ReverseWordsString reverseWordsString = new ReverseWordsString();
        /*
          示例 1：
          输入：s = "the sky is blue"
          输出："blue is sky the"
         */
        System.out.println(reverseWordsString.reverseWords("the sky is blue"));
        /*
          示例 2：
          输入：s = "  hello world  "
          输出："world hello"
          解释：输入字符串可以在前面或者后面包含多余的空格，但是翻转后的字符不能包括。
         */
        System.out.println(reverseWordsString.reverseWords("  hello world  "));
        /*
          示例 3：
          输入：s = "a good   example"
          输出："example good a"
          解释：如果两个单词间有多余的空格，将翻转后单词间的空格减少到只含一个。
         */
        System.out.println(reverseWordsString.reverseWords("a good   example"));
        /*
          示例 4：
          输入：s = "  Bob    Loves  Alice   "
          输出："Alice Loves Bob"
         */
        System.out.println(reverseWordsString.reverseWords("  Bob    Loves  Alice   "));
        /*
          示例 5：
          输入：s = "Alice does not even like bob"
          输出："bob like even not does Alice"
         */
        System.out.println(reverseWordsString.reverseWords("Alice does not even like bob"));
    }
}
