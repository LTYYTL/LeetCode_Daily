package com.leetcode.L701_800.L0707;

public class MyLinkedListTest {
    public static void main(String[] args) {
        /*
          示例：
          MyLinkedList linkedList = new MyLinkedList();
          linkedList.addAtHead(1);
          linkedList.addAtTail(3);
          linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
          linkedList.get(1);            //返回2
          linkedList.deleteAtIndex(1);  //现在链表是1-> 3
          linkedList.get(1);            //返回3
         */
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList.get(1));
    }
}
