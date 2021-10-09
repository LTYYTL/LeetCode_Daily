package com.leetcode.L101_200.L0187;

public class RepeatedDNASequencesTest {
    public static void main(String[] args) {
        RepeatedDNASequences repeatedDNASequences = new RepeatedDNASequences();
        /**
         * 示例 1：
         * 输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
         * 输出：["AAAAACCCCC","CCCCCAAAAA"]
         */
        System.out.println(repeatedDNASequences.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        /**
         * 示例 2：
         * 输入：s = "AAAAAAAAAAAAA"
         * 输出：["AAAAAAAAAA"]
         */
        System.out.println(repeatedDNASequences.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
    }
}
