package com.leetcode.L101_200.L0130;

/**
 * 130. 被围绕的区域
 * 给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 *
 * 示例 1：
 * 输入：board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
 * 输出：[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
 * 解释：被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。
 * 如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
 *
 * 示例 2：
 * 输入：board = [["X"]]
 * 输出：[["X"]]
 *
 * 提示：
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 200
 * board[i][j] 为 'X' 或 'O'
 */
public class SurroundedRegions {
    /**
     * 方法：并查集
     * @param board
     */
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        //m*n给dummy留一个位置，二维映射一维：i*n+y
        UF uf = new UF(m * n + 1);
        int dummy = m * n;
        
        //将首列，末列的o与dummy连通
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O')
                uf.union(i*n,dummy);
            if (board[i][n-1] == 'O')
                uf.union(i * n + n-1,dummy);
        }

        //将首行，末行的o与dummy连通
        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O')
                uf.union(i,dummy);
            if (board[m-1][i] == 'O')
                uf.union((m-1) * n + i,dummy);
        }
        //四个方向
        int[][] dis = {{1,0},{-1,0},{0,1},{0,-1}};
        //遍历
        for (int i = 1; i < m-1; i++) {
            for (int j = 1; j < n-1; j++) {
                //当前为O
                if (board[i][j] == 'O'){
                    //遍历四个方向
                    for (int k = 0; k < 4; k++) {
                        //新坐标
                        int x = i + dis[k][0];
                        int y = j + dis[k][1];
                        if (board[x][y] == 'O')
                            uf.union(i*n+j, x*n+y);
                    }
                }
            }
        }

        //所有不和dummy连通的O，都要被替换
        for (int i = 1; i < m-1; i++) {
            for (int j = 1; j < n-1; j++) {
                //不连通的变成'X'
                if (!uf.connected(dummy,i*n+j))
                    board[i][j] = 'X';
            }
        }
    }

    class UF{
        //连通性
        private int count;
        //记录每个节点的根节点
        private final int[] parent;
        //每个节点的重量（包含节点的数）
        private final int[] size;

        public UF(int n){
            this.count = n;
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
                size[i] = i;
            }
        }

        /**
         * 合并p和q
         * @param p
         * @param q
         */
        public void union(int p, int q){
            //寻找p的根节点
            int rootP = find(p);
            //寻找q的根节点
            int rootQ = find(q);
            //连通
            if (rootP == rootQ)
                return;
            
            //将小树接到大树上
            if (size[rootP] > size[rootQ]){
                parent[rootQ] = rootP;
                //将小树的重量接到大树的重量
                size[rootP] += parent[rootQ];
            }else {
                parent[rootP] = rootQ;
                size[rootQ] += parent[rootP];
            }
            //连通性减少
            count--;
        }

        /**
         * 节点x的根节点
         * @param x
         * @return
         */
        private int find(int x) {
            while (parent[x] != x){
                //路径压缩
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        /**
         * 判断p和q是否连通
         * @param p
         * @param q
         * @return
         */
        public boolean connected(int p, int q){
            //寻找p的根节点
            int rootP = find(p);
            //寻找q的根节点
            int rootQ = find(q);
            //处于同一棵树
            return rootP == rootQ;
        }
    }
}
