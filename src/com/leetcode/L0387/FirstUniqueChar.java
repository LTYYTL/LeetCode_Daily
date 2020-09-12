package com.leetcode.L0387;

import java.util.HashMap;
import java.util.Map;

/**
 * 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 示例1：
 * s = "leetcode"
 * 返回 0
 *
 * 示例2：
 * s = "loveleetcode"
 * 返回 2
 *
 * 提示：你可以假定该字符串只包含小写字母。
 */
public class FirstUniqueChar {

    /**
     * 方法一：Map法
     * 1、用map记录每个字符出现的次数
     * 2、从前往后遍历字符串，在map中找寻首个只出现一次的字符
     *
     * @param s 字符串
     * @return 首次出现的唯一字符的索引
     */
    public int firstUniqChar(String s) {
        //用于记录每个字符出现的次数，key为字符，value为次数
        Map<Character,Integer> map = new HashMap<>();
        //遍历字符串，记录字符出现次数
        for (char c: s.toCharArray()) {
            //判断是否已存在map中
            if (map.containsKey(c)){
                //存在，次数+1
                map.put(c,map.get(c)+1);
            }else {
                //不存在，记录出现1次
                map.put(c,1);
            }
        }
        //从前往后遍历字符串，在map中找寻首个只出现一次的字符
        for (int i = 0; i < s.length(); i++){
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        //没有这样的字符返回-1
        return -1;
    }

    /**
     * 方法二：Array数组记录
     * 1、用数组记录每个字符出现的次数
     * 2、从前往后遍历字符串，在数组中找寻首个只出现一次的字符
     *
     * @param s 字符串
     * @return 首次出现的唯一字符的索引
     */
    public int firstUniqChar_Array(String s) {
        //有26个字母，用长为26的数组记录每个字符出现的次数
        int[] array = new int[26];
        //遍历字符串，记录字符出现次数
        for (char c: s.toCharArray()) {
            array[c-'a']++;
        }
        //从前往后遍历字符串，在数组中找寻首个只出现一次的字符
        for (int i = 0; i < s.length(); i++){
            if (array[s.charAt(i)-'a']  == 1)
                return i;
        }
        //没有这样的字符返回-1
        return -1;
    }

    /**
     * 方法三：索引位置比较
     * 根据字符在首次出现的位置和最后一次出现的位置判断
     * @param s
     * @return
     */
    public int firstUniqChar_appearIndex(String s) {
        //遍历字符串的每个字符
        for (int i =0; i < s.length(); i++){
            //当前字符
            char c = s.charAt(i);
            //字符第一次出现的位置索引
            int firstIndex = s.indexOf(c);
            //字符最一次出现的位置索引
            int lastIndex = s.lastIndexOf(c);
            //首次和最后一次都是同一位置说明在字符串中只会出现一次
            if (firstIndex == lastIndex)
                return i;
        }
        return -1;
    }
}
