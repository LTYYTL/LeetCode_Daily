package com.interview.L0807;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 面试题 08.07. 无重复字符串的排列组合
 * 无重复字符串的排列组合。编写一种方法，计算某字符串的所有排列组合，字符串每个字符均不相同。
 *
 * 示例1:
 *  输入：S = "qwe"
 *  输出：["qwe", "qew", "wqe", "weq", "ewq", "eqw"]
 *
 * 示例2:
 *  输入：S = "ab"
 *  输出：["ab", "ba"]
 *
 * 提示:
 * 字符都是英文字母。
 * 字符串长度在[1, 9]之间。
 */
public class Permutation {
    /**
     * 方法：回溯算法
     * @param S
     * @return
     */
    public String[] permutation(String S) {
        //结果集
        List<String> res = new ArrayList<>();
        //模拟栈
        StringBuilder path = new StringBuilder();
        //深度优先搜索
        dfs(S, path, new HashSet<>(), res);
        //转换成数组
        String[] arr = new String[res.size()];
        return res.toArray(arr);
    }

    /**
     * 方法：深度优先搜索
     * @param s
     * @param path
     * @param set
     * @param res
     */
    private void dfs(String s, StringBuilder path, HashSet<Character> set, List<String> res) {
        //到结尾处将其加入结果集
        if (path.length() == s.length()){
            res.add(path.toString());
            return;
        }
        //遍历
        for (int i = 0; i < s.length(); i++) {
            //当前字符
            char c = s.charAt(i);
            //已经存在直接跳过
            if (set.contains(c))
                continue;
            //入栈
            path.append(c);
            //变成已访问
            set.add(c);
            //深度优先搜索
            dfs(s, path, set, res);
            //变成未访问
            set.remove(c);
            //出栈
            path.deleteCharAt(path.length()-1);
        }
    }
}
