package com.leetcode.L1001_1100.L1036;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 1036. 逃离大迷宫
 * 在一个 106 x 106 的网格中，每个网格上方格的坐标为 (x, y) 。
 * 现在从源方格 source = [sx, sy] 开始出发，意图赶往目标方格 target = [tx, ty] 。数组 blocked 是封锁的方格列表，其中每个 blocked[i] = [xi, yi] 表示坐标为 (xi, yi) 的方格是禁止通行的。
 * 每次移动，都可以走到网格中在四个方向上相邻的方格，只要该方格 不 在给出的封锁列表 blocked 上。同时，不允许走出网格。
 * 只有在可以通过一系列的移动从源方格 source 到达目标方格 target 时才返回 true。否则，返回 false。
 *
 * 示例 1：
 * 输入：blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]
 * 输出：false
 * 解释：
 * 从源方格无法到达目标方格，因为我们无法在网格中移动。
 * 无法向北或者向东移动是因为方格禁止通行。
 * 无法向南或者向西移动是因为不能走出网格。
 *
 * 示例 2：
 * 输入：blocked = [], source = [0,0], target = [999999,999999]
 * 输出：true
 * 解释：
 * 因为没有方格被封锁，所以一定可以到达目标方格。
 *
 * 提示：
 * 0 <= blocked.length <= 200
 * blocked[i].length == 2
 * 0 <= xi, yi < 106
 * source.length == target.length == 2
 * 0 <= sx, sy, tx, ty < 106
 * source != target
 * 题目数据保证 source 和 target 不在封锁列表内
 */
public class EscapeLargeMaze {
    //四个方向
    private static final int[][] DIRECTIONS = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    /**
     * 方法：广度优先搜索
     * @param blocked
     * @param source
     * @param target
     * @return
     */
    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        //没有阻碍地情况
        if (blocked == null || blocked.length == 0)
            return true;
        //广度优先搜索
        return dfs(blocked,source,target) && dfs(blocked,target,source);
    }

    /**
     * 广度优先搜索
     * @param blocked
     * @param source
     * @param target
     * @return
     */
    private boolean dfs(int[][] blocked, int[] source, int[] target) {
        //存储上是否访问
        Set<Integer> visited = new HashSet<Integer>();
        //将阻碍点变成已访问
        for (int[] block : blocked) {
            visited.add(block[0]*1000000 + block[1]);
        }
        //源点已访问
        visited.add(source[0]*1000000 + source[1]);

        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(source);
        //遍历
        while (!queue.isEmpty()){
            //一层需要遍历的个数
            int size = queue.size();
            //一层超出阻碍数，一定能访问到目的点
            if (size >= blocked.length)
                return true;
            //遍历当前层
            for (int i = 0; i < size; i++) {
                //队首元素
                int[] cur = queue.poll();
                //遍历四个方向
                for (int k = 0; k < DIRECTIONS.length; k++) {
                    //新坐标
                    int x = cur[0] + DIRECTIONS[k][0];
                    int y = cur[1] + DIRECTIONS[k][1];
                    //越界
                    if (x< 0 || x >= 1000000 || y < 0 || y >= 1000000)
                        continue;
                    //到达目的点
                    if (x == target[0] && y == target[1])
                        return true;
                    //没有访问加入队列
                    if (visited.add(x*1000000+y))
                        queue.add(new int[]{x,y});
                }
            }
        }
        return false;
    }
}
