package com.interview.L1704;

public class MissingNumberTest {
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        /*
          示例 1：
          输入：[3,0,1]
          输出：2
         */
        System.out.println(missingNumber.missingNumber(new int[]{3, 0, 1}));
        /*
          示例 2：
          输入：[9,6,4,2,3,5,7,0,1]
          输出：8
         */
        System.out.println(missingNumber.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
