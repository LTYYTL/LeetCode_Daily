package com.leetcode.L201_300.L0242;

import java.util.Arrays;

/**
 * 242. 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 *
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class ValidAnagram {
    /**
     * 方法：排序
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        //两个字符串不一样长
        if(s.length() != t.length())
            return false;
        //转换成字符数组
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        //排序两个数组
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        //遍历
        for (int i = 0; i < sChar.length; ++i){
            if (sChar[i] != tChar[i])
                return false;
        }

        return true;
    }
}
