package com.leetcode.L301_400.L0373;

public class FindKPairsSmallestSumsTest {
    public static void main(String[] args) {
        FindKPairsSmallestSums findKPairsSmallestSums = new FindKPairsSmallestSums();
        /* * 示例 1:
          输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
          输出: [1,2],[1,4],[1,6]
          解释: 返回序列中的前 3 对数：
               [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
         */
        System.out.println(findKPairsSmallestSums.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3));
        /*
          示例 2:
          输入: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
          输出: [1,1],[1,1]
          解释: 返回序列中的前 2 对数：
               [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
         */
        System.out.println(findKPairsSmallestSums.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2));
        /*
          示例 3:
          输入: nums1 = [1,2], nums2 = [3], k = 3
          输出: [1,3],[2,3]
          解释: 也可能序列中所有的数对都被返回:[1,3],[2,3]
         */
        System.out.println(findKPairsSmallestSums.kSmallestPairs(new int[]{1, 2}, new int[]{3}, 3));
    }
}
