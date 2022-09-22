package com.leetcode.L1601_1700.L1640;

public class CheckArrayConcatenationTest {
    public static void main(String[] args) {
        CheckArrayConcatenation checkArrayConcatenation = new CheckArrayConcatenation();
        /*
          示例 1：
          输入：arr = [15,88], pieces = [[88],[15]]
          输出：true
          解释：依次连接 [15] 和 [88]
         */
        System.out.println(checkArrayConcatenation.canFormArray(new int[]{15, 88}, new int[][]{{88}, {15}}));
        /*
          示例 2：
          输入：arr = [49,18,16], pieces = [[16,18,49]]
          输出：false
          解释：即便数字相符，也不能重新排列 pieces[0]
         */
        System.out.println(checkArrayConcatenation.canFormArray(new int[]{49, 18, 16}, new int[][]{{16, 18, 49}}));
        /*
          示例 3：
          输入：arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
          输出：true
          解释：依次连接 [91]、[4,64] 和 [78]
         */
        System.out.println(checkArrayConcatenation.canFormArray(new int[]{91, 4, 64, 78}, new int[][]{{78}, {4, 64}, {91}}));
    }
}
