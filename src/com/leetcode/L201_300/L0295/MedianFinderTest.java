package com.leetcode.L201_300.L0295;

public class MedianFinderTest {
    public static void main(String[] args) {
        /*
          例如，
          [2,3,4] 的中位数是 3
          [2,3] 的中位数是 (2 + 3) / 2 = 2.5

          设计一个支持以下两种操作的数据结构：
          void addNum(int num) - 从数据流中添加一个整数到数据结构中。
          double findMedian() - 返回目前所有元素的中位数。

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
