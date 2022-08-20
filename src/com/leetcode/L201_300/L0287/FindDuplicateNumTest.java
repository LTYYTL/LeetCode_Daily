package com.leetcode.L201_300.L0287;

public class FindDuplicateNumTest {
    public static void main(String[] args) {
        FindDuplicateNum findDuplicateNum = new FindDuplicateNum();
        /*
          示例 1：
          输入：nums = [1,3,4,2,2]
          输出：2
         */
        System.out.println(findDuplicateNum.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        System.out.println(findDuplicateNum.findDuplicate_two(new int[]{1, 3, 4, 2, 2}));
        /*
          示例 2：
          输入：nums = [3,1,3,4,2]
          输出：3
         */
        System.out.println(findDuplicateNum.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        System.out.println(findDuplicateNum.findDuplicate_two(new int[]{3, 1, 3, 4, 2}));
        /*
          示例 3：
          输入：nums = [1,1]
          输出：1
         */
        System.out.println(findDuplicateNum.findDuplicate(new int[]{1, 1}));
        System.out.println(findDuplicateNum.findDuplicate_two(new int[]{1, 1}));
        /*
          示例 4：
          输入：nums = [1,1,2]
          输出：1
         */
        System.out.println(findDuplicateNum.findDuplicate(new int[]{1, 1, 2}));
        System.out.println(findDuplicateNum.findDuplicate_two(new int[]{1, 1, 2}));
    }
}
