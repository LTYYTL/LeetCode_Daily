package com.interview.L0206;

import com.util.ListNode;

public class PalindromeLinkedListTest {
    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        /*** 示例 1:
         * 输入: 1->2
         * 输出: false
         */
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        System.out.println(palindromeLinkedList.isPalindrome(l1));
    }
}
