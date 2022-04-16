package com.leetcode.L801_900.L0819;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 819. 最常见的单词
 * 给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。
 * 题目保证至少有一个词不在禁用列表中，而且答案唯一。
 * 禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。
 *
 * 示例：
 * 输入:
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 * 输出: "ball"
 * 解释:
 * "hit" 出现了3次，但它是一个禁用的单词。
 * "ball" 出现了2次 (同时没有其他单词出现2次)，所以它是段落里出现次数最多的，且不在禁用列表中的单词。
 * 注意，所有这些单词在段落里不区分大小写，标点符号需要忽略（即使是紧挨着单词也忽略， 比如 "ball,"），
 * "hit"不是最终的答案，虽然它出现次数更多，但它在禁用单词列表中。
 *
 * 提示：
 * 1 <= 段落长度 <= 1000
 * 0 <= 禁用单词个数 <= 100
 * 1 <= 禁用单词长度 <= 10
 * 答案是唯一的, 且都是小写字母 (即使在 paragraph 里是大写的，即使是一些特定的名词，答案都是小写的。)
 * paragraph 只包含字母、空格和下列标点符号!?',;.
 * 不存在没有连字符或者带有连字符的单词。
 * 单词里只包含字母，不会出现省略号或者其他标点符号。
 */
public class MostCommonWord {
    /**
     * 方法：模拟
     * @param paragraph
     * @param banned
     * @return
     */
    public String mostCommonWord(String paragraph, String[] banned) {
        //变成小写
        paragraph = paragraph.toLowerCase();
        //特殊字符替换成空格，并去除首尾空格
        paragraph = paragraph.replaceAll("[!?',;.]"," ").trim();
        //按空格分割
        String[] res = paragraph.split("[+\s]");
        //记录禁词
        Set<String> set = new HashSet<>();
        //遍历
        for (String s : banned) {
            set.add(s);
        }

        //记录每个词出现次数
        Map<String,Integer> map = new HashMap<>();
        //遍历
        for (String re : res) {
            //不是禁词，记录次数
            if (!set.contains(re) && !"".equals(re))
                map.put(re,map.getOrDefault(re,0)+1);
        }

        //结果
        String s = "";
        //最大出现次数
        int max = 0;
        //遍历
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            //获取key
            String key = entry.getKey();
            //次数
            int value = entry.getValue();
            //出现次数最多的词
            if (value > max){
                s = key;
                max = value;
            }
        }

        return s;
    }
}
