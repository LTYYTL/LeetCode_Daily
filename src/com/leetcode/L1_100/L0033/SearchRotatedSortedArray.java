package com.leetcode.L1_100.L0033;

/**
 * 33. 搜索旋转排序数组
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，
 * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
 * 例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 *
 * 示例 1：
 * 输入：nums = [4,5,6,7,0,1,2], target = 0
 * 输出：4
 *
 * 示例 2：
 * 输入：nums = [4,5,6,7,0,1,2], target = 3
 * 输出：-1
 *
 * 示例 3：
 * 输入：nums = [1], target = 0
 * 输出：-1
 *
 * 提示：
 * 1 <= nums.length <= 5000
 * -10^4 <= nums[i] <= 10^4
 * nums 中的每个值都 独一无二
 * 题目数据保证 nums 在预先未知的某个下标上进行了旋转
 * -10^4 <= target <= 10^4
 *
 * 进阶：你可以设计一个时间复杂度为 O(log n) 的解决方案吗？
 */
public class SearchRotatedSortedArray {
    /**
     * 方法一：暴力法
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int len = nums.length;
        //遍历
        for (int i = 0; i < len; i++) {
            //存在索引
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 方法二：二分查找
     * @param nums
     * @param target
     * @return
     */
    public int search_binary(int[] nums, int target){
        //长度
        int n = nums.length;
        //空值
        if (n == 0)
            return -1;
        //一个值情况
        if (n == 1)
            return nums[0] == target ? 0 : -1;
        //左右指针
        int left = 0;
        int right = n -1;
        //遍历
        while (left <= right){
            //中间值
            int mid = (right - left)/2 + left;
            //判断是否相等
            if (nums[mid] == target)
                return mid;
            //判断左半部分是否有序
            if (nums[0] <= nums[mid]){
                //目标值是否在左半部分
                if (nums[0] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;

            }else {
                //判断右半部分是否有序，且在这之间
                if (nums[mid] < target && target <= nums[n-1])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
}
