package com.leetcode.L0168;

/**
 * 168. Excel表列名称
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 *
 * 示例 1:
 * 输入: 1
 * 输出: "A"
 *
 * 示例 2:
 * 输入: 28
 * 输出: "AB"
 *
 * 示例 3:
 * 输入: 701
 * 输出: "ZY"
 */
public class ExcelSheetColumnTitle {
    /**
     * 方法：数学
     * @param columnNumber
     * @return
     */
    public String convertToTitle(int columnNumber) {
        char[] word = new char[]{'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
        StringBuilder res = new StringBuilder();
        while(columnNumber > 0){
            int mod = columnNumber%26;
            res.append(word[mod]);
            columnNumber /=26;
            if (mod == 0) columnNumber--;
        }
        return res.reverse().toString();
    }
}
