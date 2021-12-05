package com.leetcode.L1401_1500.L1446;

/**
 * 1446. 连续字符
 * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
 * 请你返回字符串的能量。
 *
 * 示例 1：
 * 输入：s = "leetcode"
 * 输出：2
 * 解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
 *
 * 示例 2：
 * 输入：s = "abbcccddddeeeeedcba"
 * 输出：5
 * 解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
 *
 * 示例 3：
 * 输入：s = "triplepillooooow"
 * 输出：5
 *
 * 示例 4：
 * 输入：s = "hooraaaaaaaaaaay"
 * 输出：11
 *
 * 示例 5：
 * 输入：s = "tourist"
 * 输出：1
 *
 * 提示：
 * 1 <= s.length <= 500
 * s 只包含小写英文字母。
 */
public class ConsecutiveCharacters {
    /**
     * 方法：双指针
     * @param s
     * @return
     */
    public int maxPower(String s) {
        //最大长度
        int max = 0;
        //双指针
        int left = 0;
        int right = 1;
        //转换成数组
        char[] chars = s.toCharArray();
        //遍历
        while (right < s.length()){
            //两个字符不等
            if (chars[left] != chars[right]){
                //获取最大长度
                max = Math.max(max,right-left);
                //改变指针位置
                left = right;
            }
            //指针后移
            right++;
        }
        //防止最后是连续的没有判断
        max = Math.max(max,right-left);
        return max;
    }

}
