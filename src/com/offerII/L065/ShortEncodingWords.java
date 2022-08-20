package com.offerII.L065;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 * 剑指 Offer II 065. 最短的单词编码
 * 单词数组 words 的 有效编码 由任意助记字符串 s 和下标数组 indices 组成，且满足：
 *
 * words.length == indices.length
 * 助记字符串 s 以 '#' 字符结尾
 * 对于每个下标 indices[i] ，s 的一个从 indices[i] 开始、到下一个 '#' 字符结束（但不包括 '#'）的 子字符串 恰好与 words[i] 相等
 * 给定一个单词数组 words ，返回成功对 words 进行编码的最小助记字符串 s 的长度 。
 *
 * 示例 1：
 * 输入：words = ["time", "me", "bell"]
 * 输出：10
 * 解释：一组有效编码为 s = "time#bell#" 和 indices = [0, 2, 5] 。
 * words[0] = "time" ，s 开始于 indices[0] = 0 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#"
 * words[1] = "me" ，s 开始于 indices[1] = 2 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#"
 * words[2] = "bell" ，s 开始于 indices[2] = 5 到下一个 '#' 结束的子字符串，如加粗部分所示 "time#bell#"
 *
 * 示例 2：
 * 输入：words = ["t"]
 * 输出：2
 * 解释：一组有效编码为 s = "t#" 和 indices = [0] 。
 *
 * 提示：
 * 1 <= words.length <= 2000
 * 1 <= words[i].length <= 7
 * words[i] 仅由小写字母组成
 *
 * 注意：本题与主站 820 题相同： <a href="https://leetcode-cn.com/problems/short-encoding-of-words/">https://leetcode-cn.com/problems/short-encoding-of-words/</a>
 */
public class ShortEncodingWords {
    /**
     * 方法一：set集合
     * @param words
     * @return
     */
    public int minimumLengthEncoding(String[] words) {
        //存入set中
        Set<String> set = new HashSet<>(Arrays.asList(words));
        //遍历单词
        for (String word : words) {
            //将每个单词的后缀展示，如果存在就直接移除
            for (int i = 1; i < word.length(); i++) {
                set.remove(word.substring(i));
            }
        }

        int res = 0;
        //遍历set
        for (String s : set) {
            //每个单词后加#
            res += s.length() + 1;
        }

        return res;
    }

    /**
     * 方法二：字典树
     */
    static class Tire {
        TreeMap<Character, Tire> next;

        public Tire() {
            next = new TreeMap<>();
        }
    }

    Tire root;
    public int minimumLengthEncoding_tire(String[] words) {
        root = new Tire();
        //按照长度从小到大
        Arrays.sort(words,(a,b)-> b.length() - a.length());
        int res = 0;
        //调用添加单词
        for (String word : words) {
            res += insert(word);
        }
        return res;
    }

    //向字典树中加入
    private int insert(String s){
        Tire cur = root;
        //标志是否是后缀
        boolean flag = false;
        for (int i = s.length()-1; i >= 0; i--) {
            //当前字母
            char c = s.charAt(i);
            //不存在情况
            if (cur.next.get(c) == null) {
                cur.next.put(c, new Tire());
                flag = true;
            }
            cur = cur.next.get(c);
        }
        //不是后缀，长度在单词基础上+1
        return flag ? s.length() + 1 : 0;
    }
}
