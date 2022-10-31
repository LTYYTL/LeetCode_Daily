package com.leetcode.L901_1000.L0915;

public class PartitionArrayDisjointTest {
    public static void main(String[] args) {
        PartitionArrayDisjoint partitionArrayDisjoint = new PartitionArrayDisjoint();
        /*
          示例 1：
          输入：nums = [5,0,3,8,6]
          输出：3
          解释：left = [5,0,3]，right = [8,6]
         */
        System.out.println(partitionArrayDisjoint.partitionDisjoint(new int[]{5, 0, 3, 8, 6}));
        /*
          示例 2：
          输入：nums = [1,1,1,0,6,12]
          输出：4
          解释：left = [1,1,1,0]，right = [6,12]
         */
        System.out.println(partitionArrayDisjoint.partitionDisjoint(new int[]{1, 1, 1, 0, 6, 12}));
    }
}
