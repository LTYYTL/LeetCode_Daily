package com.leetcode.L801_900.L0811;

public class SubdomainVisitCountTest {
    public static void main(String[] args) {
        SubdomainVisitCount subdomainVisitCount = new SubdomainVisitCount();
        /* *
          示例 1：
          输入：cpdomains = ["9001 discuss.leetcode.com"]
          输出：["9001 leetcode.com","9001 discuss.leetcode.com","9001 com"]
          解释：例子中仅包含一个网站域名："discuss.leetcode.com"。
          按照前文描述，子域名 "leetcode.com" 和 "com" 都会被访问，所以它们都被访问了 9001 次。
         */
        System.out.println(subdomainVisitCount.subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
        /*
          示例 2：
          输入：cpdomains = ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
          输出：["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
          解释：按照前文描述，会访问 "google.mail.com" 900 次，"yahoo.com" 50 次，"intel.mail.com" 1 次，"wiki.org" 5 次。
          而对于父域名，会访问 "mail.com" 900 + 1 = 901 次，"com" 900 + 50 + 1 = 951 次，和 "org" 5 次。
         */
        System.out.println(subdomainVisitCount.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }
}
