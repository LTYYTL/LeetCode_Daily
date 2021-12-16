package com.interview.L1620;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 面试题 16.20. T9键盘
 * 在老式手机上，用户通过数字键盘输入，手机将提供与这些数字相匹配的单词列表。
 * 每个数字映射到0至4个字母。给定一个数字序列，实现一个算法来返回匹配单词的列表。
 * 你会得到一张含有有效单词的列表。映射如下图所示：
 *
 * 示例 1:
 * 输入: num = "8733", words = ["tree", "used"]
 * 输出: ["tree", "used"]
 *
 * 示例 2:
 * 输入: num = "2", words = ["a", "b", "c", "d"]
 * 输出: ["a", "b", "c"]
 *
 * 提示：
 * num.length <= 1000
 * words.length <= 500
 * words[i].length == num.length
 * num中不会出现 0, 1 这两个数字
 */
public class T9 {
    /**
     * 方法：模拟
     * @param num
     * @param words
     * @return
     */
    public List<String> getValidT9Words(String num, String[] words) {
        //记录每个字母对应的数字
        Map<Character,Integer> map = new HashMap<>(){{
            put('a',2);put('b',2);put('c',2);
            put('d',3);put('e',3);put('f',3);
            put('g',4);put('h',4);put('i',4);
            put('j',5);put('k',5);put('l',5);
            put('m',6);put('n',6);put('o',6);
            put('p',7);put('q',7);put('r',7);put('s',7);
            put('t',8);put('u',8);put('v',8);
            put('w',9);put('x',9);put('y',9);put('z',9);

        }};

        //结果
        List<String> res = new ArrayList<>();
        //遍历
        for (String word : words) {
            //索引
            int i = 0;
            //遍历
            while (i < word.length()){
                //当前字母
                char c = word.charAt(i);
                //当前按键
                char d = num.charAt(i);
                //按键与字母所对应按键不等跳出循环
                if (map.get(c) != (d - '0'))
                    break;
                //索引+1
                i++;
            }
            //完全匹配加入结果集
            if (i == word.length())
                res.add(word);
        }
        return res;
    }
}
