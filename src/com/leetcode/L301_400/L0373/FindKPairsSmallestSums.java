package com.leetcode.L301_400.L0373;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 373. 查找和最小的K对数字
 * 给定两个以升序排列的整数数组 nums1 和 nums2 , 以及一个整数 k 。
 * 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2 。
 * 请找到和最小的 k 个数对 (u1,v1),  (u2,v2)  ...  (uk,vk) 。
 *
 * 示例 1:
 * 输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
 * 输出: [1,2],[1,4],[1,6]
 * 解释: 返回序列中的前 3 对数：
 *      [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 *
 * 示例 2:
 * 输入: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
 * 输出: [1,1],[1,1]
 * 解释: 返回序列中的前 2 对数：
 *      [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
 *
 * 示例 3:
 * 输入: nums1 = [1,2], nums2 = [3], k = 3
 * 输出: [1,3],[2,3]
 * 解释: 也可能序列中所有的数对都被返回:[1,3],[2,3]
 *
 * 提示:
 * 1 <= nums1.length, nums2.length <= 104
 * -109 <= nums1[i], nums2[i] <= 109
 * nums1, nums2 均为升序排列
 * 1 <= k <= 1000
 */
public class FindKPairsSmallestSums {
    /**
     * 方法：堆
     * @param nums1
     * @param nums2
     * @param k
     * @return
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.sum));
        List<List<Integer>> res = new ArrayList<>();

        //数组1取前k个数 （长度n小于k则取n个，数组2也相同）,组成 k*k 个数对
        int len1 = Math.min(nums1.length, k);
        int len2 = Math.min(nums2.length, k);
        //排列组合
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                int sum = nums1[i] + nums2[j];
                queue.add(new Node(nums1[i], nums2[j], sum));
            }
        }
        //取前k个元素
        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            List<Integer> list = new ArrayList<>();
            Node cur = queue.poll();
            list.add(cur.u1);
            list.add(cur.u2);
            res.add(list);
        }

        return res;
    }

    static class Node {
        int u1;
        int u2;
        int sum;

        public Node(int u1, int u2, int sum) {
            this.u1 = u1;
            this.u2 = u2;
            this.sum = sum;
        }
    }
}
