package com.leetcode.L1701_1800.L1704;

/**
 * 1704. 判断字符串的两半是否相似
 * 给你一个偶数长度的字符串 s 。将其拆分成长度相同的两半，前一半为 a ，后一半为 b 。
 * 两个字符串 相似 的前提是它们都含有相同数目的元音（'a'，'e'，'i'，'o'，'u'，'A'，'E'，'I'，'O'，'U'）。注意，s 可能同时含有大写和小写字母。
 * 如果 a 和 b 相似，返回 true ；否则，返回 false 。
 * <p>
 * 示例 1：
 * 输入：s = "book"
 * 输出：true
 * 解释：a = "bo" 且 b = "ok" 。a 中有 1 个元音，b 也有 1 个元音。所以，a 和 b 相似。
 * <p>
 * 示例 2：
 * 输入：s = "textbook"
 * 输出：false
 * 解释：a = "text" 且 b = "book" 。a 中有 1 个元音，b 中有 2 个元音。因此，a 和 b 不相似。
 * 注意，元音 o 在 b 中出现两次，记为 2 个。
 * <p>
 * 提示：
 * 2 <= s.length <= 1000
 * s.length 是偶数
 * s 由 大写和小写 字母组成
 */
public class DetermineStringAlike {
    /**
     * 方法：模拟
     */
    public boolean halvesAreAlike(String s) {
        // 长度
        int n = s.length();
        // 分割字符串
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2);
        // 计算元音
        int sumA = getSum(a);
        int sumB = getSum(b);
        // 查看是否相等
        return sumA == sumB;
    }

    private int getSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                sum++;
            }
        }
        return sum;
    }
}
