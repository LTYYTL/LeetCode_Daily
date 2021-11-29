package com.interview.L0503;

/**
 * 面试题 05.03. 翻转数位
 * 给定一个32位整数 num，你可以将一个数位从0变为1。请编写一个程序，找出你能够获得的最长的一串1的长度。
 *
 * 示例 1：
 * 输入: num = 1775(110111011112)
 * 输出: 8
 *
 * 示例 2：
 * 输入: num = 7(01112)
 * 输出: 4
 */
public class ReverseBits {
    /**
     * 方法：滑动窗口
     * @param num
     * @return
     */
    public int reverseBits(int num) {
        //将数字转换成二进制数字
        int[] bits = new int[32];
        for (int i = 0; i < 32; i++) {
            bits[i] = (num >> i) & 1;
        }
        //指针
        int left = 0;
        int right = 0;
        //最大长度
        int max = 0;
        //是否已经变过一次
        int flag = 1;
        //遍历
        while (right < bits.length){
            //判断是否是是0需要转换
            if (bits[right] == 0)
                flag--;
            //收缩窗口
            while (left <= right && bits[right] == 0 && flag < 0){
                //收缩窗口
                if (bits[left++] == 0)
                    flag++;
            }
            //获取最大窗口
            max = Math.max(right - left + 1,max);
            right++;
        }

        return max;
    }
}
