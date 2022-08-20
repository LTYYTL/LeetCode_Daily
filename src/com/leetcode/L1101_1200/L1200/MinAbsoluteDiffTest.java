package com.leetcode.L1101_1200.L1200;

public class MinAbsoluteDiffTest {
    public static void main(String[] args) {
        MinAbsoluteDiff minAbsoluteDiff = new MinAbsoluteDiff();
        /*
          示例 1：
          输入：arr = [4,2,1,3]
          输出：[[1,2],[2,3],[3,4]]
         */
        System.out.println(minAbsoluteDiff.minimumAbsDifference(new int[]{4, 2, 1, 3}));
        /*
          示例 2：
          输入：arr = [1,3,6,10,15]
          输出：[[1,3]]
         */
        System.out.println(minAbsoluteDiff.minimumAbsDifference(new int[]{1, 3, 6, 10, 15}));
        /*
          示例 3：
          输入：arr = [3,8,-10,23,19,-4,-14,27]
          输出：[[-14,-10],[19,23],[23,27]]
         */
        System.out.println(minAbsoluteDiff.minimumAbsDifference(new int[]{3, 8, -10, 23, 19, -4, -14, 27}));
    }
}
