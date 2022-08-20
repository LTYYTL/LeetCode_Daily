package com.leetcode.L701_800.L0719;

public class FindKSmallestPairDistanceTest {
    public static void main(String[] args) {
        FindKSmallestPairDistance findKSmallestPairDistance = new FindKSmallestPairDistance();
        /*
          示例 1：
          输入：nums = [1,3,1], k = 1
          输出：0
          解释：数对和对应的距离如下：
          (1,3) -> 2
          (1,1) -> 0
          (3,1) -> 2
          距离第 1 小的数对是 (1,1) ，距离为 0 。
         */
        System.out.println(findKSmallestPairDistance.smallestDistancePair(new int[]{1, 3, 1}, 1));
        /*
          示例 2：
          输入：nums = [1,1,1], k = 2
          输出：0
         */
        System.out.println(findKSmallestPairDistance.smallestDistancePair(new int[]{1, 1, 1}, 2));
        /*
          示例 3：
          输入：nums = [1,6,1], k = 3
          输出：5
         */
        System.out.println(findKSmallestPairDistance.smallestDistancePair(new int[]{1, 6, 1}, 3));
    }
}
