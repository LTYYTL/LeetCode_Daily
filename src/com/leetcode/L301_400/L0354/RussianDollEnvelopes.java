package com.leetcode.L301_400.L0354;

import java.util.Arrays;

/**
 * 354. 俄罗斯套娃信封问题
 * 给你一个二维整数数组 envelopes ，其中 envelopes[i] = [wi, hi] ，表示第 i 个信封的宽度和高度。
 * 当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
 * 请计算 最多能有多少个 信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。
 * 注意：不允许旋转信封。
 *
 * 示例 1：
 * 输入：envelopes = [[5,4],[6,4],[6,7],[2,3]]
 * 输出：3
 * 解释：最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
 *
 * 示例 2：
 * 输入：envelopes = [[1,1],[1,1],[1,1]]
 * 输出：1
 *
 * 提示：
 * 1 <= envelopes.length <= 5000
 * envelopes[i].length == 2
 * 1 <= wi, hi <= 104
 */
public class RussianDollEnvelopes {
    /**
     * 方法一：动态规划
     * @param envelopes
     * @return
     */
    public int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length;
        //（1）w升序
        //（2）w相同时，h降序
        Arrays.sort(envelopes, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0]);
        //变成一维数组
        int[] height = new int[n];
        for (int i = 0; i < envelopes.length; i++) {
            height[i] = envelopes[i][1];
        }

        return lengthOfLIS(height);
    }

    private int lengthOfLIS(int[] nums) {
        //数组为空的情况
        if(nums.length == 0)
            return 0;
        //动态数组
        int[] dp = new int[nums.length];
        dp[0] = 1;
        //最长的长度
        int longest = 1;
        for (int i = 1; i < dp.length; i++){
            //临时变量
            int temp = 0;
            //比较当前元素比前面元素大的最大长度
            for (int j = 0;j < i; j++){
                if (nums[i] > nums[j]){
                    temp = Math.max(temp , dp[j]);
                }
            }
            //最大值加本身
            dp[i] = temp + 1;
            longest = Math.max(longest , dp[i]);
        }
        return  longest;
    }
}
