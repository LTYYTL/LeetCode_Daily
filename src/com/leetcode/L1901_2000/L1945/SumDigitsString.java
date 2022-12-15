package com.leetcode.L1901_2000.L1945;

/**
 * 1945. 字符串转化后的各位数字之和
 * 给你一个由小写字母组成的字符串 s ，以及一个整数 k 。
 * 首先，用字母在字母表中的位置替换该字母，将 s 转化 为一个整数（也就是，'a' 用 1 替换，'b' 用 2 替换，... 'z' 用 26 替换）。接着，将整数 转换 为其 各位数字之和 。共重复 转换 操作 k 次 。
 * 例如，如果 s = "zbax" 且 k = 2 ，那么执行下述步骤后得到的结果是整数 8 ：
 * 转化："zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
 * 转换 #1：262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
 * 转换 #2：17 ➝ 1 + 7 ➝ 8
 * 返回执行上述操作后得到的结果整数。
 * <p>
 * 示例 1：
 * 输入：s = "iiii", k = 1
 * 输出：36
 * 解释：操作如下：
 * - 转化："iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
 * - 转换 #1：9999 ➝ 9 + 9 + 9 + 9 ➝ 36
 * 因此，结果整数为 36 。
 * <p>
 * 示例 2：
 * 输入：s = "leetcode", k = 2
 * 输出：6
 * 解释：操作如下：
 * - 转化："leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
 * - 转换 #1：12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
 * - 转换 #2：33 ➝ 3 + 3 ➝ 6
 * 因此，结果整数为 6 。
 * <p>
 * 提示：
 * 1 <= s.length <= 100
 * 1 <= k <= 10
 * s 由小写英文字母组成
 */
public class SumDigitsString {
    /**
     * 方法：模拟
     */
    public int getLucky(String s, int k) {
        // 临时字符串
        StringBuilder temp = new StringBuilder();
        // 遍历
        for (int i = 0; i < s.length(); i++) {
            // 获取字符
            char c = s.charAt(i);
            // 转换成数字
            temp.append(c - 'a' + 1);
        }

        // 遍历
        while (k-- > 0) {
            // 转化
            temp = new StringBuilder(sum(temp.toString()));
        }

        // 转换成数字
        return Integer.parseInt(temp.toString());
    }

    private String sum(String s) {
        // 记录和
        int sum = 0;
        // 遍历
        for (int i = 0; i < s.length(); i++) {
            // 获取字符
            char c = s.charAt(i);
            // 计算和
            sum += c - '0';
        }

        // 转换成字符串
        return String.valueOf(sum);
    }
}
