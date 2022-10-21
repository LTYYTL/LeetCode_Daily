package com.leetcode.L2401_2500.L2442;

import java.util.HashSet;
import java.util.Set;

/**
 * 2442. 反转之后不同整数的数目
 * 给你一个由 正 整数组成的数组 nums 。
 * 你必须取出数组中的每个整数，反转其中每个数位，并将反转后得到的数字添加到数组的末尾。
 * 这一操作只针对 nums 中原有的整数执行。
 * 返回结果数组中 不同 整数的数目。
 * <p>
 * 示例 1：
 * 输入：nums = [1,13,10,12,31]
 * 输出：6
 * 解释：反转每个数字后，结果数组是 [1,13,10,12,31,1,31,1,21,13] 。
 * 反转后得到的数字添加到数组的末尾并按斜体加粗表示。注意对于整数 10 ，反转之后会变成 01 ，即 1 。
 * 数组中不同整数的数目为 6（数字 1、10、12、13、21 和 31）。
 * <p>
 * 示例 2：
 * 输入：nums = [2,2,2]
 * 输出：1
 * 解释：反转每个数字后，结果数组是 [2,2,2,2,2,2] 。
 * 数组中不同整数的数目为 1（数字 2）。
 * <p>
 * 提示：
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 106
 */
public class CountNumberIntegers {
    /**
     * 方法：set集合
     */
    public int countDistinctIntegers(int[] nums) {
        // 记录不同的数
        Set<Integer> set = new HashSet<>();

        // 遍历
        for (int num : nums) {
            // 反转
            int s = swap(String.valueOf(num));
            // 加入集合
            set.add(num);
            set.add(s);
        }

        // 不同的个数
        return set.size();
    }

    /**
     * 反转
     */
    private int swap(String nums) {
        char[] chars = nums.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char c = chars[left];
            chars[left] = chars[right];
            chars[right] = c;
            left++;
            right--;
        }
        return Integer.parseInt(new String(chars));
    }
}
