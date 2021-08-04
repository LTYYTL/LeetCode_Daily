package com.leetcode.L0611;

import java.util.Arrays;

/***
 * 611. 有效三角形的个数
 * 给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数。
 *
 * 示例 1:
 * 输入: [2,2,3,4]
 * 输出: 3
 * 解释:
 * 有效的组合是:
 * 2,3,4 (使用第一个 2)
 * 2,3,4 (使用第二个 2)
 * 2,2,3
 *
 * 注意:
 * 数组长度不超过1000。
 * 数组里整数的范围为 [0, 1000]。
 */
public class ValidTriangleNumber {

    /**
     * 方法一：二分查找
     * @param nums
     * @return
     */
    public int triangleNumber(int[] nums) {
        //排序
        Arrays.sort(nums);
        //结果
        int res = 0;
        //长度
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int first_side = nums[i];//固定第一条边
                int second_side = nums[j];//固定第二条边
                int sum = first_side + second_side;//两边
                int count = binarySearch(nums, j, sum) - j;//满足第三条边的个数
                res += count;
            }
        }

        return res;
    }

    /**
     * 二分查找
     * @param nums
     * @param start
     * @param sum
     * @return
     */
    private int binarySearch(int[] nums,int start,int sum){
        //记录满足条件的下标
        int k = 0;
        int left = start+1;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (right - left)/2 + left;
            if (nums[mid] >= sum){
                right = mid - 1;
            }else if (nums[mid] < sum){
                k = mid;
                left = mid + 1;
            }
        }
        return k == 0? start:k;
    }

    /**
     * 方法二：双指针
     * @param nums
     * @return
     */
    public int triangleNumber_two(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int k = i;
            for (int j = i + 1; j < n; ++j) {
                while (k + 1 < n && nums[k + 1] < nums[i] + nums[j]) {
                    ++k;
                }
                ans += Math.max(k - j, 0);
            }
        }
        return ans;
    }
}
