package com.leetcode.L701_800.L0798;

public class SmallestRotationScoreTest {
    public static void main(String[] args) {
        SmallestRotationScore smallestRotationScore = new SmallestRotationScore();
        /**
         * 示例 1：
         * 输入：nums = [2,3,1,4,0]
         * 输出：3
         * 解释：
         * 下面列出了每个 k 的得分：
         * k = 0,  nums = [2,3,1,4,0],    score 2
         * k = 1,  nums = [3,1,4,0,2],    score 3
         * k = 2,  nums = [1,4,0,2,3],    score 3
         * k = 3,  nums = [4,0,2,3,1],    score 4
         * k = 4,  nums = [0,2,3,1,4],    score 3
         * 所以我们应当选择 k = 3，得分最高。
         */
        System.out.println(smallestRotationScore.bestRotation(new int[]{2, 3, 1, 4, 0}));
        /**
         * 示例 2：
         * 输入：nums = [1,3,0,2,4]
         * 输出：0
         * 解释：
         * nums 无论怎么变化总是有 3 分。
         * 所以我们将选择最小的 k，即 0。
         */
        System.out.println(smallestRotationScore.bestRotation(new int[]{1, 3, 0, 2, 4}));
    }
}
