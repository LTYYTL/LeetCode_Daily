package com.leetcode.L101_200.L0128;

public class LongestConsecutiveSeqTest {
    public static void main(String[] args) {
        LongestConsecutiveSeq longestConsecutiveSeq = new LongestConsecutiveSeq();
        /*
          示例 1：
          输入：nums = [100,4,200,1,3,2]
          输出：4
          解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
         */
        System.out.println(longestConsecutiveSeq.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        /*
          示例 2：
          输入：nums = [0,3,7,2,5,8,4,6,0,1]
          输出：9
         */
        System.out.println(longestConsecutiveSeq.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
