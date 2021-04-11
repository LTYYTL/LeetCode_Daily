package com.LCP.L0028;

import java.util.Arrays;

/**
 * LCP 28. 采购方案
 * 小力将 N 个零件的报价存于数组 nums。小力预算为 target，假定小力仅购买两个零件，要求购买零件的花费不超过预算，请问他有多少种采购方案。
 * 注意：答案需要以 1e9 + 7 (1000000007) 为底取模，如：计算初始结果为：1000000008，请返回 1
 *
 * 示例 1：
 * 输入：nums = [2,5,3,5], target = 6
 * 输出：1
 * 解释：预算内仅能购买 nums[0] 与 nums[2]。
 *
 * 示例 2：
 * 输入：nums = [2,2,1,9], target = 10
 * 输出：4
 * 解释：符合预算的采购方案如下：
 * nums[0] + nums[1] = 4
 * nums[0] + nums[2] = 3
 * nums[1] + nums[2] = 3
 * nums[2] + nums[3] = 10
 *
 * 提示：
 * 2 <= nums.length <= 10^5
 * 1 <= nums[i], target <= 10^5
 */
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
