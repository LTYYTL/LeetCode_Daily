package com.leetcode.L1801_1900.L1859;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1859. 将句子排序
 * 一个 句子 指的是一个序列的单词用单个空格连接起来，且开头和结尾没有任何空格。每个单词都只包含小写或大写英文字母。
 * 我们可以给一个句子添加 从 1 开始的单词位置索引 ，并且将句子中所有单词 打乱顺序 。
 * 比方说，句子 "This is a sentence" 可以被打乱顺序得到 "sentence4 a3 is2 This1" 或者 "is2 sentence4 This1 a3" 。
 * 给你一个 打乱顺序 的句子 s ，它包含的单词不超过 9 个，请你重新构造并得到原本顺序的句子。
 *
 * 示例 1：
 * 输入：s = "is2 sentence4 This1 a3"
 * 输出："This is a sentence"
 * 解释：将 s 中的单词按照初始位置排序，得到 "This1 is2 a3 sentence4" ，然后删除数字。
 *
 * 示例 2：
 * 输入：s = "Myself2 Me1 I4 and3"
 * 输出："Me Myself and I"
 * 解释：将 s 中的单词按照初始位置排序，得到 "Me1 Myself2 and3 I4" ，然后删除数字。
 *
 * 提示：
 * 2 <= s.length <= 200
 * s 只包含小写和大写英文字母、空格以及从 1 到 9 的数字。
 * s 中单词数目为 1 到 9 个。
 * s 中的单词由单个空格分隔。
 * s 不包含任何前导或者后缀空格。
 */
public class SortingSentence {
    /**
     * 方法一：排序
     * @param s
     * @return
     */
    public String sortSentence(String s) {
        //按照“ ”将字符串拆分
        String[] strings = s.split(" ");
        //按照数字排序
        Arrays.sort(strings,(o1,o2)->o1.charAt(o1.length()-1)-o2.charAt(o2.length()-1));
        //结果字符串
        StringBuilder res = new StringBuilder();
        //遍历字符串数组
        for (String string : strings) {
            res.append(string.substring(0,string.length()-1));
            //添加空格
            res.append(" ");
        }
        //去除末尾的空格
        return res.substring(0,res.length()-1);
    }

    /**
     * 方法二：Map映射
     * @param s
     * @return
     */
    public String sortSentence_map(String s){
        StringBuilder res = new StringBuilder();
        //按照“ ”将字符串拆分
        String[] split = s.split(" ");
        //key:单词顺序
        //value：单词
        Map<Integer,String> map = new HashMap<>();
        for (String c : split) {
            int len = c.length();
            String key = c.substring(len-1);
            String value = c.substring(0,len -1);
            map.put(Integer.valueOf(key),value);
        }
        //拼接句子
        for (int i = 1; i <= map.size(); i++) {
            res.append(map.get(i));
            //最后一个不添加空格
            if (i != map.size())
                res.append(" ");
        }
        return res.toString();
    }

    /**
     * 方法三：数组
     * @param s
     * @return
     */
    public String sortSentence_array(String s) {
        String[] strs = s.split(" ");
        String[] res = new String[strs.length];

        for (String str : strs) {
            // 把数字字符('0'~'9')当做下标
            int num = str.charAt(str.length() - 1) - '0' - 1;
            // 保存单词
            res[num] = str.substring(0, str.length() - 1);
        }
        return String.join(" ", res);
    }
}
