package com.leetcode.L801_900.L0801;

/**
 * 801. 使序列递增的最小交换次数
 * 我们有两个长度相等且不为空的整型数组 nums1 和 nums2 。在一次操作中，我们可以交换 nums1[i] 和 nums2[i]的元素。
 * 例如，如果 nums1 = [1,2,3,8] ， nums2 =[5,6,7,4] ，你可以交换 i = 3 处的元素，得到 nums1 =[1,2,3,4] 和 nums2 =[5,6,7,8] 。
 * 返回 使 nums1 和 nums2 严格递增 所需操作的最小次数 。
 * 数组 arr 严格递增 且  arr[0] < arr[1] < arr[2] < ... < arr[arr.length - 1] 。
 * <p>
 * 注意：
 * 用例保证可以实现操作。
 * <p>
 * 示例 1:
 * 输入: nums1 = [1,3,5,4], nums2 = [1,2,3,7]
 * 输出: 1
 * 解释:
 * 交换 A[3] 和 B[3] 后，两个数组如下:
 * A = [1, 3, 5, 7] ， B = [1, 2, 3, 4]
 * 两个数组均为严格递增的。
 * <p>
 * 示例 2:
 * 输入: nums1 = [0,3,5,8,9], nums2 = [2,1,4,6,9]
 * 输出: 1
 * <p>
 * 提示:
 * 2 <= nums1.length <= 105
 * nums2.length == nums1.length
 * 0 <= nums1[i], nums2[i] <= 2 * 105
 */
public class MinSwapsSeq {
    /**
     * 方法：动态规划
     */
    public int minSwap(int[] nums1, int[] nums2) {
        // 长度
        int n = nums1.length;
        // dp[i][0]:表示i位置不互换
        // dp[i][1]:表示i位置互换
        int[][] dp = new int[n][2];
        // 初始化
        dp[0][0] = 0;
        dp[0][1] = 1;

        // 遍历
        for (int i = 1; i < n; i++) {
            // num1的i和i-1的值
            int pre1 = nums1[i - 1], cur1 = nums1[i];
            // num2的i和i-1的值
            int pre2 = nums2[i - 1], cur2 = nums2[i];
            // num1和num2均递增，换完也递增
            if ((pre1 < cur1 && pre2 < cur2) && (pre2 < cur1 && pre1 < cur2)) {
                dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]); //不换i，i-1可换可不换
                dp[i][1] = dp[i][0] + 1;//换i，i-1可换可不换
            } else if (pre1 < cur1 && pre2 < cur2) {// num1和num2均递增，换完不递增
                dp[i][0] = dp[i - 1][0];//不换i，i-1不换
                dp[i][1] = dp[i - 1][1] + 1;//换i，i-1换
            } else {// num1和num2都不递增
                dp[i][0] = dp[i - 1][1];//不换i，i-1要换
                dp[i][1] = dp[i - 1][0] + 1;// 换i的情况，i-1不换
            }
        }

        // 取最小
        return Math.min(dp[n - 1][0], dp[n - 1][1]);
    }
}
