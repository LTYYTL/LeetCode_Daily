package com.offer.L0410;

public class MedianFinderTest {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        /** * 示例 1：
         * 输入：
         * ["MedianFinder","addNum","addNum","findMedian","addNum","findMedian"]
         * [[],[1],[2],[],[3],[]]
         * 输出：[null,null,null,1.50000,null,2.00000]
         */
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
        /**
         * 示例 2：
         * 输入：
         * ["MedianFinder","addNum","findMedian","addNum","findMedian"]
         * [[],[2],[],[3],[]]
         * 输出：[null,null,2.00000,null,2.50000]
         */
    }
}
