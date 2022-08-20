package com.leetcode.L401_500.L0458;

public class PoorPigsTest {
    public static void main(String[] args) {
        PoorPigs poorPigs = new PoorPigs();
        /*
          示例 1：
          输入：buckets = 1000, minutesToDie = 15, minutesToTest = 60
          输出：5
         */
        System.out.println(poorPigs.poorPigs(1000, 15, 60));
        /*
          示例 2：
          输入：buckets = 4, minutesToDie = 15, minutesToTest = 15
          输出：2
         */
        System.out.println(poorPigs.poorPigs(4, 15, 15));
        /*
          示例 3：
          输入：buckets = 4, minutesToDie = 15, minutesToTest = 30
          输出：2
         */
        System.out.println(poorPigs.poorPigs(4, 15, 30));
    }
}
