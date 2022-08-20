package com.leetcode.L1001_1100.L1094;

public class CarPoolingTest {
    public static void main(String[] args) {
        CarPooling carPooling = new CarPooling();
        /*
          示例 1：
          输入：trips = [[2,1,5],[3,3,7]], capacity = 4
          输出：false
         */
        System.out.println(carPooling.carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 4));
        /*
          示例 2：
          输入：trips = [[2,1,5],[3,3,7]], capacity = 5
          输出：true
         */
        System.out.println(carPooling.carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 5));
        /*
          示例 3：
          输入：trips = [[2,1,5],[3,5,7]], capacity = 3
          输出：true
         */
        System.out.println(carPooling.carPooling(new int[][]{{2, 1, 5}, {3, 5, 7}}, 3));
        /*
          示例 4：
          输入：trips = [[3,2,7],[3,7,9],[8,3,9]], capacity = 11
          输出：true
         */
        System.out.println(carPooling.carPooling(new int[][]{{3, 2, 7}, {3, 7, 9}, {8, 3, 9}}, 11));
    }
}
