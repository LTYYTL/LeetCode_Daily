package com.leetcode.L2001_2100.L2013;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 2013. 检测正方形
 * 给你一个在 X-Y 平面上的点构成的数据流。设计一个满足下述要求的算法：
 * (1)添加 一个在数据流中的新点到某个数据结构中。可以添加 重复 的点，并会视作不同的点进行处理。
 * (2)给你一个查询点，请你从数据结构中选出三个点，使这三个点和查询点一同构成一个 面积为正 的 轴对齐正方形 ，统计 满足该要求的方案数目。
 *  轴对齐正方形 是一个正方形，除四条边长度相同外，还满足每条边都与 x-轴 或 y-轴 平行或垂直。
 *
 * 实现 DetectSquares 类：
 * DetectSquares() 使用空数据结构初始化对象
 * void add(int[] point) 向数据结构添加一个新的点 point = [x, y]
 * int count(int[] point) 统计按上述方式与点 point = [x, y] 共同构造 轴对齐正方形 的方案数。
 *
 * 示例：
 * 输入：
 * ["DetectSquares", "add", "add", "add", "count", "count", "add", "count"]
 * [[], [[3, 10]], [[11, 2]], [[3, 2]], [[11, 10]], [[14, 8]], [[11, 2]], [[11, 10]]]
 * 输出：
 * [null, null, null, null, 1, 0, null, 2]
 * 解释：
 * DetectSquares detectSquares = new DetectSquares();
 * detectSquares.add([3, 10]);
 * detectSquares.add([11, 2]);
 * detectSquares.add([3, 2]);
 * detectSquares.count([11, 10]); // 返回 1 。你可以选择：
 *                                //   - 第一个，第二个，和第三个点
 * detectSquares.count([14, 8]);  // 返回 0 。查询点无法与数据结构中的这些点构成正方形。
 * detectSquares.add([11, 2]);    // 允许添加重复的点。
 * detectSquares.count([11, 10]); // 返回 2 。你可以选择：
 *                                //   - 第一个，第二个，和第三个点
 *                                //   - 第一个，第三个，和第四个点
 * 提示：
 * point.length == 2
 * 0 <= x, y <= 1000
 * 调用 add 和 count 的 总次数 最多为 500
 */
public class DetectSquares {
    /**
     * 方法：哈希表
     */
    // 也可以使用数组的形式，不过在求解的时候类似Hash，另外还需要判断是否越界，这里之类直接使用hash来解决了～
    Map<Integer, Map<Integer, Integer>> map;

    public DetectSquares() {
        map = new HashMap<>();
    }

    public void add(int[] point) {
        int x = point[0], y = point[1];
        //存入<x,<y,点(x,y)出现的次数>>
        map.putIfAbsent(x, new HashMap<>());
        Map<Integer, Integer> ymap = map.get(x);
        ymap.put(y, ymap.getOrDefault(y, 0) + 1);
    }

    public int count(int[] point) {
        int res = 0;
        int x = point[0], y = point[1];
        // 说明不存在与当前x在同一行的坐标 显然是不可能构成的
        if (!map.containsKey(x)) {
            return 0;
        }
        Map<Integer, Integer> ymap = map.get(x);
        // 对map中的key进行遍历
        Set<Integer> keys = map.keySet();
        for (int col : keys) {
            // 获取当前行x对应的 colmap
            Map<Integer, Integer> colmap = map.get(col);
            if (col != x) {
                // 根据对称性，这里可以不用取绝对值
                int d = col - x;
                // 左侧黄色区域或者右侧红色区域
                res += colmap.getOrDefault(y, 0) * ymap.getOrDefault(y + d, 0) *
                        colmap.getOrDefault(y + d, 0);
                res += colmap.getOrDefault(y, 0) * ymap.getOrDefault(y - d, 0) *
                        colmap.getOrDefault(y - d, 0);
            }
        }
        return res;
    }
}
