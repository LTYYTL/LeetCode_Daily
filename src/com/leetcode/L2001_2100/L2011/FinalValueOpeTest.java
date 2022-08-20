package com.leetcode.L2001_2100.L2011;

public class FinalValueOpeTest {
    public static void main(String[] args) {
        FinalValueOpe finalValueOpe = new FinalValueOpe();
        /*
          示例 1：
          输入：operations = ["--X","X++","X++"]
          输出：1
          解释：操作按下述步骤执行：
          最初，X = 0
          --X：X 减 1 ，X =  0 - 1 = -1
          X++：X 加 1 ，X = -1 + 1 =  0
          X++：X 加 1 ，X =  0 + 1 =  1
         */
        System.out.println(finalValueOpe.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        /*
          示例 2：
          输入：operations = ["++X","++X","X++"]
          输出：3
          解释：操作按下述步骤执行：
          最初，X = 0
          ++X：X 加 1 ，X = 0 + 1 = 1
          ++X：X 加 1 ，X = 1 + 1 = 2
          X++：X 加 1 ，X = 2 + 1 = 3
         */
        System.out.println(finalValueOpe.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        /*
          示例 3：
          输入：operations = ["X++","++X","--X","X--"]
          输出：0
          解释：操作按下述步骤执行：
          最初，X = 0
          X++：X 加 1 ，X = 0 + 1 = 1
          ++X：X 加 1 ，X = 1 + 1 = 2
          --X：X 减 1 ，X = 2 - 1 = 1
          X--：X 减 1 ，X = 1 - 1 = 0
         */
        System.out.println(finalValueOpe.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }
}
