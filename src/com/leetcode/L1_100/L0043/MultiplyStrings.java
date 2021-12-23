package com.leetcode.L1_100.L0043;

/**
 * 43. 字符串相乘
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 *
 * 示例 1:
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 *
 * 示例 2:
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 *
 * 说明：
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 */
public class MultiplyStrings {
    /**
     * 方法：双指针
     * @param num1
     * @param num2
     * @return
     */
    public String multiply(String num1, String num2) {
        //长度
        int m = num1.length();
        int n = num2.length();
        //结果最多为m+n位数
        int[] res = new int[m+n];
        //遍历
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                //计算乘积
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                //乘积应该存在的两个位置
                int p1 = i + j;
                int p2 = i + j + 1;
                //存储乘积
                int sum = mul + res[p2];
                res[p2] = sum % 10;
                res[p1] += sum / 10;

            }
        }

        // 结果前缀可能存的 0（未使用的位）
        int i = 0;
        while (i < res.length && res[i] == 0)
            i++;
        //0的情况
        if (i >= res.length)
            return "0";
        // 将计算结果转化成字符串
        StringBuilder str = new StringBuilder();
        //将结果转换成字符串
        while (i < res.length){
            str.append(res[i++]);
        }
        return str.toString();
    }
}
