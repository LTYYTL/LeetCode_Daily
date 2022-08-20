package com.offer.L0440;

public class DigitSequenceNumbersTest {
    public static void main(String[] args) {
        DigitSequenceNumbers digitSequenceNumbers = new DigitSequenceNumbers();
        /*
          示例 1：
          输入：n = 3
          输出：3
         */
        System.out.println(digitSequenceNumbers.findNthDigit(3));
        /*
          示例 2：
          输入：n = 11
          输出：0
         */
        System.out.println(digitSequenceNumbers.findNthDigit(11));
    }
}
