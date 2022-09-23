package com.leetcode.L701_800.L0707;

import java.util.ArrayList;
import java.util.List;

/**
 * 707. 设计链表
 * 设计链表的实现。您可以选择使用单链表或双链表。
 * 单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。
 * 如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 * <p>
 * 在链表类中实现这些功能：
 * (1)get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * (2)addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * (3)addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * (4)addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 * (5)deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 * <p>
 * 示例：
 * MyLinkedList linkedList = new MyLinkedList();
 * linkedList.addAtHead(1);
 * linkedList.addAtTail(3);
 * linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
 * linkedList.get(1);            //返回2
 * linkedList.deleteAtIndex(1);  //现在链表是1-> 3
 * linkedList.get(1);            //返回3
 * <p>
 * 提示：
 * 所有val值都在 [1, 1000] 之内。
 * 操作次数将在  [1, 1000] 之内。
 * 请不要使用内置的 LinkedList 库。
 */
public class MyLinkedList {
    private final List<Node> list;
    private int length;

    public MyLinkedList() {
        this.list = new ArrayList<>();
        list.add(new Node(-1));
        this.length = 0;
    }

    public int get(int index) {
        if (index >= length)
            return -1;
        return list.get(index + 1).val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        Node oldNode = list.get(0);
        newNode.next = oldNode.next;
        oldNode.next = newNode;
        list.add(1, newNode);
        length++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node oldNode = list.get(length);
        oldNode.next = newNode;
        list.add(newNode);
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
        } else if (index == length) {
            addAtTail(val);
        } else if (index < length) {
            Node oldNode = list.get(index);
            Node newNode = new Node(val);
            newNode.next = oldNode.next;
            oldNode.next = newNode;
            list.add(index + 1, newNode);
            length++;
        }
    }

    public List<Node> getList() {
        return list;
    }

    public void deleteAtIndex(int index) {
        if (index < length) {
            list.remove(index + 1);
            length--;
        }
    }

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
