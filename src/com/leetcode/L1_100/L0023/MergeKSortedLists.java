package com.leetcode.L1_100.L0023;

import com.util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. 合并K个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 *
 * 示例 1：
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 * 解释：链表数组如下：
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 将它们合并到一个有序链表中得到。
 * 1->1->2->3->4->4->5->6
 *
 * 示例 2：
 * 输入：lists = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：lists = [[]]
 * 输出：[]
 *
 * 提示：
 * k == lists.length
 * 0 <= k <= 10^4
 * 0 <= lists[i].length <= 500
 * -10^4 <= lists[i][j] <= 10^4
 * lists[i] 按 升序 排列
 * lists[i].length 的总和不超过 10^4
 */
public class MergeKSortedLists {
    /**
     * 方法一：最小堆
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        //空值情况
        if (lists.length == 0 || lists == null) {
            return null;
        }
        //创建小根堆，并定义好排序
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        //将k个链表的第一个节点放入堆中
        for (ListNode head : lists) {
            if (head != null) {
                queue.add(head);
            }
        }
        //从堆顶取出最小节点，并将该节点的下一个节点加入堆中
        while (queue.size() > 0) {
            ListNode node = queue.poll();
            cur.next = node;
            cur = cur.next;
            if (node.next != null) {
                queue.add(node.next);
            }
        }
        cur.next = null;
        return dummy.next;
    }

    /**
     * 方法二：递归（两两合并）
     * @param lists
     * @return
     */
    public ListNode mergeKLists_merge(ListNode[] lists){
        if (lists.length == 0 || lists == null){
            return null;
        }
        ListNode res = lists[0];
        for (int i = 1; i < lists.length; i++){
            res = merge(res,lists[i]);
        }
        return res;
    }

    /**
     * 合并两个有序链表
     * @param a
     * @param b
     * @return
     */
    private ListNode merge(ListNode a, ListNode b) {
        if(a==null || b==null) {
            return (a==null) ? b : a;
        }
        if(a.val<=b.val) {
            a.next = merge(a.next,b);
            return a;
        } else {
            b.next = merge(a,b.next);
            return b;
        }
    }

    /**
     * 方法三：分治法
     * @param lists
     * @return
     */
    public ListNode mergeKLists_Divide(ListNode[] lists) {
        if(lists==null || lists.length==0) {
            return null;
        }
        return helper(lists,0,lists.length-1);
    }

    //通过mid将数组一分为二，并不断缩小规模，当规模为1时返回并开始合并
    //通过合并两个链表，不断增大其规模，整体看就是不断缩小-最后不断扩大的过程
    private ListNode helper(ListNode[] lists, int begin, int end) {
        if(begin==end) {
            return lists[begin];
        }
        int mid = begin+(end-begin)/2;
        ListNode left = helper(lists,begin,mid);
        ListNode right = helper(lists,mid+1,end);
        return merge(left,right);
    }

}
