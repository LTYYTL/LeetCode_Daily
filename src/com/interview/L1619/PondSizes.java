package com.interview.L1619;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 面试题 16.19. 水域大小
 * 你有一个用于表示一片土地的整数矩阵land，该矩阵中每个点的值代表对应地点的海拔高度。若值为0则表示水域。
 * 由垂直、水平或对角连接的水域为池塘。池塘的大小是指相连接的水域的个数。编写一个方法来计算矩阵中所有池塘的大小，返回值需要从小到大排序。
 *
 * 示例：
 * 输入：
 * [
 *   [0,2,1,0],
 *   [0,1,0,1],
 *   [1,1,0,1],
 *   [0,1,0,1]
 * ]
 * 输出： [1,2,4]
 *
 * 提示：
 * 0 < len(land) <= 1000
 * 0 < len(land[i]) <= 1000
 */
public class PondSizes {
    //长度
    private int m;
    private int n;

    /**
     * 方法：深度优先搜索
     * @param land
     * @return
     */
    public int[] pondSizes(int[][] land) {
        //长度
        m = land.length;
        n = land[0].length;
        //暂存结果
        List<Integer> list = new ArrayList<>();
        //标记是否访问
        boolean[][] vis = new boolean[m][n];
        //遍历
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //未访问并且是水塘
                if (!vis[i][j] && land[i][j] == 0)
                    //深度优先搜索
                    list.add(dfs(land,vis,i,j));
            }
        }
        //排序
        Collections.sort(list);
        //将集合中的结果转换成数组
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    /**
     * 方法：深度优先搜索
     * @param land
     * @param vis
     * @param i
     * @param j
     * @return
     */
    private int dfs(int[][] land, boolean[][] vis, int i, int j) {
        //越界、已访问、不是水塘，直接返回
        if (i < 0 || i >= m || j < 0 || j >= n || vis[i][j] || land[i][j] != 0 )
            return 0;
        //变成已访问
        vis[i][j] = true;
        return 1 + dfs(land, vis, i-1, j) //上
                 + dfs(land, vis, i+1, j) //下
                 + dfs(land, vis, i, j-1) //左
                 + dfs(land, vis, i, j+1) //右
                 + dfs(land, vis, i-1, j-1) //左上
                 + dfs(land, vis, i-1, j+1) //右上
                 + dfs(land, vis, i+1, j-1) //左下
                 + dfs(land, vis, i+1, j+1);//youxia
    }
}
