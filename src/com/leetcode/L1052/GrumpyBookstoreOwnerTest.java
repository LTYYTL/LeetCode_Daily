package com.leetcode.L1052;


public class GrumpyBookstoreOwnerTest {
    public static void main(String[] args) {
        GrumpyBookstoreOwner grumpyBookstoreOwner = new GrumpyBookstoreOwner();
        /**
         * 示例：
         * 输入：customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], X = 3
         * 输出：16
         * 解释：
         * 书店老板在最后 3 分钟保持冷静。
         * 感到满意的最大客户数量 = 1 + 1 + 1 + 1 + 7 + 5 = 16.
         */
        int[] customers = new int[]{1,0,1,2,1,1,7,5};
        int[] grumpy = new int[]{0,1,0,1,0,1,0,1};
        System.out.println(grumpyBookstoreOwner.maxSatisfied(customers,grumpy,3));
    }
}
