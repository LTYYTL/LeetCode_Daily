package com.leetcode.L3201_3300.L3297;

import java.util.HashMap;
import java.util.Map;

/**
 * 3297. 统计重新排列后包含另一个字符串的子字符串数目 I
 * 给你两个字符串 word1 和 word2 。
 * 如果一个字符串 x 重新排列后，word2 是重排字符串的前缀，
 * 那么我们称字符串 x 是 合法的 。
 *
 * 请你返回 word1 中 合法子字符串的数目。
 *
 * 示例 1：
 * 输入：word1 = "bcca", word2 = "abc"
 * 输出：1
 * 解释：
 * 唯一合法的子字符串是 "bcca" ，可以重新排列得到 "abcc" ，"abc" 是它的前缀。
 *
 * 示例 2：
 * 输入：word1 = "abcabc", word2 = "abc"
 * 输出：10
 * 解释：
 * 除了长度为 1 和 2 的所有子字符串都是合法的。
 *
 * 示例 3：
 * 输入：word1 = "abcabc", word2 = "aaabc"
 * 输出：0
 *
 * 解释：
 *
 * 1 <= word1.length <= 105
 * 1 <= word2.length <= 104
 * word1 和 word2 都只包含小写英文字母。
 */
public class RearrangedSubstringCounter {
    /**
     * 方法：滑动窗口
     */
    public long validSubstringCount(String word1, String word2) {
        if (word1.length() < word2.length()){
            return 0;
        }

        int[] window = new int[26];
        int[] target = new int[26];

        for (int i = 0; i < word2.length(); i++) {
            target[word2.charAt(i) - 'a']++;
        }

        long res = 0;
        int left = 0;
        for (int right = 0; right < word1.length(); right++) {
            window[word1.charAt(right) - 'a']++;

            if (right < word2.length() - 1){
                continue;
            }

            while (equal(window,target)){
                window[word1.charAt(left) - 'a']--;
                left++;
            }
            res += left;
        }

        return res;
    }

    private boolean equal(int[] window, int[] target){
        for (int i = 0; i < window.length; i++) {
            if (window[i] < target[i]) {
                return false;
            }
        }

        return true;
    }
}
