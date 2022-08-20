package com.leetcode.L1301_1400.L1342;

public class StepsReduceZeroTest {
    public static void main(String[] args) {
        StepsReduceZero stepsReduceZero = new StepsReduceZero();
        /*
          示例 1：
          输入：num = 14
          输出：6
          解释：
          步骤 1) 14 是偶数，除以 2 得到 7 。
          步骤 2） 7 是奇数，减 1 得到 6 。
          步骤 3） 6 是偶数，除以 2 得到 3 。
          步骤 4） 3 是奇数，减 1 得到 2 。
          步骤 5） 2 是偶数，除以 2 得到 1 。
          步骤 6） 1 是奇数，减 1 得到 0 。
         */
        System.out.println(stepsReduceZero.numberOfSteps(14));
        /*
          示例 2：
          输入：num = 8
          输出：4
          解释：
          步骤 1） 8 是偶数，除以 2 得到 4 。
          步骤 2） 4 是偶数，除以 2 得到 2 。
          步骤 3） 2 是偶数，除以 2 得到 1 。
          步骤 4） 1 是奇数，减 1 得到 0 。
         */
        System.out.println(stepsReduceZero.numberOfSteps(8));
        /*
          示例 3：
          输入：num = 123
          输出：12
         */
        System.out.println(stepsReduceZero.numberOfSteps(123));
    }
}
