package com.leetcode.L1001_1100.L1089;

import java.util.Arrays;

public class DuplicateZerosTest {
    public static void main(String[] args) {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        /*
          示例 1：
          输入：[1,0,2,3,0,4,5,0]
          输出：null
          解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
         */
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
        /*
          示例 2：
          输入：[1,2,3]
          输出：null
          解释：调用函数后，输入的数组将被修改为：[1,2,3]
         */
        int[] arr1 = new int[]{1, 2, 3};
        duplicateZeros.duplicateZeros(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{0, 0, 0, 0, 0, 0, 0};
        duplicateZeros.duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
