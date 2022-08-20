package com.interview.L1720;

public class MedianFinderTest {
    public static void main(String[] args) {
        /* *
          示例：
          addNum(1)
          addNum(2)
          findMedian() -> 1.5
          addNum(3)
          findMedian() -> 2
         */
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
    }
}
