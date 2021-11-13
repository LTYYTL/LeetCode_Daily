package com.leetcode.L501_600.L0520;

/**
 * 520. 检测大写字母
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *  1、全部字母都是大写，比如 "USA" 。
 *  2、单词中所有字母都不是大写，比如 "leetcode" 。
 *  3、如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
 * 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 * 输入：word = "USA"
 * 输出：true
 *
 * 示例 2：
 * 输入：word = "FlaG"
 * 输出：false
 *
 * 提示：
 * 1 <= word.length <= 100
 * word 由小写和大写英文字母组成
 */
public class DetectCapital {
    /**
     * 方法：模拟
     * @param word
     * @return
     */
    public boolean detectCapitalUse(String word) {
        //首字母是否是大写
        boolean flag = false;
        //记录大写字母
        int upper = 0;
        //记录小写字母
        int lower = 0;
        //判断首字母是否是大写
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            flag = true;
            upper++;
        }else {
            lower++;
        }
        //遍历
        for (int i = 1; i < word.length(); i++) {
            //当前字母
            char c = word.charAt(i);
            //记录大小写
            if (c >= 'A' && c <= 'Z')
                upper++;
            else
                lower++;
            //首字母是大写，后面有大写有小写
            if (flag && upper > 1 && lower > 0)
                return false;
            //首字母不是大写，后面有大写
            if (!flag && upper >= 1)
                return false;
        }
        return true;
    }
}
