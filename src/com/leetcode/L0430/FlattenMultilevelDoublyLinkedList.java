package com.leetcode.L0430;

/**
 * 430. 扁平化多级双向链表
 * 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。
 * 这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 * 给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。
 *
 * 示例 1：
 * 输入：head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * 输出：[1,2,3,7,8,11,12,9,10,4,5,6]
 *
 * 示例 2：
 * 输入：head = [1,2,null,3]
 * 输出：[1,3,2]
 * 解释：
 * 输入的多级列表如下图所示：
 *
 *   1---2---NULL
 *   |
 *   3---NULL
 *
 * 示例 3：
 * 输入：head = []
 * 输出：[]
 *
 * 如何表示测试用例中的多级链表？
 * 以 示例 1 为例：
 *  1---2---3---4---5---6--NULL
 *          |
 *          7---8---9---10--NULL
 *              |
 *              11--12--NULL
 * 序列化其中的每一级之后：
 * [1,2,3,4,5,6,null]
 * [7,8,9,10,null]
 * [11,12,null]
 * 为了将每一级都序列化到一起，我们需要每一级中添加值为 null 的元素，以表示没有节点连接到上一级的上级节点。
 * [1,2,3,4,5,6,null]
 * [null,null,7,8,9,10,null]
 * [null,11,12,null]
 * 合并所有序列化结果，并去除末尾的 null 。
 * [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 *
 * 提示：
 * 节点数目不超过 1000
 * 1 <= Node.val <= 10^5
 */
public class FlattenMultilevelDoublyLinkedList {
    /**
     * 方法：深度优先搜索
     * @param head
     * @return
     */
    public Node flatten(Node head) {
        // 遍历每一个节点，看它是否有子节点，有子节点的话，把它的子节点那一坨放在它和next之间
        dfs(head);
        return head;
    }

    private void dfs(Node node) {
        // 退出条件
        if (node == null) {
            return;
        }

        // 子节点不为空，需要处理
        if (node.child != null) {
            // 记录下来下一个节点
            Node next = node.next;

            // 先把子链表扁平化
            dfs(node.child);

            // 修改当前节点的下一个节点为子链表的头
            // 同时，子链表头的上一个节点为当前节点
            node.next = node.child;
            node.child.prev = node;

            // 寻找扁平化之后的子节点的最后一个节点（即子链表的尾）
            Node tail = node.child;
            while (tail.next != null) {
                tail = tail.next;
            }

            // 把子链表的尾与原来当前节点的下一个节点连起来
            // 注意空指针的处理
            if (next != null) {
                next.prev = tail;
            }
            tail.next = next;

            // 子链表置空
            node.child = null;

            // 从原来的next节点继续
            // 测试用例有漏洞，这行不加也不报错
            // 因为局限于序列化方式，每一层最多有一个节点有子节点
            // 所以不加下面这行也没报错。。。
            dfs(next);
        } else {
            // 子节点为空，不需要处理
            dfs(node.next);
        }
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
}
