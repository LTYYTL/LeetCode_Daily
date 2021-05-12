package com.leetcode.L0141;

import com.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表
 * 给定一个链表，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 *
 * 进阶：
 * 你能用 O(1)（即，常量）内存解决此问题吗？
 *
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 * 示例 2：
 * 输入：head = [1,2], pos = 0
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 * 示例 3：
 * 输入：head = [1], pos = -1
 * 输出：false
 * 解释：链表中没有环。
 *
 * 提示：
 * 链表中节点的数目范围是 [0, 104]
 * -105 <= Node.val <= 105
 * pos 为 -1 或者链表中的一个 有效索引 。
 */
public class LinkedListCycle {
    /**
     * 方法一：set集合
     * @param head
     * @return
     */
    public boolean hasCycle_set(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null){
            //判断当前节点是否在set中
            if (set.contains(head)){
                return true;
            }
            //将遍历后但不在set中的节点存入
            set.add(head);
            head = head.next;
        }
        return false;
    }

    /**
     * 方法二：双指针
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        //初始化快、慢指针
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next !=null){
            //快指针走两步
            fast = fast.next.next;
            //慢指针走一步
            slow = slow.next;
            //存在环，快慢指针一定相遇
            if (slow == fast)
                return true;
        }
        return false;
    }

}
