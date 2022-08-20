package com.offerII.L004;

public class SingleNumberIITest {
    public static void main(String[] args) {
        SingleNumberII singleNumberII = new SingleNumberII();
        /*
          示例 1：
          输入：nums = [2,2,3,2]
          输出：3
         */
        System.out.println(singleNumberII.singleNumber(new int[]{2, 2, 3, 2}));
        System.out.println(singleNumberII.singleNumber_bit(new int[]{2, 2, 3, 2}));
        /*
          示例 2：
          输入：nums = [0,1,0,1,0,1,99]
          输出：99
         */
        System.out.println(singleNumberII.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
        System.out.println(singleNumberII.singleNumber_bit(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }
}
