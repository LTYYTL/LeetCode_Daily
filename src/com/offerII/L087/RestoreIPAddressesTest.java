package com.offerII.L087;

public class RestoreIPAddressesTest {
    public static void main(String[] args) {
        RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();
        /**
         * 示例 1：
         * 输入：s = "25525511135"
         * 输出：["255.255.11.135","255.255.111.35"]
         */
        System.out.println(restoreIPAddresses.restoreIpAddresses("25525511135"));
        /**
         * 示例 2：
         * 输入：s = "0000"
         * 输出：["0.0.0.0"]
         */
        System.out.println(restoreIPAddresses.restoreIpAddresses("0000"));
        /**
         * 示例 3：
         * 输入：s = "1111"
         * 输出：["1.1.1.1"]
         */
        System.out.println(restoreIPAddresses.restoreIpAddresses("1111"));
        /**
         * 示例 4：
         * 输入：s = "010010"
         * 输出：["0.10.0.10","0.100.1.0"]
         */
        System.out.println(restoreIPAddresses.restoreIpAddresses("010010"));
        /**
         * 示例 5：
         * 输入：s = "101023"
         * 输出：["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
         */
        System.out.println(restoreIPAddresses.restoreIpAddresses("101023"));
    }
}
