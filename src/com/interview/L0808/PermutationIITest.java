package com.interview.L0808;

import java.util.Arrays;

public class PermutationIITest {
    public static void main(String[] args) {
        PermutationII permutationII = new PermutationII();
        /*
          示例1:
           输入：S = "qqe"
           输出：["eqq","qeq","qqe"]
         */
        System.out.println(Arrays.toString(permutationII.permutation("qqe")));
        /*
          示例2:
           输入：S = "ab"
           输出：["ab", "ba"]
         */
        System.out.println(Arrays.toString(permutationII.permutation("ab")));
    }
}
