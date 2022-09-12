package com.leetcode.L1601_1700.L1608;

public class ArrayElementsTest {
    public static void main(String[] args) {
        ArrayElements arrayElements = new ArrayElements();
        /*
          示例 1：
          输入：nums = [3,5]
          输出：2
          解释：有 2 个元素（3 和 5）大于或等于 2 。
         */
        System.out.println(arrayElements.specialArray(new int[]{3, 5}));
        /*
          示例 2：
          输入：nums = [0,0]
          输出：-1
          解释：没有满足题目要求的特殊数组，故而也不存在特征值 x 。
          如果 x = 0，应该有 0 个元素 >= x，但实际有 2 个。
          如果 x = 1，应该有 1 个元素 >= x，但实际有 0 个。
          如果 x = 2，应该有 2 个元素 >= x，但实际有 0 个。
          x 不能取更大的值，因为 nums 中只有两个元素。
         */
        System.out.println(arrayElements.specialArray(new int[]{0, 0}));
        /*
          示例 3：
          输入：nums = [0,4,3,0,4]
          输出：3
          解释：有 3 个元素大于或等于 3 。
         */
        System.out.println(arrayElements.specialArray(new int[]{0, 4, 3, 0, 4}));
        /*
          示例 4：
          输入：nums = [3,6,7,7,0]
          输出：-1
         */
        System.out.println(arrayElements.specialArray(new int[]{3, 6, 7, 7, 0}));
    }
}
