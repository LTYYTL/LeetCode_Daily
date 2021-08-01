package com.leetcode.L1337;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 1337. 矩阵中战斗力最弱的 K 行
 * 给你一个大小为 m * n 的矩阵 mat，矩阵由若干军人和平民组成，分别用 1 和 0 表示。
 * 请你返回矩阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。
 * 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。
 * 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。
 *
 * 示例 1：
 * 输入：mat =
 * [[1,1,0,0,0],
 *  [1,1,1,1,0],
 *  [1,0,0,0,0],
 *  [1,1,0,0,0],
 *  [1,1,1,1,1]],
 * k = 3
 * 输出：[2,0,3]
 * 解释：
 * 每行中的军人数目：
 * 行 0 -> 2
 * 行 1 -> 4
 * 行 2 -> 1
 * 行 3 -> 2
 * 行 4 -> 5
 * 从最弱到最强对这些行排序后得到 [2,0,3,1,4]
 *
 * 示例 2：
 * 输入：mat =
 * [[1,0,0,0],
 *  [1,1,1,1],
 *  [1,0,0,0],
 *  [1,0,0,0]],
 * k = 2
 * 输出：[0,2]
 * 解释：
 * 每行中的军人数目：
 * 行 0 -> 1
 * 行 1 -> 4
 * 行 2 -> 1
 * 行 3 -> 1
 * 从最弱到最强对这些行排序后得到 [0,2,3,1]
 *
 * 提示：
 * m == mat.length
 * n == mat[i].length
 * 2 <= n, m <= 100
 * 1 <= k <= m
 * matrix[i][j] 不是 0 就是 1
 */
public class TheKWeakestRowsMatrix {

    /**
     * 方法：堆+暴力法
     * @param mat
     * @param k
     * @return
     */
    public int[] kWeakestRows(int[][] mat, int k) {
        //创建堆
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])//当"1"的个数相等时
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        //计算每行"1"的个数
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    count++;
            }
            //将{个数，索引}存入堆中
            queue.offer(new int[]{count,i});
        }

        //取前k个元素
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[1];
        }
        return res;
    }

    /**
     * 方法：堆+二分查找
     * @param mat
     * @param k
     * @return
     */
    public int[] kWeakestRows_brinary(int[][] mat, int k) {
        //创建堆
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])//当"1"的个数相等时
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        //计算每行"1"的个数
        for (int i = 0; i < mat.length; i++) {
            int left = 0;
            int right = mat[i].length -1 ;
            int pos = -1;//最后一个"1"的索引
            while (left <= right){
                int mid = (right - left)/2 +left;
                if (mat[i][mid] == 0)
                    right = mid -1;
                else {
                    pos = mid;
                    left = mid + 1;
                }
            }
            //将{个数，索引}存入堆中
            queue.offer(new int[]{pos+1,i});
        }

        //取前k个元素
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[1];
        }
        return res;
    }
}
