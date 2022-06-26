package com.leetcode.L1_100.L0017;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * <p>
 * 示例 1：
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * <p>
 * 示例 2：
 * 输入：digits = ""
 * 输出：[]
 * <p>
 * 示例 3：
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 * <p>
 * 提示：
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 */
public class LetterCombinationsPhoneNumber {
    String[] mapping = new String[]{
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    List<String> res = new ArrayList<>();

    /**
     * 方法：回溯算法
     *
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        //空值
        if (digits.isEmpty())
            return res;
        //回溯算法
        back(digits, 0, new StringBuilder());
        return res;
    }

    private void back(String digits, int begin, StringBuilder sb) {
        //回调
        if (digits.length() == sb.length()) {
            res.add(sb.toString());
            return;
        }
        //遍历
        for (int i = begin; i < digits.length(); i++) {
            //当前数字
            int c = digits.charAt(i) - '0';
            //遍历数字对应的字母
            for (char d : mapping[c].toCharArray()) {
                //做选择
                sb.append(d);
                //递归
                back(digits, i + 1, sb);
                //撤销选择
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
