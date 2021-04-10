package com.LCP.L0028;

import java.util.Arrays;


public class ProcurementPlan {
    /**
     * 方法：双指针
     * 思路：
     * 1、将数组排序，双指针分别放到头和尾
     * 2、判断nums[left] + nums[rigth] 与 target的关系
     * （1）nums[left] + nums[rigth] <= target：说明当前位置的left与最大值结合已经比目标值小，即right -left之间的数都小
     * （2）nums[left] + nums[rigth] > target：说明当前位置right和left的和偏大，将right向前一位，获取小的值，继续计算
     * @param nums
     * @param target
     * @return
     */
    public int purchasePlans(int[] nums, int target) {
        //结果集
        int res = 0;
        //排序
        Arrays.sort(nums);
        //双指针
        int left = 0;
        int rigth = nums.length - 1;

        while (left < rigth){
            if (nums[left] + nums[rigth] > target){
                rigth--;
            }else {
                res = res + rigth - left;
                left++;
            }
            res = res%1000000007;
        }
        return res%1000000007;
    }
}
