package com.interview.L1710;

/**
 * 面试题 17.10. 主要元素
 * 数组中占比超过一半的元素称之为主要元素。给你一个 整数 数组，找出其中的主要元素。若没有，返回 -1 。请设计时间复杂度为 O(N) 、空间复杂度为 O(1) 的解决方案。
 *
 * 示例 1：
 * 输入：[1,2,5,9,5,9,5,5,5]
 * 输出：5
 *
 * 示例 2：
 * 输入：[3,2]
 * 输出：-1
 *
 * 示例 3：
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 */
public class FindMajorityElement {
    /**
     * 方法：摩尔投票
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int count = 1;
        int maj = nums[0];
        for (int num : nums) {
            if(num == maj)
                count++;
            else {
                count--;
                //为零则重置可能出现超过一半的数字
                if (count == 0){
                    maj = num;
                    count = 1;
                }
            }
        }
        //验证
        int x = 0;
        for (int num : nums) {
            if (num == maj)
                x++;
        }
        return x>nums.length/2 ? maj : -1;
    }
}
