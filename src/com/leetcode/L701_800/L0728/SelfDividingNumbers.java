package com.leetcode.L701_800.L0728;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数
 * 自除数 是指可以被它包含的每一位数整除的数。
 * 例如，128 是一个 自除数 ，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 自除数 不允许包含 0 。
 * 给定两个整数 left 和 right ，返回一个列表，列表的元素是范围 [left, right] 内所有的 自除数 。
 *
 * 示例 1：
 * 输入：left = 1, right = 22
 * 输出：[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 *
 * 示例 2:
 * 输入：left = 47, right = 85
 * 输出：[48,55,66,77]
 *
 * 提示：
 * 1 <= left <= right <= 104
 */
public class SelfDividingNumbers {
    /**
     * 方法：数学
     * @param left
     * @param right
     * @return
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        //结果集
        List<Integer> res = new ArrayList<>();
        //遍历
        for (int i = left; i <= right; i++) {
            //判断是否符合条件
            if (isValid(i))
                res.add(i);
        }
        return res;
    }

    /**
     * 判断函数
     * @param num
     * @return
     */
    private boolean isValid(int num) {
        //临时变量
        int temp = num;
        //遍历
        while (temp != 0){
            //获取最后一位数字
            int div = temp%10;
            //不符合条件的情况
            if (div == 0 || num % div != 0)
                return false;
            //缩小
            temp /= 10;
        }
        return true;
    }
}
