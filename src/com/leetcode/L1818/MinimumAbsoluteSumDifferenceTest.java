package com.leetcode.L1818;

public class MinimumAbsoluteSumDifferenceTest {
    public static void main(String[] args) {
        MinimumAbsoluteSumDifference minimumAbsoluteSumDifference = new MinimumAbsoluteSumDifference();
        /**
         * 输入：nums1 = [1,7,5], nums2 = [2,3,5]
         * 输出：3
         * 解释：有两种可能的最优方案：
         * - 将第二个元素替换为第一个元素：[1,7,5] => [1,1,5] ，或者
         * - 将第二个元素替换为第三个元素：[1,7,5] => [1,5,5]
         * 两种方案的绝对差值和都是 |1-2| + (|1-3| 或者 |5-3|) + |5-5| = 3
         * 示例 2：
         */
        System.out.println(minimumAbsoluteSumDifference.minAbsoluteSumDiff(new int[]{1, 7, 5}, new int[]{2, 3, 5}));
        /**
         * 输入：nums1 = [2,4,6,8,10], nums2 = [2,4,6,8,10]
         * 输出：0
         * 解释：nums1 和 nums2 相等，所以不用替换元素。绝对差值和为 0
         * 示例 3：
         */
        System.out.println(minimumAbsoluteSumDifference.minAbsoluteSumDiff(new int[]{2,4,6,8,10}, new int[]{2,4,6,8,10}));
        /**
         * 输入：nums1 = [1,10,4,4,2,7], nums2 = [9,3,5,1,7,4]
         * 输出：20
         * 解释：将第一个元素替换为第二个元素：[1,10,4,4,2,7] => [10,10,4,4,2,7]
         * 绝对差值和为 |10-9| + |10-3| + |4-5| + |4-1| + |2-7| + |7-4| = 20
         */
        System.out.println(minimumAbsoluteSumDifference.minAbsoluteSumDiff(new int[]{1,10,4,4,2,7}, new int[]{9,3,5,1,7,4}));
    }
}
