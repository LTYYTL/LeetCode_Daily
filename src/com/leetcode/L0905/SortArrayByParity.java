package com.leetcode.L0905;

/**
 * 905. 按奇偶排序数组
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 *
 * 示例：
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 *
 * 提示：
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class SortArrayByParity {
    /**
     * 方法：双指针
     * @param nums
     * @return
     */
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int cur = nums[left];
            //为奇数时，交换两个指针位置的数字
            if (cur%2 != 0){
                nums[left] = nums[right];
                nums[right] = cur;
                right--;
            }else{
                //为偶数时，直接移动指针
                left++;
            }

        }
        return nums;
    }

}
