package com.leetcode.L1801_1900.L1876;

/**
 * 1876. 长度为三且各字符不同的子字符串
 * 如果一个字符串不含有任何重复字符，我们称这个字符串为 好 字符串。
 * 给你一个字符串 s ，请你返回 s 中长度为 3 的 好子字符串 的数量。
 * 注意，如果相同的好子字符串出现多次，每一次都应该被记入答案之中。
 * 子字符串 是一个字符串中连续的字符序列。
 *
 * 示例 1：
 * 输入：s = "xyzzaz"
 * 输出：1
 * 解释：总共有 4 个长度为 3 的子字符串："xyz"，"yzz"，"zza" 和 "zaz" 。
 * 唯一的长度为 3 的好子字符串是 "xyz" 。
 *
 * 示例 2：
 * 输入：s = "aababcabc"
 * 输出：4
 * 解释：总共有 7 个长度为 3 的子字符串："aab"，"aba"，"bab"，"abc"，"bca"，"cab" 和 "abc" 。
 * 好子字符串包括 "abc"，"bca"，"cab" 和 "abc" 。
 *
 * 提示：
 * 1 <= s.length <= 100
 * s只包含小写英文字母。
 */

public class SubstringsSizeThreeDistinctCharacters {
    /**
     * 方法：双指针
     * @param s
     * @return
     */
    public int countGoodSubstrings(String s) {
        //特殊情况
        if (s.length()<3){
            return 0;
        }
        //结果集
        int res = 0;
        //指针
        int i = 0;
        int j = 1;
        int k = 2;

        while (k < s.length()){
            //判断三个字符是否存在相同项
            if (s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(k) && s.charAt(j) != s.charAt(k))
                res++;
            //移动指针
            i++;
            j++;
            k++;
        }
        return res;
    }
}
