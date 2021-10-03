package com.leetcode.L501_600.L0517;

public class SuperWashingMachinesTest {
    public static void main(String[] args) {
        SuperWashingMachines superWashingMachines = new SuperWashingMachines();
        /**
         * 示例 1：
         * 输入：machines = [1,0,5]
         * 输出：3
         * 解释：
         * 第一步:    1     0 <-- 5    =>    1     1     4
         * 第二步:    1 <-- 1 <-- 4    =>    2     1     3
         * 第三步:    2     1 <-- 3    =>    2     2     2
         */
        System.out.println(superWashingMachines.findMinMoves(new int[]{1, 0, 5}));
        /**
         * 示例 2：
         * 输入：machines = [0,3,0]
         * 输出：2
         * 解释：
         * 第一步:    0 <-- 3     0    =>    1     2     0
         * 第二步:    1     2 --> 0    =>    1     1     1
         */
        System.out.println(superWashingMachines.findMinMoves(new int[]{0, 3, 0}));
        /**
         * 示例 3：
         * 输入：machines = [0,2,0]
         * 输出：-1
         * 解释：
         * 不可能让所有三个洗衣机同时剩下相同数量的衣物。
         */
        System.out.println(superWashingMachines.findMinMoves(new int[]{0, 2, 0}));
    }
}
