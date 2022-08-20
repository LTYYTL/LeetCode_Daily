package com.interview.L1617;

public class ContiguousSeqTest {
    public static void main(String[] args) {
        ContiguousSeq contiguousSeq = new ContiguousSeq();
        /*
          示例：
          输入： [-2,1,-3,4,-1,2,1,-5,4]
          输出： 6
          解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
         */
        System.out.println(contiguousSeq.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
