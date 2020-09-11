package com.leetcode.L0344;

/**
 * 344. 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 * 示例 1：
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 *
 * 示例 2：
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 */
public class ReverseString {
    /**
     * 方法：双指针
     * 时间复杂度：O(N)。执行了 N/2 次的交换。
     * 空间复杂度：O(1)，只使用了常数级空间。
     * @param s
     */
    public void reverseString(char[] s) {
        //字符串为空的情况
        if (s.length == 0 || s == null)
            return;
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
    }


}
