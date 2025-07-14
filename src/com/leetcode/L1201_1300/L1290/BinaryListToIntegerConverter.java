package com.leetcode.L1201_1300.L1290;

import com.util.ListNode;

/**
 * 1290. 二进制链表转整数
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 * 最高位 在链表的头部。
 *
 * 示例 1：
 * 输入：head = [1,0,1]
 * 输出：5
 * 解释：二进制数 (101) 转化为十进制数 (5)
 *
 * 示例 2：
 * 输入：head = [0]
 * 输出：0
 *
 *
 * 提示：
 *
 * 链表不为空。
 * 链表的结点总数不超过 30。
 * 每个结点的值不是 0 就是 1。
 */
public class BinaryListToIntegerConverter {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null){
            sb.append(head.val);
            head = head.next;
        }

        return getInt(sb.toString());

    }

    private int getInt(String s){
        int res = 0;
        int log = 2;
        int n = s.length() - 1;
        for (int i = n; i >= 0; i--) {
            int cur = s.charAt(i) - '0';
            int tmp = (int) (cur * Math.pow(log, n -i ));
            res += tmp;
        }

        return res;
    }
}
