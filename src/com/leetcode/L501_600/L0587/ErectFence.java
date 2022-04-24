package com.leetcode.L501_600.L0587;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 587. 安装栅栏
 * 在一个二维的花园中，有一些用 (x, y) 坐标表示的树。由于安装费用十分昂贵，你的任务是先用最短的绳子围起所有的树。
 * 只有当所有的树都被绳子包围时，花园才能围好栅栏。你需要找到正好位于栅栏边界上的树的坐标。
 *
 * 示例 1:
 * 输入: [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
 * 输出: [[1,1],[2,0],[4,2],[3,3],[2,4]]
 * 解释:
 *
 * 示例 2:
 * 输入: [[1,2],[2,2],[4,2]]
 * 输出: [[1,2],[2,2],[4,2]]
 * 解释:
 *
 * 即使树都在一条直线上，你也需要先用绳子包围它们。
 *
 * 注意:
 * 所有的树应当被围在一起。你不能剪断绳子来包围树或者把树分成一组以上。
 * 输入的整数在 0 到 100 之间。
 * 花园至少有一棵树。
 * 所有树的坐标都是不同的。
 * 输入的点没有顺序。输出顺序也没有要求。
 */
public class ErectFence {
    /**
     * 方法：Graham 算法
     * @param trees
     * @return
     */
    public int[][] outerTrees(int[][] trees) {
        int n = trees.length;
        if (n < 4) {
            return trees;
        }
        int bottom = 0;
        //找到 y 最小的点 bottom
        for (int i = 0; i < n; i++) {
            if (trees[i][1] < trees[bottom][1]) {
                bottom = i;
            }
        }
        swap(trees, bottom, 0);
        //以 bottom 原点,根据极坐标的角度由小到大进行排序
        Arrays.sort(trees, 1, n, (a, b) -> {
            int diff = cross(trees[0], a, b) - cross(trees[0], b, a);
            if (diff == 0) {
                //极角相同,按距离排
                return distance(trees[0], a) - distance(trees[0], b);
            } else {
                //让叉乘为+的点先遍历
                return -diff;
            }
        });
        //对于凸包最后且在同一条直线的元素要按照距离从大到小进行排序
        int r = n - 1;
        //从末尾找到共线的最后一个点
        while (r >= 0 && cross(trees[0], trees[n - 1], trees[r]) == 0) {
            r--;
        }
        for (int l = r + 1, h = n - 1; l < h; l++, h--) {
            swap(trees, l, h);
        }

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        stack.push(1);
        //开始进行处理
        for (int i = 2; i < n; i++) {
            int top = stack.pop();
            //如果当前元素与栈顶的两个元素构成的向量顺时针旋转,则弹出栈顶元素
            while (!stack.isEmpty() && cross(trees[stack.peek()], trees[top], trees[i]) < 0) {
                top = stack.pop();
            }
            stack.push(top);
            stack.push(i);
        }

        int size = stack.size();
        int[][] res = new int[size][2];
        for (int i = 0; i < size; i++) {
            res[i] = trees[stack.pop()];
        }
        return res;
    }

    //计算pq叉乘qr
    //目的是求点r是在pq的左侧还是右侧
    //若在左侧,其值会大于0
    public int cross(int[] p, int[] q, int[] r) {
        return (q[0] - p[0]) * (r[1] - q[1]) - (q[1] - p[1]) * (r[0] - q[0]);
    }

    //求两点间的距离
    public int distance(int[] p, int[] q) {
        return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
    }

    //交换第i棵树和第j棵树的位置
    public void swap(int[][] trees, int i, int j) {
        int x = trees[i][0], y = trees[i][1];
        trees[i][0] = trees[j][0];
        trees[i][1] = trees[j][1];
        trees[j][0] = x;
        trees[j][1] = y;
    }
}
