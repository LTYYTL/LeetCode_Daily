package com.leetcode.L1401_1500.L1417;

import java.util.ArrayList;
import java.util.List;

/**
 * 1417. 重新格式化字符串
 * 给你一个混合了数字和字母的字符串 s，其中的字母均为小写英文字母。
 * 请你将该字符串重新格式化，使得任意两个相邻字符的类型都不同。也就是说，字母后面应该跟着数字，而数字后面应该跟着字母。
 * 请你返回 重新格式化后 的字符串；如果无法按要求重新格式化，则返回一个 空字符串 。
 * <p>
 * 示例 1：
 * 输入：s = "a0b1c2"
 * 输出："0a1b2c"
 * 解释："0a1b2c" 中任意两个相邻字符的类型都不同。 "a0b1c2", "0a1b2c", "0c2a1b" 也是满足题目要求的答案。
 * <p>
 * 示例 2：
 * 输入：s = "leetcode"
 * 输出：""
 * 解释："leetcode" 中只有字母，所以无法满足重新格式化的条件。
 * <p>
 * 示例 3：
 * 输入：s = "1229857369"
 * 输出：""
 * 解释："1229857369" 中只有数字，所以无法满足重新格式化的条件。
 * <p>
 * 示例 4：
 * 输入：s = "covid2019"
 * 输出："c2o0v1i9d"
 * <p>
 * 示例 5：
 * 输入：s = "ab123"
 * 输出："1a2b3"
 * <p>
 * 提示：
 * 1 <= s.length <= 500
 * s 仅由小写英文字母和/或数字组成。
 */
public class ReformatString {
    /**
     * 方法：模拟
     *
     * @param s
     * @return
     */
    public String reformat(String s) {
        //分别记录数字和字母
        List<Character> num = new ArrayList<>();
        List<Character> word = new ArrayList<>();
        //遍历
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num.add(c);
            } else {
                word.add(c);
            }
        }

        //不满足条件
        if (Math.abs(num.size() - word.size()) > 1)
            return "";
        //结果
        StringBuilder res = new StringBuilder();
        //遍历
        for (int i = 0; i < Math.min(num.size(), word.size()); i++) {
            res.append(num.get(i)).append(word.get(i));
        }
        //处理多出来的字符
        if (num.size() > word.size()) {
            res.append(num.get(num.size() - 1));
        }
        if (num.size() < word.size()) {
            res.insert(0, word.get(word.size() - 1));
        }

        return res.toString();
    }
}
