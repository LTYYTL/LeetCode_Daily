package com.offer.L0561;

import java.util.Arrays;

public class NumberArrayTest {
    public static void main(String[] args) {
        NumberArray numberArray = new NumberArray();
        /* * 示例 1：
          输入：nums = [4,1,4,6]
          输出：[1,6] 或 [6,1]
         */
        System.out.println(Arrays.toString(numberArray.singleNumbers(new int[]{4, 1, 4, 6})));
        /*
          示例 2：
          输入：nums = [1,2,10,4,1,4,3,3]
          输出：[2,10] 或 [10,2]
         */
        System.out.println(Arrays.toString(numberArray.singleNumbers(new int[]{1, 2, 10, 4, 1, 4, 3, 3})));
    }
}
