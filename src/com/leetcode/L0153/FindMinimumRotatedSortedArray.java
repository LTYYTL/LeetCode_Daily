package com.leetcode.L0153;

/**
 * 153. 寻找旋转排序数组中的最小值
 * 已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,2,4,5,6,7] 在变化后可能得到：
 * 若旋转 4 次，则可以得到 [4,5,6,7,0,1,2]
 * 若旋转 7 次，则可以得到 [0,1,2,4,5,6,7]
 * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
 * 给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
 *
 * 示例 1：
 * 输入：nums = [3,4,5,1,2]
 * 输出：1
 * 解释：原数组为 [1,2,3,4,5] ，旋转 3 次得到输入数组。
 *
 * 示例 2：
 * 输入：nums = [4,5,6,7,0,1,2]
 * 输出：0
 * 解释：原数组为 [0,1,2,4,5,6,7] ，旋转 4 次得到输入数组。
 *
 * 示例 3：
 * 输入：nums = [11,13,15,17]
 * 输出：11
 * 解释：原数组为 [11,13,15,17] ，旋转 4 次得到输入数组。
 *
 * 提示：
 * n == nums.length
 * 1 <= n <= 5000
 * -5000 <= nums[i] <= 5000
 * nums 中的所有整数 互不相同
 * nums 原来是一个升序排序的数组，并进行了 1 至 n 次旋转
 */
public class FindMinimumRotatedSortedArray {
    /**
     * 方法：二分法
     * 解题思路：
     * 因为 nums 数组本身是有序的，所以用二分查找。当找到中点 mid 后，mid 的左、右两侧中必有一侧是升序排列的。
     * 双指针：low 指针指向数组开头；high 指针指向数组末尾。
     * （1）若 nums[low] <= nums[mid] 时，则说明升序序列在 mid 的左侧，即从 low 到 mid 的序列是升序序列，
     *     此时该序列的最小值为 nums[low] 记录后并修改边界，即 low = mid + 1 继续找 mid 右边的序列中的最小值。
     * （2）若 nums[low] > nums[mid] 时，则说明升序序列在 mid 的右侧，即从 mid 到 high 的序列是升序序列，
     *     此时该序列的 最小值为 nums[mid] 记录后并修改边界，即 high = mid - 1 继续找 mid 左边的序列中的最小值。
     * （此时也可以用 nums[high] >= nums[mid] 当做判断条件）
     * 作者：Booooo_
     * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/solution/xun-zhao-xuan-zhuan-pai-xu-shu-zu-zhong-yiyo6/
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (low <= high){
            int mid = low + (high - low)/2;
            //前半部分有序
            if (nums[low] <= nums[mid]){
                min = Math.min(min, nums[low]);
                low = mid + 1;
            }else{//后半部分有序
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
}
