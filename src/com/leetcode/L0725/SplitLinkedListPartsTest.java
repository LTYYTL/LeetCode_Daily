package com.leetcode.L0725;

import com.util.ListNode;

import java.util.Arrays;

public class SplitLinkedListPartsTest {
    public static void main(String[] args) {
        SplitLinkedListParts splitLinkedListParts = new SplitLinkedListParts();
        /**
         * 示例 1：
         * 输入：head = [1,2,3], k = 5
         * 输出：[[1],[2],[3],[],[]]
         * 解释：
         * 第一个元素 output[0] 为 output[0].val = 1 ，output[0].next = null 。
         * 最后一个元素 output[4] 为 null ，但它作为 ListNode 的字符串表示是 [] 。
         */
        ListNode l1 = new ListNode();
        l1 = l1.add(new int[]{1,2,3},l1);
        System.out.println(Arrays.toString(splitLinkedListParts.splitListToParts(l1, 5)));
        /**
         * 示例 2：
         * 输入：head = [1,2,3,4,5,6,7,8,9,10], k = 3
         * 输出：[[1,2,3,4],[5,6,7],[8,9,10]]
         * 解释：
         * 输入被分成了几个连续的部分，并且每部分的长度相差不超过 1 。前面部分的长度大于等于后面部分的长度。
         */
        ListNode l2 = new ListNode();
        l2 = l2.add(new int[]{1,2,3,4,5,6,7,8,9,10},l2);
        System.out.println(Arrays.toString(splitLinkedListParts.splitListToParts(l2, 3)));
    }
}
