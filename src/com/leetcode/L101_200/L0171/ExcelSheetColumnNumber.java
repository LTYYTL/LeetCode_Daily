package com.leetcode.L101_200.L0171;

/**
 * 171. Excel表列序号
 * 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回该列名称对应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 *
 *
 * 示例 1:
 * 输入: columnTitle = "A"
 * 输出: 1
 *
 * 示例 2:
 * 输入: columnTitle = "AB"
 * 输出: 28
 *
 * 示例 3:
 * 输入: columnTitle = "ZY"
 * 输出: 701
 *
 * 示例 4:
 * 输入: columnTitle = "FXSHRXW"
 * 输出: 2147483647
 *
 * 提示：
 * 1 <= columnTitle.length <= 7
 * columnTitle 仅由大写英文组成
 * columnTitle 在范围 ["A", "FXSHRXW"] 内
 */
public class ExcelSheetColumnNumber {
    /**
     * 方法：数学
     * 解题思路：ZY
     * Z = 26, Y = 25
     * ZY = 26*26 + 25 = 26^1*26 + 26^0*25 = 26^1*Z对应的数 + 26^0*Y对应的数
     * @param columnTitle
     * @return
     */
    public int titleToNumber(String columnTitle) {
        //结果集
        int res = 0;
        //长度
        int n = columnTitle.length();
        //字符串转换成数组
        char[] chars = columnTitle.toCharArray();
        //从后往前遍历
        for (int i = n - 1; i >= 0; i--) {
            //当前字符所对的数字
            int cur = chars[i] - 'A'+1;
            //n-1-i:26的幂数
            res += Math.pow(26,n - 1 - i) * cur;
        }
        return res;
    }
}
