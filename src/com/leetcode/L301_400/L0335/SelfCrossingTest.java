package com.leetcode.L301_400.L0335;

public class SelfCrossingTest {
    public static void main(String[] args) {
        SelfCrossing selfCrossing = new SelfCrossing();
        /*
          示例 1：
          输入：distance = [2,1,1,2]
          输出：true
         */
        System.out.println(selfCrossing.isSelfCrossing(new int[]{2, 1, 1, 2}));
        /*
          示例 2：
          输入：distance = [1,2,3,4]
          输出：false
         */
        System.out.println(selfCrossing.isSelfCrossing(new int[]{1, 2, 3, 4}));
        /*
          示例 3：
          输入：distance = [1,1,1,1]
          输出：true
         */
        System.out.println(selfCrossing.isSelfCrossing(new int[]{1, 1, 1, 1}));
    }
}
