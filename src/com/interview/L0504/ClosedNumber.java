package com.interview.L0504;

/**
 * 面试题 05.04. 下一个数
 * 下一个数。给定一个正整数，找出与其二进制表达式中1的个数相同且大小最接近的那两个数（一个略大，一个略小）。
 *
 * 示例1:
 *  输入：num = 2（或者0b10）
 *  输出：[4, 1] 或者（[0b100, 0b1]）
 *
 * 示例2:
 *  输入：num = 1
 *  输出：[2, -1]
 *
 * 提示:
 * num的范围在[1, 2147483647]之间；
 * 如果找不到前一个或者后一个满足条件的正数，那么输出 -1。
 */
public class ClosedNumber {
    /**
     * 方法：暴力法
     * @param num
     * @return
     */
    public int[] findClosedNumbers(int num) {
        //结果集
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        //等于0
        if (num == 0)
            return res;
        //计算1的个数
        int count = Integer.bitCount(num);
        //判断是否越界
        int i = num == Integer.MAX_VALUE ? -1 : num + 1;
        //获取大一点的数，大于当前数并且不越界
        while (i > num && i <= Integer.MAX_VALUE) {
            //1的个数相同
            if (count == Integer.bitCount(i)){
                res[0] = i;
                break;
            }
            i++;
        }

        i = num == Integer.MAX_VALUE ? -1 : num - 1;
        //获取小一点的数，小于当前数并且大于0
        while (i > 0){
            //1的个数相同
            if (count == Integer.bitCount(i)){
                res[1] = i;
                break;
            }
            i--;
        }
        return res;
    }
}
