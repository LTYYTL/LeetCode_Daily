package com.interview.L1611;

import java.util.Arrays;

public class DivingBoardTest {
    public static void main(String[] args) {
        DivingBoard divingBoard = new DivingBoard();
        /**
         * 示例 1
         * 输入：
         * shorter = 1
         * longer = 2
         * k = 3
         * 输出： [3,4,5,6]
         * 解释：
         * 可以使用 3 次 shorter，得到结果 3；使用 2 次 shorter 和 1 次 longer，得到结果 4 。以此类推，得到最终结果。
         */
        System.out.println(Arrays.toString(divingBoard.divingBoard(1, 2, 3)));
    }
}
