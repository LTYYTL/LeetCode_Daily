package com.leetcode.L501_600.L0557;

/**
 * 557. 反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例：
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 *
 * 提示：
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWordsIII {
    /**
     * 方法：双指针
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        //结果
        StringBuilder res = new StringBuilder();
        //按照空格分单词
        String[] strs = s.split(" ");
        //遍历
        for (String str : strs) {
            //进行转换
            res.append(reverseString(str.toCharArray()));
            //添加空格
            res.append(" ");
        }
        //去掉首尾空格
        return res.toString().trim();
    }

    /**
     * 方法：双指针
     * 时间复杂度：O(N)。执行了 N/2 次的交换。
     * 空间复杂度：O(1)，只使用了常数级空间。
     * @param s
     */
    private String reverseString(char[] s) {
        //字符串为空的情况
        if (s.length == 0 || s == null)
            return "";
        //定义左、右两个指针，分别在char[]数组头和尾
        int left = 0;
        int right = s.length - 1;
        //循环移动两个指针，直到left>=right时跳出循环
        while (left < right){
            //临时变量，防止交换时数值丢失
            char temp;
            //将s[left]位置上的值赋值给临时变量temp
            temp = s[left];
            //将s[right]位置上的值赋值给s[left]位置
            s[left] = s[right];
            //将temp中的值赋值给s[right]位置,即将s[left]的值赋值到s[right]中，实现交换
            s[right] = temp;
            //左指针向右移，右指针向左移
            left++;
            right--;
        }

        return String.valueOf(s);
    }
}
