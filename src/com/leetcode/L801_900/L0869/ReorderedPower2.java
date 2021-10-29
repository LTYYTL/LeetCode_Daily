package com.leetcode.L801_900.L0869;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 869. 重新排序得到 2 的幂
 * 给定正整数 N ，我们按任何顺序（包括原始顺序）将数字重新排序，注意其前导数字不能为零。
 * 如果我们可以通过上述方式得到 2 的幂，返回 true；否则，返回 false。
 *
 * 示例 1：
 * 输入：1
 * 输出：true
 *
 * 示例 2：
 * 输入：10
 * 输出：false
 *
 * 示例 3：
 * 输入：16
 * 输出：true
 *
 * 示例 4：
 * 输入：24
 * 输出：false
 *
 * 示例 5：
 * 输入：46
 * 输出：true
 *
 * 提示：
 * 1 <= N <= 10^9
 */
public class ReorderedPower2 {
    boolean[] vis;

    /**
     * 方法：回溯算法
     * @param n
     * @return
     */
    public boolean reorderedPowerOf2(int n) {
        //转换成字符数组
        char[] chars = String.valueOf(n).toCharArray();
        //排序，便于剪枝
        Arrays.sort(chars);
        //记录字符是否使用
        vis = new boolean[chars.length];
        return backtrack(chars,0,0);
    }

    private boolean backtrack(char[] chars, int index, int num) {
        //组成数字
        if (index == chars.length)
            return isTwo(num);
        //遍历字符数组
        for (int i = 0; i < chars.length; i++) {
            // 不能有前导零或者被使用或者除去重复
            if ((num == 0 && chars[i] == '0') || vis[i] || (i > 0 && !vis[i - 1] && chars[i] == chars[i - 1])) {
                continue;
            }
            //改成使用
            vis[i] = true;
            //进入下一层
            if (backtrack(chars, index+1, num*10 + chars[i] - '0'))
                return true;
            //回退
            vis[i] = false;

        }
        return false;
    }

    /**
     * 判断是否是2的幂
     * @param n
     * @return
     */
    private boolean isTwo(int n){
        return ( n &(n-1) )== 0;
    }

    /**
     * 方法二：set集合
     * @param n
     * @return
     */
    Set<String> set = new HashSet<>();
    public boolean reorderedPowerOf2_set(int n){
        init();
        return set.contains(countDigits(n));
    }

    //所有2的幂数
    private void init() {
        for (int i = 1; i <= 1e9; i <<=1){
            set.add(countDigits(i));
        }
    }

    /**
     * 数字转换成字符数组，并将其变成字符串
     * @param n
     * @return
     */
    private String countDigits(int n) {
        char[] chars = new char[10];
        while (n > 0){
            ++chars[n%10];
            n /= 10;
        }
        return new String(chars);
    }
}
