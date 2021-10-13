package com.offerII.L018;

/**
 * 剑指 Offer II 018. 有效的回文
 * 给定一个字符串 s ，验证 s 是否是 回文串 ，只考虑字母和数字字符，可以忽略字母的大小写。
 * 本题中，将空字符串定义为有效的 回文串 。
 *
 * 示例 1:
 * 输入: s = "A man, a plan, a canal: Panama"
 * 输出: true
 * 解释："amanaplanacanalpanama" 是回文串
 *
 * 示例 2:
 * 输入: s = "race a car"
 * 输出: false
 * 解释："raceacar" 不是回文串
 *
 * 提示：
 * 1 <= s.length <= 2 * 105
 * 字符串 s 由 ASCII 字符组成
 *
 * 注意：本题与主站 125 题相同： https://leetcode-cn.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    /**
     * 方法：双指针
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        //将字符串s的大写变小写，用正则表达式去除字符串s中无关字符
        s = s.toLowerCase().replaceAll("[^0-9a-z]","");
        //头尾指针
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            //不等直接返回
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
}
