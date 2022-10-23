package com.leetcode.L1701_1800.L1768;

public class MergeStringsTest {
    public static void main(String[] args) {
        MergeStrings mergeStrings = new MergeStrings();
        /*
          示例 1：
          输入：word1 = "abc", word2 = "pqr"
          输出："apbqcr"
          解释：字符串合并情况如下所示：
          word1：  a   b   c
          word2：    p   q   r
          合并后：  a p b q c r
         */
        System.out.println(mergeStrings.mergeAlternately("abc", "pqr"));
        /*
          示例 2：
          输入：word1 = "ab", word2 = "pqrs"
          输出："apbqrs"
          解释：注意，word2 比 word1 长，"rs" 需要追加到合并后字符串的末尾。
          word1：  a   b
          word2：    p   q   r   s
          合并后：  a p b q   r   s
         */
        System.out.println(mergeStrings.mergeAlternately("ab", "pqrs"));
        /*
          示例 3：
          输入：word1 = "abcd", word2 = "pq"
          输出："apbqcd"
          解释：注意，word1 比 word2 长，"cd" 需要追加到合并后字符串的末尾。
          word1：  a   b   c   d
          word2：    p   q
          合并后：  a p b q c   d
         */
        System.out.println(mergeStrings.mergeAlternately("abcd", "pq"));
    }
}
