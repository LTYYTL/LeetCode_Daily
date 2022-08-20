package com.leetcode.L101_200.L0125;

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 *
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class ValidPalindrome {
    /**
     * 方法一：双指针 + 正则表达式
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        //将字符串s的大写变小写，用正则表达式去除字符串s中无关字符
        s = s.toLowerCase().replaceAll("[^\\da-z]", "");
        //将字符串转换成char[]
        char[] chars = s.toCharArray();
        //头指针
        int i = 0;
        //尾指针
        int j = s.length()-1;
        //同时移动两个指针，直到j<=i
        while (i < j){
            //判断i位置和j位置的字符是否相同
            if (chars[i] != chars[j])
                return false;
            //头指针向后移动
            i++;
            //尾指针向前移动
            j--;
        }
        return true;
    }

    /**
     * 方法二：双指针
     * @param s
     * @return
     */
    public boolean isPalindrome_none(String s) {
        //将字符串s的大写变小写，
        s = s.toLowerCase();
        //将字符串转换成char[]
        char[] c = s.toCharArray();
        //头指针
        int i = 0;
        //尾指针
        int j = s.length()-1;
        //同时移动两个指针，直到j<=i
        while (i < j){
            //跳过无关字符
            if (!((c[i] >= '0' && c[i] <= '9') || (c[i] >= 'a' && c[i] <= 'z'))) {
                i++;
                continue;
            }
            //跳过无关字符
            if (!((c[j] >= '0' && c[j] <= '9') || (c[j] >= 'a' && c[j] <= 'z'))) {
                j--;
                continue;
            }
            //判断i位置和j位置的字符是否相同
            if(c[i] != c[j]){
                return false;
            }
            //头指针向后移动
            i++;
            //尾指针向前移动
            j--;
        }
        return true;
    }
}
