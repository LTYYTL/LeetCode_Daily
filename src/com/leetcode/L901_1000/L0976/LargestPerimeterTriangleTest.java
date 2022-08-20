package com.leetcode.L901_1000.L0976;

public class LargestPerimeterTriangleTest {
    public static void main(String[] args) {
        LargestPerimeterTriangle largestPerimeterTriangle = new LargestPerimeterTriangle();
        /* 示例 1：
         输入：[2,1,2]
         输出：5

         示例 2：
         输入：[1,2,1]
         输出：0

         示例 3：
         输入：[3,2,3,4]
         输出：10

         示例 4：
         输入：[3,6,2,3]
         输出：8
         */
        System.out.println(largestPerimeterTriangle.largestPerimeter(new int[]{2, 1, 2}));
        System.out.println(largestPerimeterTriangle.largestPerimeter(new int[]{1, 2, 1}));
        System.out.println(largestPerimeterTriangle.largestPerimeter(new int[]{3, 2, 3, 4}));
        System.out.println(largestPerimeterTriangle.largestPerimeter(new int[]{3, 6, 2, 3}));
    }
}
