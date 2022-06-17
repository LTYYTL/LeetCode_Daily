package com.leetcode.L801_900.L0890;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 890. 查找和替换模式
 * 你有一个单词列表 words 和一个模式  pattern，你想知道 words 中的哪些单词与模式匹配。
 * 如果存在字母的排列 p ，使得将模式中的每个字母 x 替换为 p(x) 之后，我们就得到了所需的单词，那么单词与模式是匹配的。
 * （回想一下，字母的排列是从字母到字母的双射：每个字母映射到另一个字母，没有两个字母映射到同一个字母。）
 * 返回 words 中与给定模式匹配的单词列表。
 * <p>
 * 你可以按任何顺序返回答案。
 * <p>
 * 示例：
 * 输入：words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * 输出：["mee","aqq"]
 * 解释：
 * "mee" 与模式匹配，因为存在排列 {a -> m, b -> e, ...}。
 * "ccc" 与模式不匹配，因为 {a -> c, b -> c, ...} 不是排列。
 * 因为 a 和 b 映射到同一个字母。
 * <p>
 * 提示：
 * 1 <= words.length <= 50
 * 1 <= pattern.length = words[i].length <= 20
 */
public class FindReplacePattern {
    /**
     * 方法：map映射
     *
     * @param words
     * @param pattern
     * @return
     */
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        //结果
        List<String> res = new ArrayList<>();
        //遍历
        for (String word : words) {
            //判断情况
            if (match(word, pattern) && match(pattern, word))
                res.add(word);
        }
        return res;
    }

    private boolean match(String word, String pattern) {
        //存储映射
        Map<Character, Character> map = new HashMap<>();
        //遍历
        for (int i = 0; i < word.length(); i++) {
            //当前字符
            char c = word.charAt(i);
            char d = pattern.charAt(i);
            //不存在映射
            if (!map.containsKey(c))
                map.put(c, d);
            else if (map.get(c) != d)//同一个字母对应两个字母
                return false;
        }
        return true;
    }
}
