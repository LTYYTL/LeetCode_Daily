package com.leetcode.L601_700.L0649;

public class Dota2SenateTest {
    public static void main(String[] args) {
        Dota2Senate dota2Senate = new Dota2Senate();
        /* * 示例 1：
          输入："RD"
          输出："Radiant"
         */
        System.out.println(dota2Senate.predictPartyVictory("RD"));
        /*
          示例 2：
          输入："RDD"
          输出："Dire"
         */
        System.out.println(dota2Senate.predictPartyVictory("RDD"));
    }
}
