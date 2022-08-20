package com.leetcode.L1301_1400.L1345;

public class JumpGameIVTest {
    public static void main(String[] args) {
        JumpGameIV jumpGameIV = new JumpGameIV();
        /*
          示例 1：
          输入：arr = [100,-23,-23,404,100,23,23,23,3,404]
          输出：3
          解释：那你需要跳跃 3 次，下标依次为 0 --> 4 --> 3 --> 9 。下标 9 为数组的最后一个元素的下标。
         */
        System.out.println(jumpGameIV.minJumps(new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404}));
        /*
          示例 2：
          输入：arr = [7]
          输出：0
          解释：一开始就在最后一个元素处，所以你不需要跳跃。
         */
        System.out.println(jumpGameIV.minJumps(new int[]{7}));
        /*
          示例 3：
          输入：arr = [7,6,9,6,9,6,9,7]
          输出：1
          解释：你可以直接从下标 0 处跳到下标 7 处，也就是数组的最后一个元素处。
         */
        System.out.println(jumpGameIV.minJumps(new int[]{7, 6, 9, 6, 9, 6, 9, 7}));
        /*
          示例 4：
          输入：arr = [6,1,9]
          输出：2
         */
        System.out.println(jumpGameIV.minJumps(new int[]{6, 1, 9}));
        /*
          示例 5：
          输入：arr = [11,22,7,7,7,7,7,7,7,22,13]
          输出：3
         */
        System.out.println(jumpGameIV.minJumps(new int[]{11, 22, 7, 7, 7, 7, 7, 7, 7, 22, 13}));
    }
}
