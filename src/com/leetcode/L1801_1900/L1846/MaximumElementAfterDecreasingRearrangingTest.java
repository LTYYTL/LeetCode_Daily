package com.leetcode.L1801_1900.L1846;

public class MaximumElementAfterDecreasingRearrangingTest {
    public static void main(String[] args) {
        MaximumElementAfterDecreasingRearranging maximumElementAfterDecreasingRearranging = new MaximumElementAfterDecreasingRearranging();
        /*
          示例 1：
          输入：arr = [2,2,1,2,1]
          输出：2
          解释：
          我们可以重新排列 arr 得到 [1,2,2,2,1] ，该数组满足所有条件。
          arr 中最大元素为 2 。
         */
        System.out.println(maximumElementAfterDecreasingRearranging.maximumElementAfterDecrementingAndRearranging(new int[]{2, 2, 1, 2, 1}));
        System.out.println(maximumElementAfterDecreasingRearranging.maximumElementAfterDecrementingAndRearranging_count(new int[]{2, 2, 1, 2, 1}));
        /*
          示例 2：
          输入：arr = [100,1,1000]
          输出：3
          解释：
          一个可行的方案如下：
          1. 重新排列 arr 得到 [1,100,1000] 。
          2. 将第二个元素减小为 2 。
          3. 将第三个元素减小为 3 。
          现在 arr = [1,2,3] ，满足所有条件。
          arr 中最大元素为 3 。
         */
        System.out.println(maximumElementAfterDecreasingRearranging.maximumElementAfterDecrementingAndRearranging(new int[]{1, 100, 100}));
        System.out.println(maximumElementAfterDecreasingRearranging.maximumElementAfterDecrementingAndRearranging_count(new int[]{1, 100, 100}));
        /*
          示例 3：
          输入：arr = [1,2,3,4,5]
          输出：5
          解释：数组已经满足所有条件，最大元素为 5 。
         */
        System.out.println(maximumElementAfterDecreasingRearranging.maximumElementAfterDecrementingAndRearranging(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maximumElementAfterDecreasingRearranging.maximumElementAfterDecrementingAndRearranging_count(new int[]{1, 2, 3, 4, 5}));
    }
}
