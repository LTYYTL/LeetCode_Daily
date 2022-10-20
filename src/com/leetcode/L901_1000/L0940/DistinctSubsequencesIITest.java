package com.leetcode.L901_1000.L0940;

public class DistinctSubsequencesIITest {
    public static void main(String[] args) {
        DistinctSubsequencesII distinctSubsequencesII = new DistinctSubsequencesII();
        /*
          示例 1：
          输入：s = "abc"
          输出：7
          解释：7 个不同的子序列分别是 "a", "b", "c", "ab", "ac", "bc", 以及 "abc"。
         */
        System.out.println(distinctSubsequencesII.distinctSubseqII("abc"));
        /*
          示例 2：
          输入：s = "aba"
          输出：6
          解释：6 个不同的子序列分别是 "a", "b", "ab", "ba", "aa" 以及 "aba"。
         */
        System.out.println(distinctSubsequencesII.distinctSubseqII("aba"));
        /*
          示例 3：
          输入：s = "aaa"
          输出：3
          解释：3 个不同的子序列分别是 "a", "aa" 以及 "aaa"。
         */
        System.out.println(distinctSubsequencesII.distinctSubseqII("aaa"));
    }
}
