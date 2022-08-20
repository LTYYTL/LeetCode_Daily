package com.leetcode.L501_600.L0598;

public class RangeAdditionIITest {
    public static void main(String[] args) {
        RangeAdditionII rangeAdditionII = new RangeAdditionII();
        /* * 示例 1:
          输入:
          m = 3, n = 3
          operations = [[2,2],[3,3]]
          输出: 4
          解释:
          初始状态, M =
          [[0, 0, 0],
           [0, 0, 0],
           [0, 0, 0]]
          执行完操作 [2,2] 后, M =
          [[1, 1, 0],
           [1, 1, 0],
           [0, 0, 0]]
          执行完操作 [3,3] 后, M =
          [[2, 2, 1],
           [2, 2, 1],
           [1, 1, 1]]
          M 中最大的整数是 2, 而且 M 中有4个值为2的元素。因此返回 4。
         */
        System.out.println(rangeAdditionII.maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
    }
}
