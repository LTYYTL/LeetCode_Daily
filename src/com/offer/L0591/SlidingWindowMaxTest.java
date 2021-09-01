package com.offer.L0591;

import java.util.Arrays;

public class SlidingWindowMaxTest {
    public static void main(String[] args) {
        SlidingWindowMax slidingWindowMax = new SlidingWindowMax();
        /**
         * 示例:
         * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
         * 输出: [3,3,5,5,6,7]
         * 解释:
         *   滑动窗口的位置                最大值
         * ---------------               -----
         * [1  3  -1] -3  5  3  6  7       3
         *  1 [3  -1  -3] 5  3  6  7       3
         *  1  3 [-1  -3  5] 3  6  7       5
         *  1  3  -1 [-3  5  3] 6  7       5
         *  1  3  -1  -3 [5  3  6] 7       6
         *  1  3  -1  -3  5 [3  6  7]      7
         */
        System.out.println(Arrays.toString(slidingWindowMax.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}
