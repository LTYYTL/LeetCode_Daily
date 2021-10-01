package com.offerII.L005;

/**
 * 剑指 Offer II 005. 单词长度的最大乘积
 * 给定一个字符串数组 words，请计算当两个字符串 words[i] 和 words[j] 不包含相同字符时，它们长度的乘积的最大值。
 * 假设字符串中只包含英语的小写字母。如果没有不包含相同字符的一对字符串，返回 0。
 *
 * 示例 1:
 * 输入: words = ["abcw","baz","foo","bar","fxyz","abcdef"]
 * 输出: 16
 * 解释: 这两个单词为 "abcw", "fxyz"。它们不包含相同字符，且长度的乘积最大。
 *
 * 示例 2:
 * 输入: words = ["a","ab","abc","d","cd","bcd","abcd"]
 * 输出: 4
 * 解释: 这两个单词为 "ab", "cd"。
 *
 * 示例 3:
 * 输入: words = ["a","aa","aaa","aaaa"]
 * 输出: 0
 * 解释: 不存在这样的两个单词。
 *
 * 提示：
 * 2 <= words.length <= 1000
 * 1 <= words[i].length <= 1000
 * words[i] 仅包含小写字母
 *
 * 注意：本题与主站 318 题相同：https://leetcode-cn.com/problems/maximum-product-of-word-lengths/
 */
public class MaximumProductWordLengths {
    /**
     * 方法：位运算
     * @param words
     * @return
     */
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] state = new int[n];
        //将字符串二进制化
        for (int i = 0; i < words.length; i++) {
            int mode = 0;
            for (int j = 0; j < words[i].length(); ++j){
                mode |= (1 << (words[i].charAt(j)-'a'));
            }
            state[i] = mode;
        }

        int ans = 0;
        for (int i = 0; i < state.length; i++) {
            for (int j = i+1; j < state.length; j++) {
                //等于0说明两者不同
                if ((state[i] & state[j]) == 0){
                    int temp = words[i].length() * words[j].length();
                    ans = Math.max(ans,temp);
                }
            }
        }
        return ans;
    }
}
