package com.leetcode.L601_700.L0639;

public class DecodeWaysIITest {
    public static void main(String[] args) {
        DecodeWaysII decodeWaysII = new DecodeWaysII();
        /*
          示例 1：
          输入：s = "*"
          输出：9
          解释：这一条编码消息可以表示 "1"、"2"、"3"、"4"、"5"、"6"、"7"、"8" 或 "9" 中的任意一条。
          可以分别解码成字符串 "A"、"B"、"C"、"D"、"E"、"F"、"G"、"H" 和 "I" 。
          因此，"*" 总共有 9 种解码方法。
         */
        System.out.println(decodeWaysII.numDecodings("*"));
        /*
          示例 2：
          输入：s = "1*"
          输出：18
          解释：这一条编码消息可以表示 "11"、"12"、"13"、"14"、"15"、"16"、"17"、"18" 或 "19" 中的任意一条。
          每种消息都可以由 2 种方法解码（例如，"11" 可以解码成 "AA" 或 "K"）。
          因此，"1*" 共有 9 * 2 = 18 种解码方法。
         */
        System.out.println(decodeWaysII.numDecodings("1*"));
        /*
          示例 3：
          输入：s = "2*"
          输出：15
          解释：这一条编码消息可以表示 "21"、"22"、"23"、"24"、"25"、"26"、"27"、"28" 或 "29" 中的任意一条。
          "21"、"22"、"23"、"24"、"25" 和 "26" 由 2 种解码方法，但 "27"、"28" 和 "29" 仅有 1 种解码方法。
          因此，"2*" 共有 (6 * 2) + (3 * 1) = 12 + 3 = 15 种解码方法。
         */
        System.out.println(decodeWaysII.numDecodings("2*"));
    }
}
