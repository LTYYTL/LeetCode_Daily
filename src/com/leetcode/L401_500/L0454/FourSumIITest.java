package com.leetcode.L401_500.L0454;

public class FourSumIITest {
    public static void main(String[] args) {
        FourSumII fourSumII = new FourSumII();
        /*** 例如:
         * 输入:
         * A = [ 1, 2]
         * B = [-2,-1]
         * C = [-1, 2]
         * D = [ 0, 2]
         * 输出:
         * 2
         */
        int[] A = {1,2};
        int[] B = {-2,-1};
        int[] C = {-1,2};
        int[] D = {0,2};
        System.out.println(fourSumII.fourSumCount(A,B,C,D));
    }
}
