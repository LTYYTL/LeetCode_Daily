package com.leetcode.L1839;

/**
 * 1839. 所有元音按顺序排布的最长子字符串
 * 当一个字符串满足如下条件时，我们称它是 美丽的 ：
 * 所有 5 个英文元音字母（'a' ，'e' ，'i' ，'o' ，'u'）都必须 至少 出现一次。
 * 这些元音字母的顺序都必须按照 字典序 升序排布（也就是说所有的 'a' 都在 'e' 前面，所有的 'e' 都在 'i' 前面，以此类推）
 * 比方说，字符串 "aeiou" 和 "aaaaaaeiiiioou" 都是 美丽的 ，但是 "uaeio" ，"aeoiu" 和 "aaaeeeooo" 不是美丽的 。
 * 给你一个只包含英文元音字母的字符串 word ，请你返回 word 中 最长美丽子字符串的长度 。如果不存在这样的子字符串，请返回 0 。
 * 子字符串 是字符串中一个连续的字符序列。
 *
 * 示例 1：
 * 输入：word = "aeiaaioaaaaeiiiiouuuooaauuaeiu"
 * 输出：13
 * 解释：最长子字符串是 "aaaaeiiiiouuu" ，长度为 13 。
 *
 * 示例 2：
 * 输入：word = "aeeeiiiioooauuuaeiou"
 * 输出：5
 * 解释：最长子字符串是 "aeiou" ，长度为 5 。
 *
 * 示例 3：
 * 输入：word = "a"
 * 输出：0
 * 解释：没有美丽子字符串，所以返回 0 。
 *
 * 提示：
 * 1 <= word.length <= 5 * 105
 * word 只包含字符 'a'，'e'，'i'，'o' 和 'u' 。
 */
public class LongestSubstringOfAllVowelsOrder {
    /**
     * 方法：双指针
     *
     * 解题思路：
     * 1.首先如果数组长度小于5的话，不可能满足美丽的定义，将这种情况提前排除
     * 2.遍历时分了几种情况判断：
     * - 如果当前字符比上一个不小（顺序意义），那么当前子串长度+1
     * - 如果当前字符比上一个大，那么子串中元音字母种类+1
     * - 如果当前字符比上一个小，那么肯定当前字串不美丽，以当前字符为首继续进行遍历
     * 3.如果当前子字符串没有以a开头的话，那么在进行下一个子字符串开始遍历之前，元音种类一定不会达到5，所以只要判断种类即可
     * 4.当元音种类为5的时候，持续维护更新最终结果，取出最大值即可
     *
     * 作者：SweetpepperJ
     * @param word
     * @return
     */
    public int longestBeautifulSubstring(String word) {
        //长度不够5
        if (word.length() < 5){
            return 0;
        }
        int len = 1;
        int type = 1;
        int ans = 0;
        for (int i = 1; i < word.length(); i++) {
            //更新字符串长度
            if (word.charAt(i) >= word.charAt(i -1))
                len++;
            //更新字符种类
            if (word.charAt(i) > word.charAt(i-1))
                type++;
            //重头计算字符串
            if (word.charAt(i) < word.charAt(i-1)){
                type = 1;
                len = 1;
            }
            //更新更大的长度
            if (type == 5)
                ans = Math.max(ans,len);
        }
        return ans;
    }
}
