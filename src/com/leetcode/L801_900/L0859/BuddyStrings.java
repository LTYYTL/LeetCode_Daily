package com.leetcode.L801_900.L0859;

import java.util.HashMap;
import java.util.Map;

/**
 * 859. 亲密字符串
 * 给你两个字符串 s 和 goal ，只要我们可以通过交换 s 中的两个字母得到与 goal 相等的结果，就返回 true ；否则返回 false 。
 * 交换字母的定义是：取两个下标 i 和 j （下标从 0 开始）且满足 i != j ，接着交换 s[i] 和 s[j] 处的字符。
 * 例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
 *
 * 示例 1：
 * 输入：s = "ab", goal = "ba"
 * 输出：true
 * 解释：你可以交换 s[0] = 'a' 和 s[1] = 'b' 生成 "ba"，此时 s 和 goal 相等。
 *
 * 示例 2：
 * 输入：s = "ab", goal = "ab"
 * 输出：false
 * 解释：你只能交换 s[0] = 'a' 和 s[1] = 'b' 生成 "ba"，此时 s 和 goal 不相等。
 *
 * 示例 3：
 * 输入：s = "aa", goal = "aa"
 * 输出：true
 * 解释：你可以交换 s[0] = 'a' 和 s[1] = 'a' 生成 "aa"，此时 s 和 goal 相等。
 *
 * 示例 4：
 * 输入：s = "aaaaaaabc", goal = "aaaaaaacb"
 * 输出：true
 *
 * 提示：
 * 1 <= s.length, goal.length <= 2 * 104
 * s 和 goal 由小写英文字母组成
 */
public class BuddyStrings {
    /**
     * 方法：模拟
     * @param s
     * @param goal
     * @return
     */
    public boolean buddyStrings(String s, String goal) {
        //获取字符串长度
        int m = s.length();
        int n = goal.length();
        //不等长
        if (m != n)
            return false;
        //记录两个字符串字母出现的次数
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        //不同字母的个数
        int sum = 0;
        //遍历
        for (int i = 0; i < m; i++) {
            //当前两个字母
            int c = s.charAt(i) - 'a';
            int d = goal.charAt(i) - 'a';
            //记录字母次数
            cnt1[c]++;
            cnt2[d]++;
            //当前两个字母不等
            if (c != d)
                sum++;
        }
        //标志位，记录是否有次数超过2次的字母
        boolean flag = false;
        //遍历
        for (int i = 0; i < 26; i++) {
            //字母出现次数不一样
            if (cnt1[i] != cnt2[i])
                return false;
            //字母出现过两次
            if (cnt1[i] >= 2)
                flag = true;
        }
        //有两个位置的字母不一样或者两个字符串字母都一样但是有相同的字母出现过两次
        return sum == 2 || (sum == 0 && flag);
    }
}
