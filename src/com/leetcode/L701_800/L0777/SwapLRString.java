package com.leetcode.L701_800.L0777;

/**
 * 777. 在LR字符串中交换相邻字符
 * 在一个由 'L' , 'R' 和 'X' 三个字符组成的字符串（例如"RXXLRXRXL"）中进行移动操作。
 * 一次移动操作指用一个"LX"替换一个"XL"，或者用一个"XR"替换一个"RX"。
 * 现给定起始字符串start和结束字符串end，请编写代码，当且仅当存在一系列移动操作使得start可以转换成end时， 返回True。
 * <p>
 * 示例 :
 * 输入: start = "RXXLRXRXL", end = "XRLXXRRLX"
 * 输出: True
 * 解释:
 * 我们可以通过以下几步将start转换成end:
 * RXXLRXRXL ->
 * XRXLRXRXL ->
 * XRLXRXRXL ->
 * XRLXXRRXL ->
 * XRLXXRRLX
 * <p>
 * 提示：
 * 1 <= len(start) = len(end) <= 10000。
 * start和end中的字符串仅限于'L', 'R'和'X'。
 */
public class SwapLRString {
    /**
     * 方法：模拟
     * 题解：https://leetcode.cn/problems/swap-adjacent-in-lr-string/solution/zhua-wa-mou-xiu-by-muse-77-tr3w/
     */
    public boolean canTransform(String start, String end) {
        // 转换成数组
        char[] startArray = start.toCharArray();
        char[] endArray = end.toCharArray();
        // 索引
        int j = 0;
        // 长度
        int n = start.length();

        // 遍历
        for (int i = 0; i < n; i++) {
            // 当前字符
            char c = startArray[i];
            // X不做操作
            if (c == 'X') {
                continue;
            }
            // 跳过X
            for (; j < n; j++) {
                if (endArray[j] != 'X') {
                    break;
                }
            }

            // 两个字符串字符对不上
            if (j == n || startArray[i] != endArray[j]) {
                return false;
            }
            // 'L'字符其索引不是大于等于
            if (startArray[i] == 'L' && i < j) {
                return false;
            }
            // 'R'字符其索引不是小于等于
            if (startArray[i] == 'R' && i > j) {
                return false;
            }
            // 索引后移
            j++;
        }

        // 两个字符串，字符不匹配
        for (; j < n; j++) {
            if (endArray[j] != 'X') {
                return false;
            }
        }
        return true;
    }
}
