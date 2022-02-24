package com.leetcode.L1701_1800.L1706;

import java.util.Arrays;

public class WhereWillBallFallTest {
    public static void main(String[] args) {
        WhereWillBallFall whereWillBallFall = new WhereWillBallFall();
        /**
         * 示例 1：
         * 输入：grid = [[1,1,1,-1,-1],[1,1,1,-1,-1],[-1,-1,-1,1,1],[1,1,1,1,-1],[-1,-1,-1,-1,-1]]
         * 输出：[1,-1,-1,-1,-1]
         * 解释：示例如图：
         * b0 球开始放在第 0 列上，最终从箱子底部第 1 列掉出。
         * b1 球开始放在第 1 列上，会卡在第 2、3 列和第 1 行之间的 "V" 形里。
         * b2 球开始放在第 2 列上，会卡在第 2、3 列和第 0 行之间的 "V" 形里。
         * b3 球开始放在第 3 列上，会卡在第 2、3 列和第 0 行之间的 "V" 形里。
         * b4 球开始放在第 4 列上，会卡在第 2、3 列和第 1 行之间的 "V" 形里。
         */
        System.out.println(Arrays.toString(whereWillBallFall.findBall(new int[][]{
                {1, 1, 1, -1, -1},
                {1, 1, 1, -1, -1},
                {-1, -1, -1, 1, 1},
                {1, 1, 1, 1, -1},
                {-1, -1, -1, -1, -1}
        })));
        /**
         * 示例 2：
         * 输入：grid = [[-1]]
         * 输出：[-1]
         * 解释：球被卡在箱子左侧边上。
         */
        System.out.println(Arrays.toString(whereWillBallFall.findBall(new int[][]{
                {-1}
        })));
        /**
         * 示例 3：
         * 输入：grid = [[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1],[1,1,1,1,1,1],[-1,-1,-1,-1,-1,-1]]
         * 输出：[0,1,2,3,4,-1]
         */
        System.out.println(Arrays.toString(whereWillBallFall.findBall(new int[][]{
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1},
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1}
        })));
    }
}
