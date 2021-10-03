package com.leetcode.L401_500.L0402;

import java.util.Stack;

/**
 * 402. 移掉K位数字
 * 给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。
 *
 * 注意:
 * num 的长度小于 10002 且 ≥ k。
 * num 不会包含任何前导零。
 *
 * 示例 1 :
 * 输入: num = "1432219", k = 3
 * 输出: "1219"
 * 解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
 *
 * 示例 2 :
 * 输入: num = "10200", k = 1
 * 输出: "200"
 * 解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
 *
 * 示例 3 :
 * 输入: num = "10", k = 2
 * 输出: "0"
 * 解释: 从原数字移除所有的数字，剩余为空就是0。
 */
public class RemoveKDigits {
    /**
     * 方法：栈
     * 解题思路：
     * 1、从左到右遍历，将每个元素加入到栈中
     * 2、对于遍历到的元素，我们选择保留，但是我们可以选择性丢弃前面相邻的元素。
     * 保留：当前元素左边没有元素或者比左边元素大
     * 丢弃：当前元素比左边元素小
     * @param num
     * @param k
     * @return
     */
    public String removeKdigits(String num, int k) {
        char[] chars = num.toCharArray();
        //空值情况
        if (k == chars.length){
            return "0";
        }
        if (k == 0){
            return num;
        }
        Stack<Character> stack = new Stack<>();
        //遍历数组
        for (char c:chars) {
            //移除元素
            while (!stack.isEmpty() && c < stack.peek() && k>0){
                stack.pop();
                k--;
            }
            //栈为空，且当前为0时，不加入栈
            if (stack.isEmpty() && c == '0'){
                continue;
            }
            stack.push(c);
        }
        //没有移除完成
        while (k > 0){
            stack.pop();
            k--;
        }
        if (stack.isEmpty()){
            return "0";
        }
        //反转并返回字符串
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
