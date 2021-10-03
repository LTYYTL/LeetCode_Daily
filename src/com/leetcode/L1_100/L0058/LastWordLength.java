package com.leetcode.L1_100.L0058;

/**
 * 58. 最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
 * 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 *
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 */
public class LastWordLength {
    /**
     * 方法：暴力法
     * 从后往前遍历找到最后单词前面的空格的位置，即从此位置之后为最后一个单词
     * 注：结尾处仍然可能有空格。
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        //空值情况
        if (s == null || s.length() == 0)
            return 0;
        //记录长度
        int count = 0;
        //从后往前遍历
        for (int i = s.length()-1; i >= 0; i--){
            //判断当前位置是否为空格
            if (s.charAt(i) == ' '){
                //是末尾空格就继续循环，否则跳出
                if (count == 0)
                    continue;
                break;
            }
            //不是空格的情况
            count++;
        }
        return count;
    }

    /**
     * 应用trim(),去除末尾空格
     * @param s
     * @return
     */
    public int lengthOfLastWord_trim(String s) {
        //空值情况
        if (s == null || s.length() == 0)
            return 0;
        //去除两边空格
        s = s.trim();
        //从尾部开始找到第一个出现空格的位置，+1指的是最后一个单词的第一个字母出现的位置
        int start = s.lastIndexOf(" ") + 1;
        //截取从第一个字母到末尾的字符串，返回长度
        return s.substring(start).length();
    }

    /**
     * 应用split()改成数组，取最后一个，即为最后一个单词
     * @param s
     * @return
     */
    public int lengthOfLastWord_split(String s) {
        //空值情况
        if (s == null || s.length() == 0)
            return 0;
        //根据空格截取成数组
        String[] words = s.split(" ");
        if (words.length < 1)
            return 0;
        //取最后一个，即为最后一个单词
        return words[words.length - 1].length();
    }
}
