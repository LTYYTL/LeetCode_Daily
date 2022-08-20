package com.leetcode.L1201_1300.L1296;

public class DivideArrKConsecutiveTest {
    public static void main(String[] args) {
        DivideArrKConsecutive divideArrKConsecutive = new DivideArrKConsecutive();
        /*
          示例 1：
          输入：nums = [1,2,3,3,4,4,5,6], k = 4
          输出：true
          解释：数组可以分成 [1,2,3,4] 和 [3,4,5,6]。
         */
        System.out.println(divideArrKConsecutive.isPossibleDivide(new int[]{1, 2, 3, 3, 4, 4, 5, 6}, 4));
        /*
          示例 2：
          输入：nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
          输出：true
          解释：数组可以分成 [1,2,3] , [2,3,4] , [3,4,5] 和 [9,10,11]。
         */
        System.out.println(divideArrKConsecutive.isPossibleDivide(new int[]{3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11}, 3));
        /*
          示例 3：
          输入：nums = [3,3,2,2,1,1], k = 3
          输出：true
         */
        System.out.println(divideArrKConsecutive.isPossibleDivide(new int[]{3, 3, 2, 2, 1, 1}, 3));
        /*
          示例 4：
          输入：nums = [1,2,3,4], k = 3
          输出：false
          解释：数组不能分成几个大小为 3 的子数组。
         */
        System.out.println(divideArrKConsecutive.isPossibleDivide(new int[]{1, 2, 3, 4}, 3));
    }
}
