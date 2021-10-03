package com.leetcode.L1_100.L0070;

public class ClimbStairsTest {
    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();

        /**
         * 示例 1：
         * 输入： 2
         * 输出： 2
         * 解释： 有两种方法可以爬到楼顶。
         * 1.  1 阶 + 1 阶
         * 2.  2 阶
         */
        System.out.println("有"+climbStairs.climbStairs(2)+"种方式");

        /**
         * 示例 2：
         * 输入： 3
         * 输出： 3
         * 解释： 有三种方法可以爬到楼顶。
         * 1.  1 阶 + 1 阶 + 1 阶
         * 2.  1 阶 + 2 阶
         * 3.  2 阶 + 1 阶
         */
        System.out.println("有"+climbStairs.climbStairs(3)+"种方式");
    }
}
