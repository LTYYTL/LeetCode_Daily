package com.leetcode.L1701_1800.L1779;

public class FindPointSameTest {
    public static void main(String[] args) {
        FindPointSame findPointSame = new FindPointSame();
        /*
          示例 1：
          输入：x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
          输出：2
          解释：所有点中，[3,1]，[2,4] 和 [4,4] 是有效点。有效点中，[2,4] 和 [4,4] 距离你当前位置的曼哈顿距离最小，都为 1 。[2,4] 的下标最小，所以返回 2 。
         */
        System.out.println(findPointSame.nearestValidPoint(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}}));
        /*
          示例 2：
          输入：x = 3, y = 4, points = [[3,4]]
          输出：0
          提示：答案可以与你当前所在位置坐标相同。
         */
        System.out.println(findPointSame.nearestValidPoint(3, 4, new int[][]{{3, 4}}));
        /*
          示例 3：
          输入：x = 3, y = 4, points = [[2,3]]
          输出：-1
          解释：没有 有效点。
         */
        System.out.println(findPointSame.nearestValidPoint(3, 4, new int[][]{{2, 3}}));
    }
}
