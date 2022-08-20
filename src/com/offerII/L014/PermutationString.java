package com.offerII.L014;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer II 014. 字符串中的变位词
 * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的某个变位词。
 * 换句话说，第一个字符串的排列之一是第二个字符串的 子串 。
 *
 * 示例 1：
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 *
 * 示例 2
 * 输入: s1= "ab" s2 = "eidboaoo"
 * 输出: False
 *
 * 提示：
 * 1 <= s1.length, s2.length <= 104
 * s1 和 s2 仅包含小写字母
 *
 * 注意：本题与主站 567 题相同： <a href="https://leetcode-cn.com/problems/permutation-in-string/">https://leetcode-cn.com/problems/permutation-in-string/</a>
 */
public class PermutationString {
    /**
     * 方法：滑动窗口
     * @param s1
     * @param s2
     * @return
     */
    public boolean checkInclusion(String s1, String s2) {
        //记录t中字符出现的次数
        Map<Character,Integer> needs = new HashMap<>();
        for (char c : s1.toCharArray()) {
            needs.put(c,needs.getOrDefault(c,0)+1);
        }

        //窗口内字符出现的次数
        Map<Character,Integer> window = new HashMap<>();

        //窗口的左右边界
        int left = 0,right = 0;
        //表示记录窗口满足条件的字符个数
        int valid = 0;

        while (right < s2.length()){
            //c是移入窗口的字符
            char c = s2.charAt(right);
            //右移窗口
            right++;
            //进行窗口内数据的一系列更新
            if (needs.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(needs.get(c)))
                    valid++;
            }

            while (right - left >= s1.length()){
                //满足条件的合法排序
                if (valid == needs.size())
                    return true;
                //d是将移除窗口的字符
                char d = s2.charAt(left);
                //左移动窗口
                left++;
                //进行窗口内数据的一系列更新
                if (needs.containsKey(d)){
                    if (window.get(d).equals(needs.get(d)))
                        valid--;
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return false;
    }
}
