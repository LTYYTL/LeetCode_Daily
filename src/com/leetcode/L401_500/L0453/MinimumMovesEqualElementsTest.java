package com.leetcode.L401_500.L0453;

public class MinimumMovesEqualElementsTest {
    public static void main(String[] args) {
        MinimumMovesEqualElements minimumMovesEqualElements = new MinimumMovesEqualElements();
        /*
          示例 1：
          输入：nums = [1,2,3]
          输出：3
          解释：
          只需要3次操作（注意每次操作会增加两个元素的值）：
          [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
         */
        System.out.println(minimumMovesEqualElements.minMoves(new int[]{1, 2, 3}));
        /*
          示例 2：
          输入：nums = [1,1,1]
          输出：0
         */
        System.out.println(minimumMovesEqualElements.minMoves(new int[]{1, 1, 1}));
    }
}
