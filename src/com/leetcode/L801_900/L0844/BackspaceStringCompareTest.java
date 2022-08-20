package com.leetcode.L801_900.L0844;

public class BackspaceStringCompareTest {
    public static void main(String[] args) {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        /*
          示例 1：
          输入：S = "ab#c", T = "ad#c"
          输出：true
          解释：S 和 T 都会变成 “ac”。
         */
        System.out.println(backspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        /*
          示例 2：
          输入：S = "ab##", T = "c#d#"
          输出：true
          解释：S 和 T 都会变成 “”。
         */
        System.out.println(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        /*
          示例 3：
          输入：S = "a##c", T = "#a#c"
          输出：true
          解释：S 和 T 都会变成 “c”。
         */
        System.out.println(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
        /*
          示例 4：
          输入：S = "a#c", T = "b"
          输出：false
          解释：S 会变成 “c”，但 T 仍然是 “b”。
         */
        System.out.println(backspaceStringCompare.backspaceCompare("a#c", "b"));
    }
}
