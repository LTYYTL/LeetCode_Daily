package com.offerII.L039;

public class LargestRectangleHistogramTest {
    public static void main(String[] args) {
        LargestRectangleHistogram largestRectangleHistogram = new LargestRectangleHistogram();
        /*
          示例 1:
          输入：heights = [2,1,5,6,2,3]
          输出：10
          解释：最大的矩形为图中红色区域，面积为 10
         */
        System.out.println(largestRectangleHistogram.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        /*
          示例 2：
          输入： heights = [2,4]
          输出： 4
         */
        System.out.println(largestRectangleHistogram.largestRectangleArea(new int[]{2, 4}));
    }
}
