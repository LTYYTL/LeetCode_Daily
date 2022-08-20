package com.leetcode.L401_500.L0482;

public class LicenseKeyFormattingTest {
    public static void main(String[] args) {
        LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();
        /*
          示例 1：
          输入：S = "5F3Z-2e-9-w", K = 4
          输出："5F3Z-2E9W"
          解释：字符串 S 被分成了两个部分，每部分 4 个字符；
               注意，两个额外的破折号需要删掉。
         */
        System.out.println(licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        /*
          示例 2：
          输入：S = "2-5g-3-J", K = 2
          输出："2-5G-3J"
          解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。
         */
        System.out.println(licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
    }
}
