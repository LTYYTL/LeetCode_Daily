package com.leetcode.L501_600.L0565;

public class ArrayNestingTest {
    public static void main(String[] args) {
        ArrayNesting arrayNesting = new ArrayNesting();
        /*
          示例 1:
          输入: A = [5,4,0,3,1,6,2]
          输出: 4
          解释:
          A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.
          其中一种最长的 S[K]:
          S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
         */
        System.out.println(arrayNesting.arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2}));
    }
}
