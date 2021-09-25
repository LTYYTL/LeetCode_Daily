package com.leetcode.L0583;

public class DeleteOperationTwoStringsTest {
    public static void main(String[] args) {
        DeleteOperationTwoStrings deleteOperationTwoStrings = new DeleteOperationTwoStrings();
        /**
         * 示例：
         * 输入: "sea", "eat"
         * 输出: 2
         * 解释: 第一步将"sea"变为"ea"，第二步将"eat"变为"ea"
         */
        System.out.println(deleteOperationTwoStrings.minDistance("sea", "eat"));
    }
}
