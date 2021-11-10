package com.offerII.L117;

import com.util.UF;

/**
 * 剑指 Offer II 117. 相似的字符串
 * 如果交换字符串 X 中的两个不同位置的字母，使得它和字符串 Y 相等，那么称 X 和 Y 两个字符串相似。如果这两个字符串本身是相等的，那它们也是相似的。
 * 例如，"tars" 和 "rats" 是相似的 (交换 0 与 2 的位置)； "rats" 和 "arts" 也是相似的，但是 "star" 不与 "tars"，"rats"，或 "arts" 相似。
 * 总之，它们通过相似性形成了两个关联组：{"tars", "rats", "arts"} 和 {"star"}。注意，"tars" 和 "arts" 是在同一组中，即使它们并不相似。
 * 形式上，对每个组而言，要确定一个单词在组中，只需要这个词和该组中至少一个单词相似。
 * 给定一个字符串列表 strs。列表中的每个字符串都是 strs 中其它所有字符串的一个 字母异位词 。请问 strs 中有多少个相似字符串组？
 * 字母异位词（anagram），一种把某个字符串的字母的位置（顺序）加以改换所形成的新词。
 *
 * 示例 1：
 * 输入：strs = ["tars","rats","arts","star"]
 * 输出：2
 *
 * 示例 2：
 * 输入：strs = ["omv","ovm"]
 * 输出：1
 *
 * 提示：
 * 1 <= strs.length <= 300
 * 1 <= strs[i].length <= 300
 * strs[i] 只包含小写字母。
 * strs 中的所有单词都具有相同的长度，且是彼此的字母异位词。
 *
 * 注意：本题与主站 839 题相同：https://leetcode-cn.com/problems/similar-string-groups/
 */
public class SimilarStringGroups {
    /**
     * 方法：并查集
     * @param strs
     * @return
     */
    public int numSimilarGroups(String[] strs) {
        //长度
        int n = strs.length;
        //构建并查集
        UF uf = new UF(n);
        //遍历
        for (int i = 0; i < strs.length; i++) {
            for (int j = i+1; j < strs.length; j++) {
                String s1 = strs[i];
                String s2 = strs[j];
                //查看两个字符串是否符合条件，不在同一个集中，并且两个字符串交换两个字母就一样
                if (!uf.connected(i,j) && check(s1,s2))
                    uf.union(i,j);
            }
        }
        //连通性
        return uf.getCount();
    }

    /**
     * 判断两个字符串是否符合条件，因为是等长字母异位词，所以有两个位置字母不一样证明满足条件
     * @param s1
     * @param s2
     * @return
     */
    private boolean check(String s1, String s2) {
        //记录不同的字母数
        int num = 0;
        //遍历
        for (int i = 0; i < s1.length(); i++) {
            //不同
            if (s1.charAt(i) != s2.charAt(i)){
                //计数
                num++;
                //超过三位不同不满足条件
                if (num > 2)
                    return false;
            }
        }
        return true;
    }
}
