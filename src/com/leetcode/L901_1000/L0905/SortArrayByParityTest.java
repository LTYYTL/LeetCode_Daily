package com.leetcode.L901_1000.L0905;

import java.util.Arrays;

public class SortArrayByParityTest {
    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        /**
         * 示例：
         * 输入：[3,1,2,4]
         * 输出：[2,4,3,1]
         * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
         */
        System.out.println(Arrays.toString(sortArrayByParity.sortArrayByParity(new int[]{3, 1, 2, 4})));
    }
}
