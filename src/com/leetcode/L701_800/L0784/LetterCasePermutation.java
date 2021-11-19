package com.leetcode.L701_800.L0784;

import java.util.ArrayList;
import java.util.List;

/**
 * 784. 字母大小写全排列
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 *
 * 示例：
 * 输入：S = "a1b2"
 * 输出：["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * 输入：S = "3z4"
 * 输出：["3z4", "3Z4"]
 *
 * 输入：S = "12345"
 * 输出：["12345"]
 *
 * 提示：
 * S 的长度不超过12。
 * S 仅由数字和字母组成。
 */
public class LetterCasePermutation {
    /**
     * 方法：回溯算法
     * @param s
     * @return
     */
    public List<String> letterCasePermutation(String s) {
        //结果集
        List<String> res = new ArrayList<>();
        //空串
        if (s == "")
            return res;
        //模拟栈
        StringBuilder path = new StringBuilder();
        //深度优先搜索
        dfs(s,0,path,res);

        return res;
    }

    /**
     * 深度优先搜索
     * @param s
     * @param begin
     * @param path
     * @param res
     */
    private void dfs(String s, int begin, StringBuilder path, List<String> res) {
        //长度相等时加入结果集
        if (path.length() == s.length()){
            res.add(path.toString());
            return;
        }
        //遍历
        for (int j = begin; j < s.length(); j++) {
            //当前字符
            char c = s.charAt(j);
            //放入路径
            path.append(c);
            //深度优先搜索
            dfs(s, j+1, path, res);
            //退出路径
            path.deleteCharAt(path.length()-1);

            //判断当前字符是不是字母
            if (c >= 'a' && c <= 'z'){
                //取出当前字符的大写字母
                char d = s.toUpperCase().charAt(j);
                path.append(d);
                dfs(s, j+1, path, res);
                path.deleteCharAt(path.length()-1);
            }else if (c >= 'A' && c <= 'Z'){
                //取出当前字符的小写字母
                char d = s.toLowerCase().charAt(j);
                path.append(d);
                dfs(s, j+1, path, res);
                path.deleteCharAt(path.length()-1);
            }
        }
    }
}
