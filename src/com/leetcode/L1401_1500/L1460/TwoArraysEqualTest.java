package com.leetcode.L1401_1500.L1460;

public class TwoArraysEqualTest {
    public static void main(String[] args) {
        TwoArraysEqual twoArraysEqual = new TwoArraysEqual();
        /*
          示例 1：
          输入：target = [1,2,3,4], arr = [2,4,1,3]
          输出：true
          解释：你可以按照如下步骤使 arr 变成 target：
          1- 翻转子数组 [2,4,1] ，arr 变成 [1,4,2,3]
          2- 翻转子数组 [4,2] ，arr 变成 [1,2,4,3]
          3- 翻转子数组 [4,3] ，arr 变成 [1,2,3,4]
          上述方法并不是唯一的，还存在多种将 arr 变成 target 的方法。
         */
        System.out.println(twoArraysEqual.canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
        /*
          示例 2：
          输入：target = [7], arr = [7]
          输出：true
          解释：arr 不需要做任何翻转已经与 target 相等。
         */
        System.out.println(twoArraysEqual.canBeEqual(new int[]{7}, new int[]{7}));
        /*
          示例 3：
          输入：target = [3,7,9], arr = [3,7,11]
          输出：false
          解释：arr 没有数字 9 ，所以无论如何也无法变成 target 。
         */
        System.out.println(twoArraysEqual.canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11}));
    }
}
