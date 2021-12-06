package com.leetcode.L1001_1100.L1094;

import com.util.Difference;

/**
 * 1094. 拼车
 * 假设你是一位顺风车司机，车上最初有 capacity 个空座位可以用来载客。由于道路的限制，车只能向一个方向行驶（也就是说，不允许掉头或改变方向，你可以将其想象为一个向量）。
 * 这儿有一份乘客行程计划表 trips[][]，其中 trips[i] = [num_passengers, start_location, end_location] 包含了第 i 组乘客的行程信息：
 * (1)必须接送的乘客数量；
 * (2)乘客的上车地点；
 * (3)以及乘客的下车地点。
 * 这些给出的地点位置是从你的 初始 出发位置向前行驶到这些地点所需的距离（它们一定在你的行驶方向上）。
 * 请你根据给出的行程计划表和车子的座位数，来判断你的车是否可以顺利完成接送所有乘客的任务（当且仅当你可以在所有给定的行程中接送所有乘客时，返回 true，否则请返回 false）。
 *
 * 示例 1：
 * 输入：trips = [[2,1,5],[3,3,7]], capacity = 4
 * 输出：false
 *
 * 示例 2：
 * 输入：trips = [[2,1,5],[3,3,7]], capacity = 5
 * 输出：true
 *
 * 示例 3：
 * 输入：trips = [[2,1,5],[3,5,7]], capacity = 3
 * 输出：true
 *
 * 示例 4：
 * 输入：trips = [[3,2,7],[3,7,9],[8,3,9]], capacity = 11
 * 输出：true
 *
 * 提示：
 * 你可以假设乘客会自觉遵守 “先下后上” 的良好素质
 * trips.length <= 1000
 * trips[i].length == 3
 * 1 <= trips[i][0] <= 100
 * 0 <= trips[i][1] < trips[i][2] <= 1000
 * 1 <= capacity <= 100000
 */
public class CarPooling {
    /**
     * 方法：差分数组
     * @param trips
     * @param capacity
     * @return
     */
    public boolean carPooling(int[][] trips, int capacity) {
        //最多有1000个站
        int[] nums = new int[1001];

        Difference difference = new Difference(nums);

        for (int[] trip : trips) {
            //乘客数量
            int val = trip[0];
            //乘车区间
            int i = trip[1];
            //因为trip[2]已经下车，所以乘车区间是[i,j-1]
            int j = trip[2] - 1;

            difference.increment(i,j,val);
        }

        int[] res = difference.result();
        //客车从始至终都没有超载
        for (int re : res) {
            if (capacity < re)
                return  false;
        }

        return true;
    }
}
