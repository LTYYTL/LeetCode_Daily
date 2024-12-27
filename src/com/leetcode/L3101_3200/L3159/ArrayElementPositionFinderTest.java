package com.leetcode.L3101_3200.L3159;

import com.util.ArrayUtil;

public class ArrayElementPositionFinderTest {
    public static void main(String[] args) {
        ArrayElementPositionFinder arrayElementPositionFinder = new ArrayElementPositionFinder();
        /*
         * 示例 1：
         * 输入：nums = [1,3,1,7], queries = [1,3,2,4], x = 1
         * 输出：[0,-1,2,-1]
         * 解释：
         * 第 1 个查询，第一个 1 出现在下标 0 处。
         * 第 2 个查询，nums 中只有两个 1 ，所以答案为 -1 。
         * 第 3 个查询，第二个 1 出现在下标 2 处。
         * 第 4 个查询，nums 中只有两个 1 ，所以答案为 -1 。
         */
        System.out.println(ArrayUtil.toString(arrayElementPositionFinder.occurrencesOfElement(new int[]{1, 3, 1, 7}, new int[]{1, 3, 2, 4}, 1)));
        /**
         * 示例 2：
         * 输入：nums = [1,2,3], queries = [10], x = 5
         * 输出：[-1]
         * 解释：
         * 第 1 个查询，nums 中没有 5 ，所以答案为 -1 。
         */
        System.out.println(ArrayUtil.toString(arrayElementPositionFinder.occurrencesOfElement(new int[]{1, 2, 3}, new int[]{10}, 5)));
    }
}
