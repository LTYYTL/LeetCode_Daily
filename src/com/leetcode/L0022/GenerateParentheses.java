package com.leetcode.L0022;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 有效括号组合需满足：左括号必须以正确的顺序闭合。
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
 */
public class GenerateParentheses {
    /**
     * 方法：回溯算法
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        //特殊情况
        if (n == 0)
            return null;
        //记录所有组合
        List<String> res = new ArrayList<>();
        //记录回溯的过程中的路径
        StringBuilder path = new StringBuilder();
        backtrack(n,n,path,res);
        return res;
    }

    /**
     * 深度优先搜索
     * @param left
     * @param right
     * @param path
     * @param res
     */
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
