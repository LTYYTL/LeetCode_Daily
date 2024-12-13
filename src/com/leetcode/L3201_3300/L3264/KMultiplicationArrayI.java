package com.leetcode.L3201_3300.L3264;

import java.util.PriorityQueue;

/**
 * 3264. K 次乘运算后的最终数组 I
 *
 * 给你一个整数数组 nums ，一个整数 k  和一个整数 multiplier 。
 * 你需要对 nums 执行 k 次操作，每次操作中：
 * 找到 nums 中的 最小 值 x ，如果存在多个最小值，选择最 前面 的一个。
 * 将 x 替换为 x * multiplier 。
 * 请你返回执行完 k 次乘运算之后，最终的 nums 数组。
 *
 * 示例 1：
 * 输入：nums = [2,1,3,5,6], k = 5, multiplier = 2
 * 输出：[8,4,6,5,6]
 *
 * 解释：
 * 操作	结果
 * 1 次操作后	[2, 2, 3, 5, 6]
 * 2 次操作后	[4, 2, 3, 5, 6]
 * 3 次操作后	[4, 4, 3, 5, 6]
 * 4 次操作后	[4, 4, 6, 5, 6]
 * 5 次操作后	[8, 4, 6, 5, 6]
 *
 * 示例 2：
 * 输入：nums = [1,2], k = 3, multiplier = 4
 * 输出：[16,8]
 *
 * 解释：
 * 操作	结果
 * 1 次操作后	[4, 2]
 * 2 次操作后	[4, 8]
 * 3 次操作后	[16, 8]
 *
 * 提示：
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * 1 <= k <= 10
 * 1 <= multiplier <= 5
 */
public class KMultiplicationArrayI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int length = nums.length;

        // 排除空值
        if (length <= 0){
            return nums;
        }

        PriorityQueue<Node> queue = initQueue(nums);
        // 遍历k次
        for (int i = 0; i < k; i++) {
            Node cur = queue.poll();
            cur.setNum(cur.num * multiplier);

            queue.add(cur);
        }

        // 将结果赋值回原来位置
        while (!queue.isEmpty()){
            Node poll = queue.poll();
            int index = poll.index;
            int num = poll.num;

            nums[index] = num;
        }


        return nums;
    }

    /**
     * 初始化小根堆
     */
    private PriorityQueue<Node> initQueue(int[] nums){
        PriorityQueue<Node> queue = new PriorityQueue<>(nums.length, (o1, o2) ->{
            // 值一样，按照索引升序
            if (o1.num == o2.num){
                return o1.index - o2.index;
            }
            // 按照值升序
            return o1.num - o2.num;
        });

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            queue.add(new Node(i, num));
        }

        return queue;
    }


    /**
     * 存储索引和索引下对应的值
     */
    private static class Node{
        private int index;
        private int num;

        public Node(int index, int num){
            this.num = num;
            this.index = index;
        }

        public void setNum(int num){
            this.num = num;
        }
    }
}
