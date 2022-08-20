package com.leetcode.L501_600.L0519;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        /*
          示例：
          输入
          ["Solution", "flip", "flip", "flip", "reset", "flip"]
          [[3, 1], [], [], [], [], []]
          输出
          [null, [1, 0], [2, 0], [0, 0], null, [2, 0]]
          解释
          Solution solution = new Solution(3, 1);
          solution.flip();  // 返回 [1, 0]，此时返回 [0,0]、[1,0] 和 [2,0] 的概率应当相同
          solution.flip();  // 返回 [2, 0]，因为 [1,0] 已经返回过了，此时返回 [2,0] 和 [0,0] 的概率应当相同
          solution.flip();  // 返回 [0, 0]，根据前面已经返回过的下标，此时只能返回 [0,0]
          solution.reset(); // 所有值都重置为 0 ，并可以再次选择下标返回
          solution.flip();  // 返回 [2, 0]，此时返回 [0,0]、[1,0] 和 [2,0] 的概率应当相同
         */
        Solution solution = new Solution(3, 1);
        System.out.println(Arrays.toString(solution.flip()));
        System.out.println(Arrays.toString(solution.flip()));
        System.out.println(Arrays.toString(solution.flip()));
        solution.reset();
        System.out.println(Arrays.toString(solution.flip()));
    }
}
