package com.leetcode.L601_700.L0686;

/**
 * 686. 重复叠加字符串匹配
 * 给定两个字符串 a 和 b，寻找重复叠加字符串 a 的最小次数，使得字符串 b 成为叠加后的字符串 a 的子串，如果不存在则返回 -1。
 * 注意：字符串 "abc" 重复叠加 0 次是 ""，重复叠加 1 次是 "abc"，重复叠加 2 次是 "abcabc"。
 *
 * 示例 1：
 * 输入：a = "abcd", b = "cdabcdab"
 * 输出：3
 * 解释：a 重复叠加三遍后为 "abcdabcdabcd", 此时 b 是其子串。
 *
 * 示例 2：
 * 输入：a = "a", b = "aa"
 * 输出：2
 *
 * 示例 3：
 * 输入：a = "a", b = "a"
 * 输出：1
 *
 * 示例 4：
 * 输入：a = "abc", b = "wxyz"
 * 输出：-1
 *
 * 提示：
 * 1 <= a.length <= 104
 * 1 <= b.length <= 104
 * a 和 b 由小写英文字母组成
 */
public class RepeatedMatch {
    /**
     * 方法：模拟
     * 我们假设 b 的长度是 a 的 x 倍，主要有以下三种情况，分别举例说明：
     * （1）a 重复 x 次后正好等于 b，比如 a="ab", b="abab"，a 只需要重复 2 次即可；
     * （2）a 重复 x 次后无法包含 b，比如 a="ab", b="ababa"，a 需要重复 3次才可以，也就是 x+1 次；
     * （3）a 重复 x+1 次后也无法包含 b，比如 a="abc", b="cabcabca"，a 需要重复 4次才可以，也就是 x+2 次；
     * 作者：tong-zhu
     * 链接：https://leetcode-cn.com/problems/repeated-string-match/solution/tong-ge-lai-shua-ti-la-jian-dan-si-lu-ju-lcit/
     * @param a
     * @param b
     * @return
     */
    public int repeatedStringMatch(String a, String b) {
        //b中存在a中不存在的字符
        boolean[] arr = new boolean[26];
        //a中出现的字符
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a'] = true;
        }
        //遍历
        for (int i = 0; i < b.length(); i++) {
            //出现不在a中的字符
            if (!arr[b.charAt(i) - 'a'])
                return -1;
        }
        //表示最初a重复的次数
        int count = b.length()/a.length();
        //将count个a加入
        //StringBuilder sb = new StringBuilder(a.repeat(count));
        StringBuilder sb = new StringBuilder();
        //遍历
        for (int i = 0; i <= 2 ; i++) {
            //看是否出现了b
            if (sb.indexOf(b) >= 0)
                return count + i;//初始次数+又重复次数
            //重复1次
            sb.append(a);
        }

        return -1;
    }
}
