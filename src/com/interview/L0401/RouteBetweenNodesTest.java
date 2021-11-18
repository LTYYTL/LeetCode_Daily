package com.interview.L0401;

public class RouteBetweenNodesTest {
    public static void main(String[] args) {
        RouteBetweenNodes routeBetweenNodes = new RouteBetweenNodes();
        /**
         * 示例1:
         *  输入：n = 3, graph = [[0, 1], [0, 2], [1, 2], [1, 2]], start = 0, target = 2
         *  输出：true
         */
        System.out.println(routeBetweenNodes.findWhetherExistsPath(3, new int[][]{{0, 1}, {0, 2}, {1, 2}, {1, 2}}, 0, 2));
        /**
         * 示例2:
         *  输入：n = 5, graph = [[0, 1], [0, 2], [0, 4], [0, 4], [0, 1], [1, 3], [1, 4], [1, 3], [2, 3], [3, 4]], start = 0, target = 4
         *  输出 true
         */
        System.out.println(routeBetweenNodes.findWhetherExistsPath(5,
                new int[][]{{0, 1}, {0, 2}, {0, 4}, {0, 4},{0,1},{1,3},{1,4},{1,3},{2,3},{3,4}},
                0, 4));
    }
}
