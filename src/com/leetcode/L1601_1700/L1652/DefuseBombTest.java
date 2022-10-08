package com.leetcode.L1601_1700.L1652;

import java.util.Arrays;

public class DefuseBombTest {
    public static void main(String[] args) {
        DefuseBomb defuseBomb = new DefuseBomb();
        /*
          示例 1：
          输入：code = [5,7,1,4], k = 3
          输出：[12,10,16,13]
          解释：每个数字都被接下来 3 个数字之和替换。解密后的密码为 [7+1+4, 1+4+5, 4+5+7, 5+7+1]。注意到数组是循环连接的。
         */
        System.out.println(Arrays.toString(defuseBomb.decrypt(new int[]{5, 7, 1, 4}, 3)));
        /*
          示例 2：
          输入：code = [1,2,3,4], k = 0
          输出：[0,0,0,0]
          解释：当 k 为 0 时，所有数字都被 0 替换。
         */
        System.out.println(Arrays.toString(defuseBomb.decrypt(new int[]{1, 2, 3, 4}, 0)));
        /*
          示例 3：
          输入：code = [2,4,9,3], k = -2
          输出：[12,5,6,13]
          解释：解密后的密码为 [3+9, 2+3, 4+2, 9+4] 。注意到数组是循环连接的。如果 k 是负数，那么和为 之前 的数字。
         */
        System.out.println(Arrays.toString(defuseBomb.decrypt(new int[]{2, 4, 9, 3}, -2)));
    }
}
