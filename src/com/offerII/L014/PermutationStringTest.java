package com.offerII.L014;

public class PermutationStringTest {
    public static void main(String[] args) {
        PermutationString permutationString = new PermutationString();
        /**
         * 示例 1：
         * 输入: s1 = "ab" s2 = "eidbaooo"
         * 输出: True
         * 解释: s2 包含 s1 的排列之一 ("ba").
         */
        System.out.println(permutationString.checkInclusion("ab", "eidbaooo"));
        /**
         * 示例 2
         * 输入: s1= "ab" s2 = "eidboaoo"
         * 输出: False
         */
        System.out.println(permutationString.checkInclusion("ab", "eidboaoo"));
    }
}
