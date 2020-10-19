package com.leetcode.L0844;

import java.util.Collections;
import java.util.Stack;

/**
 * 844. 比较含退格的字符串
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 * 示例 1：
 * 输入：S = "ab#c", T = "ad#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “ac”。
 *
 * 示例 2：
 * 输入：S = "ab##", T = "c#d#"
 * 输出：true
 * 解释：S 和 T 都会变成 “”。
 *
 * 示例 3：
 * 输入：S = "a##c", T = "#a#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “c”。
 *
 * 示例 4：
 * 输入：S = "a#c", T = "b"
 * 输出：false
 * 解释：S 会变成 “c”，但 T 仍然是 “b”。
 *
 * 提示：
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S 和 T 只含有小写字母以及字符 '#'。
 *
 * 进阶：
 * 你可以用 O(N) 的时间复杂度和 O(1) 的空间复杂度解决该问题吗？
 */
public class BackspaceStringCompare {
    /**
     * 方法一：暴力法
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompare(String S, String T) {
        //将字符串改变成无后退符的字符串
        S = change(S);
        T = change(T);
        //字符串长度不一样，一定不相等
        if (S.length() != T.length())
            return false;
        //判断两个字符串每一位是否都相等
        for (int i = 0; i < S.length(); ++i){
            if (S.charAt(i) != T.charAt(i))
                return false;
        }
        return true;
    }

    /**
     * 字符串改造
     * @param str
     * @return
     */
    private String change(String str) {
        StringBuilder res = new StringBuilder();
        //字符串变成char数组
        char[] chars = str.toCharArray();
        //遍历每一个字符
        for (int i = 0; i < chars.length; ++i){
            //当前位置为‘#’并且临时字符串不为空时，后退一个字符即删除最后一位
            if(chars[i] == '#' && res.length()!=0)
                res.deleteCharAt(res.length()-1);
            else if (chars[i] != '#')//当前位置不为‘#’时，直接加入临时字符串
                res.append(chars[i]);
        }
        return res.toString();
    }

    /**
     * 方法一：栈
     * @param S
     * @param T
     * @return
     */
    public boolean backspaceCompare_stack(String S, String T) {
        //将字符串改变成无后退符的字符串
        S = change(S);
        T = change(T);
        //字符串长度不一样，一定不相等
        if (S.length() != T.length())
            return false;
        //判断两个字符串每一位是否都相等
        for (int i = 0; i < S.length(); ++i){
            if (S.charAt(i) != T.charAt(i))
                return false;
        }
        return true;
    }

    /**
     * 利用栈改造字符串
     * @param str
     * @return
     */
    private String change_stack(String str) {
        Stack<Character> res = new Stack<>();
        //字符串变成char数组
        char[] chars = str.toCharArray();
        //遍历每一个字符
        for (int i = 0; i < chars.length; ++i){
            //当前位置为‘#’并且栈不为空，弹出栈顶元素
            if(chars[i] == '#' && res.size()!=0)
                res.pop();
            else if (chars[i] != '#')//当前位置不为‘#’时，压入栈
                res.push(chars[i]);
        }
        //反转栈
        Collections.reverse(res);
        return res.toString();
    }
}
