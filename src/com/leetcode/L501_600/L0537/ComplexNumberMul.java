package com.leetcode.L501_600.L0537;

/**
 * 537. 复数乘法
 * 复数 可以用字符串表示，遵循 "实部+虚部i" 的形式，并满足下述条件：
 * (1)实部 是一个整数，取值范围是 [-100, 100]
 * (2)虚部 也是一个整数，取值范围是 [-100, 100]
 * i^2 == -1
 * 给你两个字符串表示的复数 num1 和 num2 ，请你遵循复数表示形式，返回表示它们乘积的字符串。
 *
 * 示例 1：
 * 输入：num1 = "1+1i", num2 = "1+1i"
 * 输出："0+2i"
 * 解释：(1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。
 *
 * 示例 2：
 * 输入：num1 = "1+-1i", num2 = "1+-1i"
 * 输出："0+-2i"
 * 解释：(1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i ，你需要将它转换为 0+-2i 的形式。
 *
 * 提示：
 * num1 和 num2 都是有效的复数表示。
 */
public class ComplexNumberMul {
    /**
     * 方法：数学
     * @param num1
     * @param num2
     * @return
     */
    public String complexNumberMultiply(String num1, String num2) {
        //获取实部字符串转换成数字
        int num1_real = changNum(num1.substring(0,num1.indexOf('+')));
        //获取虚部字符串转换成数字
        int num1_imag = changNum(num1.substring(num1.indexOf('+')+1,num1.indexOf('i')));

        //获取实部字符串转换成数字
        int num2_real = changNum(num2.substring(0,num2.indexOf('+')));
        //获取虚部字符串转换成数字
        int num2_imag = changNum(num2.substring(num2.indexOf('+')+1,num2.indexOf('i')));

        //结果：实部 = 两个实部的积 - 两个虚部的积
        int real = (num1_real * num2_real) - (num1_imag * num2_imag);
        //结果：虚部 = 实部与另一个虚部的积的和
        int imag = (num1_real * num2_imag) + (num1_imag * num2_real);

        return real + "+" + imag + "i";
    }

    /**
     * 转换成数字
     * @param s
     * @return
     */
    private int changNum(String s) {
        //开始的索引
        int i = 0;
        //结果
        int res = 0;
        //是负数
        if (s.charAt(i)== '-'){
            //从第二个字符开始遍历
            i = 1;
        }
        //遍历
        while (i < s.length()){
            //当前字符转换成数字
            int c = s.charAt(i++) - '0';
            //累加结果
            res = res * 10 + c;
        }
        //看是否为负数
        return s.charAt(0) == '-' ? -res : res;
    }
}
