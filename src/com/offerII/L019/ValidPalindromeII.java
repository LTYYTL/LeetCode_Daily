package com.offerII.L019;

/**
 * 剑指 Offer II 019. 最多删除一个字符得到回文
 * 给定一个非空字符串 s，请判断如果 最多 从字符串中删除一个字符能否得到一个回文字符串。
 *
 * 示例 1:
 * 输入: s = "aba"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "abca"
 * 输出: true
 * 解释: 可以删除 "c" 字符 或者 "b" 字符
 *
 * 示例 3:
 * 输入: s = "abc"
 * 输出: false
 *
 * 提示:
 * 1 <= s.length <= 105
 * s 由小写英文字母组成
 *
 * 注意：本题与主站 680 题相同： <a href="https://leetcode-cn.com/problems/valid-palindrome-ii/">https://leetcode-cn.com/problems/valid-palindrome-ii/</a>
 */
public class ValidPalindromeII {
    /**
     * 方法：双指针
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            char c = s.charAt(left);
            char d = s.charAt(right);
            //不等的情况，删除一个元素
            if (c != d){
                return validPalindrome(s,left+1,right) || validPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * 判断回文
     * @param s
     * @param left
     * @param right
     * @return
     */
    private boolean validPalindrome(String s, int left, int right) {
        while (left < right){
            char c = s.charAt(left++);
            char d = s.charAt(right--);
            if (c != d){
                return false;
            }
        }
        return true;
    }
}
