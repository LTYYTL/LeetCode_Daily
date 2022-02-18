package com.leetcode.L1101_1200.L1189;

import java.util.HashMap;
import java.util.Map;

/**
 * 1189. “气球” 的最大数量
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 *
 * 示例 1：
 * 输入：text = "nlaebolko"
 * 输出：1
 *
 * 示例 2：
 * 输入：text = "loonbalxballpoon"
 * 输出：2
 *
 * 示例 3：
 * 输入：text = "leetcode"
 * 输出：0
 *
 * 提示：
 * 1 <= text.length <= 10^4
 * text 全部由小写英文字母组成
 */
public class MaxNumberBalloons {
    /**
     * 方法：map映射
     * @param text
     * @return
     */
    public int maxNumberOfBalloons(String text) {
        //记录每个字母的出现的次数
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //有一个字母不存在，就组不成
        if (!map.containsKey('b') || !map.containsKey('a')|| !map.containsKey('l')|| !map.containsKey('o')|| !map.containsKey('n'))
            return 0;
        //能组成单词的个数需要靠字母中出现次数最少的决定
        int min = Integer.MAX_VALUE;
        min = Math.min(map.get('b'),min);
        min = Math.min(map.get('a'),min);
        min = Math.min(map.get('l')/2,min);
        min = Math.min(map.get('o')/2,min);
        min = Math.min(map.get('n'),min);

        return min;
    }
}
