package com.interview.L0106;

public class CompressStringTest {
    public static void main(String[] args) {
        CompressString compressString = new CompressString();
        /**
         * 示例1:
         * 输入："aabcccccaaa"
         * 输出："a2b1c5a3"
         */
        System.out.println(compressString.compressString("aabcccccaaa"));
        /**
         * 示例2:
         * 输入："abbccd"
         * 输出："abbccd"
         * 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
         */
        System.out.println(compressString.compressString("abbccd"));
    }
}
