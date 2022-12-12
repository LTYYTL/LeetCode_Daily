package com.leetcode.L1701_1800.L1758;

public class MinChangesStringTest {
    public static void main(String[] args) {
        MinChangesString minChangesString = new MinChangesString();
        /*
          示例 1：
          输入：s = "0100"
          输出：1
          解释：如果将最后一个字符变为 '1' ，s 就变成 "0101" ，即符合交替字符串定义。
         */
        System.out.println(minChangesString.minOperations("0100"));
        /*
          示例 2：
          输入：s = "10"
          输出：0
          解释：s 已经是交替字符串。
         */
        System.out.println(minChangesString.minOperations("10"));
        /*
          示例 3：
          输入：s = "1111"
          输出：2
          解释：需要 2 步操作得到 "0101" 或 "1010" 。
         */
        System.out.println(minChangesString.minOperations("1111"));
    }
}
