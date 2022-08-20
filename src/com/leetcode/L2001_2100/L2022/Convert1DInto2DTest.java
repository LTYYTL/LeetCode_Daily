package com.leetcode.L2001_2100.L2022;

import java.util.Arrays;

public class Convert1DInto2DTest {
    public static void main(String[] args) {
        Convert1DInto2D convert1DInto2D = new Convert1DInto2D();
        /*
          示例 1：
          输入：original = [1,2,3,4], m = 2, n = 2
          输出：[[1,2],[3,4]]
          解释：
          构造出的二维数组应该包含 2 行 2 列。
          original 中第一个 n=2 的部分为 [1,2] ，构成二维数组的第一行。
          original 中第二个 n=2 的部分为 [3,4] ，构成二维数组的第二行。
         */
        System.out.println(Arrays.deepToString(convert1DInto2D.construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
        /*
          示例 2：
          输入：original = [1,2,3], m = 1, n = 3
          输出：[[1,2,3]]
          解释：
          构造出的二维数组应该包含 1 行 3 列。
          将 original 中所有三个元素放入第一行中，构成要求的二维数组。
         */
        System.out.println(Arrays.deepToString(convert1DInto2D.construct2DArray(new int[]{1, 2, 3}, 1, 3)));
        /*
          示例 3：
          输入：original = [1,2], m = 1, n = 1
          输出：[]
          解释：
          original 中有 2 个元素。
          无法将 2 个元素放入到一个 1x1 的二维数组中，所以返回一个空的二维数组。
         */
        System.out.println(Arrays.deepToString(convert1DInto2D.construct2DArray(new int[]{1, 2}, 1, 1)));
        /*
          示例 4：
          输入：original = [3], m = 1, n = 2
          输出：[]
          解释：
          original 中只有 1 个元素。
          无法将 1 个元素放满一个 1x2 的二维数组，所以返回一个空的二维数组。
         */
        System.out.println(Arrays.deepToString(convert1DInto2D.construct2DArray(new int[]{3}, 1, 2)));
    }
}
