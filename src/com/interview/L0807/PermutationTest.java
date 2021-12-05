package com.interview.L0807;

import java.util.Arrays;

public class PermutationTest {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        /**
         * 示例1:
         *  输入：S = "qwe"
         *  输出：["qwe", "qew", "wqe", "weq", "ewq", "eqw"]
         */
        System.out.println(Arrays.toString(permutation.permutation("qwe")));
        /**
         * 示例2:
         *  输入：S = "ab"
         *  输出：["ab", "ba"]
         */
        System.out.println(Arrays.toString(permutation.permutation("ab")));
    }
}
