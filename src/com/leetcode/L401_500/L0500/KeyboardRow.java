package com.leetcode.L401_500.L0500;

import java.util.ArrayList;
import java.util.List;

/**
 * 500. 键盘行
 * 给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。
 *
 * 美式键盘 中：
 * 第一行由字符 "qwertyuiop" 组成。
 * 第二行由字符 "asdfghjkl" 组成。
 * 第三行由字符 "zxcvbnm" 组成。
 *
 * 示例 1：
 * 输入：words = ["Hello","Alaska","Dad","Peace"]
 * 输出：["Alaska","Dad"]
 *
 * 示例 2：
 * 输入：words = ["omk"]
 * 输出：[]
 *
 * 示例 3：
 * 输入：words = ["adsdf","sfd"]
 * 输出：["adsdf","sfd"]
 *
 * 提示：
 * 1 <= words.length <= 20
 * 1 <= words[i].length <= 100
 * words[i] 由英文字母（小写和大写字母）组成
 */
public class KeyboardRow {
    /**
     * 方法：map映射（数组模拟）
     * @param words
     * @return
     */
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        //1、第一行   2、第二行   3、第三行
        int[] word = new int[]{2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        //遍历
        for (String s : words) {
            //转换成小写
            String temp = s.toLowerCase();
            //通过第一个判断是哪一行
            int flag = word[temp.charAt(0) - 'a'];
            boolean state = false;
            //遍历单词
            for (int i = 1; i < temp.length(); i++) {
                char c = temp.charAt(i);
                //判断当前单词的字母是否在同一行
                if (flag != word[c - 'a']) {
                    state = true;
                    break;
                }
            }
            if (!state)
                res.add(s);
        }
        //转换成数组
        return res.toArray(new String[res.size()]);
    }
}
