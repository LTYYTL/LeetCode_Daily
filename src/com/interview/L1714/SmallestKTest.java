package com.interview.L1714;

import java.util.Arrays;

public class SmallestKTest {
    public static void main(String[] args) {
        SmallestK smallestK = new SmallestK();
        /*
          示例：
          输入： arr = [1,3,5,7,2,4,6,8], k = 4
          输出： [1,2,3,4]
         */
        System.out.println(Arrays.toString(smallestK.smallestK(new int[]{1, 3, 5, 7, 2, 4, 6, 8}, 4)));
        System.out.println(Arrays.toString(smallestK.smallestK_selection(new int[]{1, 3, 5, 7, 2, 4, 6, 8}, 4)));
        System.out.println(Arrays.toString(smallestK.smallestK_bubble(new int[]{1, 3, 5, 7, 2, 4, 6, 8}, 4)));
        System.out.println(Arrays.toString(smallestK.smallestK_quick(new int[]{1, 3, 5, 7, 2, 4, 6, 8}, 4)));
    }
}
