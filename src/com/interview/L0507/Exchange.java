package com.interview.L0507;

/**
 * 面试题 05.07. 配对交换
 * 配对交换。编写程序，交换某个整数的奇数位和偶数位，尽量使用较少的指令（也就是说，位0与位1交换，位2与位3交换，以此类推）。
 *
 * 示例1:
 *  输入：num = 2（或者0b10）
 *  输出 1 (或者 0b01)
 *
 * 示例2:
 *  输入：num = 3
 *  输出：3
 *
 * 提示:
 * num的范围在[0, 2^30 - 1]之间，不会发生整数溢出。
 */
public class Exchange {
    /**
     * 方法：位运算
     * @param num
     * @return
     */
    public int exchangeBits(int num) {
        //提取偶数位的掩码
        int hex_odd = 0xaaaaaaaa;
        //提取奇数位的掩码
        int hex_even = 0x55555555;
        //提起偶数位
        int odd = num & hex_odd;
        //提起奇数位
        int even = num & hex_even;
        //偶数位右移动，奇数位左移
        int ans = (odd >> 1) + (even << 1);

        return ans;
    }
}
