package com.offer.L0591;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 59 - I. 滑动窗口的最大值
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 *
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
 *
 * 提示：
 * 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
 * 注意：本题与主站 239 题相同：<a href="https://leetcode-cn.com/problems/sliding-window-maximum/">https://leetcode-cn.com/problems/sliding-window-maximum/</a>
 */
public class SlidingWindowMax {
    /**
     * 方法：单调队列
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        MaxQueue window = new MaxQueue();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i  < k - 1){
                //先填入k-1个元素
                window.push(nums[i]);
            }else {
                //滑动窗口，加入新数字
                window.push(nums[i]);
                //添加 最大值
                res.add(window.max());
                //移除旧数字
                window.pop(nums[i - k + 1]);
            }
        }
        //转换成数组
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }

        return arr;
    }

    static class MaxQueue {
        LinkedList<Integer> queue = new LinkedList<>();

        //在队尾添加元素
        public void push(int x) {
            while (!queue.isEmpty() && queue.getLast() <= x)
                queue.pollLast();
            queue.addLast(x);
        }

        //返回最大元素
        public int max() {
            return queue.getFirst();
        }

        //删除队头元素
        public void pop(int x) {
            //判断队头元素是否为滑出元素
            if (x == queue.getFirst())
                queue.pollFirst();
        }
    }
}
