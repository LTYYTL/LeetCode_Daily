package com.leetcode.L2201_2300.L2250;

import java.util.Arrays;

public class CountContainingPointTest {
    public static void main(String[] args) {
        CountContainingPoint countContainingPoint = new CountContainingPoint();
        /*
          示例 1：
          输入：rectangles = [[1,2],[2,3],[2,5]], points = [[2,1],[1,4]]
          输出：[2,1]
          解释：
          第一个矩形不包含任何点。
          第二个矩形只包含一个点 (2, 1) 。
          第三个矩形包含点 (2, 1) 和 (1, 4) 。
          包含点 (2, 1) 的矩形数目为 2 。
          包含点 (1, 4) 的矩形数目为 1 。
          所以，我们返回 [2, 1] 。
         */
        System.out.println(Arrays.toString(countContainingPoint.countRectangles(new int[][]{{1, 2}, {2, 3}, {2, 5}}, new int[][]{{2, 1}, {1, 4}})));
        /*
          示例 2：
          输入：rectangles = [[1,1],[2,2],[3,3]], points = [[1,3],[1,1]]
          输出：[1,3]
          解释：
          第一个矩形只包含点 (1, 1) 。
          第二个矩形只包含点 (1, 1) 。
          第三个矩形包含点 (1, 3) 和 (1, 1) 。
          包含点 (1, 3) 的矩形数目为 1 。
          包含点 (1, 1) 的矩形数目为 3 。
          所以，我们返回 [1, 3] 。
         */
        System.out.println(Arrays.toString(countContainingPoint.countRectangles(new int[][]{{1, 1}, {2, 2}, {3, 3}}, new int[][]{{1, 3}, {1, 1}})));
    }
}
