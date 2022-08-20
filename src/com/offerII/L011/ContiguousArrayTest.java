package com.offerII.L011;

public class ContiguousArrayTest {
    public static void main(String[] args) {
        ContiguousArray contiguousArray = new ContiguousArray();
        /*
          示例 1:
          输入: nums = [0,1]
          输出: 2
          说明: [0, 1] 是具有相同数量0和1的最长连续子数组。
         */
        System.out.println(contiguousArray.findMaxLength(new int[]{0, 1}));
        /*
          示例 2:
          输入: nums = [0,1,0]
          输出: 2
          说明: [0, 1] (或 [1, 0]) 是具有相同数量0和1的最长连续子数组。
         */
        System.out.println(contiguousArray.findMaxLength(new int[]{0, 1, 0}));
    }
}
