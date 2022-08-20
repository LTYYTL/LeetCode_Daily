package com.offerII.L085;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer II 085. 生成匹配的括号
 * 正整数 n 代表生成括号的对数，请设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 示例 1：
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 *
 * 示例 2：
 * 输入：n = 1
 * 输出：["()"]
 *
 * 提示：
 * 1 <= n <= 8
 *
 * 注意：本题与主站 22 题相同： <a href="https://leetcode-cn.com/problems/generate-parentheses/">https://leetcode-cn.com/problems/generate-parentheses/</a>
 */
public class GenerateParentheses {
    /**
     * 方法：回溯算法
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        //记录所有组合
        List<String> res = new ArrayList<>();
        //记录回溯的过程中的路径
        StringBuilder path = new StringBuilder();
        backtrack(n,n,path,res);
        return res;
    }

    private void backtrack(int left, int right, StringBuilder path, List<String> res) {
        //若左括号剩的少，说明不合法
        if (left > right)
            return;
        //数量小于0，肯定是不合法的
        if (left < 0 || right < 0)
            return;
        //当所有括号都用完，得到一个合法的括号组合
        if (left == 0 && right == 0){
            res.add(path.toString());
            return;
        }
        //尝试添加一个左括号
        path.append("(");//选择
        backtrack(left-1, right, path, res);
        path.deleteCharAt(path.length()-1);//撤销

        //尝试添加一个右括号
        path.append(")");//选择
        backtrack(left, right-1, path, res);
        path.deleteCharAt(path.length()-1);//撤销


    }
}
