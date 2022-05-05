package com.leetcode.L401_500.L0427;

public class ConstructQuadTreeTest {
    public static void main(String[] args) {
        ConstructQuadTree constructQuadTree = new ConstructQuadTree();
        /**
         * 示例 1：
         * 输入：grid = [[0,1],[1,0]]
         * 输出：[[0,1],[1,0],[1,1],[1,1],[1,0]]
         * 解释：此示例的解释如下：
         * 请注意，在下面四叉树的图示中，0 表示 false，1 表示 True 。
         */
        System.out.println(constructQuadTree.construct(new int[][]{{0, 1}, {1, 0}}));
        /**
         * 示例 2：
         * 输入：grid = [[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0]]
         * 输出：[[0,1],[1,1],[0,1],[1,1],[1,0],null,null,null,null,[1,0],[1,0],[1,1],[1,1]]
         * 解释：网格中的所有值都不相同。我们将网格划分为四个子网格。
         * topLeft，bottomLeft 和 bottomRight 均具有相同的值。
         * topRight 具有不同的值，因此我们将其再分为 4 个子网格，这样每个子网格都具有相同的值。
         * 解释如下图所示：
         */
        System.out.println(constructQuadTree.construct(new int[][]{
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        }));
        /**
         * 示例 3：
         * 输入：grid = [[1,1],[1,1]]
         * 输出：[[1,1]]
         */
        System.out.println(constructQuadTree.construct(new int[][]{
                {1, 1}, {1, 1}
        }));
        /**
         * 示例 4：
         * 输入：grid = [[0]]
         * 输出：[[1,0]]
         */
        System.out.println(constructQuadTree.construct(new int[][]{
                {0}
        }));
        /**
         * 示例 5：
         * 输入：grid = [[1,1,0,0],[1,1,0,0],[0,0,1,1],[0,0,1,1]]
         * 输出：[[0,1],[1,1],[1,0],[1,0],[1,1]]
         */
        System.out.println(constructQuadTree.construct(new int[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, 1},
        }));
    }
}
