package com.leetcode.L601_700.L0667;

import java.util.Arrays;

public class BeautifulArrangementIITest {
    public static void main(String[] args) {
        BeautifulArrangementII beautifulArrangementII = new BeautifulArrangementII();
        /* * 示例 1：
          输入：n = 3, k = 1
          输出：[1, 2, 3]
          解释：[1, 2, 3] 包含 3 个范围在 1-3 的不同整数，并且 [1, 1] 中有且仅有 1 个不同整数：1
         */
        System.out.println(Arrays.toString(beautifulArrangementII.constructArray(3, 1)));
        /*
          示例 2：
          输入：n = 3, k = 2
          输出：[1, 3, 2]
          解释：[1, 3, 2] 包含 3 个范围在 1-3 的不同整数，并且 [2, 1] 中有且仅有 2 个不同整数：1 和 2
         */
        System.out.println(Arrays.toString(beautifulArrangementII.constructArray(3, 2)));
    }
}
