package com.offerII.L040;

public class MaximalRectangleTest {
    public static void main(String[] args) {
        MaximalRectangle maximalRectangle = new MaximalRectangle();
        /*
          示例 1：
          输入：matrix = ["10100","10111","11111","10010"]
          输出：6
          解释：最大矩形如上图所示。
         */
        System.out.println(maximalRectangle.maximalRectangle(new String[]{"10100", "10111", "11111", "10010"}));
        /*
          示例 2：
          输入：matrix = []
          输出：0
         */
        System.out.println(maximalRectangle.maximalRectangle(new String[]{}));
        /*
          示例 3：
          输入：matrix = ["0"]
          输出：0
         */
        System.out.println(maximalRectangle.maximalRectangle(new String[]{"0"}));
        /*
          示例 4：
          输入：matrix = ["1"]
          输出：1
         */
        System.out.println(maximalRectangle.maximalRectangle(new String[]{"1"}));
        /*
          示例 5：
          输入：matrix = ["00"]
          输出：0
         */
        System.out.println(maximalRectangle.maximalRectangle(new String[]{"00"}));
    }
}
