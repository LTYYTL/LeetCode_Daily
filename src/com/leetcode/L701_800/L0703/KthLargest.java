package com.leetcode.L701_800.L0703;

import java.util.PriorityQueue;

/**
 * 703. 数据流中的第 K 大元素
 * 设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。
 *
 * 请实现 KthLargest 类：
 * (1)KthLargest(int k, int[] nums) 使用整数 k 和整数流 nums 初始化对象。
 * (2)int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。
 *
 * 示例：
 * 输入：
 * ["KthLargest", "add", "add", "add", "add", "add"]
 * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
 * 输出：
 * [null, 4, 5, 5, 8, 8]
 * 解释：
 * KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
 * kthLargest.add(3);   // return 4
 * kthLargest.add(5);   // return 5
 * kthLargest.add(10);  // return 5
 * kthLargest.add(9);   // return 8
 * kthLargest.add(4);   // return 8
 *
 * 提示：
 * 1 <= k <= 104
 * 0 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * -104 <= val <= 104
 * 最多调用 add 方法 104 次
 * 题目数据保证，在查找第 k 大元素时，数组中至少有 k 个元素
 */
public class KthLargest {
    /**
     * 方法：堆
     */
    int k;//堆大小
    PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        //升序，容量为k的堆，堆顶为第k大的元素
        queue = new PriorityQueue<>();
        //初始化
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        //将元素加入
        queue.offer(val);
        //超过k的部分砍掉
        if (queue.size() > k)
            queue.poll();
        return queue.peek();
    }
}
