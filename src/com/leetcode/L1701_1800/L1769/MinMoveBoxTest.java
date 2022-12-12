package com.leetcode.L1701_1800.L1769;

import java.util.Arrays;

public class MinMoveBoxTest {
    public static void main(String[] args) {
        MinMoveBox minMoveBox = new MinMoveBox();
        /* * 示例 1：
          输入：boxes = "110"
          输出：[1,1,3]
          解释：每个盒子对应的最小操作数如下：
          1) 第 1 个盒子：将一个小球从第 2 个盒子移动到第 1 个盒子，需要 1 步操作。
          2) 第 2 个盒子：将一个小球从第 1 个盒子移动到第 2 个盒子，需要 1 步操作。
          3) 第 3 个盒子：将一个小球从第 1 个盒子移动到第 3 个盒子，需要 2 步操作。将一个小球从第 2 个盒子移动到第 3 个盒子，需要 1 步操作。共计 3 步操作。
         */
        System.out.println(Arrays.toString(minMoveBox.minOperations("110")));
        /*
          示例 2：
          输入：boxes = "001011"
          输出：[11,8,5,4,3,4]
         */
        System.out.println(Arrays.toString(minMoveBox.minOperations("001011")));
    }
}
