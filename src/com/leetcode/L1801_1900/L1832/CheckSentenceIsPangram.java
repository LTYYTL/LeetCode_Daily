package com.leetcode.L1801_1900.L1832;

import java.util.HashSet;
import java.util.Set;

/**
 * 1832. 判断句子是否为全字母句
 * 全字母句 指包含英语字母表中每个字母至少一次的句子。
 * 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 全字母句 。
 * 如果是，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 * 输入：sentence = "thequickbrownfoxjumpsoverthelazydog"
 * 输出：true
 * 解释：sentence 包含英语字母表中每个字母至少一次。
 *
 * 示例 2：
 * 输入：sentence = "leetcode"
 * 输出：false
 *
 * 提示：
 * 1 <= sentence.length <= 1000
 * sentence 由小写英语字母组成
 */
public class CheckSentenceIsPangram {
    /**
     * 方法一：Set集合
     * 解题思路：应用set集合的不重复性质
     *        将每个出现的字母加入其中，因为不会出现重复，所以如果是全字母的情况，set的长度就会是26
     * @param sentence
     * @return
     */
    public boolean checkIfPangram(String sentence) {
        //长度小于26，说明肯定不是全字母
        if (sentence.length() < 26)
            return false;
        //Set集合：元素不相同
        Set<Character> set = new HashSet<>();
        //遍历字符串的每一个字符，将其加入set集合中
        for (int i = 0; i < sentence.length(); ++i){
            char c = sentence.charAt(i);
            set.add(c);
        }
        //判断set长度是否为26
        return set.size() == 26;
    }
}
