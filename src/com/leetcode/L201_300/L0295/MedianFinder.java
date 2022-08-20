package com.leetcode.L201_300.L0295;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 295. 数据流的中位数
 * 中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。
 *
 * 例如，
 * [2,3,4] 的中位数是 3
 * [2,3] 的中位数是 (2 + 3) / 2 = 2.5
 *
 * 设计一个支持以下两种操作的数据结构：
 * void addNum(int num) - 从数据流中添加一个整数到数据结构中。
 * double findMedian() - 返回目前所有元素的中位数。
 *
 * 示例：
 * addNum(1)
 * addNum(2)
 * findMedian() -> 1.5
 * addNum(3)
 * findMedian() -> 2
 *
 * 进阶:
 * 如果数据流中所有整数都在 0 到 100 范围内，你将如何优化你的算法？
 * 如果数据流中 99% 的整数都在 0 到 100 范围内，你将如何优化你的算法？
 */
public class MedianFinder {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        // 左边要大顶堆 （中间的数最大）
        maxHeap = new PriorityQueue<>((a,b) -> b - a);
        // 右边要小顶堆 （中间的数最小）
        minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a));
    }

    public void addNum(int num) {
        // 如果小顶堆没有数，或者插入的数属于小顶堆，先加到小顶堆
        // 否则加到大顶堆
        if(minHeap.size() == 0 || minHeap.peek() <= num)
            minHeap.add(num);
        else
            maxHeap.add(num);
        // 判断两边长度是否差别太大
        if(minHeap.size() - maxHeap.size() > 1)
            maxHeap.add(minHeap.poll());
        else if(maxHeap.size() - minHeap.size() > 1)
            minHeap.add(maxHeap.poll());
    }

    public double findMedian() {
        // 总长度为偶数，两边各取一个
        // 否则取更长一点儿的那边的那个
        if(minHeap.size() == maxHeap.size())
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        else if(minHeap.size() > maxHeap.size())
            return minHeap.peek();
        return maxHeap.peek();
    }

}
