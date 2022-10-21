package com.leetcode.L2401_2500.L2442;

public class CountNumberIntegersTest {
    public static void main(String[] args) {
        CountNumberIntegers countNumberIntegers = new CountNumberIntegers();
        /*
          示例 1：
          输入：nums = [1,13,10,12,31]
          输出：6
          解释：反转每个数字后，结果数组是 [1,13,10,12,31,1,31,1,21,13] 。
          反转后得到的数字添加到数组的末尾并按斜体加粗表示。注意对于整数 10 ，反转之后会变成 01 ，即 1 。
          数组中不同整数的数目为 6（数字 1、10、12、13、21 和 31）。
         */
        System.out.println(countNumberIntegers.countDistinctIntegers(new int[]{1, 13, 10, 12, 31}));
        /*
          示例 2：
          输入：nums = [2,2,2]
          输出：1
          解释：反转每个数字后，结果数组是 [2,2,2,2,2,2] 。
          数组中不同整数的数目为 1（数字 2）。
         */
        System.out.println(countNumberIntegers.countDistinctIntegers(new int[]{2, 2, 2}));
    }
}
