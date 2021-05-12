package com.interview.L0208;

import com.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 02.08. 环路检测
 * 给定一个链表，如果它是有环链表，实现一个算法返回环路的开头节点。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 *
 * 示例 1：
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：tail connects to node index 1
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 * 示例 2：
 * 输入：head = [1,2], pos = 0
 * 输出：tail connects to node index 0
 * 解释：链表中有一个环，其尾部连接到第一个节点。
 *
 * 示例 3：
 * 输入：head = [1], pos = -1
 * 输出：no cycle
 * 解释：链表中没有环。
 *
 * 进阶：
 * 你是否可以不用额外空间解决此题？
 */
public class LinkedListCycleII {
    /**
     * 方法一：set集合
     * @param head
     * @return
     */
    public ListNode detectCycle_set(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<ListNode>();
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
