package com.leetcode.L2101_2200.L2169;

/**
 * 2169. 得到 0 的操作数
 * 给你两个 非负 整数 num1 和 num2 。
 * 每一步 操作 中，如果 num1 >= num2 ，你必须用 num1 减 num2 ；否则，你必须用 num2 减 num1 。
 * 例如，num1 = 5 且 num2 = 4 ，应该用 num1 减 num2 ，因此，得到 num1 = 1 和 num2 = 4 。
 * 然而，如果 num1 = 4且 num2 = 5 ，一步操作后，得到 num1 = 4 和 num2 = 1 。
 * 返回使 num1 = 0 或 num2 = 0 的 操作数 。
 *
 * 示例 1：
 * 输入：num1 = 2, num2 = 3
 * 输出：3
 * 解释：
 * - 操作 1 ：num1 = 2 ，num2 = 3 。由于 num1 < num2 ，num2 减 num1 得到 num1 = 2 ，num2 = 3 - 2 = 1 。
 * - 操作 2 ：num1 = 2 ，num2 = 1 。由于 num1 > num2 ，num1 减 num2 。
 * - 操作 3 ：num1 = 1 ，num2 = 1 。由于 num1 == num2 ，num1 减 num2 。
 * 此时 num1 = 0 ，num2 = 1 。由于 num1 == 0 ，不需要再执行任何操作。
 * 所以总操作数是 3 。
 *
 * 示例 2：
 * 输入：num1 = 10, num2 = 10
 * 输出：1
 * 解释：
 * - 操作 1 ：num1 = 10 ，num2 = 10 。由于 num1 == num2 ，num1 减 num2 得到 num1 = 10 - 10 = 0 。
 * 此时 num1 = 0 ，num2 = 10 。由于 num1 == 0 ，不需要再执行任何操作。
 * 所以总操作数是 1 。
 *
 * 提示：
 * 0 <= num1, num2 <= 105
 */
public class CountOperationsZero {
    /**
     * 方法：数学
     * @param num1
     * @param num2
     * @return
     */
    public int countOperations(int num1, int num2) {
        //结果
        int res = 0;
        //有一方为0就退出循环
        while (num1 != 0 && num2 != 0){
            //用大的减小的
            if (num1 > num2)
                num1 -= num2;
            else if (num1 < num2)
                num2 -= num1;
            else {
                num1 = 0;
                num2 = 0;
            }
            //增加操作次数
            res++;
        }
        return res;
    }
}
