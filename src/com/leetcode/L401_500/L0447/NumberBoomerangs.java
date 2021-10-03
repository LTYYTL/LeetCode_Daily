package com.leetcode.L401_500.L0447;

import java.util.HashMap;
import java.util.Map;

/**
 * 447. 回旋镖的数量
 * 给定平面上 n 对 互不相同 的点 points ，其中 points[i] = [xi, yi] 。
 * 回旋镖 是由点 (i, j, k) 表示的元组 ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 *
 * 返回平面上所有回旋镖的数量。
 *
 * 示例 1：
 * 输入：points = [[0,0],[1,0],[2,0]]
 * 输出：2
 * 解释：两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
 *
 * 示例 2：
 * 输入：points = [[1,1],[2,2],[3,3]]
 * 输出：2
 *
 * 示例 3：
 * 输入：points = [[1,1]]
 * 输出：0
 *
 * 提示：
 * n == points.length
 * 1 <= n <= 500
 * points[i].length == 2
 * -104 <= xi, yi <= 104
 */
public class NumberBoomerangs {
    /**
     * 方法：map映射
     * @param points
     * @return
     */
    public int numberOfBoomerangs(int[][] points) {
        //结果集
        int res = 0;
        //遍历节点
        for (int[] p : points) {
            //存储其他点到该点的距离个数
            Map<Integer,Integer> map = new HashMap<>();
            //遍历节点
            for (int[] q : points) {
                //计算距离
                int dis = distance(p[0],p[1],q[0],q[1]);
                //存储距离的节点个数
                map.put(dis,map.getOrDefault(dis,0)+1);
            }
            //遍历map
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                //当前距离的个数
                int m = entry.getValue();
                //在 m 个元素中选出 2 个不同元素的排列数
                res += m * (m - 1);
            }
        }
        return res;
    }

    private int distance(int x1,int y1,int x2,int y2){
        return (int) (Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    }
}
