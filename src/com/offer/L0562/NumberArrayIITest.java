package com.offer.L0562;

public class NumberArrayIITest {
    public static void main(String[] args) {
        NumberArrayII numberArrayII = new NumberArrayII();
        /* * 示例 1：
          输入：nums = [3,4,3,3]
          输出：4
         */
        System.out.println(numberArrayII.singleNumber(new int[]{3, 4, 3, 3}));
        /*
          示例 2：
          输入：nums = [9,1,7,9,7,9,7]
          输出：1
         */
        System.out.println(numberArrayII.singleNumber(new int[]{9, 1, 7, 9, 7, 9, 7}));
    }
}
