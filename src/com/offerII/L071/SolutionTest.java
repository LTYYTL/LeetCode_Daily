package com.offerII.L071;

public class SolutionTest {
    public static void main(String[] args) {
        /** * 示例 1：
         * 输入：
         * inputs = ["Solution","pickIndex"]
         * inputs = [[[1]],[]]
         * 输出：
         * [null,0]
         * 解释：
         * Solution solution = new Solution([1]);
         * solution.pickIndex(); // 返回 0，因为数组中只有一个元素，所以唯一的选择是返回下标 0。
         */
        Solution solution = new Solution(new int[]{1});
        System.out.println(solution.pickIndex());
        /**
         * 示例 2：
         * 输入：
         * inputs = ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
         * inputs = [[[1,3]],[],[],[],[],[]]
         * 输出：
         * [null,1,1,1,1,0]
         * 解释：
         * Solution solution = new Solution([1, 3]);
         * solution.pickIndex(); // 返回 1，返回下标 1，返回该下标概率为 3/4 。
         * solution.pickIndex(); // 返回 1
         * solution.pickIndex(); // 返回 1
         * solution.pickIndex(); // 返回 1
         * solution.pickIndex(); // 返回 0，返回下标 0，返回该下标概率为 1/4 。
         */


         }
}
