package com.leetcode.L1_100.L0091;

public class DecodeWaysTest {
    public static void main(String[] args) {
        DecodeWays decodeWays = new DecodeWays();
        /*
          示例 1：
          输入：s = "12"
          输出：2
          解释：它可以解码为 "AB"（1 2）或者 "L"（12）。
         */
        System.out.println(decodeWays.numDecodings("12"));
        /*
          示例 2：
          输入：s = "226"
          输出：3
          解释：它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
         */
        System.out.println(decodeWays.numDecodings("226"));
        /*
          示例 3：
          输入：s = "0"
          输出：0
          解释：没有字符映射到以 0 开头的数字。
          含有 0 的有效映射是 'J' -> "10" 和 'T'-> "20" 。
          由于没有字符，因此没有有效的方法对此进行解码，因为所有数字都需要映射。
         */
        System.out.println(decodeWays.numDecodings("0"));
        /*
          示例 4：
          输入：s = "06"
          输出：0
          解释："06" 不能映射到 "F" ，因为字符串含有前导 0（"6" 和 "06" 在映射中并不等价）。
         */
        System.out.println(decodeWays.numDecodings("06"));
    }
}
