package com.offer.L0035;

import com.util.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 35. 复杂链表的复制
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 * 示例 1：
 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
 *
 * 示例 2：
 * 输入：head = [[1,1],[2,1]]
 * 输出：[[1,1],[2,1]]
 *
 * 示例 3：
 * 输入：head = [[3,null],[3,0],[3,null]]
 * 输出：[[3,null],[3,0],[3,null]]
 *
 * 示例 4：
 * 输入：head = []
 * 输出：[]
 * 解释：给定的链表为空（空指针），因此返回 null。
 *
 * 提示：
 * -10000 <= Node.val <= 10000
 * Node.random 为空（null）或指向链表中的节点。
 * 节点数目不超过 1000 。
 *
 * 注意：本题与主站 138 题相同：https://leetcode-cn.com/problems/copy-list-with-random-pointer/
 */
public class CopyListRandomPointer {
    /**
     * 方法：map映射
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        //空值情况
        if (head == null) {
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        //临时变量
        Node cur = head;
        //将复制节点与原节点放入一个组中
        while (cur != null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;

        //将原节点的内容复制给新节点
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            //map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
