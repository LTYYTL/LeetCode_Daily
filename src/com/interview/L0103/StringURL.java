package com.interview.L0103;

/**
 * 面试题 01.03. URL化
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *
 * 示例 1：
 * 输入："Mr John Smith    ", 13
 * 输出："Mr%20John%20Smith"
 *
 * 示例 2：
 * 输入："               ", 5
 * 输出："%20%20%20%20%20"
 *
 * 提示：
 * 字符串长度在 [0, 500000] 范围内。
 */
public class StringURL {
    /**
     * 方法：模拟
     * @param S
     * @param length
     * @return
     */
    public String replaceSpaces(String S, int length) {
        //记录字符串长度
        int index = 0;
        //结果
        StringBuilder res = new StringBuilder();
        //遍历当结果字符串满足长度条件退出
        for (int i = 0; i < S.length() && index < length; i++) {
            //当前字符
            char c = S.charAt(i);
            //是空格添加%20，不是添加字符
            if (c == ' '){
                res.append("%20");
            }else {
                res.append(c);
            }
            //长度+1
            index++;
        }
        return res.toString();
    }
}
