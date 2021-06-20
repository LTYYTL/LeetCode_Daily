package com.LSP.L0002;

public class CompleteHalfProblemTest {
    public static void main(String[] args) {
        CompleteHalfProblem completeHalfProblem = new CompleteHalfProblem();
        /** * 示例 1：
         * 输入：questions = [2,1,6,2]
         * 输出：1
         * 解释：有 2 位扣友在 4 道题目中选择 2 题。
         * 可选择完成知识点类型为 2 的题目时，此时仅一种知识点类型
         * 因此至少包含 1 种知识点类型。
         */
        System.out.println(completeHalfProblem.halfQuestions(new int[]{2, 1, 6, 2}));
        /**
         * 示例 2：
         * 输入：questions = [1,5,1,3,4,5,2,5,3,3,8,6]
         * 输出：2
         * 解释：有 6 位扣友在 12 道题目中选择题目，需要选择 6 题。
         * 选择完成知识点类型为 3、5 的题目，因此至少包含 2 种知识点类型。
         */
        System.out.println(completeHalfProblem.halfQuestions(new int[]{1,5,1,3,4,5,2,5,3,3,8,6}));
    }
}
