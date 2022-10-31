package com.leetcode.L901_1000.L0907;

public class SumSubarrayMinTest {
    public static void main(String[] args) {
        SumSubarrayMin sumSubarrayMin = new SumSubarrayMin();
        /*
          示例 1：
          输入：arr = [3,1,2,4]
          输出：17
          解释：
          子数组为 [3]，[1]，[2]，[4]，[3,1]，[1,2]，[2,4]，[3,1,2]，[1,2,4]，[3,1,2,4]。
          最小值为 3，1，2，4，1，1，2，1，1，1，和为 17。
         */
        System.out.println(sumSubarrayMin.sumSubarrayMins(new int[]{3, 1, 2, 4}));
        /*
          示例 2：
          输入：arr = [11,81,94,43,3]
          输出：444
         */
        System.out.println(sumSubarrayMin.sumSubarrayMins(new int[]{11, 81, 94, 43, 3}));
    }
}
