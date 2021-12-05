package com.interview.L0808;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 08.08. 有重复字符串的排列组合
 * 有重复字符串的排列组合。编写一种方法，计算某字符串的所有排列组合。
 *
 * 示例1:
 *  输入：S = "qqe"
 *  输出：["eqq","qeq","qqe"]
 *
 * 示例2:
 *  输入：S = "ab"
 *  输出：["ab", "ba"]
 *
 * 提示:
 * 字符都是英文字母。
 * 字符串长度在[1, 9]之间。
 */
public class PermutationII {
    /**
     * 方法：回溯算法
     * @param S
     * @return
     */
    public String[] permutation(String S)  {
        //结果集
        Set<String> res = new HashSet<>();
        //模拟栈
        StringBuilder path = new StringBuilder();
        //深度优先搜索
        dfs(S,path,new boolean[S.length()],res);
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
    private void dfs(String s, StringBuilder path, boolean[] vis, Set<String> res) {
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
            if (vis[i])
                continue;
            //入栈
            path.append(c);
            //变成已访问
            vis[i] = true;
            //深度优先搜索
            dfs(s, path, vis, res);
            //变成未访问
            vis[i] = false;
            //出栈
            path.deleteCharAt(path.length()-1);
        }
    }
}
