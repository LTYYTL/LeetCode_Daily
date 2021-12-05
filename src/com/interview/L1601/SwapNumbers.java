package com.interview.L1601;

/**
 * 面试题 16.01. 交换数字
 * 编写一个函数，不用临时变量，直接交换numbers = [a, b]中a与b的值。
 *
 * 示例：
 * 输入: numbers = [1,2]
 * 输出: [2,1]
 *
 * 提示：
 * numbers.length == 2
 * -2147483647 <= numbers[i] <= 2147483647
 */
public class SwapNumbers {
    /**
     * 方法：数学
     * @param numbers
     * @return
     */
    public int[] swapNumbers(int[] numbers) {
        //[a,b] ---> [a^b,b]
        numbers[0] ^= numbers[1];
        //[a^b,b] ---> [a^b,a],即 a^b^b = a
        numbers[1] ^= numbers[0];
        //[a^b,a] ---> [b,a],即 a^b^a = b
        numbers[0] ^= numbers[1];
        return numbers;
    }
}
