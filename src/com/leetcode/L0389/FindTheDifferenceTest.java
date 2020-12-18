package com.leetcode.L0389;

public class FindTheDifferenceTest {
    public static void main(String[] args) {
        FindTheDifference findTheDifference = new FindTheDifference();
        /**
         * 示例 1：
         * 输入：s = "abcd", t = "abcde"
         * 输出："e"
         * 解释：'e' 是那个被添加的字母。
         */
        //方法一：哈希表
        System.out.println(findTheDifference.findTheDifference("abcd","abcde"));
        //方法二：求和
        System.out.println(findTheDifference.findTheDifference_sum("abcd","abcde"));
        //方法三：位运算
        System.out.println(findTheDifference.findTheDifference_XOR("abcd","abcde"));
        /**
         * 示例 2：
         * 输入：s = "", t = "y"
         * 输出："y"
         */
        //方法一：哈希表
        System.out.println(findTheDifference.findTheDifference("","y"));
        //方法二：求和
        System.out.println(findTheDifference.findTheDifference_sum("","y"));
        //方法三：位运算
        System.out.println(findTheDifference.findTheDifference_XOR("","y"));
    }
}
