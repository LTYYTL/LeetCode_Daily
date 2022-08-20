package com.interview.L1011;

import java.util.Arrays;

public class PeaksValleysTest {
    public static void main(String[] args) {
        PeaksValleys peaksValleys = new PeaksValleys();
        /*
          示例:
          输入: [5, 3, 1, 2, 3]
          输出: [5, 1, 3, 2, 3]
         */
        int[] arr = new int[]{5, 3, 1, 2, 3};
        peaksValleys.wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
