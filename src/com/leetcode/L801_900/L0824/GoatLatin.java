package com.leetcode.L801_900.L0824;

/**
 * 824. 山羊拉丁文
 * 给你一个由若干单词组成的句子 sentence ，单词间由空格分隔。每个单词仅由大写和小写英文字母组成。
 * 请你将句子转换为 “山羊拉丁文（Goat Latin）”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。山羊拉丁文的规则如下：
 *
 * (1)如果单词以元音开头（'a', 'e', 'i', 'o', 'u'），在单词后添加"ma"。
 * 例如，单词 "apple" 变为 "applema" 。
 * (2)如果单词以辅音字母开头（即，非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词 "goat" 变为 "oatgma" 。
 * (3)根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从 1 开始。
 * 例如，在第一个单词后添加 "a" ，在第二个单词后添加 "aa" ，以此类推。
 * 返回将 sentence 转换为山羊拉丁文后的句子。
 *
 * 示例 1：
 * 输入：sentence = "I speak Goat Latin"
 * 输出："Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 *
 * 示例 2：
 * 输入：sentence = "The quick brown fox jumped over the lazy dog"
 * 输出："heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 *
 * 提示：
 * 1 <= sentence.length <= 150
 * sentence 由英文字母和空格组成
 * sentence 不含前导或尾随空格
 * sentence 中的所有单词由单个空格分隔
 */
public class GoatLatin {
    /**
     * 方法：模拟
     * @param sentence
     * @return
     */
    public String toGoatLatin(String sentence) {
        //按空格分割
        String[] arr = sentence.split(" ");
        //结果
        StringBuilder ans = new StringBuilder();
        //遍历
        for (int i = 0; i < arr.length; i++) {
            //转换成小写
            String s = arr[i].toLowerCase();
            //临时字符串
            StringBuilder res = new StringBuilder();
            //元音字母情况
            if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
                res.append(arr[i]);
                res.append("ma");
            }else{//非元音
                res.append(arr[i].substring(1));
                res.append(arr[i].charAt(0));
                res.append("ma");
            }
            //加入a的个数，从1开始
            res.append("a".repeat(i + 1));
            //加入集合
            ans.append(res);
            //不是最后一个需要加“ ”
            if (i != arr.length-1)
                ans.append(" ");
        }
        return ans.toString();
    }
}
