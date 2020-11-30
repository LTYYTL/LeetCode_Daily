package com.leetcode.L0767;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 767. 重构字符串
 * 给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
 * 若可行，输出任意可行的结果。若不可行，返回空字符串。
 *
 * 示例 1:
 * 输入: S = "aab"
 * 输出: "aba"
 *
 * 示例 2:
 * 输入: S = "aaab"
 * 输出: ""
 *
 * 注意:
 * S 只包含小写字母并且长度在[1, 500]区间内。
 */
public class ReorganizeString {
    /**
     * 方法一：基于最大堆的贪心算法
     * @param S
     * @return
     */
    public String reorganizeString(String S) {
        //特殊情况
        if (S.length() < 2)
            return S;
        //记录每个字母出现次数
        int[] counts = new int[26];
        //出现最多的字母次数
        int maxCount = 0;
        int len = S.length();
        //遍历字符串记录每个字母出现的次数，找到最大的次数
        for (int i = 0; i < len; ++i){
            char c = S.charAt(i);
            counts[c - 'a']++;
            maxCount = Math.max(maxCount,counts[c - 'a']);
        }
        //最大次数比长度的一半还要大，肯定不能做到相同字母不相邻
        if (maxCount > (len + 1)/2)
            return "";

        //创建最大堆结构，根据出现次数排序
        PriorityQueue<Character> queue = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return counts[o2 - 'a'] - counts[o1 - 'a'];
            }
        });

        //构建最大堆
        for (char c = 'a';c<='z'; ++c){
            if (counts[c -'a'] > 0)
                queue.offer(c);
        }
        //结果字符串
        StringBuilder res = new StringBuilder();
        //遍历最大堆
        while(queue.size() > 1){
            //取堆顶的两个元素
            char c1 = queue.poll();
            char c2 = queue.poll();
            //加入字符串
            res.append(c1);
            res.append(c2);
            //计算字符位置
            int index1 = c1 - 'a';
            int index2 = c2 - 'a';
            //减去次数
            counts[index1]--;
            counts[index2]--;
            //字符没有用完，继续加入队列
            if (counts[index1] > 0)
                queue.offer(c1);
            if (counts[index2] > 0)
                queue.offer(c2);
        }
        //最后剩下的一个添加到字符串
        if (queue.size() > 0)
            res.append(queue.poll());

        return res.toString();
    }

    /**
     * 方法二：基于计数的贪心算法
     * @param S
     * @return
     */
    public String reorganizeString_count(String S){
        //把字符串S转化为字符数组
        char[] alphabetArr = S.toCharArray();
        //记录每个字符出现的次数
        int[] alphabetCount = new int[26];
        //字符串的长度
        int length = S.length();
        //统计每个字符出现的次数
        for (int i = 0; i < length; i++) {
            alphabetCount[alphabetArr[i] - 'a']++;
        }
        int max = 0, alphabet = 0, threshold = (length + 1) /2;
        //找出出现次数最多的那个字符
        for (int i = 0; i < alphabetCount.length; i++) {
            if (alphabetCount[i] > max) {
                max = alphabetCount[i];
                alphabet = i;
                //如果出现次数最多的那个字符的数量大于阈值，说明他不能使得
                // 两相邻的字符不同，直接返回空字符串即可
                if (max > threshold)
                    return "";
            }
        }
        //到这一步说明他可以使得两相邻的字符不同，我们随便返回一个结果，res就是返回
        //结果的数组形式，最后会再转化为字符串的
        char[] res = new char[length];
        int index = 0;
        //先把出现次数最多的字符存储在数组下标为偶数的位置上
        while (alphabetCount[alphabet]-- > 0) {
            res[index] = (char) (alphabet + 'a');
            index += 2;
        }
        //然后再把剩下的字符存储在其他位置上
        for (int i = 0; i < alphabetCount.length; i++) {
            while (alphabetCount[i]-- > 0) {
                if (index >= res.length) {
                    index = 1;
                }
                res[index] = (char) (i + 'a');
                index += 2;
            }
        }
        return new String(res);
    }
}
