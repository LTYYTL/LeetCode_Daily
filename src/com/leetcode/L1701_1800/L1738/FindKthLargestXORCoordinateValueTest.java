package com.leetcode.L1701_1800.L1738;

public class FindKthLargestXORCoordinateValueTest {
    public static void main(String[] args) {
        FindKthLargestXORCoordinateValue findKthLargestXORCoordinateValue = new FindKthLargestXORCoordinateValue();
        int[][] matrix = {
                {5, 2},
                {1, 6}
        };
        /*
          示例 1：
          输入：matrix = [[5,2],[1,6]], k = 1
          输出：7
          解释：坐标 (0,1) 的值是 5 XOR 2 = 7 ，为最大的值。
         */
        System.out.println(findKthLargestXORCoordinateValue.kthLargestValue(matrix, 1));
        /*
          示例 2：
          输入：matrix = [[5,2],[1,6]], k = 2
          输出：5
          解释：坐标 (0,0) 的值是 5 = 5 ，为第 2 大的值。
         */
        System.out.println(findKthLargestXORCoordinateValue.kthLargestValue(matrix, 2));
        /*
          示例 3：
          输入：matrix = [[5,2],[1,6]], k = 3
          输出：4
          解释：坐标 (1,0) 的值是 5 XOR 1 = 4 ，为第 3 大的值。
         */
        System.out.println(findKthLargestXORCoordinateValue.kthLargestValue(matrix, 3));
        /*
          示例 4：
          输入：matrix = [[5,2],[1,6]], k = 4
          输出：0
          解释：坐标 (1,1) 的值是 5 XOR 2 XOR 1 XOR 6 = 0 ，为第 4 大的值。
         */
        System.out.println(findKthLargestXORCoordinateValue.kthLargestValue(matrix, 4));
    }
}
