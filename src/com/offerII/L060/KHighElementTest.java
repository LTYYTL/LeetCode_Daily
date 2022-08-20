package com.offerII.L060;

import java.util.Arrays;

public class KHighElementTest {
    public static void main(String[] args) {
        KHighElement kHighElement = new KHighElement();
        /*
          示例 1:
          输入: nums = [1,1,1,2,2,3], k = 2
          输出: [1,2]
         */
        System.out.println(Arrays.toString(kHighElement.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        /*
          示例 2:
          输入: nums = [1], k = 1
          输出: [1]
         */
        System.out.println(Arrays.toString(kHighElement.topKFrequent(new int[]{1}, 1)));
    }
}
