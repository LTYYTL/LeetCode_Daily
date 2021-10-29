package com.offerII.L076;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 剑指 Offer II 076. 数组中的第 k 大的数字
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 示例 1:
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 *
 * 示例 2:
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 *
 * 提示：
 * 1 <= k <= nums.length <= 104
 * -104 <= nums[i] <= 104
 *
 * 注意：本题与主站 215 题相同： https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElementArray {
    /**
     * 方法一：排序
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    /**
     * 方法二：堆
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest_heap(int[] nums, int k) {
        //小根堆
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //遍历
        for (int num : nums) {
            queue.offer(num);
            //只存k个元素
            if (queue.size() > k)
                queue.poll();

        }
        return queue.peek();
    }

    /**
     * 方法三：快速排序
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest_quickSort(int[] nums, int k) {
        quickSort(nums,0,nums.length-1);
        return nums[nums.length - k];
    }

    private void quickSort(int[] arr, int l, int r) {
        //子数组长度为1时，终止递归
        if (l >= r)
            return;
        // 哨兵划分操作（以 arr[l] 作为基准数）
        int i = l;
        int j = r;
        while (i < j){
            while (i < j && arr[j] >= arr[l]) j--;
            while (i < j && arr[i] <= arr[l]) i++;
            //交换i，j元素
            swap(arr,i,j);
        }
        //交换基准的位置
        swap(arr,i,l);
        // 递归左（右）子数组执行哨兵划分
        quickSort(arr,l,i-1);
        quickSort(arr,i+1,r);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
