package com.leetcode.L1401_1500.L1470;

import java.util.Arrays;

public class ShuffleArrayTest {
    public static void main(String[] args) {
        ShuffleArray shuffleArray = new ShuffleArray();
        /**
         * 示例 1：
         * 输入：nums = [2,5,1,3,4,7], n = 3
         * 输出：[2,3,5,4,1,7]
         * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
         */
        System.out.println(Arrays.toString(shuffleArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
        /**
         * 示例 2：
         * 输入：nums = [1,2,3,4,4,3,2,1], n = 4
         * 输出：[1,4,2,3,3,2,4,1]
         */
        System.out.println(Arrays.toString(shuffleArray.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4)));
        /**
         * 示例 3：
         * 输入：nums = [1,1,2,2], n = 2
         * 输出：[1,2,1,2]
         */
        System.out.println(Arrays.toString(shuffleArray.shuffle(new int[]{1, 1, 2, 2}, 2)));
    }
}
