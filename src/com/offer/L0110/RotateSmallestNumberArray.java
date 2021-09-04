package com.offer.L0110;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 *
 * 示例 1：
 * 输入：[3,4,5,1,2]
 * 输出：1
 *
 * 示例 2：
 * 输入：[2,2,2,0,1]
 * 输出：0
 * 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */
public class RotateSmallestNumberArray {
    /**
     * 方法：二分查找
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right){
            int mid = (right - left)/2 + left;
            //证明旋转点在left~mid之间
            if (numbers[mid] < numbers[right]){
                right = mid;
            }else if (numbers[mid] > numbers[right]){//证明旋转点在mid~right之间
                left = mid + 1;
            }else {//缩小右边界
                right--;
            }
        }
        return numbers[left];
    }
}
