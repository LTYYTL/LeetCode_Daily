package com.leetcode.L0611;

public class ValidTriangleNumberTest {
    public static void main(String[] args) {
        ValidTriangleNumber validTriangleNumber = new ValidTriangleNumber();
        /**
         * 示例 1:
         * 输入: [2,2,3,4]
         * 输出: 3
         * 解释:
         * 有效的组合是:
         * 2,3,4 (使用第一个 2)
         * 2,3,4 (使用第二个 2)
         * 2,2,3
         */

        System.out.println(validTriangleNumber.triangleNumber(new int[]{2, 2, 3, 4}));
        System.out.println(validTriangleNumber.triangleNumber_two(new int[]{2, 2, 3, 4}));

    }
}
