package com.leetcode.L0239;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 * 239. 滑动窗口最大值
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口中的最大值。
 *
 * 进阶：
 * 你能在线性时间复杂度内解决此题吗？
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
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * 1 <= k <= nums.length
 */
public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //空值情况
        if (nums == null || k <=0)
            return new int[0];
        int n = nums.length;
        int[] res = new int[n-k+1];
        int index = 0;
        //双端队列，就是两边都可以插入和删除数据的队列，
        // 注意这里存储的是元素在数组中的下标，不是元素的值
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++){
            //如果队列中队头元素和当前元素位置相差i-k，相当于队头元素要出窗口了，
            //就把队头元素给移除，注意队列中存储的是元素的下标
            if (!queue.isEmpty() && queue.peekFirst() <= i -k){
                queue.pollFirst();
            }
            //在添加一个值之前，前面比他小的都要被移除掉，
            //并且还要保证窗口中队列头部元素永远是队列中最大的
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                queue.pollLast();
            }
            //将当前元素的下标加入到队列中
            queue.addLast(i);
            //当窗口长度大于等于k个的时候才开始计算（从0开始）
            if (i >= k-1){
                //队头元素是队列中最大的，把队列头部元素加入到数组中
                res[index++] = nums[queue.peekFirst()];
            }
        }
        return res;
    }
}
