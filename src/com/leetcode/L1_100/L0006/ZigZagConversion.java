package com.leetcode.L1_100.L0006;

import java.util.Arrays;

/**
 * 6. Z 字形变换
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * 请你实现这个将字符串进行指定行数变换的函数：
 * string convert(string s, int numRows);
 *
 * 示例 1：
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 *
 * 示例 2：
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 * 示例 3：
 * 输入：s = "A", numRows = 1
 * 输出："A"
 *
 * 提示：
 * 1 <= s.length <= 1000
 * s 由英文字母（小写和大写）、',' 和 '.' 组成
 * 1 <= numRows <= 1000
 */
public class ZigZagConversion {
    /**
     * 方法：模拟
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        //计算长度
        int len = Math.min(s.length(),numRows);
        //创建转化数组
        String[] res = new String[len];
        //填充空串
        Arrays.fill(res,"");
        //位移指针
        int col = 0;
        //方向转换标志
        boolean flag = false;
        //遍历
        for (int i = 0; i < s.length(); i++) {
            //当前字符
            char c = s.charAt(i);
            //累加到所在位置的字符串上
            res[col] += c;
            //是否 转换方向
            if (col == 0 || col == len - 1)
                flag = !flag;
            //根据方向判断位移指针
            col += flag ? 1 : -1;
        }
        //遍历结果
        String ans = "";
        for (String re : res) {
            ans += re;
        }


        return ans;
    }
}
