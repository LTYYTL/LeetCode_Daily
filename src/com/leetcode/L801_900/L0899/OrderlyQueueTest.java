package com.leetcode.L801_900.L0899;

public class OrderlyQueueTest {
    public static void main(String[] args) {
        OrderlyQueue orderlyQueue = new OrderlyQueue();
        /*
          示例 1：
          输入：s = "cba", k = 1
          输出："acb"
          解释：
          在第一步中，我们将第一个字符（“c”）移动到最后，获得字符串 “bac”。
          在第二步中，我们将第一个字符（“b”）移动到最后，获得最终结果 “acb”。
         */
        System.out.println(orderlyQueue.orderlyQueue("cba", 1));
        /*
          示例 2：
          输入：s = "baaca", k = 3
          输出："aaabc"
          解释：
          在第一步中，我们将第一个字符（“b”）移动到最后，获得字符串 “aacab”。
          在第二步中，我们将第三个字符（“c”）移动到最后，获得最终结果 “aaabc”。
         */
        System.out.println(orderlyQueue.orderlyQueue("baaca", 3));
    }
}
