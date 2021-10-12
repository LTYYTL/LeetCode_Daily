package com.offerII.L017;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer II 017. 含有所有字符的最短字符串
 * 给定两个字符串 s 和 t 。返回 s 中包含 t 的所有字符的最短子字符串。如果 s 中不存在符合条件的子字符串，则返回空字符串 "" 。
 * 如果 s 中存在多个符合条件的子字符串，返回任意一个。
 *
 * 注意： 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 *
 * 示例 1：
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * 解释：最短子字符串 "BANC" 包含了字符串 t 的所有字符 'A'、'B'、'C'
 *
 * 示例 2：
 * 输入：s = "a", t = "a"
 * 输出："a"
 *
 * 示例 3：
 * 输入：s = "a", t = "aa"
 * 输出：""
 * 解释：t 中两个字符 'a' 均应包含在 s 的子串中，因此没有符合条件的子字符串，返回空字符串。
 *
 * 提示：
 * 1 <= s.length, t.length <= 105
 * s 和 t 由英文字母组成
 *
 * 进阶：你能设计一个在 o(n) 时间内解决此问题的算法吗？
 *
 * 注意：本题与主站 76 题相似（本题答案不唯一）：https://leetcode-cn.com/problems/minimum-window-substring/
 */
public class MinimumWindowSubstring {
    /**
     * 方法：滑动窗口
     * @param s
     * @param t
     * @return
     */
    public String minWindow(String s, String t) {
        //记录t中字符出现的次数
        Map<Character,Integer> nedds = new HashMap<>();
        for (char c : t.toCharArray()) {
            nedds.put(c,nedds.getOrDefault(c,0)+1);
        }

        //窗口内字符出现的次数
        Map<Character,Integer> window = new HashMap<>();

        //窗口的左右边界
        int left = 0,right = 0;
        //表示记录窗口满足条件的字符个数
        int valid = 0;

        //记录最小覆盖字串的起始索引和长度
        int start = 0,len = Integer.MAX_VALUE;

        while (right < s.length()){
            //c是移入窗口的字符
            char c = s.charAt(right);
            //右移窗口
            right++;

            //进行窗口内数据的一系列更新
            if (nedds.containsKey(c)){

                window.put(c, window.getOrDefault(c,0)+1);
                //此题超出范围将"=="改为equals（）
                if (window.get(c).equals(nedds.get(c)))
                    valid++;
            }

            //判断左侧窗口是否要收缩
            while (valid == nedds.size()){
                //更新最小覆盖字串
                if (right - left < len){
                    start = left;
                    len = right - left;
                }
                //d是将移除窗口的字符
                char d = s.charAt(left);
                //左移动窗口
                left++;

                //进行窗口内数据一系列更新
                if (nedds.containsKey(d)){
                    //此题超出范围将"=="改为equals（）
                    if (window.get(d).equals(nedds.get(d)))
                        valid--;
                    window.put(d, window.getOrDefault(d,0)-1);
                }
            }
        }
        return len == Integer.MAX_VALUE? "" : s.substring(start,start+len);
    }
}
