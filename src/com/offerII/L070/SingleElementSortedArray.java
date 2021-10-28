package com.offerII.L070;

/**
 * 剑指 Offer II 070. 排序数组中只出现一次的数字
 * 给定一个只包含整数的有序数组 nums ，每个元素都会出现两次，唯有一个数只会出现一次，请找出这个唯一的数字。
 *
 * 示例 1:
 * 输入: nums = [1,1,2,3,3,4,4,8,8]
 * 输出: 2
 *
 * 示例 2:
 * 输入: nums =  [3,3,7,7,10,11,11]
 * 输出: 10
 *
 * 提示:
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 105
 *
 * 进阶: 采用的方案可以在 O(log n) 时间复杂度和 O(1) 空间复杂度中运行吗？
 *
 * 注意：本题与主站 540 题相同：https://leetcode-cn.com/problems/single-element-in-a-sorted-array/
 */
public class SingleElementSortedArray {
    /**
     * 方法一：暴力法
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length-1; i += 2) {
            if (nums[i] != nums[i+1])
                return nums[i];
        }
        return nums[nums.length - 1];
    }

    /**
     * 方法二：二分查找
     * @param nums
     * @return
     */
    public int singleNonDuplicate_binary(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int mid = (right - left)/2 + left;
            boolean flag = mid%2 == 0;
            /*
                [1,1,4,4],[5,5,6,8,8]
                left     mid     right
             */
            if (flag && nums[mid] == nums[mid+1])
                left = mid + 2;
            /*
                [1,1,4,4,5],[5,6,6,8,9,9]
                left        mid        right
             */
            else if (!flag && nums[mid] == nums[mid-1])
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }
}
