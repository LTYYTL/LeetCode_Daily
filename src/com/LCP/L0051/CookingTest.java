package com.LCP.L0051;

public class CookingTest {
    public static void main(String[] args) {
        Cooking cooking = new Cooking();
        /*
          示例 1：
          输入：materials = [3,2,4,1,2]
          cookbooks = [[1,1,0,1,2],[2,1,4,0,0],[3,2,4,1,0]]
          attribute = [[3,2],[2,4],[7,6]]
          limit = 5
          输出：7
          解释：
          食材数量可以满足以下两种方案：
          方案一：制作料理 0 和料理 1，可获得饱腹感 2+4、美味度 3+2
          方案二：仅制作料理 2， 可饱腹感为 6、美味度为 7
          因此在满足饱腹感的要求下，可获得最高美味度 7
         */
        System.out.println(cooking.perfectMenu(new int[]{3, 2, 4, 1, 2},
                new int[][]{{1, 1, 0, 1, 2}, {2, 1, 4, 0, 0}, {3, 2, 4, 1, 0}},
                new int[][]{{3, 2}, {2, 4}, {7, 6}},
                5));
        /*
          示例 2：
          输入：materials = [10,10,10,10,10]
          cookbooks = [[1,1,1,1,1],[3,3,3,3,3],[10,10,10,10,10]]
          attribute = [[5,5],[6,6],[10,10]]
          limit = 1
          输出：11
          解释：通过制作料理 0 和 1，可满足饱腹感，并获得最高美味度 11
         */
        System.out.println(cooking.perfectMenu(new int[]{10, 10, 10, 10, 10},
                new int[][]{{1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}, {10, 10, 10, 10, 10}},
                new int[][]{{5, 5}, {6, 6}, {10, 10}},
                1));
    }
}
