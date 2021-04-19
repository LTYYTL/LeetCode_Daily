package com.leetcode.L0026;

/**
 * 26. 删除有序数组中的重复项
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 说明:
 * 为什么返回数值是整数，但输出的答案是数组呢?
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 *
 * 示例 1：
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2：
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 *
 * 提示：
 * 0 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums 已按升序排列
 */
public class RemoveDuplicatesSortedArray {
    /**
     * 方法：双指针
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        //前后指针
        int left = 0;
        int right = 1;
        //在到达数组尾部结束
        while(right < nums.length){
            //分情况讨论
            //1、两个数相同：将right向后移动一位
            //2、两个数不同：将left向后移动一位，并将当前不一样数赋值到当前位置，同时right向移动一位
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        //返回数组长度：left为不同数最后一个数的索引，left+1为数组长度
        return left+1;
    }
}
