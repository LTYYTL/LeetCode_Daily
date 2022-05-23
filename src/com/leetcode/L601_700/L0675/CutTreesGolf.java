package com.leetcode.L601_700.L0675;

import java.util.*;

/**
 * 675. 为高尔夫比赛砍树
 * 你被请来给一个要举办高尔夫比赛的树林砍树。树林由一个 m x n 的矩阵表示， 在这个矩阵中：
 * (1)0 表示障碍，无法触碰
 * (2)1 表示地面，可以行走
 * (2)比 1 大的数 表示有树的单元格，可以行走，数值表示树的高度
 * 每一步，你都可以向上、下、左、右四个方向之一移动一个单位，如果你站的地方有一棵树，那么你可以决定是否要砍倒它。
 * <p>
 * 你需要按照树的高度从低向高砍掉所有的树，每砍过一颗树，该单元格的值变为 1（即变为地面）。
 * 你将从 (0, 0) 点开始工作，返回你砍完所有树需要走的最小步数。 如果你无法砍完所有的树，返回 -1 。
 * 可以保证的是，没有两棵树的高度是相同的，并且你至少需要砍倒一棵树。
 * <p>
 * 示例 1：
 * 输入：forest = [[1,2,3],[0,0,4],[7,6,5]]
 * 输出：6
 * 解释：沿着上面的路径，你可以用 6 步，按从最矮到最高的顺序砍掉这些树。
 * <p>
 * 示例 2：
 * 输入：forest = [[1,2,3],[0,0,0],[7,6,5]]
 * 输出：-1
 * 解释：由于中间一行被障碍阻塞，无法访问最下面一行中的树。
 * <p>
 * 示例 3：
 * 输入：forest = [[2,3,4],[0,0,5],[8,7,6]]
 * 输出：6
 * 解释：可以按与示例 1 相同的路径来砍掉所有的树。
 * (0,0) 位置的树，可以直接砍去，不用算步数。
 * <p>
 * 提示：
 * m == forest.length
 * n == forest[i].length
 * 1 <= m, n <= 50
 * 0 <= forest[i][j] <= 109
 */
public class CutTreesGolf {
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    /**
     * 方法：广度优先搜索
     *
     * @param forest
     * @return
     */
    public int cutOffTree(List<List<Integer>> forest) {
        //长度
        int m = forest.size();
        int n = forest.get(0).size();

        //记录所有树
        List<int[]> trees = new ArrayList<>();
        //遍历
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //树高
                int val = forest.get(i).get(j);
                //是树，记录
                if (val > 1)
                    trees.add(new int[]{i, j});
            }
        }
        //根据树的高度对树的位置排序
        trees.sort(Comparator.comparingInt(a -> forest.get(a[0]).get(a[1])));

        //初始坐标
        int x = 0;
        int y = 0;
        //结果
        int ans = 0;

        //遍历
        for (int[] tree : trees) {
            //最小步数
            int step = dfs(forest, x, y, tree[0], tree[1]);
            //不能到达
            if (step == -1)
                return -1;
            //增加步数
            ans += step;
            //坐标值
            x = tree[0];
            y = tree[1];
        }

        return ans;
    }

    /**
     * 寻找两个点的最小步数
     *
     * @param forest
     * @param x
     * @param y
     * @param tx
     * @param ty
     * @return
     */
    private int dfs(List<List<Integer>> forest, int x, int y, int tx, int ty) {
        //当前点就是目标点
        if (x == tx && y == ty)
            return 0;

        //长度
        int m = forest.size();
        int n = forest.get(0).size();
        //步数
        int step = 0;

        //队列
        Queue<int[]> queue = new LinkedList<>();
        //记录访问
        boolean[][] visited = new boolean[m][n];
        //加入队列
        queue.offer(new int[]{x, y});
        //已访问
        visited[x][y] = true;

        //遍历
        while (!queue.isEmpty()) {
            //层数
            step++;
            //当前层个数
            int size = queue.size();
            //遍历层
            for (int i = 0; i < size; i++) {
                //队首
                int[] cur = queue.poll();
                //四个方向
                for (int k = 0; k < 4; k++) {
                    //新坐标
                    int newX = cur[0] + dirs[k][0];
                    int newY = cur[1] + dirs[k][1];
                    //越界，访问过，不是树
                    if (newX < 0 || newX >= m || newY < 0 || newY >= n || visited[newX][newY] || forest.get(newX).get(newY) < 1)
                        continue;
                    //是目标坐标
                    if (newX == tx && newY == ty)
                        return step;
                    //加入队列
                    queue.add(new int[]{newX, newY});
                    //已访问
                    visited[newX][newY] = true;
                }
            }
        }
        return -1;
    }
}
