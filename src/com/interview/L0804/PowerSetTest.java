package com.interview.L0804;

public class PowerSetTest {
    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        /**
         * 示例:
         *  输入： nums = [1,2,3]
         *  输出：
         * [
         *   [3],
         *   [1],
         *   [2],
         *   [1,2,3],
         *   [1,3],
         *   [2,3],
         *   [1,2],
         *   []
         * ]
         */
        System.out.println(powerSet.subsets(new int[]{1, 2, 3}));
    }
}
