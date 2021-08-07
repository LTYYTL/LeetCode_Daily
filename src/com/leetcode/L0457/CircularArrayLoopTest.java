package com.leetcode.L0457;

public class CircularArrayLoopTest {
    public static void main(String[] args) {
        CircularArrayLoop circularArrayLoop = new CircularArrayLoop();
        /**
         * 示例 1：
         * 输入：nums = [2,-1,1,2,2]
         * 输出：true
         * 解释：存在循环，按下标 0 -> 2 -> 3 -> 0 。循环长度为 3 。
         */
        System.out.println(circularArrayLoop.circularArrayLoop(new int[]{2, -1, 1, 2, 2}));
        /**
         * 示例 2：
         * 输入：nums = [-1,2]
         * 输出：false
         * 解释：按下标 1 -> 1 -> 1 ... 的运动无法构成循环，因为循环的长度为 1 。根据定义，循环的长度必须大于 1 。
         */
        System.out.println(circularArrayLoop.circularArrayLoop(new int[]{-1,2}));
        /**
         * 示例 3:
         * 输入：nums = [-2,1,-1,-2,-2]
         * 输出：false
         * 解释：按下标 1 -> 2 -> 1 -> ... 的运动无法构成循环，因为 nums[1] 是正数，而 nums[2] 是负数。
         * 所有 nums[seq[j]] 应当不是全正就是全负。
         */
        System.out.println(circularArrayLoop.circularArrayLoop(new int[]{1,2,3,4,5}));
    }
}
