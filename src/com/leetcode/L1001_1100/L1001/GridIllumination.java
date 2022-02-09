package com.leetcode.L1001_1100.L1001;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1001. 网格照明
 * 在大小为 n x n 的网格 grid 上，每个单元格都有一盏灯，最初灯都处于 关闭 状态。
 * 给你一个由灯的位置组成的二维数组 lamps ，其中 lamps[i] = [rowi, coli] 表示 打开 位于 grid[rowi][coli] 的灯。
 * 即便同一盏灯可能在 lamps 中多次列出，不会影响这盏灯处于 打开 状态。
 * 当一盏灯处于打开状态，它将会照亮 自身所在单元格 以及同一 行 、同一 列 和两条 对角线 上的 所有其他单元格 。
 * 另给你一个二维数组 queries ，其中 queries[j] = [rowj, colj] 。对于第 j 个查询，如果单元格 [rowj, colj] 是被照亮的，则查询结果为 1 ，否则为 0 。
 * 在第 j 次查询之后 [按照查询的顺序] ，关闭 位于单元格 grid[rowj][colj] 上及相邻 8 个方向上（与单元格 grid[rowi][coli] 共享角或边）的任何灯。
 *
 * 返回一个整数数组 ans 作为答案， ans[j] 应等于第 j 次查询 queries[j] 的结果，1 表示照亮，0 表示未照亮。
 *
 * 示例 1：
 * 输入：n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,0]]
 * 输出：[1,0]
 * 解释：最初所有灯都是关闭的。在执行查询之前，打开位于 [0, 0] 和 [4, 4] 的灯。
 * 第 0 次查询检查 grid[1][1] 是否被照亮（蓝色方框）。该单元格被照亮，所以 ans[0] = 1 。然后，关闭红色方框中的所有灯。
 * 第 1 次查询检查 grid[1][0] 是否被照亮（蓝色方框）。该单元格没有被照亮，所以 ans[1] = 0 。然后，关闭红色矩形中的所有灯。
 *
 * 示例 2：
 * 输入：n = 5, lamps = [[0,0],[4,4]], queries = [[1,1],[1,1]]
 * 输出：[1,1]
 *
 * 示例 3：
 * 输入：n = 5, lamps = [[0,0],[0,4]], queries = [[0,4],[0,1],[1,4]]
 * 输出：[1,1,0]
 *
 * 提示：
 * 1 <= n <= 109
 * 0 <= lamps.length <= 20000
 * 0 <= queries.length <= 20000
 * lamps[i].length == 2
 * 0 <= rowi, coli < n
 * queries[j].length == 2
 * 0 <= rowj, colj < n
 */
public class GridIllumination {
    private static final int[][] DIRS = {{0, 0}, {0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    /**
     * 方法：map映射
     * @param n
     * @param lamps
     * @param queries
     * @return
     */
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        // 使用哈希表记录每行、每列、正对角线、反对角线灯的数量
        // 查询的时候，对于查询点及周围八个坐标看是否有灯，有灯则对应的行、列、正反对角线灯的数量减一
        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();
        Map<Integer, Integer> diags = new HashMap<>();
        Map<Integer, Integer> backDiags = new HashMap<>();

        // 记录哪些位置有灯
        Set<Integer> lights = new HashSet<>();

        //遍历
        for (int[] lamp : lamps) {
            int x = lamp[0];
            int y = lamp[1];

            // 每个灯只计算一次
            if (lights.add(convert(x, y))) {
                //行亮灯数
                rows.put(x, rows.getOrDefault(x, 0) + 1);
                //列亮灯数
                cols.put(y, cols.getOrDefault(y, 0) + 1);
                //正对角线亮灯数
                diags.put(x + y, diags.getOrDefault(x + y, 0) + 1);
                //反对角线亮灯数
                backDiags.put(x - y, backDiags.getOrDefault(x - y, 0) + 1);
            }
        }

        //结果
        int[] ans = new int[queries.length];
        //遍历
        for (int i = 0; i < queries.length; i++) {
            //坐标
            int x = queries[i][0];
            int y = queries[i][1];

            // 如果行、列、正反对角线任意一个有灯，就说明这个地方被照亮了
            if (rows.containsKey(x) || cols.containsKey(y) || diags.containsKey(x + y) || backDiags.containsKey(x - y)) {
                ans[i] = 1;
            }

            // 把它自己及周围八个格子的灯灭了
            for (int[] dir : DIRS) {
                //新坐标
                int nx = x + dir[0];
                int ny = y + dir[1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && lights.remove(convert(nx, ny))) {
                    //减少亮灯数
                    removeOneLight(rows, nx);
                    removeOneLight(cols, ny);
                    removeOneLight(diags, nx + ny);
                    removeOneLight(backDiags, nx - ny);
                }
            }
        }

        return ans;
    }

    private int convert(int x, int y) {
        // 二维坐标转一维坐标，这里不用考虑溢出，只需要保证唯一即可
        // 这里不要使用 n，会有重复的风险
        // 或者使用 n，返回值和Set中存储类型换成 long 也是可以的
        return x * 1000000001 + y;
    }

    private void removeOneLight(Map<Integer, Integer> map, int key) {
        // 如果只有一个，减一之后就变成0了，直接移除
        int old = map.get(key);
        if (old == 1) {
            map.remove(key);
        } else {
            map.put(key, old - 1);
        }
    }

}
