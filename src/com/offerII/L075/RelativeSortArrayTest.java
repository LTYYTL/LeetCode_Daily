package com.offerII.L075;

import java.util.Arrays;

public class RelativeSortArrayTest {
    public static void main(String[] args) {
        RelativeSortArray relativeSortArray = new RelativeSortArray();
        /**
         * 示例：
         * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
         * 输出：[2,2,2,1,4,3,3,9,6,7,19]
         */
        System.out.println(Arrays.toString(relativeSortArray.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }
}
