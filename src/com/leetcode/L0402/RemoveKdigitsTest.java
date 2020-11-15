package com.leetcode.L0402;

public class RemoveKdigitsTest {
    public static void main(String[] args) {
        RemoveKDigits removeKDigits = new RemoveKDigits();
        /*** 示例 1 :
         * 输入: num = "1432219", k = 3
         * 输出: "1219"
         * 解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
         */
        System.out.println(removeKDigits.removeKdigits("1432219",3));
        /**
         * 示例 2 :
         * 输入: num = "10200", k = 1
         * 输出: "200"
         * 解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
         */
        System.out.println(removeKDigits.removeKdigits("10200",1));
        /**
         * 示例 3 :
         * 输入: num = "10", k = 2
         * 输出: "0"
         */
        System.out.println(removeKDigits.removeKdigits("10",2));
    }
}
