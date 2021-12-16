package com.interview.L1619;

import java.util.Arrays;

public class PondSizesTest {
    public static void main(String[] args) {
        PondSizes pondSizes = new PondSizes();
        /**
         * 示例：
         * 输入：
         * [
         *   [0,2,1,0],
         *   [0,1,0,1],
         *   [1,1,0,1],
         *   [0,1,0,1]
         * ]
         * 输出： [1,2,4]
         */
        System.out.println(Arrays.toString(pondSizes.pondSizes(new int[][]{
                {0, 2, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 1, 0, 1}
        })));
    }
}
