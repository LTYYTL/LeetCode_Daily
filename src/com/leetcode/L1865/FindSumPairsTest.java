package com.leetcode.L1865;

public class FindSumPairsTest {
    public static void main(String[] args) {
        /*** 示例：
         * 输入：
         * ["FindSumPairs", "count", "add", "count", "count", "add", "add", "count"]
         * [[[1, 1, 2, 2, 2, 3], [1, 4, 5, 2, 5, 4]], [7], [3, 2], [8], [4], [0, 1], [1, 1], [7]]
         * 输出：
         * [null, 8, null, 2, 1, null, null, 11]
         * 解释：
         * FindSumPairs findSumPairs = new FindSumPairs([1, 1, 2, 2, 2, 3], [1, 4, 5, 2, 5, 4]);
         * findSumPairs.count(7);  // 返回 8 ; 下标对 (2,2), (3,2), (4,2), (2,4), (3,4), (4,4) 满足 2 + 5 = 7 ，下标对 (5,1), (5,5) 满足 3 + 4 = 7
         * findSumPairs.add(3, 2); // 此时 nums2 = [1,4,5,4,5,4]
         * findSumPairs.count(8);  // 返回 2 ；下标对 (5,2), (5,4) 满足 3 + 5 = 8
         * findSumPairs.count(4);  // 返回 1 ；下标对 (5,0) 满足 3 + 1 = 4
         * findSumPairs.add(0, 1); // 此时 nums2 = [2,4,5,4,5,4]
         * findSumPairs.add(1, 1); // 此时 nums2 = [2,5,5,4,5,4]
         * findSumPairs.count(7);  // 返回 11 ；下标对 (2,1), (2,2), (2,4), (3,1), (3,2), (3,4), (4,1), (4,2), (4,4) 满足 2 + 5 = 7 ，下标对 (5,3), (5,5) 满足 3 + 4 = 7
         */
        FindSumPairs findSumPairs = new FindSumPairs(new int[]{1, 1, 2, 2, 2, 3},new int[]{1, 4, 5, 2, 5, 4});
        System.out.println(findSumPairs.count(7));
        findSumPairs.add(3, 2); // 此时 nums2 = [1,4,5,4,5,4]
        System.out.println(findSumPairs.count(8));
        System.out.println(findSumPairs.count(4));
        findSumPairs.add(0, 1); // 此时 nums2 = [2,4,5,4,5,4]
        findSumPairs.add(1, 1); // 此时 nums2 = [2,5,5,4,5,4]
        System.out.println(findSumPairs.count(7));

    }
}
