package com.leetcode.L1001_1100.L1047;

import java.util.Stack;

/**
 * 1047. 删除字符串中的所有相邻重复项
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 *
 * 示例：
 * 输入："abbaca"
 * 输出："ca"
 * 解释：
 * 例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 *
 * 提示：
 * 1 <= S.length <= 20000
 * S 仅由小写英文字母组成。
 */
public class RemoveAllAdjacentDuplicatesString {
    /**
     * 方法：栈
     * @param S
     * @return
     */
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        //结果集
        StringBuffer res = new StringBuffer();
        //字符串长度
        int len = S.length();
        /*//将第一个元素压入栈
        stack.push(S.charAt(0));*/
        for (int i = 0; i < len; ++i){
            //获取当前位置字符
            char c = S.charAt(i);
            //如果栈为空，直接压入栈
            if (stack.isEmpty()){
                stack.push(c);
                continue;
            }
            //当前元素和栈顶相同时，将栈顶元素弹出
            //当前元素和栈顶不同时，将元素压入栈
            if (stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        //遍历栈
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }

        //将字符串反转
        return res.reverse().toString();
    }
}
