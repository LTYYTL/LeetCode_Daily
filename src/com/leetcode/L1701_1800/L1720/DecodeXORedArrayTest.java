package com.leetcode.L1701_1800.L1720;

import java.util.Arrays;

public class DecodeXORedArrayTest {

    public static void main(String[] args) {
        DecodeXORedArray decodeXORedArray = new DecodeXORedArray();
        /* 示例 1：
         输入：encoded = [1,2,3], first = 1
         输出：[1,0,2,1]
         解释：若 arr = [1,0,2,1] ，那么 first = 1 且 encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
         */
        System.out.println(Arrays.toString(decodeXORedArray.decode(new int[]{1, 2, 3}, 1)));
        /*
          示例 2：
          输入：encoded = [6,2,7,3], first = 4
          输出：[4,2,0,7,4]
         */
        System.out.println(Arrays.toString(decodeXORedArray.decode(new int[]{6, 2, 7, 3}, 4)));
    }
}
