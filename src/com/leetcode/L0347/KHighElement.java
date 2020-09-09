package com.leetcode.L0347;

import java.util.*;

/**
 * 347. 前 K 个高频元素
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * 示例 1:
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 *
 * 示例 2:
 * 输入: nums = [1], k = 1
 * 输出: [1]
 *
 * 提示：
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 * 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的。
 * 你可以按任意顺序返回答案。
 */
public class KHighElement {

    /**
     * 最小根堆
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        //记录每个元素出现的次数
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:nums) {
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        //定制排序
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return map.get(o1) - map.get(o2);
            }
        };
        //建立最小堆
        //1、如果堆的元素个数小于 k，就可以直接插入堆中。
        //2、如果堆的元素个数等于 k，则检查堆顶与当前出现次数的大小。
        //  如果堆顶更大，说明至少有 k个数字的出现次数比当前值大，故舍弃当前值；否则，就弹出堆顶，并将当前值插入堆中。
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
        for (Integer key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }

        // 取出最小堆中的元素
        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            res[i] = pq.poll();
        }

        return res;
    }


}
