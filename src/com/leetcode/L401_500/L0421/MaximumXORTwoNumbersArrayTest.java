package com.leetcode.L401_500.L0421;

public class MaximumXORTwoNumbersArrayTest {
    public static void main(String[] args) {
        MaximumXORTwoNumbersArray maximumXORTwoNumbersArray = new MaximumXORTwoNumbersArray();
        /*
          示例 1：
          输入：nums = [3,10,5,25,2,8]
          输出：28
          解释：最大运算结果是 5 XOR 25 = 28.
         */
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8}));
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR_trie(new int[]{3, 10, 5, 25, 2, 8}));
        /*
          示例 2：
          输入：nums = [0]
          输出：0
         */
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR(new int[]{0}));
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR_trie(new int[]{0}));

        /*
          示例 3：
          输入：nums = [2,4]
          输出：6
         */
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR(new int[]{2, 4}));
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR_trie(new int[]{2, 4}));
        /*
          示例 4：
          输入：nums = [8,10,2]
          输出：10
         */
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR(new int[]{8, 10, 2}));
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR_trie(new int[]{8, 10, 2}));

        /*
          示例 5：
          输入：nums = [14,70,53,83,49,91,36,80,92,51,66,70]
          输出：127
         */
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR(new int[]{14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70}));
        System.out.println(maximumXORTwoNumbersArray.findMaximumXOR_trie(new int[]{14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70}));
    }
}
