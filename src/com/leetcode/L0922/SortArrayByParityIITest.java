package com.leetcode.L0922;

import java.util.Arrays;

public class SortArrayByParityIITest {
    public static void main(String[] args) {
        SortArrayByParityII sortArrayByParityII = new SortArrayByParityII();
        /**
         * 示例：
         * 输入：[4,2,5,7]
         * 输出：[4,5,2,7]
         * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
         */
        int[] A = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII.sortArrayByParityII(A)));
    }
}
