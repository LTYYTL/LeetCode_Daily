package com.leetcode.L501_600.L0522;

/**
 * 522. 最长特殊序列 II
 * 给定字符串列表 strs ，返回其中 最长的特殊序列 。如果最长特殊序列不存在，返回 -1 。
 * 特殊序列 定义如下：该序列为某字符串 独有的子序列（即不能是其他字符串的子序列）。
 * s 的 子序列可以通过删去字符串 s 中的某些字符实现。
 * 例如，"abc" 是 "aebdc" 的子序列，因为您可以删除"aebdc"中的下划线字符来得到 "abc" 。"aebdc"的子序列还包括"aebdc"、 "aeb" 和 "" (空字符串)。
 * <p>
 * 示例 1：
 * 输入: strs = ["aba","cdc","eae"]
 * 输出: 3
 * <p>
 * 示例 2:
 * 输入: strs = ["aaa","aaa","aa"]
 * 输出: -1
 * <p>
 * 提示:
 * 2 <= strs.length <= 50
 * 1 <= strs[i].length <= 10
 * strs[i] 只包含小写英文字母
 */
public class LongUncommonSubII {
    /**
     * 方法：双指针
     *
     * @param strs
     * @return
     */
    public int findLUSlength(String[] strs) {
        //长度
        int n = strs.length;
        //结果
        int ans = -1;
        //遍历
        for (int i = 0; i < n; ++i) {
            //标志
            boolean check = true;
            //遍历
            for (int j = 0; j < n; ++j) {
                //不是同一个字符串，并且不是另一个字符串的子串
                if (i != j && isSubseq(strs[i], strs[j])) {
                    //改变标志
                    check = false;
                    break;
                }
            }
            //标志为真
            if (check) {
                //记录最长字符串
                ans = Math.max(ans, strs[i].length());
            }
        }
        return ans;
    }

    public boolean isSubseq(String s, String t) {
        //双指针
        int ptS = 0, ptT = 0;
        while (ptS < s.length() && ptT < t.length()) {
            if (s.charAt(ptS) == t.charAt(ptT)) {
                ++ptS;
            }
            ++ptT;
        }
        return ptS == s.length();
    }
}
