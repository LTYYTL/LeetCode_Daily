package com.offer.L0210;

import java.util.Arrays;

public class AdjustOrderArrayTest {
    public static void main(String[] args) {
        AdjustOrderArray adjustOrderArray = new AdjustOrderArray();
        /**
         * 示例：
         * 输入：nums = [1,2,3,4]
         * 输出：[1,3,2,4]
         * 注：[3,1,2,4] 也是正确的答案之一。
         */
        System.out.println(Arrays.toString(adjustOrderArray.exchange(new int[]{1, 2, 3, 4})));
    }
}
