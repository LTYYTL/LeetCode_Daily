package com.offer.L005;

/**
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 * 限制：
 * 0 <= s 的长度 <= 10000
 */
public class ReplaceSpaces {
    /**
     * 方法：遍历
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        //结果集
        StringBuilder res = new StringBuilder();
        //遍历字符串
        for (Character c:s.toCharArray()) {
            //遇到‘ ’加入“%20”，否则直接加入
            if (c == ' ')
              res.append("%20");
            else
                res.append(c);
        }

        //转换数据类型
        return res.toString();
    }

}
