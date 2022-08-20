package com.leetcode.L401_500.L0403;

public class FrogJumpTest {
    public static void main(String[] args) {
        FrogJump frogJump = new FrogJump();
        /*
          示例 1：
          输入：stones = [0,1,3,5,6,8,12,17]
          输出：true
          解释：青蛙可以成功过河，按照如下方案跳跃：
          跳 1 个单位到第 2 块石子,
          然后跳 2 个单位到第 3 块石子,
          接着 跳 2 个单位到第 4 块石子,
          然后跳 3 个单位到第 6 块石子,
          跳 4 个单位到第 7 块石子,
          最后，跳 5 个单位到第 8 个石子（即最后一块石子）。
         */
        System.out.println(frogJump.canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17}));
        /*
          示例 2：
          输入：stones = [0,1,2,3,4,8,9,11]
          输出：false
          解释：这是因为第 5 和第 6 个石子之间的间距太大，没有可选的方案供青蛙跳跃过去。
         */
        System.out.println(frogJump.canCross(new int[]{0, 1, 2, 3, 4, 8, 9, 11}));
    }
}
