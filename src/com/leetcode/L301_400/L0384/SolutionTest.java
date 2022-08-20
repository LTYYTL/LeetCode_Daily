package com.leetcode.L301_400.L0384;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        /*
          示例：
          输入
          ["Solution", "shuffle", "reset", "shuffle"]
          [[[1, 2, 3]], [], [], []]
          输出
          [null, [3, 1, 2], [1, 2, 3], [1, 3, 2]]
          解释
          Solution solution = new Solution([1, 2, 3]);
          solution.shuffle();    // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。例如，返回 [3, 1, 2]
          solution.reset();      // 重设数组到它的初始状态 [1, 2, 3] 。返回 [1, 2, 3]
          solution.shuffle();    // 随机返回数组 [1, 2, 3] 打乱后的结果。例如，返回 [1, 3, 2]
         */
        Solution solution = new Solution(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(solution.shuffle()));
        System.out.println(Arrays.toString(solution.reset()));
        System.out.println(Arrays.toString(solution.shuffle()));
    }
}
