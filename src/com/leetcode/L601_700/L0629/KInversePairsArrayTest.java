package com.leetcode.L601_700.L0629;

public class KInversePairsArrayTest {
    public static void main(String[] args) {
        KInversePairsArray kInversePairsArray = new KInversePairsArray();
        /*
          示例 1:
          输入: n = 3, k = 0
          输出: 1
          解释:
          只有数组 [1,2,3] 包含了从1到3的整数并且正好拥有 0 个逆序对。
         */
        System.out.println(kInversePairsArray.kInversePairs(3, 0));
        /*
          示例 2:
          输入: n = 3, k = 1
          输出: 2
          解释:
          数组 [1,3,2] 和 [2,1,3] 都有 1 个逆序对。
         */
        System.out.println(kInversePairsArray.kInversePairs(3, 1));
    }
}
