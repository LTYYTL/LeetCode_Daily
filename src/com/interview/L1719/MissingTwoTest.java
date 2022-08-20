package com.interview.L1719;

import java.util.Arrays;

public class MissingTwoTest {
    public static void main(String[] args) {
        MissingTwo missingTwo = new MissingTwo();
        /*
          示例 1:
          输入: [1]
          输出: [2,3]
         */
        System.out.println(Arrays.toString(missingTwo.missingTwo(new int[]{1})));
        /*
          示例 2:
          输入: [2,3]
          输出: [1,4]
         */
        System.out.println(Arrays.toString(missingTwo.missingTwo(new int[]{2, 3})));
    }
}
