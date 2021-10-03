package com.leetcode.L301_400.L0345;

/**
 * 345. 反转字符串中的元音字母
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1：
 * 输入："hello"
 * 输出："holle"
 *
 * 示例 2：
 * 输入："leetcode"
 * 输出："leotcede"
 *
 * 提示：
 * 元音字母不包含字母 "y" 。
 */
public class ReverseVowelsString {
    /**
     * 方法一：双指针
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        //长度
        int n = s.length();
        //转换成数组
        char[] arr = s.toCharArray();
        //双指针
        int i = 0, j = n - 1;
        while (i < j) {
            //从头找寻元音
            while (i < n && !isVowel(arr[i])) {
                ++i;
            }
            //从尾找寻元音
            while (j > 0 && !isVowel(arr[j])) {
                --j;
            }
            if (i < j) {
                swap(arr, i, j);
                ++i;
                --j;
            }
        }
        return new String(arr);
    }


    /**
     * 方法二：双指针（优化）
     * @param s
     * @return
     */
    public String reverseVowels_optimization(String s) {
        //长度
        int n = s.length();
        //转换成数组
        char[] arr = s.toCharArray();
        //双指针
        int i = 0, j = n - 1;
        while (i < j) {
            // 相等则交换
            if (isVowel(arr[i]) && isVowel(arr[j])) {
                swap(arr,i,j);
                i++;
                j--;
            }

            // 左指针不是元音，右移一位
            if (!isVowel(arr[i])) i++;
            // 右指针不是元音，左移一位
            if (!isVowel(arr[j])) j--;
        }

        return new String(arr);
    }

    /**
     * 检查是否为元音
     * @param ch
     * @return
     */
    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    /**
     * 交换
     * @param arr
     * @param i
     * @param j
     */
    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
