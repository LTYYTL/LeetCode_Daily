package com.leetcode.L301_400.L0352;

public class SummaryRangesTest {
    public static void main(String[] args) {
        /**
         * SummaryRanges summaryRanges = new SummaryRanges();
         * summaryRanges.addNum(1);      // arr = [1]
         * summaryRanges.getIntervals(); // 返回 [[1, 1]]
         * summaryRanges.addNum(3);      // arr = [1, 3]
         * summaryRanges.getIntervals(); // 返回 [[1, 1], [3, 3]]
         * summaryRanges.addNum(7);      // arr = [1, 3, 7]
         * summaryRanges.getIntervals(); // 返回 [[1, 1], [3, 3], [7, 7]]
         * summaryRanges.addNum(2);      // arr = [1, 2, 3, 7]
         * summaryRanges.getIntervals(); // 返回 [[1, 3], [7, 7]]
         * summaryRanges.addNum(6);      // arr = [1, 2, 3, 6, 7]
         * summaryRanges.getIntervals(); // 返回 [[1, 3], [6, 7]]
         */

        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);      // arr = [1]
        summaryRanges.getIntervals(); // 返回 [[1, 1]]
        summaryRanges.addNum(3);      // arr = [1, 3]
        summaryRanges.getIntervals(); // 返回 [[1, 1], [3, 3]]
        summaryRanges.addNum(7);      // arr = [1, 3, 7]
        summaryRanges.getIntervals(); // 返回 [[1, 1], [3, 3], [7, 7]]
        summaryRanges.addNum(2);      // arr = [1, 2, 3, 7]
        summaryRanges.getIntervals(); // 返回 [[1, 3], [7, 7]]
        summaryRanges.addNum(6);      // arr = [1, 2, 3, 6, 7]

    }
}
