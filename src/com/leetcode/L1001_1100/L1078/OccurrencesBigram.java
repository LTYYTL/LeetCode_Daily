package com.leetcode.L1001_1100.L1078;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078. Bigram 分词
 * 给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，其中 second 紧随 first 出现，third 紧随 second 出现。
 * 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。
 *
 * 示例 1：
 * 输入：text = "alice is a good girl she is a good student", first = "a", second = "good"
 * 输出：["girl","student"]
 *
 * 示例 2：
 *
 * 输入：text = "we will we will rock you", first = "we", second = "will"
 * 输出：["we","rock"]
 *
 *
 * 提示：
 *
 * 1 <= text.length <= 1000
 * text 由小写英文字母和空格组成
 * text 中的所有单词之间都由 单个空格字符 分隔
 * 1 <= first.length, second.length <= 10
 * first 和 second 由小写英文字母组成
 */
public class OccurrencesBigram {
    /**
     * 方法：模拟
     * @param text
     * @param first
     * @param second
     * @return
     */
    public String[] findOcurrences(String text, String first, String second) {
        //存储单词
        List<String> list = new ArrayList<>();
        //按照空格切分
        String[] data = text.split(" ");
        //指针
        int i = 0;
        //遍历
        while (i+2 < data.length){
            //第一个单词
            String a = data[i];
            //第二个单词
            String b = data[i+1];
            //两个单词都满足
            if (first.equals(a) && second.equals(b)){
                //加入随后的单词
                list.add(data[i+2]);
            }
            //指针向后移动
            i++;
        }
        //转换成字符串数组
        String[] res = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            res[j] = list.get(j);
        }
        return res;
    }
}
