package com.offerII.L116;

import com.util.UF;

/**
 * 剑指 Offer II 116. 省份数量
 * 有 n 个城市，其中一些彼此相连，另一些没有相连。如果城市 a 与城市 b 直接相连，且城市 b 与城市 c 直接相连，那么城市 a 与城市 c 间接相连。
 * 省份 是一组直接或间接相连的城市，组内不含其他没有相连的城市。
 * 给你一个 n x n 的矩阵 isConnected ，其中 isConnected[i][j] = 1 表示第 i 个城市和第 j 个城市直接相连，而 isConnected[i][j] = 0 表示二者不直接相连。
 * 返回矩阵中 省份 的数量。
 *
 * 示例 1：
 * 输入：isConnected = [[1,1,0],[1,1,0],[0,0,1]]
 * 输出：2
 *
 * 示例 2：
 * 输入：isConnected = [[1,0,0],[0,1,0],[0,0,1]]
 * 输出：3
 *
 * 提示：
 * 1 <= n <= 200
 * n == isConnected.length
 * n == isConnected[i].length
 * isConnected[i][j] 为 1 或 0
 * isConnected[i][i] == 1
 * isConnected[i][j] == isConnected[j][i]
 *
 * 注意：本题与主站 547 题相同： <a href="https://leetcode-cn.com/problems/number-of-provinces/">https://leetcode-cn.com/problems/number-of-provinces/</a>
 */
public class NumberProvinces {
    /**
     * 方法：并查集
     * @param isConnected
     * @return
     */
    public int findCircleNum(int[][] isConnected) {
        //长度
        int n = isConnected.length;
        //创建并查集
        UF uf = new UF(n);
        //遍历
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                //不是本身且两个不是连通的
                if (i!=j && isConnected[i][j] == 1 && !uf.connected(i,j))
                    uf.union(i,j);//合并
            }
        }
        //返回连通性
        return uf.getCount();
    }
}
