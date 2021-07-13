package com.leetcode.L0218;

import java.util.*;

/**
 * 218. 天际线问题
 * 城市的天际线是从远处观看该城市中所有建筑物形成的轮廓的外部轮廓。给你所有建筑物的位置和高度，请返回由这些建筑物形成的 天际线 。
 * 每个建筑物的几何信息由数组 buildings 表示，其中三元组 buildings[i] = [lefti, righti, heighti] 表示：
 *  lefti 是第 i 座建筑物左边缘的 x 坐标。
 *  righti 是第 i 座建筑物右边缘的 x 坐标。
 *  heighti 是第 i 座建筑物的高度。
 * 天际线 应该表示为由 “关键点” 组成的列表，格式 [[x1,y1],[x2,y2],...] ，并按 x 坐标 进行 排序 。关键点是水平线段的左端点。
 * 列表中最后一个点是最右侧建筑物的终点，y 坐标始终为 0 ，仅用于标记天际线的终点。此外，任何两个相邻建筑物之间的地面都应被视为天际线轮廓的一部分。
 *
 * 注意：输出天际线中不得有连续的相同高度的水平线。例如 [...[2 3], [4 5], [7 5], [11 5], [12 7]...] 是不正确的答案；
 * 三条高度为 5 的线应该在最终输出中合并为一个：[...[2 3], [4 5], [12 7], ...]
 *
 * 示例 1：
 * 输入：buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
 * 输出：[[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]
 * 解释：
 * 图 A 显示输入的所有建筑物的位置和高度，
 * 图 B 显示由这些建筑物形成的天际线。图 B 中的红点表示输出列表中的关键点。
 *
 * 示例 2：
 * 输入：buildings = [[0,2,3],[2,5,3]]
 * 输出：[[0,3],[5,0]]
 *
 * 提示：
 * 1 <= buildings.length <= 104
 * 0 <= lefti < righti <= 231 - 1
 * 1 <= heighti <= 231 - 1
 * buildings 按 lefti 非递减排序
 */
public class TheSkylineProblem {
    /**
     * 方法：扫描法
     * @param buildings
     * @return
     */
    public List<List<Integer>> getSkyline(int[][] buildings) {
        // x轴从小到大排序，如果x相等，则按照高度从低到高排序
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        for (int[] building : buildings) {
            // 左端点和高度入队，高度为负值说明是左端点
            pq.offer(new int[] { building[0], -building[2] });
            // 右端点和高度入队
            pq.offer(new int[] { building[1], building[2] });
        }

        List<List<Integer>> res = new ArrayList<>();

        // 降序排列
        TreeMap<Integer, Integer> heights = new TreeMap<>((a, b) -> b - a);
        heights.put(0, 1);
        int left = 0, height = 0;

        while (!pq.isEmpty()) {
            int[] arr = pq.poll();
            // 如果是左端点
            if (arr[1] < 0) {
                // 高度 --> 高度 + 1
                heights.put(-arr[1], heights.getOrDefault(-arr[1], 0) + 1);
            }
            // 右端点
            else {
                // 高度 --> 高度 - 1
                heights.put(arr[1], heights.get(arr[1]) - 1);
                // 说明左右端点都已经遍历完
                if (heights.get(arr[1]) == 0) heights.remove(arr[1]);
            }
            // heights是以降序的方式排列的，所以以下会获得最大高度
            int maxHeight = heights.keySet().iterator().next();
            // 如果最大高度不变，则说明当前建筑高度在一个比它高的建筑下面，不做操作
            if (maxHeight != height) {
                left = arr[0];
                height = maxHeight;
                res.add(Arrays.asList(left, height));
            }
        }
        return res;
    }
}
