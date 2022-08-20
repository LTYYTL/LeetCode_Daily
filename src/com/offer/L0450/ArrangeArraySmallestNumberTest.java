package com.offer.L0450;

public class ArrangeArraySmallestNumberTest {
    public static void main(String[] args) {
        ArrangeArraySmallestNumber arrangeArraySmallestNumber = new ArrangeArraySmallestNumber();
        /*
          示例 1:
          输入: [10,2]
          输出: "102"
         */
        System.out.println(arrangeArraySmallestNumber.minNumber(new int[]{10, 2}));
        System.out.println(arrangeArraySmallestNumber.minNumber_sort(new int[]{10, 2}));
        /*
          示例 2:
          输入: [3,30,34,5,9]
          输出: "3033459"
         */
        System.out.println(arrangeArraySmallestNumber.minNumber(new int[]{3, 30, 34, 5, 9}));
        System.out.println(arrangeArraySmallestNumber.minNumber_sort(new int[]{3, 30, 34, 5, 9}));
    }
}
