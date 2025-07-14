package com.leetcode.L1201_1300.L1290;

import com.util.ListNode;

public class BinaryListToIntegerConverterTest {
    public static void main(String[] args) {
        BinaryListToIntegerConverter binaryListToIntegerConverter = new BinaryListToIntegerConverter();
        /*
         * 示例 1：
         * 输入：head = [1,0,1]
         * 输出：5
         * 解释：二进制数 (101) 转化为十进制数 (5)
         */
        {
            ListNode listNode = new ListNode();
            listNode = listNode.add(new int[]{1, 0, 1}, listNode);
            System.out.println(binaryListToIntegerConverter.getDecimalValue(listNode));
        }
        /*
         * 示例 2：
         * 输入：head = [0]
         * 输出：0
         */
        {
            ListNode listNode = new ListNode();
            listNode = listNode.add(new int[]{0}, listNode);
            System.out.println(binaryListToIntegerConverter.getDecimalValue(listNode));
        }

    }
}
