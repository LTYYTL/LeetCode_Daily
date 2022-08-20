package com.offer.L0390;

public class MajorityElementTest {
    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        /*
          示例 1:
          输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
          输出: 2
         */
        System.out.println(majorityElement.majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
        System.out.println(majorityElement.majorityElement_sort(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
        System.out.println(majorityElement.majorityElement_moore(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
}
