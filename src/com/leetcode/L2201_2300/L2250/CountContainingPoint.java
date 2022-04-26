package com.leetcode.L2201_2300.L2250;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 2250. 统计包含每个点的矩形数目
 * 给你一个二维整数数组 rectangles ，其中 rectangles[i] = [li, hi] 表示第 i 个矩形长为 li 高为 hi 。
 * 给你一个二维整数数组 points ，其中 points[j] = [xj, yj] 是坐标为 (xj, yj) 的一个点。
 * 第 i 个矩形的 左下角 在 (0, 0) 处，右上角 在 (li, hi) 。
 * 请你返回一个整数数组 count ，长度为 points.length，其中 count[j]是 包含 第 j 个点的矩形数目。
 * <p>
 * 如果 0 <= xj <= li 且 0 <= yj <= hi ，那么我们说第 i 个矩形包含第 j 个点。如果一个点刚好在矩形的 边上 ，这个点也被视为被矩形包含。
 * <p>
 * 示例 1：
 * 输入：rectangles = [[1,2],[2,3],[2,5]], points = [[2,1],[1,4]]
 * 输出：[2,1]
 * 解释：
 * 第一个矩形不包含任何点。
 * 第二个矩形只包含一个点 (2, 1) 。
 * 第三个矩形包含点 (2, 1) 和 (1, 4) 。
 * 包含点 (2, 1) 的矩形数目为 2 。
 * 包含点 (1, 4) 的矩形数目为 1 。
 * 所以，我们返回 [2, 1] 。
 * <p>
 * 示例 2：
 * 输入：rectangles = [[1,1],[2,2],[3,3]], points = [[1,3],[1,1]]
 * 输出：[1,3]
 * 解释：
 * 第一个矩形只包含点 (1, 1) 。
 * 第二个矩形只包含点 (1, 1) 。
 * 第三个矩形包含点 (1, 3) 和 (1, 1) 。
 * 包含点 (1, 3) 的矩形数目为 1 。
 * 包含点 (1, 1) 的矩形数目为 3 。
 * 所以，我们返回 [1, 3] 。
 * <p>
 * 提示：
 * 1 <= rectangles.length, points.length <= 5 * 104
 * rectangles[i].length == points[j].length == 2
 * 1 <= li, xj <= 109
 * 1 <= hi, yj <= 100
 * 所有 rectangles 互不相同 。
 * 所有 points 互不相同 。
 */
public class CountContainingPoint {
    /**
     * 方法一：二分查找
     *
     * @param rectangles
     * @param points
     * @return
     */
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        //长度
        int n = points.length;
        //对应100个做坐标
        List[] lists = new List[101];
        //初始化
        for (int i = 1; i <= 100; i++) {
            lists[i] = new ArrayList<Integer>();
        }
        //遍历
        for (int[] rectangle : rectangles) {
            //坐标值
            int x = rectangle[0];
            int y = rectangle[1];
            //将横坐标按照纵坐标放入对应位置
            lists[y].add(x);
        }

        //将横坐标排序
        for (int i = 1; i <= 100; i++) {
            Collections.sort(lists[i]);
        }

        //结果
        int[] res = new int[n];

        //遍历
        for (int i = 0; i < n; i++) {
            //当前点
            int[] point = points[i];
            //坐标
            int x = point[0];
            int y = point[1];
            //个数
            int count = 0;
            //从当前纵坐标开始，向后遍历
            for (int j = y; j <= 100; j++) {
                //此纵坐标不存在
                if (lists[j].size() <= 0)
                    continue;
                //此纵坐标下符合条件横坐标的个数
                count += left_search(lists[j], x);
            }
            //赋值
            res[i] = count;
        }

        return res;
    }

    /**
     * 二分查找
     *
     * @param list
     * @param k
     * @return
     */
    private int left_search(List<Integer> list, int k) {
        //左右指针
        int left = 0;
        int right = list.size() - 1;
        //遍历
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (list.get(mid) >= k)
                right = mid;
            else
                left = mid + 1;
        }
        //满足条件的最小横坐标的位置，其满足条件的个数为之后的所有纵坐标的个数
        return list.get(right) >= k ? list.size() - right : 0;
    }
}
