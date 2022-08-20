package com.interview.L1710;

public class FindMajorityElementTest {
    public static void main(String[] args) {
        FindMajorityElement findMajorityElement = new FindMajorityElement();
        /*
          示例 1：
          输入：[1,2,5,9,5,9,5,5,5]
          输出：5
         */
        System.out.println(findMajorityElement.majorityElement(new int[]{1, 2, 5, 9, 5, 9, 5, 5, 5}));
        /*
          示例 2：
          输入：[3,2]
          输出：-1
         */
        System.out.println(findMajorityElement.majorityElement(new int[]{3, 2}));
        /*
          示例 3：
          输入：[2,2,1,1,1,2,2]
          输出：2
         */
        System.out.println(findMajorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
