package com.leetcode.L1301_1400.L1332;

public class RemovePalindromicSubTest {
    public static void main(String[] args) {
        RemovePalindromicSub removePalindromicSub = new RemovePalindromicSub();
        /*
          示例 1：
          输入：s = "ababa"
          输出：1
          解释：字符串本身就是回文序列，只需要删除一次。
         */
        System.out.println(removePalindromicSub.removePalindromeSub("ababa"));
        /*
          示例 2：
          输入：s = "abb"
          输出：2
          解释："abb" -> "bb" -> "".
          先删除回文子序列 "a"，然后再删除 "bb"。
         */
        System.out.println(removePalindromicSub.removePalindromeSub("abb"));
        /*
          示例 3：
          输入：s = "baabb"
          输出：2
          解释："baabb" -> "b" -> "".
          先删除回文子序列 "baab"，然后再删除 "b"。
         */
        System.out.println(removePalindromicSub.removePalindromeSub("baabb"));
    }
}
