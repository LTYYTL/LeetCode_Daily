package com.leetcode.L401_500.L0433;

public class MinGeneticMutationTest {
    public static void main(String[] args) {
        MinGeneticMutation minGeneticMutation = new MinGeneticMutation();
        /**
         * 示例 1：
         * 输入：start = "AACCGGTT", end = "AACCGGTA", bank = ["AACCGGTA"]
         * 输出：1
         */
        System.out.println(minGeneticMutation.minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"}));
        /**
         * 示例 2：
         * 输入：start = "AACCGGTT", end = "AAACGGTA", bank = ["AACCGGTA","AACCGCTA","AAACGGTA"]
         * 输出：2
         */
        System.out.println(minGeneticMutation.minMutation("AACCGGTT", "AAACGGTA", new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
        /**
         * 示例 3：
         * 输入：start = "AAAAACCC", end = "AACCCCCC", bank = ["AAAACCCC","AAACCCCC","AACCCCCC"]
         * 输出：3
         */
        System.out.println(minGeneticMutation.minMutation("AAAAACCC", "AACCCCCC", new String[]{"AAAACCCC", "AAACCCCC", "AACCCCCC"}));
    }
}
