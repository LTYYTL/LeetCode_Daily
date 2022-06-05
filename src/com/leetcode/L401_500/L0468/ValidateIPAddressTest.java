package com.leetcode.L401_500.L0468;

public class ValidateIPAddressTest {
    public static void main(String[] args) {
        ValidateIPAddress validateIPAddress = new ValidateIPAddress();
        /**
         * 示例 1：
         * 输入：queryIP = "172.16.254.1"
         * 输出："IPv4"
         * 解释：有效的 IPv4 地址，返回 "IPv4"
         */
        System.out.println(validateIPAddress.validIPAddress("172.16.254.1"));
        /**
         * 示例 2：
         * 输入：queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334"
         * 输出："IPv6"
         * 解释：有效的 IPv6 地址，返回 "IPv6"
         */
        System.out.println(validateIPAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        /**
         * 示例 3：
         * 输入：queryIP = "256.256.256.256"
         * 输出："Neither"
         * 解释：既不是 IPv4 地址，又不是 IPv6 地址
         */
        System.out.println(validateIPAddress.validIPAddress("256.256.256.256"));
    }
}
