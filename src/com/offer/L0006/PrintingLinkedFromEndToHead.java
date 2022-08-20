package com.offer.L0006;

import com.util.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 * 限制：
 * 0 <= 链表长度 <= 10000
 */
public class PrintingLinkedFromEndToHead {
    /**
     * 方法一：栈
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        //栈
        LinkedList<Integer> stack = new LinkedList<>();
        //遍历链表，将元素存入栈
        while (head != null){
            stack.add(head.val);
            head = head.next;
        }
        //取数
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; ++i){
            res[i] = stack.removeLast();
        }
        return res;
    }




    /**
     * 方法二：递归
     *
     * @param head
     * @return
     */
    ArrayList<Integer> tmp = new ArrayList<>();
    public int[] reversePrint_recursive(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }

}
