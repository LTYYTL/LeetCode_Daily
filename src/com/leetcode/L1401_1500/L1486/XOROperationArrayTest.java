package com.leetcode.L1401_1500.L1486;

public class XOROperationArrayTest {
    public static void main(String[] args) {
        XOROperationArray xorOperationArray = new XOROperationArray();
        /*
          示例 1：
          输入：n = 5, start = 0
          输出：8
          解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
               "^" 为按位异或 XOR 运算符。
         */
        System.out.println(xorOperationArray.xorOperation(5, 0));
        /*
          示例 2：
          输入：n = 4, start = 3
          输出：8
          解释：数组 nums 为 [3, 5, 7, 9]，其中 (3 ^ 5 ^ 7 ^ 9) = 8.
         */
        System.out.println(xorOperationArray.xorOperation(4, 3));
        /*
          示例 3：
          输入：n = 1, start = 7
          输出：7
         */
        System.out.println(xorOperationArray.xorOperation(1, 7));
        /*
          示例 4：
          输入：n = 10, start = 5
          输出：2
         */
        System.out.println(xorOperationArray.xorOperation(10, 5));
    }
}
