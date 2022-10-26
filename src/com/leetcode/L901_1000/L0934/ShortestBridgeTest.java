package com.leetcode.L901_1000.L0934;

public class ShortestBridgeTest {
    public static void main(String[] args) {
        ShortestBridge shortestBridge = new ShortestBridge();
        /*
          示例 1：
          输入：grid = [[0,1],[1,0]]
          输出：1
         */
        System.out.println(shortestBridge.shortestBridge(new int[][]{{0, 1}, {1, 0}}));
        /*
          示例 2：
          输入：grid = [[0,1,0],[0,0,0],[0,0,1]]
          输出：2
         */
        System.out.println(shortestBridge.shortestBridge(new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 0, 1}}));
        /*
          示例 3：
          输入：grid = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
          输出：1
         */
        System.out.println(shortestBridge.shortestBridge(new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}}));
    }
}
