package com.interview.L0201;

import com.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 02.01. 移除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 *
 * 示例1:
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 *
 * 示例2:
 * 输入：[1, 1, 1, 1, 2]
 * 输出：[1, 2]
 *
 * 提示：
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 *
 * 进阶：
 * 如果不得使用临时缓冲区，该怎么解决？
 */
public class RemoveDuplicateNode {
    /**
     * 方法：双指针
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        //特殊情况
        if (head == null)
            return head;
        //存储节点值
        Set<Integer> set = new HashSet<>();
        //头节点值
        set.add(head.val);
        //指针
        ListNode pos = head;
        //遍历
        while (pos.next != null){
            //当前节点
            ListNode cur = pos.next;
            //判断当前节点是否存在
            if (set.add(cur.val))
                pos = pos.next;//不存在向后移动
            else
                pos.next = pos.next.next;//存在，删除节点，指针不动
        }
        //改变尾指针指向
        pos.next = null;

        return head;
    }
}
