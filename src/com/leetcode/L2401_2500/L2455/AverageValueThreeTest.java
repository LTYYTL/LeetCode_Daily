package com.leetcode.L2401_2500.L2455;

public class AverageValueThreeTest {
    public static void main(String[] args) {
        AverageValueThree averageValueThree = new AverageValueThree();
        /*
          示例 1：
          输入：nums = [1,3,6,10,12,15]
          输出：9
          解释：6 和 12 是可以被 3 整除的偶数。(6 + 12) / 2 = 9 。
         */
        System.out.println(averageValueThree.averageValue(new int[]{1, 3, 6, 10, 12, 15}));
        /*
          示例 2：
          输入：nums = [1,2,4,7,10]
          输出：0
          解释：不存在满足题目要求的整数，所以返回 0 。
         */
        System.out.println(averageValueThree.averageValue(new int[]{1, 2, 4, 7, 10}));
    }
}
