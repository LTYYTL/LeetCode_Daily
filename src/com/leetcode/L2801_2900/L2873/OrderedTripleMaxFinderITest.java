package com.leetcode.L2801_2900.L2873;

public class OrderedTripleMaxFinderITest {
    public static void main(String[] args) {
        OrderedTripleMaxFinderI orderedTripleMaxFinder = new OrderedTripleMaxFinderI();
        /*
         * 示例 1：
         * 输入：nums = [12,6,1,2,7]
         * 输出：77
         * 解释：下标三元组 (0, 2, 4) 的值是 (nums[0] - nums[2]) * nums[4] = 77 。
         * 可以证明不存在值大于 77 的有序下标三元组。
         */
        System.out.println(orderedTripleMaxFinder.maximumTripletValue(new int[]{12, 6, 1, 2, 7}));
        /*
         * 示例 2：
         * 输入：nums = [1,10,3,4,19]
         * 输出：133
         * 解释：下标三元组 (1, 2, 4) 的值是 (nums[1] - nums[2]) * nums[4] = 133 。
         * 可以证明不存在值大于 133 的有序下标三元组。
         */
        System.out.println(orderedTripleMaxFinder.maximumTripletValue(new int[]{1, 10, 3, 4, 19}));

        /*
         * 示例 3：
         * 输入：nums = [1,2,3]
         * 输出：0
         * 解释：唯一的下标三元组 (0, 1, 2) 的值是一个负数，(nums[0] - nums[1]) * nums[2] = -3 。因此，答案是 0 。
         *
         */
        System.out.println(orderedTripleMaxFinder.maximumTripletValue(new int[]{1, 2, 3}));
    }
}
