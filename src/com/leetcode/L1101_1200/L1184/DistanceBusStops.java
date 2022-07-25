package com.leetcode.L1101_1200.L1184;

/**
 * 1184. 公交站间的距离
 * 环形公交路线上有 n 个站，按次序从 0 到 n - 1 进行编号。我们已知每一对相邻公交站之间的距离，distance[i] 表示编号为 i 的车站和编号为 (i + 1) % n 的车站之间的距离。
 * 环线上的公交车都可以按顺时针和逆时针的方向行驶。
 * 返回乘客从出发点 start 到目的地 destination 之间的最短距离。
 * <p>
 * 示例 1：
 * 输入：distance = [1,2,3,4], start = 0, destination = 1
 * 输出：1
 * 解释：公交站 0 和 1 之间的距离是 1 或 9，最小值是 1。
 * <p>
 * 示例 2：
 * 输入：distance = [1,2,3,4], start = 0, destination = 2
 * 输出：3
 * 解释：公交站 0 和 2 之间的距离是 3 或 7，最小值是 3。
 * <p>
 * 示例 3：
 * 输入：distance = [1,2,3,4], start = 0, destination = 3
 * 输出：4
 * 解释：公交站 0 和 3 之间的距离是 6 或 4，最小值是 4。
 * <p>
 * 提示：
 * 1 <= n <= 10^4
 * distance.length == n
 * 0 <= start, destination < n
 * 0 <= distance[i] <= 10^4
 */
public class DistanceBusStops {
    /**
     * 方法：前缀和
     *
     * @param distance
     * @param start
     * @param destination
     * @return
     */
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        //顺时针总共距离
        int total = 0;
        //顺时针两个站点距离
        int pre_total = 0;
        //最大站
        int max = Math.max(start, destination);
        //最小站
        int min = Math.min(start, destination);

        //遍历
        for (int i = 0; i < distance.length; i++) {
            //记录距离
            total += distance[i];
            //两个车站的距离记录
            if (min <= i && i < max) {
                pre_total += distance[i];
            }
        }

        //获取最小，total-pre_total为逆时针站点距离
        return Math.min(pre_total, total - pre_total);
    }
}
