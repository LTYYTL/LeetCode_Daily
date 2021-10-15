package com.offerII.L032;

import java.util.Arrays;

/**
 * 剑指 Offer II 032. 有效的变位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断它们是不是一组变位词（字母异位词）。
 * 注意：若 s 和 t 中每个字符出现的次数都相同且字符顺序不完全相同，则称 s 和 t 互为变位词（字母异位词）。
 *
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 *
 * 示例 3:
 * 输入: s = "a", t = "a"
 * 输出: false
 *
 * 提示:
 * 1 <= s.length, t.length <= 5 * 104
 * s and t 仅包含小写字母
 *
 * 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 * 注意：本题与主站 242 题相似（字母异位词定义不同）：https://leetcode-cn.com/problems/valid-anagram/
 */
public class ValidConjugation {
    /**
     * 方法：排序
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {

        //两个字符串不一样长
        if(s.length() != t.length() || s.equals(t))
            return false;
        //转换成数组
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        //排序
        Arrays.sort(schar);
        Arrays.sort(tchar);
        //比较字符是否相同
        for (int i = 0; i < schar.length; i++) {
            if (schar[i] != tchar[i])
                return false;
        }
        return true;
    }
}
