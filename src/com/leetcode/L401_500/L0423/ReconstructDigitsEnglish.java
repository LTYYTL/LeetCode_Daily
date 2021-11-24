package com.leetcode.L401_500.L0423;

import java.util.HashMap;
import java.util.Map;

/**
 * 423. 从英文中重建数字
 * 给你一个字符串 s ，其中包含字母顺序打乱的用英文单词表示的若干数字（0-9）。按 升序 返回原始的数字。
 *
 * 示例 1：
 * 输入：s = "owoztneoer"
 * 输出："012"
 *
 * 示例 2：
 * 输入：s = "fviefuro"
 * 输出："45"
 *
 * 提示：
 * 1 <= s.length <= 105
 * s[i] 为 ["e","g","f","i","h","o","n","s","r","u","t","w","v","x","z"] 这些字符之一
 * s 保证是一个符合题目要求的字符串
 */
public class ReconstructDigitsEnglish {
    /**
     * 方法：map映射
     * @param s
     * @return
     */
    public String originalDigits(String s) {
        //记录每个字母出现的次数
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //记录每个数字的次数
        int[] cnt = new int[10];
        //z只出现在zero中，所以z的次数是0出现的次数
        cnt[0]  = map.getOrDefault('z',0);
        //w只出现在two中，所以w的次数是2出现的次数
        cnt[2]  = map.getOrDefault('w',0);
        //u只出现在four中，所以u的次数是4出现的次数
        cnt[4]  = map.getOrDefault('u',0);
        //x只出现在six中，所以x的次数是6出现的次数
        cnt[6]  = map.getOrDefault('x',0);
        //g只出现在eight中，所以g的次数是8出现的次数
        cnt[8]  = map.getOrDefault('g',0);
        //h只出现在three、eight中，eight的数量已经确定，所以h的次数-eight的次数是3出现的次数
        cnt[3]  = map.getOrDefault('h',0) - cnt[8];
        //f只出现在four、five中，four的数量已经确定，所以f的次数-four的次数是5出现的次数
        cnt[5]  = map.getOrDefault('f',0) - cnt[4];
        //s只出现在six、seven中，six的数量已经确定，所以s的次数-six的次数是7出现的次数
        cnt[7]  = map.getOrDefault('s',0) - cnt[6];
        //o只出现在zero、one、two、four中，zero、two、four的数量已经确定，所以o的次数-zero的次数-two的次数-four的次数是1出现的次数
        cnt[1]  = map.getOrDefault('o',0) - cnt[0] - cnt[2] - cnt[4];
        //i只出现在five、six、eight、nine中，five、six、eight的数量已经确定，所以i的次数-five的次数-six的次数-eight的次数是9出现的次数
        cnt[9]  = map.getOrDefault('i',0) - cnt[5] - cnt[6] - cnt[8];

        //结果
        StringBuilder res = new StringBuilder();
        //遍历
        for (int i = 0; i < 10; i++) {
            //遍历数字次数
            for (int j = 0; j < cnt[i]; j++) {
                res.append(i);
            }
        }

        return res.toString();
    }
}
