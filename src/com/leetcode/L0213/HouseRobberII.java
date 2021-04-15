package com.leetcode.L0213;

import java.util.Arrays;

/**
 * 213. 打家劫舍 II
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。
 *
 * 示例 1：
 * 输入：nums = [2,3,2]
 * 输出：3
 * 解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 *
 * 示例 2：
 * 输入：nums = [1,2,3,1]
 * 输出：4
 * 解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 *
 * 示例 3：
 * 输入：nums = [0]
 * 输出：0
 */
public class HouseRobberII {
    /**
     * 方法：动态规划
     * 解题思路：打家劫舍的升级版，将其看成两个数组，做打家劫舍1的操作
     *
     * 动态方程分析：dp[i]：偷盗至第 i个房子时，所获取的最大利益
     * 这是因为：如果定义dp[i]:偷盗含第 i个房子时，所获取的最大利益，就需要取找寻金额最大的那个房间，再需要同时考虑两边的大小，就会进入一个恶性循环
     * 1、由于不可以在相邻的房屋闯入，所以至i房屋可盗窃的最大值，要么就是至 i-1 房屋可盗窃的最大值，要么就是至 i-2 房屋可盗窃的最大值加上当前房屋的值，
     * 二者之间取最大值，即：dp[i] = max(dp[i-2]+nums[i], dp[i-1])
     *
     * 2、当只有一间房子时，那就偷窃这间，即：dp[0] = nums[0]
     *
     * 3、当有两间房子时，偷窃最大的那间，即：dp[1] = max(nums[0],nums[1])
     *
     * @param nums 房间金额数组
     * @return 最大收益
     */
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        if(length ==2){
            return Math.max(nums[0],nums[1]);
        }
        //确保下面两端子数组的长度都是大于1的(最短也为2)；因此在rob1中就省略了特判；
        //如果将上述特判的情况写在下面的函数rob1中也可以；

        int p1 = rob1(Arrays.copyOfRange(nums,0,length-1));   //不选最后一个
        int p2 = rob1(Arrays.copyOfRange(nums,1,length));     //不选第一个


        return Math.max(p1,p2);
    }

    /**
     * 打家劫舍1的部分
     * @param nums
     * @return
     */
    public int rob1(int[] nums) {
        int length = nums.length;

        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }

}
