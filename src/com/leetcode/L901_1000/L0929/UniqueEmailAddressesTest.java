package com.leetcode.L901_1000.L0929;

public class UniqueEmailAddressesTest {
    public static void main(String[] args) {
        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
        /**
         * 示例 1：
         * 输入：emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
         * 输出：2
         * 解释：实际收到邮件的是 "testemail@leetcode.com" 和 "testemail@lee.tcode.com"。
         */
        System.out.println(uniqueEmailAddresses.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
        /**
         * 示例 2：
         * 输入：emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
         * 输出：3
         */
        System.out.println(uniqueEmailAddresses.numUniqueEmails(new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"}));
    }
}
