package com.leetcode.L601_700.L0699;

public class FallingSquaresTest {
    public static void main(String[] args) {
        FallingSquares fallingSquares = new FallingSquares();
        /*
          示例 1：
          输入：positions = [[1,2],[2,3],[6,1]]
          输出：[2,5,5]
          解释：
          第 1 个方块掉落后，最高的堆叠由方块 1 组成，堆叠的最高高度为 2 。
          第 2 个方块掉落后，最高的堆叠由方块 1 和 2 组成，堆叠的最高高度为 5 。
          第 3 个方块掉落后，最高的堆叠仍然由方块 1 和 2 组成，堆叠的最高高度为 5 。
          因此，返回 [2, 5, 5] 作为答案。
         */
        System.out.println(fallingSquares.fallingSquares(new int[][]{{1, 2}, {2, 3}, {6, 1}}));
        /*
          示例 2：
          输入：positions = [[100,100],[200,100]]
          输出：[100,100]
          解释：
          第 1 个方块掉落后，最高的堆叠由方块 1 组成，堆叠的最高高度为 100 。
          第 2 个方块掉落后，最高的堆叠可以由方块 1 组成也可以由方块 2 组成，堆叠的最高高度为 100 。
          因此，返回 [100, 100] 作为答案。
          注意，方块 2 擦过方块 1 的右侧边，但不会算作在方块 1 上着陆。
         */
        System.out.println(fallingSquares.fallingSquares(new int[][]{{100, 100}, {200, 100}}));
    }
}
