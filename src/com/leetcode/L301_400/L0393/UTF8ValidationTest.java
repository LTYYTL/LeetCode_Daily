package com.leetcode.L301_400.L0393;

public class UTF8ValidationTest {
    public static void main(String[] args) {
        UTF8Validation utf8Validation = new UTF8Validation();
        /**
         * 示例 1：
         * 输入：data = [197,130,1]
         * 输出：true
         * 解释：数据表示字节序列:11000101 10000010 00000001。
         * 这是有效的 utf-8 编码，为一个 2 字节字符，跟着一个 1 字节字符。
         */
        System.out.println(utf8Validation.validUtf8(new int[]{197, 130, 1}));
        /**
         * 示例 2：
         * 输入：data = [235,140,4]
         * 输出：false
         * 解释：数据表示 8 位的序列: 11101011 10001100 00000100.
         * 前 3 位都是 1 ，第 4 位为 0 表示它是一个 3 字节字符。
         * 下一个字节是开头为 10 的延续字节，这是正确的。
         * 但第二个延续字节不以 10 开头，所以是不符合规则的。
         */
        System.out.println(utf8Validation.validUtf8(new int[]{235, 140, 4}));
    }
}
