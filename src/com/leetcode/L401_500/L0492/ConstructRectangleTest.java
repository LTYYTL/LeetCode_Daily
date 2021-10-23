package com.leetcode.L401_500.L0492;

import java.util.Arrays;

public class ConstructRectangleTest {
    public static void main(String[] args) {
        ConstructRectangle constructRectangle = new ConstructRectangle();
        /**
         * 示例：
         * 输入: 4
         * 输出: [2, 2]
         * 解释: 目标面积是 4， 所有可能的构造方案有 [1,4], [2,2], [4,1]。
         * 但是根据要求2，[1,4] 不符合要求; 根据要求3，[2,2] 比 [4,1] 更能符合要求. 所以输出长度 L 为 2， 宽度 W 为 2。
         */
        System.out.println(Arrays.toString(constructRectangle.constructRectangle(4)));
    }
}
