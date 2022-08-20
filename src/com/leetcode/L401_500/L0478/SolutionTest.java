package com.leetcode.L401_500.L0478;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        /*
          示例 1：
          输入:
          ["Solution","randPoint","randPoint","randPoint"]
          [[1.0, 0.0, 0.0], [], [], []]
          输出: [null, [-0.02493, -0.38077], [0.82314, 0.38945], [0.36572, 0.17248]]
          解释:
          Solution solution = new Solution(1.0, 0.0, 0.0);
          solution.randPoint ();//返回[-0.02493，-0.38077]
          solution.randPoint ();//返回[0.82314,0.38945]
          solution.randPoint ();//返回[0.36572,0.17248]
         */
        Solution solution = new Solution(1.0, 0.0, 0.0);
        System.out.println(Arrays.toString(solution.randPoint()));
    }
}
