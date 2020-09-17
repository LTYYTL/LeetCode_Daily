package com.leetcode.L0796;

import java.util.Arrays;

/**
 * 796. 旋转字符串
 * 给定两个字符串, A 和 B。
 * A 的旋转操作就是将 A 最左边的字符移动到最右边。
 * 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后，A 能变成B，那么返回True。
 *
 * 示例 1:
 * 输入: A = 'abcde', B = 'cdeab'
 * 输出: true
 *
 * 示例 2:
 * 输入: A = 'abcde', B = 'abced'
 * 输出: false
 *
 * 注意：
 * A 和 B 长度不超过 100。
 */
public class RotateString {
    /**
     * 方法一：暴力法
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString(String A, String B) {
        int Alen = A.length();
        //A、B均为空字符串
        if (A.equals("")  && B.equals(""))
            return true;
        //循环字符串A一周
        for (int i = 0; i < Alen; i++){
            //字符串A的第一个字符
            String first = A.substring(0,1);
            //字符串A除第一个字符以外的剩下字符
            String end = A.substring(1,Alen);
            //重新拼接A
            A = end + first;
            //判断当前的A与字符串B是否相等
            if (A.equals(B))
                return true;
        }
        return false;
    }

    /**
     * 无论它怎样旋转，最终的 A + A包含了所有可以通过旋转操作从 A 得到的字符串，
     * 即：只需要判断 B 是否为 A + A 的子串就可以了
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString_conversion(String A, String B) {

        return A.length() == B.length()  && (A+A).contains(B);
    }

    /**
     * 需要判断 B 是否为 A + A 的子串,可用字符串匹配算法kmp
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString_kmp(String A, String B){
        //A、B均为空字符串
        if (A.equals("")  && B.equals(""))
            return true;
        //重新拼接A
        A = A + A;
        //调用kmp算法，返回成功匹配的起始索引位置
        int index = kmp(A,B);
        //没有匹配成功证明没有存在
        if (index == -1)
            return false;
        return true;
    }

    /**
     * kmp算法
     * @param haystack 目标串
     * @param needle   模式串
     * @return 匹配的起始索引位置
     */
    private int kmp(String haystack, String needle) {
        //获得next[]
        int[] next = getNext(needle);
        //指向模式串的指针
        int j = 0;
        //主循环，遍历主字符串
        for (int i = 0; i < haystack.length(); i++){
            if (j==-1 || haystack.charAt(i) == needle.charAt(j)){
                j++;
            }else {
                //遇到坏字符串，查询next数组并改变模拟串起点
                j = next[j];
            }
            if (j == needle.length()){
                //匹配成功，返回下标
                return i - j + 1;
            }
        }

        return -1;
    }

    /**
     * 获得next[]数组
     * @param needle 模式串
     * @return
     */
    private int[] getNext(String needle) {
        int[] next = new int[needle.length()];
        char[] chars = needle.toCharArray();
        int j = 0;
        //部分匹配表
        for (int i = 1; i < needle.length(); i++){

            while (j!=0 &&  chars[i] != chars[j]){
                j = next[j-1];
            }
            if(chars[j] == chars[i]){
                j++;
            }
            next[i] = j;
        }
        //匹配表
        for(int i = next.length-1; i > 0; i--){
            next[i] = next[i-1];
        }
        next[0] = -1;
        return next;
    }
}
