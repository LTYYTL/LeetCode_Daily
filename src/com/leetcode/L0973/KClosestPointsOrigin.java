package com.leetcode.L0973;

import java.util.*;

/**
 * 973. 最接近原点的 K 个点
 * 我们有一个由平面上的点组成的列表 points。需要从中找出 K 个距离原点 (0, 0) 最近的点。
 * （这里，平面上两点之间的距离是欧几里德距离。）
 * 你可以按任何顺序返回答案。除了点坐标的顺序之外，答案确保是唯一的。
 *
 * 示例 1：
 * 输入：points = [[1,3],[-2,2]], K = 1
 * 输出：[[-2,2]]
 * 解释：
 * (1, 3) 和原点之间的距离为 sqrt(10)，
 * (-2, 2) 和原点之间的距离为 sqrt(8)，
 * 由于 sqrt(8) < sqrt(10)，(-2, 2) 离原点更近。
 * 我们只需要距离原点最近的 K = 1 个点，所以答案就是 [[-2,2]]。
 *
 * 示例 2：
 * 输入：points = [[3,3],[5,-1],[-2,4]], K = 2
 * 输出：[[3,3],[-2,4]]
 * （答案 [[-2,4],[3,3]] 也会被接受。）
 *
 * 提示：
 * 1 <= K <= points.length <= 10000
 * -10000 < points[i][0] < 10000
 * -10000 < points[i][1] < 10000
 */
public class KClosestPointsOrigin {
    /**
     * 方法：堆
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosest(int[][] points, int K) {
        //记录每个
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < points.length; ++i){
            int x = points[i][0];
            int y = points[i][1];
            double distance = sqrt(x,y);
            map.put(i,distance);
        }
        //System.out.println(map);

        //定制排序
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (int) (map.get(o2) - map.get(o1));
            }
        };
        //建立最大堆
        //1、如果堆的元素个数小于 k，就可以直接插入堆中。
        //2、如果堆的元素个数等于 k，则检查堆顶与当前距离的大小。
        //  如果堆顶更小，说明至少有 k个数字的距离比较小，故舍弃当前值；否则，就弹出堆顶，并将当前值插入堆中。
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);

        for (Integer key : map.keySet()) {
            if (pq.size() < K){
                pq.add(key);
            }else if (map.get(key) < map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }
        // 取出最小堆中的元素
        int[][] res = new int[K][2];
        for (int i = 0; i < K; ++i) {
            int index = pq.poll();
            res[i] = points[index];
        }
        return res;
    }

    /**
     * 欧几里德算法
     * @param x x轴
     * @param y y轴
     * @return  返回x的平方与y平方的和
     */
    private double sqrt(int x,int y){
        //x的平方
        double x_pow = Math.pow(x,2);
        //y的平方
        double y_pow = Math.pow(y,2);
        return x_pow + y_pow;
    }


}
