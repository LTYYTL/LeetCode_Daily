package com.offerII.L002;

/**
 * 剑指 Offer II 002. 二进制加法
 * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 * 输入: a = "11", b = "10"
 * 输出: "101"
 *
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 提示：
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 *
 * 注意：本题与主站 67 题相同：https://leetcode-cn.com/problems/add-binary/
 */
public class AddBinary {
    /**
     * 方法：模拟
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        //双指针
        int i = a.length() - 1;
        int j = b.length() - 1;
        //结果
        StringBuilder res = new StringBuilder();
        //进位
        int digit = 0;

        while (i >= 0 || j >= 0){
            //当前位，不存在时为0
            int x = i < 0 ? 0 : a.charAt(i--) - '0';
            int y = j < 0 ? 0 : b.charAt(j--) - '0';
            //当前位的和
            int sum = x + y + digit;
            //添加到结果中
            res.insert(0,sum%2);
            //判断是否进位
            digit = sum / 2;
        }
        //还有进位的情况
        if (digit != 0)
            res.insert(0,digit);
        return res.toString();
    }

    /**
     * 方法二：内置函数
     * @param a
     * @param b
     * @return
     */
    public String addBinary_fun(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2) + Integer.parseInt(b,2));
    }
}
