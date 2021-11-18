package com.offerII.L029;

/**
 * 剑指 Offer II 029. 排序的循环链表
 * 给定循环单调非递减列表中的一个点，写一个函数向这个列表中插入一个新元素 insertVal ，使这个列表仍然是循环升序的。
 * 给定的可以是这个列表中任意一个顶点的指针，并不一定是这个列表中最小元素的指针。
 * 如果有多个满足条件的插入位置，可以选择任意一个位置插入新的值，插入后整个列表仍然保持有序。
 * 如果列表为空（给定的节点是 null），需要创建一个循环有序列表并返回这个节点。否则。请返回原先给定的节点。
 *
 * 示例 1：
 * 输入：head = [3,4,1], insertVal = 2
 * 输出：[3,4,1,2]
 * 解释：在上图中，有一个包含三个元素的循环有序列表，你获得值为 3 的节点的指针，我们需要向表中插入元素 2 。
 * 新插入的节点应该在 1 和 3 之间，插入之后，整个列表如上图所示，最后返回节点 3 。
 *
 * 示例 2：
 * 输入：head = [], insertVal = 1
 * 输出：[1]
 * 解释：列表为空（给定的节点是 null），创建一个循环有序列表并返回这个节点。
 *
 * 示例 3：
 * 输入：head = [1], insertVal = 0
 * 输出：[1,0]
 *
 * 提示：
 * 0 <= Number of Nodes <= 5 * 10^4
 * -10^6 <= Node.val <= 10^6
 * -10^6 <= insertVal <= 10^6
 *
 * 注意：本题与主站 708 题相同： https://leetcode-cn.com/problems/insert-into-a-sorted-circular-linked-list/
 */
public class SortedCircularList {
    /**
     * 方法：模拟
     * @param head
     * @param insertVal
     * @return
     */
    public Node insert(Node head, int insertVal) {
        //空置情况
        if (head == null){
            Node node = new Node(insertVal,null);
            node.next = node;
            return node;
        }

        //一个点
        if (head.next == head){
            Node node = new Node(insertVal,head);
            head.next = node;
            return head;
        }

        //两个点及以上
        Node pre = head;
        Node cur = pre.next;

        while (true){
            //加入点在顺序两点之间
            //pre = 2   cur = 4  insertVal = 3
            if (pre.val <= insertVal && insertVal <= cur.val){
                Node node = new Node(insertVal,cur);
                pre.next = node;
                return head;
            }
            //当前是逆序
            if (pre.val > cur.val){
                //当加入点在逆序的两点之间
                //pre = 6   cur = 2  insertVal = 8
                if (pre.val < insertVal && insertVal > cur.val){
                    pre.next = new Node(insertVal,cur);
                    return head;
                //pre = 6   cur = 2  insertVal = 1
                }else if (pre.val >= insertVal && insertVal <= cur.val){
                    pre.next = new Node(insertVal,cur);
                    return head;
                }
            }
            //指针向后移动
            pre = cur;
            cur = cur.next;

            //【3，3，3】出入0的情况
            if (pre == head)
                break;
        }

        pre.next = new Node(insertVal,cur);
        return head;
    }

    class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }
}
