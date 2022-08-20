package com.leetcode.L101_200.L0118;

public class PascalTriangleTest {
    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        /*
          示例:
          输入: 5
          输出:
          [
               [1],
              [1,1],
             [1,2,1],
            [1,3,3,1],
           [1,4,6,4,1]
          ]
         */
        System.out.println(pascalTriangle.generate(5).toString());
    }
}
