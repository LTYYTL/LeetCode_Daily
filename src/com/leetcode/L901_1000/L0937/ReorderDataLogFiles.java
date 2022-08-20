package com.leetcode.L901_1000.L0937;

import java.util.ArrayList;
import java.util.List;

/**
 * 937. 重新排列日志文件
 * 给你一个日志数组 logs。每条日志都是以空格分隔的字串，其第一个字为字母与数字混合的 标识符 。
 * <p>
 * 有两种不同类型的日志：
 * (1)字母日志：除标识符之外，所有字均由小写字母组成
 * (2)数字日志：除标识符之外，所有字均由数字组成
 * <p>
 * 请按下述规则将日志重新排序：
 * (1)所有 字母日志 都排在 数字日志 之前。
 * (2)字母日志 在内容不同时，忽略标识符后，按内容字母顺序排序；在内容相同时，按标识符排序。
 * (2)数字日志 应该保留原来的相对顺序。
 * 返回日志的最终顺序。
 * <p>
 * 示例 1：
 * 输入：logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
 * 输出：["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
 * 解释：
 * 字母日志的内容都不同，所以顺序为 "art can", "art zero", "own kit dig" 。
 * 数字日志保留原来的相对顺序 "dig1 8 1 5 1", "dig2 3 6" 。
 * <p>
 * 示例 2：
 * 输入：logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * 输出：["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 * <p>
 * 提示：
 * 1 <= logs.length <= 100
 * 3 <= logs[i].length <= 100
 * logs[i] 中，字与字之间都用 单个 空格分隔
 * 题目数据保证 logs[i] 都有一个标识符，并且在标识符之后至少存在一个字
 */
public class ReorderDataLogFiles {
    /**
     * 方法：排序
     *
     * @param logs
     * @return
     */
    public String[] reorderLogFiles(String[] logs) {
        //存储字母字符串
        List<String> strList = new ArrayList<>();
        //存储数字字符串
        List<String> numList = new ArrayList<>();
        //遍历
        for (String log : logs) {
            //获取内容
            String s = log.substring(log.indexOf(' ')).trim();
            //判断内容是数字还是字母
            if (Character.isDigit(s.charAt(0)))
                numList.add(log);
            else
                strList.add(log);
        }

        //排序
        strList.sort((o1, o2) -> {
            //将字符串分成标识符和内容
            String[] s1 = o1.split(" ", 2);
            String[] s2 = o2.split(" ", 2);
            //内容相等
            if (s1[1].compareTo(s2[1]) == 0)
                //按照标识符排序
                return s1[0].compareTo(s2[0]);
            return s1[1].compareTo(s2[1]);
        });

        //结果集
        String[] res = new String[logs.length];
        //遍历
        for (int i = 0; i < res.length; i++) {
            //遍历字母字符串集合
            for (String s : strList) {
                res[i++] = s;
            }
            //遍历数字字符串集合
            for (String s : numList) {
                res[i++] = s;
            }
        }

        return res;
    }
}
