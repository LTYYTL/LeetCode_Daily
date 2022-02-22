package com.leetcode.L801_900.L0838;

public class PushDominoesTest {
    public static void main(String[] args) {
        PushDominoes pushDominoes = new PushDominoes();
        /**
         * 示例 1：
         * 输入：dominoes = "RR.L"
         * 输出："RR.L"
         * 解释：第一张多米诺骨牌没有给第二张施加额外的力。
         */
        System.out.println(pushDominoes.pushDominoes("RR.L"));
        /**
         * 示例 2：
         * 输入：dominoes = ".L.R...LR..L.."
         * 输出："LL.RR.LLRRLL.."
         */
        System.out.println(pushDominoes.pushDominoes(".L.R...LR..L.."));
    }
}
