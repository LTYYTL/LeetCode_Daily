package com.leetcode.L1501_1600.L1576;

public class ReplaceAvoidConsecutiveTest {
    public static void main(String[] args) {
        ReplaceAvoidConsecutive replaceAvoidConsecutive = new ReplaceAvoidConsecutive();
        /*
          示例 1：
          输入：s = "?zs"
          输出："azs"
          解释：该示例共有 25 种解决方案，从 "azs" 到 "yzs" 都是符合题目要求的。只有 "z" 是无效的修改，因为字符串 "zzs" 中有连续重复的两个 'z' 。
         */
        System.out.println(replaceAvoidConsecutive.modifyString("?zs"));
        /*
          示例 2：
          输入：s = "ubv?w"
          输出："ubvaw"
          解释：该示例共有 24 种解决方案，只有替换成 "v" 和 "w" 不符合题目要求。因为 "ubvvw" 和 "ubvww" 都包含连续重复的字符。
         */
        System.out.println(replaceAvoidConsecutive.modifyString("ubv?w"));
        /*
          示例 3：
          输入：s = "j?qg??b"
          输出："jaqgacb"
         */
        System.out.println(replaceAvoidConsecutive.modifyString("j?qg??b"));
        /*
          示例 4：
          输入：s = "??yw?ipkj?"
          输出："acywaipkja"
         */
        System.out.println(replaceAvoidConsecutive.modifyString("??yw?ipkj?"));
    }
}
