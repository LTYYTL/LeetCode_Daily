package com.leetcode.L801_900.L0864;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 864. 获取所有钥匙的最短路径
 * 给定一个二维网格 grid ，其中：
 * (1)'.' 代表一个空房间
 * (2)'#' 代表一堵
 * (3)'@' 是起点
 * (4)小写字母代表钥匙
 * (5)大写字母代表锁
 * 我们从起点开始出发，一次移动是指向四个基本方向之一行走一个单位空间。我们不能在网格外面行走，也无法穿过一堵墙。
 * 如果途经一个钥匙，我们就把它捡起来。除非我们手里有对应的钥匙，否则无法通过锁。
 * 假设 k 为 钥匙/锁 的个数，且满足 1 <= k <= 6，字母表中的前 k 个字母在网格中都有自己对应的一个小写和一个大写字母。
 * 换言之，每个锁有唯一对应的钥匙，每个钥匙也有唯一对应的锁。另外，代表钥匙和锁的字母互为大小写并按字母顺序排列。
 * 返回获取所有钥匙所需要的移动的最少次数。如果无法获取所有钥匙，返回 -1 。
 * <p>
 * 示例 1：
 * 输入：grid = ["@.a.#","###.#","b.A.B"]
 * 输出：8
 * 解释：目标是获得所有钥匙，而不是打开所有锁。
 * <p>
 * 示例 2：
 * 输入：grid = ["@..aA","..B#.","....b"]
 * 输出：6
 * <p>
 * 示例 3:
 * 输入: grid = ["@Aa"]
 * 输出: -1
 * <p>
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 30
 * grid[i][j] 只含有 '.', '#', '@', 'a'-'f' 以及 'A'-'F'
 * 钥匙的数目范围是 [1, 6]
 * 每个钥匙都对应一个 不同 的字母
 * 每个钥匙正好打开一个对应的锁
 */
public class ShortestPathKeys {
    // 四个方向
    private final int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    /**
     * 方法：广度优先搜索
     */
    public int shortestPathAllKeys(String[] grid) {
        // 长度
        // 长度
        int m = grid.length;
        int n = grid[0].length();
        // 记录位置
        Queue<int[]> queue = new ArrayDeque<>();
        // 记录是否访问
        boolean[][][] vis = new boolean[m][n][64];
        // 拿到的所有钥匙状态
        int totalMask = 0;
        //  遍历
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 当前字符
                char c = grid[i].charAt(j);
                // 起点
                if (c == '@') {
                    // 加入字符
                    queue.add(new int[]{i, j, 0});
                    // 记录已访问
                    vis[i][j][0] = true;
                }
                // 记录拿到的钥匙状态
                if (c >= 'a' && c <= 'z') {
                    totalMask |= 1 << (c - 'a');
                }
            }
        }
        // 结果
        int res = 0;
        // 遍历
        while (!queue.isEmpty()) {
            // 当前层节点个数
            int size = queue.size();
            // 遍历层
            for (int i = 0; i < size; i++) {
                // 队首元素
                int[] cur = queue.poll();
                // 坐标
                int x = cur[0];
                int y = cur[1];
                // 当前拿到钥匙的状态
                int mask = cur[2];
                // 拿到所有钥匙
                if (mask == totalMask) {
                    return res;
                }
                // 遍历四个方向
                for (int[] dir : dirs) {
                    // 新坐标
                    int newX = dir[0] + x;
                    int newY = dir[1] + y;
                    // 越界
                    if (newX < 0 || newX >= m || newY < 0 || newY >= n) {
                        continue;
                    }
                    // 当前字符
                    char c = grid[newX].charAt(newY);
                    // 已拿到的钥匙
                    int nMask = mask;
                    // 是墙
                    if (c == '#') {
                        continue;
                    } else if (c >= 'A' && c <= 'Z' && ((mask >> (c - 'A')) & 1) == 0) {
                        // 是锁，但是没有拿到钥匙
                        continue;
                    } else if (c >= 'a' && c <= 'z') {
                        // 是钥匙，改变拿钥匙状态
                        nMask |= 1 << (c - 'a');
                    }
                    // 没有访问过
                    if (!vis[newX][newY][nMask]) {
                        // 放入队列
                        queue.add(new int[]{newX, newY, nMask});
                        // 记录访问
                        vis[newX][newY][nMask] = true;
                    }
                }
            }
            // 记录步数
            res++;
        }

        // 不能成功
        return -1;
    }
}
