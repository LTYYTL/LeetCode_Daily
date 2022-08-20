package com.leetcode.L501_600.L0528;

public class RandomPickWithWeightTest {
    public static void main(String[] args) {

        /*
          示例 1：
          输入：
          ["Solution","pickIndex"]
          [[[1]],[]]
          输出：
          [null,0]
          解释：
          Solution solution = new Solution([1]);
          solution.pickIndex(); // 返回 0，因为数组中只有一个元素，所以唯一的选择是返回下标 0。
         */
        RandomPickWithWeight randomPickWithWeight = new RandomPickWithWeight(new int[]{1});
        System.out.println(randomPickWithWeight.pickIndex());
        System.out.println("=============================");
        /*
          示例 2：
          输入：
          ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
          [[[1,3]],[],[],[],[],[]]
          输出：
          [null,1,1,1,1,0]
          解释：
          Solution solution = new Solution([1, 3]);
          solution.pickIndex(); // 返回 1，返回下标 1，返回该下标概率为 3/4 。
          solution.pickIndex(); // 返回 1
          solution.pickIndex(); // 返回 1
          solution.pickIndex(); // 返回 1
          solution.pickIndex(); // 返回 0，返回下标 0，返回该下标概率为 1/4 。
          由于这是一个随机问题，允许多个答案，因此下列输出都可以被认为是正确的:
          [null,1,1,1,1,0]
          [null,1,1,1,1,1]
          [null,1,1,1,0,0]
          [null,1,1,1,0,1]
          [null,1,0,1,0,0]
          ......
          诸若此类。
         */
        RandomPickWithWeight randomPickWithWeight1 = new RandomPickWithWeight(new int[]{3, 1, 2, 4});
        System.out.println(randomPickWithWeight1.pickIndex());
        System.out.println(randomPickWithWeight1.pickIndex());
        System.out.println(randomPickWithWeight1.pickIndex());
        System.out.println(randomPickWithWeight1.pickIndex());
        System.out.println(randomPickWithWeight1.pickIndex());
    }
}
