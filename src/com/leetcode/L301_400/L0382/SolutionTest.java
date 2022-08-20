package com.leetcode.L301_400.L0382;

import com.util.ListNode;

public class SolutionTest {
    public static void main(String[] args) {
        /* * 示例：
          输入
          ["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
          [[[1, 2, 3]], [], [], [], [], []]
          输出
          [null, 1, 3, 2, 2, 3]
          解释
          Solution solution = new Solution([1, 2, 3]);
          solution.getRandom(); // 返回 1
          solution.getRandom(); // 返回 3
          solution.getRandom(); // 返回 2
          solution.getRandom(); // 返回 2
          solution.getRandom(); // 返回 3
          // getRandom() 方法应随机返回 1、2、3中的一个，每个元素被返回的概率相等。
         */
        ListNode listNode = new ListNode();
        listNode = listNode.add(new int[]{1, 2, 3}, listNode);
        Solution solution = new Solution(listNode);
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());
    }
}
