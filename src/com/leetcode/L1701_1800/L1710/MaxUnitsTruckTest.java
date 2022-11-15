package com.leetcode.L1701_1800.L1710;

public class MaxUnitsTruckTest {
    public static void main(String[] args) {
        MaxUnitsTruck maxUnitsTruck = new MaxUnitsTruck();
        /* * 示例 1：
          输入：boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
          输出：8
          解释：箱子的情况如下：
          - 1 个第一类的箱子，里面含 3 个单元。
          - 2 个第二类的箱子，每个里面含 2 个单元。
          - 3 个第三类的箱子，每个里面含 1 个单元。
          可以选择第一类和第二类的所有箱子，以及第三类的一个箱子。
          单元总数 = (1 * 3) + (2 * 2) + (1 * 1) = 8
         */
        System.out.println(maxUnitsTruck.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
        /*
          示例 2：
          输入：boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
          输出：91
         */
        System.out.println(maxUnitsTruck.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
    }
}
