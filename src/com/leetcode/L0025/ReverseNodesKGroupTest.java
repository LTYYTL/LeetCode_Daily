package com.leetcode.L0025;

import com.util.ListNode;

public class ReverseNodesKGroupTest {
    public static void main(String[] args) {
        ReverseNodesKGroup reverseNodesKGroup = new ReverseNodesKGroup();
        /**
         * 示例 1：
         * 输入：head = [1,2,3,4,5], k = 2
         * 输出：[2,1,4,3,5]
         */
        ListNode head = new ListNode();
        head = head.add(new int[]{1,2,3,4,5},head);
        System.out.println(reverseNodesKGroup.reverseKGroup(head, 2));
        /**
         * 示例 2：
         * 输入：head = [1,2,3,4,5], k = 3
         * 输出：[3,2,1,4,5]
         */
        ListNode head1 = new ListNode();
        head1 = head1.add(new int[]{1,2,3,4,5},head1);
        System.out.println(reverseNodesKGroup.reverseKGroup(head1, 3));
        /**
         * 示例 3：
         * 输入：head = [1,2,3,4,5], k = 1
         * 输出：[1,2,3,4,5]
         */
        ListNode head2 = new ListNode();
        head2 = head2.add(new int[]{1,2,3,4,5},head2);
        System.out.println(reverseNodesKGroup.reverseKGroup(head2, 1));
        /**
         * 示例 4：
         * 输入：head = [1], k = 1
         * 输出：[1]
         */
    }
}
