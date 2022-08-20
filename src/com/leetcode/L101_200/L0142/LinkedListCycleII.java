package com.leetcode.L101_200.L0142;

import com.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 142. 环形链表 II
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
 * 说明：不允许修改给定的链表。
 *
 * 进阶：
 * 你是否可以使用 O(1) 空间解决此题？
 *
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：返回索引为 1 的链表节点
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 * 示例 2：
 * 输入：head = [1,2], pos = 0
 * 输出：返回索引为 0 的链表节点
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 * 示例 3：
 * 输入：head = [1], pos = -1
 * 输出：返回 null
 * 解释：链表中没有环。
 *
 * 提示：
 * 链表中节点的数目范围在范围 [0, 104] 内
 * -105 <= Node.val <= 105
 * pos 的值为 -1 或者链表中的一个有效索引
 */
public class LinkedListCycleII {
    /**
     * 方法一：set集合
     * @param head
     * @return
     */
    public ListNode detectCycle_set(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<>();
        while (pos != null) {
            //判断当前节点是否在set中
            if (visited.contains(pos)) {
                return pos;
            } else {
                //将遍历后但不在set中的节点存入
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }

    /**
     * 方法二：双指针
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
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
                break;
        }
        // 上面的代码类似 hasCycle 函数
        if (fast == null || fast.next == null) {
            // fast 遇到空指针说明没有环
            return null;
        }
        slow = head;
        while (slow != fast){
            //两个指针以相同的速度前进
            slow = slow.next;
            fast = fast.next;
        }
        //两个指针再次相遇的那个单链表节点就是环的起点
        return slow;
    }
}
