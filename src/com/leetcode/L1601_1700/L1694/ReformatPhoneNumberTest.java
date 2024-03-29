package com.leetcode.L1601_1700.L1694;

public class ReformatPhoneNumberTest {
    public static void main(String[] args) {
        ReformatPhoneNumber reformatPhoneNumber = new ReformatPhoneNumber();
        /* * 示例 1：
          输入：number = "1-23-45 6"
          输出："123-456"
          解释：数字是 "123456"
          步骤 1：共有超过 4 个数字，所以先取 3 个数字分为一组。第 1 个块是 "123" 。
          步骤 2：剩下 3 个数字，将它们放入单个含 3 个数字的块。第 2 个块是 "456" 。
          连接这些块后得到 "123-456" 。
         */
        System.out.println(reformatPhoneNumber.reformatNumber("1-23-45 6"));
        /*
          示例 2：
          输入：number = "123 4-567"
          输出："123-45-67"
          解释：数字是 "1234567".
          步骤 1：共有超过 4 个数字，所以先取 3 个数字分为一组。第 1 个块是 "123" 。
          步骤 2：剩下 4 个数字，所以将它们分成两个含 2 个数字的块。这 2 块分别是 "45" 和 "67" 。
          连接这些块后得到 "123-45-67" 。
         */
        System.out.println(reformatPhoneNumber.reformatNumber("123 4-567"));
        /*
          示例 3：
          输入：number = "123 4-5678"
          输出："123-456-78"
          解释：数字是 "12345678" 。
          步骤 1：第 1 个块 "123" 。
          步骤 2：第 2 个块 "456" 。
          步骤 3：剩下 2 个数字，将它们放入单个含 2 个数字的块。第 3 个块是 "78" 。
          连接这些块后得到 "123-456-78" 。
         */
        System.out.println(reformatPhoneNumber.reformatNumber("123 4-5678"));
        /*
          示例 4：
          输入：number = "12"
          输出："12"
         */
        System.out.println(reformatPhoneNumber.reformatNumber("12"));
        /*
          示例 5：
          输入：number = "--17-5 229 35-39475 "
          输出："175-229-353-94-75"
         */
        System.out.println(reformatPhoneNumber.reformatNumber("--17-5 229 35-39475 "));
    }
}
