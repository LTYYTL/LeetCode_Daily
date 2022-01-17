package com.leetcode.L301_400.L0382;

import com.util.ListNode;

import java.util.Random;

/**
 * 382. 链表随机节点
 * 给你一个单链表，随机选择链表的一个节点，并返回相应的节点值。每个节点 被选中的概率一样 。
 *
 * 实现 Solution 类：
 * (1)Solution(ListNode head) 使用整数数组初始化对象。
 * (2)int getRandom() 从链表中随机选择一个节点并返回该节点的值。链表中所有节点被选中的概率相等。
 *
 * 示例：
 * 输入
 * ["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
 * [[[1, 2, 3]], [], [], [], [], []]
 * 输出
 * [null, 1, 3, 2, 2, 3]
 * 解释
 * Solution solution = new Solution([1, 2, 3]);
 * solution.getRandom(); // 返回 1
 * solution.getRandom(); // 返回 3
 * solution.getRandom(); // 返回 2
 * solution.getRandom(); // 返回 2
 * solution.getRandom(); // 返回 3
 * // getRandom() 方法应随机返回 1、2、3中的一个，每个元素被返回的概率相等。
 *
 * 提示：
 * 链表中的节点数在范围 [1, 104] 内
 * -104 <= Node.val <= 104
 * 至多调用 getRandom 方法 104 次
 *
 * 进阶：
 * 如果链表非常大且长度未知，该怎么处理？
 * 你能否在不使用额外空间的情况下解决此问题？
 */
public class Solution {
    /**
     * 方法：设计
     */
    ListNode head;
    Random random = new Random();
    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int i = 0;
        int res = 0;
        ListNode p = head;
        //遍历
        while (p != null){
            i++;
            //生成一个[0,i)之间的整数
            //这个整数等于0的概率就是1/i
            if (0 == random.nextInt(i)){
                res = p.val;
            }
            p = p.next;
        }
        return res;
    }
}
