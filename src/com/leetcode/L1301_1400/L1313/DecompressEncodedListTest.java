package com.leetcode.L1301_1400.L1313;

import java.util.Arrays;

public class DecompressEncodedListTest {
    public static void main(String[] args) {
        DecompressEncodedList decompressEncodedList = new DecompressEncodedList();
        /*
          示例 1：
          输入：nums = [1,2,3,4]
          输出：[2,4,4,4]
          解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
          第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
          最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
         */
        System.out.println(Arrays.toString(decompressEncodedList.decompressRLElist(new int[]{1, 2, 3, 4})));
        /*
          示例 2：
          输入：nums = [1,1,2,3]
          输出：[1,3,3]
         */
        System.out.println(Arrays.toString(decompressEncodedList.decompressRLElist(new int[]{1, 1, 2, 3})));
    }
}
