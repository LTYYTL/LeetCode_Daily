package com.leetcode.L801_900.L0817;

import com.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 817. 链表组件
 * 给定链表头结点 head，该链表上的每个结点都有一个 唯一的整型值 。同时给定列表 nums，该列表是上述链表中整型值的一个子集。
 * 返回列表 nums 中组件的个数，这里对组件的定义为：链表中一段最长连续结点的值（该值必须在列表 nums 中）构成的集合。
 * <p>
 * 示例 1：
 * 输入: head = [0,1,2,3], nums = [0,1,3]
 * 输出: 2
 * 解释: 链表中,0 和 1 是相连接的，且 nums 中不包含 2，所以 [0, 1] 是 nums 的一个组件，同理 [3] 也是一个组件，故返回 2。
 * <p>
 * 示例 2：
 * 输入: head = [0,1,2,3,4], nums = [0,3,1,4]
 * 输出: 2
 * 解释: 链表中，0 和 1 是相连接的，3 和 4 是相连接的，所以 [0, 1] 和 [3, 4] 是两个组件，故返回 2。
 * <p>
 * 提示：
 * 链表中节点数为n
 * 1 <= n <= 104
 * 0 <= Node.val < n
 * Node.val 中所有值 不同
 * 1 <= nums.length <= n
 * 0 <= nums[i] < n
 * nums 中所有值 不同
 */
public class LinkedListComponents {
    /**
     * 方法：模拟
     */
    public int numComponents(ListNode head, int[] nums) {
        ListNode dump = head;
        // 前一个节点是否存在
        boolean pre = false;
        // 记录出现的数字
        Set<Integer> set = new HashSet<>();
        // 遍历放入集合
        for (int num : nums) {
            set.add(num);
        }

        // 结果
        int res = 0;
        // 遍历
        while (dump != null) {
            // 当前值
            int val = dump.val;
            // 当前节点时候存在
            boolean cur = set.contains(val);
            // 前一个不存在，当前存在，表示组件+1
            if (!pre && cur) {
                res++;
            }
            // 记录状态
            pre = cur;
            // 指针后移
            dump = dump.next;
        }

        return res;
    }
}
