package com.offerII.L083;

public class PermutationsTest {
    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        /*
          示例 1：
          输入：nums = [1,2,3]
          输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
         */
        System.out.println(permutations.permute(new int[]{1, 2, 3}));
        /*
          示例 2：
          输入：nums = [0,1]
          输出：[[0,1],[1,0]]
         */
        System.out.println(permutations.permute(new int[]{0, 1}));
        /*
          示例 3：
          输入：nums = [1]
          输出：[[1]]
         */
        System.out.println(permutations.permute(new int[]{1}));
    }
}
