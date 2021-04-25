package com.leetcode.L1838;

public class FrequencyMostFrequentElementTest {
    public static void main(String[] args) {
        FrequencyMostFrequentElement frequencyMostFrequentElement = new FrequencyMostFrequentElement();
        /** * 示例 1：
         * 输入：nums = [1,2,4], k = 5
         * 输出：3
         * 解释：对第一个元素执行 3 次递增操作，对第二个元素执 2 次递增操作，此时 nums = [4,4,4] 。
         * 4 是数组中最高频元素，频数是 3 。
         */
        System.out.println(frequencyMostFrequentElement.maxFrequency(new int[]{1, 2, 4}, 6));
        /**
         * 示例 2：
         * 输入：nums = [1,4,8,13], k = 5
         * 输出：2
         * 解释：存在多种最优解决方案：
         * - 对第一个元素执行 3 次递增操作，此时 nums = [4,4,8,13] 。4 是数组中最高频元素，频数是 2 。
         * - 对第二个元素执行 4 次递增操作，此时 nums = [1,8,8,13] 。8 是数组中最高频元素，频数是 2 。
         * - 对第三个元素执行 5 次递增操作，此时 nums = [1,4,13,13] 。13 是数组中最高频元素，频数是 2 。
         */
        System.out.println(frequencyMostFrequentElement.maxFrequency(new int[]{1, 4, 8, 13}, 5));
    }
}
