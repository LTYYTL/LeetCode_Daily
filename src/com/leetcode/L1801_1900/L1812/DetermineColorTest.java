package com.leetcode.L1801_1900.L1812;

public class DetermineColorTest {
    public static void main(String[] args) {
        DetermineColor determineColor = new DetermineColor();
        /*
          示例 1：
          输入：coordinates = "a1"
          输出：false
          解释：如上图棋盘所示，"a1" 坐标的格子是黑色的，所以返回 false 。
         */
        System.out.println(determineColor.squareIsWhite("a1"));
        /*
          示例 2：
          输入：coordinates = "h3"
          输出：true
          解释：如上图棋盘所示，"h3" 坐标的格子是白色的，所以返回 true 。
         */
        System.out.println(determineColor.squareIsWhite("h3"));
        /*
          示例 3：
          输入：coordinates = "c7"
          输出：false
         */
        System.out.println(determineColor.squareIsWhite("c7"));
    }
}
