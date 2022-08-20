package com.leetcode.L1201_1300.L1295;

public class FindEvenNumDigitsTest {
    public static void main(String[] args) {
        FindEvenNumDigits findEvenNumDigits = new FindEvenNumDigits();
        /*
          示例 1：
          输入：nums = [12,345,2,6,7896]
          输出：2
          解释：
          12 是 2 位数字（位数为偶数）
          345 是 3 位数字（位数为奇数）
          2 是 1 位数字（位数为奇数）
          6 是 1 位数字 位数为奇数）
          7896 是 4 位数字（位数为偶数）
          因此只有 12 和 7896 是位数为偶数的数字
         */
        System.out.println(findEvenNumDigits.findNumbers(new int[]{12, 345, 2, 6, 7896}));
        /*
          示例 2：
          输入：nums = [555,901,482,1771]
          输出：1
          解释：
          只有 1771 是位数为偶数的数字。
         */
        System.out.println(findEvenNumDigits.findNumbers(new int[]{555, 901, 482, 1771}));
    }
}
