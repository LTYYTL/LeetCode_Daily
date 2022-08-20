package com.interview.L1606;

public class SmallestDifferenceTest {
    public static void main(String[] args) {
        SmallestDifference smallestDifference = new SmallestDifference();
        /*
          示例：
          输入：{1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
          输出：3，即数值对(11, 8)
         */
        System.out.println(smallestDifference.smallestDifference(new int[]{1, 3, 15, 11, 2}, new int[]{23, 127, 235, 19, 8}));
    }
}
