package com.offer.L0003;

public class RepeatedNumbersArrayTest {
    public static void main(String[] args) {
        RepeatedNumbersArray repeatedNumbersArray = new RepeatedNumbersArray();
        /*
          示例 1：
          输入：
          [2, 3, 1, 0, 2, 5, 3]
          输出：2 或 3
         */
        System.out.println(repeatedNumbersArray.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
        System.out.println(repeatedNumbersArray.findRepeatNumber_sort(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}
