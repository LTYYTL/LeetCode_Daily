package com.leetcode.L1601_1700.L1620;

import java.util.Arrays;

public class CoordinateMaxNetworkTest {
    public static void main(String[] args) {
        CoordinateMaxNetwork coordinateMaxNetwork = new CoordinateMaxNetwork();
        /*
          示例 1：
          输入：towers = [[1,2,5],[2,1,7],[3,1,9]], radius = 2
          输出：[2,1]
          解释：
          坐标 (2, 1) 信号强度之和为 13
          - 塔 (2, 1) 强度参数为 7 ，在该点强度为 ⌊7 / (1 + sqrt(0)⌋ = ⌊7⌋ = 7
          - 塔 (1, 2) 强度参数为 5 ，在该点强度为 ⌊5 / (1 + sqrt(2)⌋ = ⌊2.07⌋ = 2
          - 塔 (3, 1) 强度参数为 9 ，在该点强度为 ⌊9 / (1 + sqrt(1)⌋ = ⌊4.5⌋ = 4
          没有别的坐标有更大的信号强度。
         */
        System.out.println(Arrays.toString(coordinateMaxNetwork.bestCoordinate(new int[][]{{1, 2, 5}, {2, 1, 7}, {3, 1, 9}}, 2)));
        /*
          示例 2：
          输入：towers = [[23,11,21]], radius = 9
          输出：[23,11]
          解释：由于仅存在一座信号塔，所以塔的位置信号强度最大。
         */
        System.out.println(Arrays.toString(coordinateMaxNetwork.bestCoordinate(new int[][]{{23, 11, 21}}, 2)));
        /*
          示例 3：
          输入：towers = [[1,2,13],[2,1,7],[0,1,9]], radius = 2
          输出：[1,2]
          解释：坐标 (1, 2) 的信号强度最大。
         */
        System.out.println(Arrays.toString(coordinateMaxNetwork.bestCoordinate(new int[][]{{1, 2, 13}, {2, 1, 7}, {0, 1, 9}}, 2)));
    }
}
