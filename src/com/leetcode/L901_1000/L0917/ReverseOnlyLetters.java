package com.leetcode.L901_1000.L0917;

/**
 * 917. 仅仅反转字母
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 *
 * 示例 1：
 * 输入："ab-cd"
 * 输出："dc-ba"
 *
 * 示例 2：
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 *
 * 示例 3：
 * 输入："Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 *
 * 提示：
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S 中不包含 \ or "
 */
public class ReverseOnlyLetters {
    /**
     * 方法：双指针
     * @param s
     * @return
     */
    public String reverseOnlyLetters(String s) {
        //转换成数组
        char[] chars = s.toCharArray();
        //双指针
        int left = 0;
        int right = chars.length - 1;
        //遍历
        while (left <= right){
            //判断是否是字母，不是指针后移
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }
            //判断是否是字母，不是指针前移
            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }
            //交换
            char c = chars[left];
            chars[left] = chars[right];
            chars[right] = c;
            //移动指针
            left++;
            right--;
        }
        //转换为字符串
        return String.valueOf(chars);
    }
}
