package com.leetcode.L1701_1800.L1763;

/**
 * 1763. 最长的美好子字符串
 * 当一个字符串 s 包含的每一种字母的大写和小写形式 同时 出现在 s 中，就称这个字符串 s 是 美好 字符串。
 * 比方说，"abABB" 是美好字符串，因为 'A' 和 'a' 同时出现了，且 'B' 和 'b' 也同时出现了。然而，"abA" 不是美好字符串因为 'b' 出现了，而 'B' 没有出现。
 *
 * 给你一个字符串 s ，请你返回 s 最长的 美好子字符串 。如果有多个答案，请你返回 最早 出现的一个。如果不存在美好子字符串，请你返回一个空字符串。
 *
 * 示例 1：
 * 输入：s = "YazaAay"
 * 输出："aAa"
 * 解释："aAa" 是一个美好字符串，因为这个子串中仅含一种字母，其小写形式 'a' 和大写形式 'A' 也同时出现了。
 * "aAa" 是最长的美好子字符串。
 *
 * 示例 2：
 * 输入：s = "Bb"
 * 输出："Bb"
 * 解释："Bb" 是美好字符串，因为 'B' 和 'b' 都出现了。整个字符串也是原字符串的子字符串。
 *
 * 示例 3：
 * 输入：s = "c"
 * 输出：""
 * 解释：没有美好子字符串。
 *
 * 示例 4：
 * 输入：s = "dDzeE"
 * 输出："dD"
 * 解释："dD" 和 "eE" 都是最长美好子字符串。
 * 由于有多个美好子字符串，返回 "dD" ，因为它出现得最早。
 *
 * 提示：
 * 1 <= s.length <= 100
 * s 只包含大写和小写英文字母。
 */
public class LongNiceSub {
    /**
     * 方法：模拟
     * @param s
     * @return
     */
    public String longestNiceSubstring(String s) {
        //长度
        int n = s.length();
        //最大长度
        int maxLen = 0;
        //最大长度字符串开始的索引
        int index = 0;
        //遍历
        for (int i = 0; i < n; i++) {
            //小写
            int lower = 0;
            //大写
            int upper = 0;
            for (int j = i; j < n; j++) {
                //当前字符
                char c = s.charAt(j);
                //判读大小写
                if (Character.isLowerCase(c)) {
                    //记录出现的小写字母的位置
                    lower |= 1 <<  (c - 'a');
                } else {
                    //记录出现的大写字母的位置
                    upper |= 1 <<  (c - 'A');
                }
                //当字符大小写都出现过并且大于最大长度
                if (lower == upper && j - i + 1 > maxLen){
                    //最大长度
                    maxLen = j - i + 1;
                    //开始索引
                    index = i;
                }
            }
        }
        //截取字符串
        return s.substring(index,index+maxLen);
    }
}
