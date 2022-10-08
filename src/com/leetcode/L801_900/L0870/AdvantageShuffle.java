package com.leetcode.L801_900.L0870;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 870. 优势洗牌
 * 给定两个大小相等的数组 nums1 和 nums2，nums1 相对于 nums2 的优势可以用满足 nums1[i] > nums2[i] 的索引 i 的数目来描述。
 * 返回 nums1 的任意排列，使其相对于 nums2 的优势最大化。
 * <p>
 * 示例 1：
 * 输入：nums1 = [2,7,11,15], nums2 = [1,10,4,11]
 * 输出：[2,11,7,15]
 * <p>
 * 示例 2：
 * 输入：nums1 = [12,24,8,32], nums2 = [13,25,32,11]
 * 输出：[24,32,8,12]
 * <p>
 * 提示：
 * 1 <= nums1.length <= 105
 * nums2.length == nums1.length
 * 0 <= nums1[i], nums2[i] <= 109
 */
public class AdvantageShuffle {
    /**
     * 方法：排序
     */
    public int[] advantageCount(int[] nums1, int[] nums2) {
        // 长度
        int n = nums1.length;
        // 进行排序，从大到小排序
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);

        // 入队
        for (int i = 0; i < nums2.length; i++) {
            queue.offer(new int[]{i, nums2[i]});
        }

        // 排序
        Arrays.sort(nums1);

        // 结果
        int[] res = new int[n];

        // 双指针
        int left = 0;
        int right = n - 1;
        // 循环
        while (!queue.isEmpty()) {
            // 出队
            int[] cur = queue.poll();
            // 位置
            int i = cur[0];
            // 当前值
            int max = cur[1];

            // 大于情况：取当前值
            // 小于情况：从后面取
            if (max < nums1[right]) {
                res[i] = nums1[right];
                right--;
            } else {
                res[i] = nums1[left];
                left++;
            }
        }

        return res;
    }
}
