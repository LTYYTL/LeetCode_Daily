package com.offerII.L104;

public class CombinationSumIVTest {
    public static void main(String[] args) {
        CombinationSumIV combinationSumIV = new CombinationSumIV();
        /*
          示例 1：
          输入：nums = [1,2,3], target = 4
          输出：7
          解释：
          所有可能的组合为：
          (1, 1, 1, 1)
          (1, 1, 2)
          (1, 2, 1)
          (1, 3)
          (2, 1, 1)
          (2, 2)
          (3, 1)
          请注意，顺序不同的序列被视作不同的组合。
         */
        System.out.println(combinationSumIV.combinationSum4(new int[]{1, 2, 3}, 4));
        /*
          示例 2：
          输入：nums = [9], target = 3
          输出：0
         */
        System.out.println(combinationSumIV.combinationSum4(new int[]{9}, 3));
    }
}
