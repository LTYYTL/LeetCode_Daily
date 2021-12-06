package com.leetcode.L301_400.L0370;

import java.util.Arrays;

public class IntervalAdditionTest {
    public static void main(String[] args) {
        IntervalAddition intervalAddition = new IntervalAddition();
        /**
         * 示例 1：
         * 输入：length = 5, updates = [[1,3,2],[2,4,3],[0,2,-2]]
         * 输出：[-2,0,3,5,3]
         */
        System.out.println(Arrays.toString(intervalAddition.getModifiedArray(5, new int[][]{{1, 3, 2}, {2, 4, 3}, {0, 2, -2}})));
    }
}
