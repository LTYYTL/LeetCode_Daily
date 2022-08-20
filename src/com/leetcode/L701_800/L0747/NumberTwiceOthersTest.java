package com.leetcode.L701_800.L0747;

public class NumberTwiceOthersTest {
    public static void main(String[] args) {
        NumberTwiceOthers numberTwiceOthers = new NumberTwiceOthers();
        /*
          示例 1：
          输入：nums = [3,6,1,0]
          输出：1
          解释：6 是最大的整数，对于数组中的其他整数，6 大于数组中其他元素的两倍。6 的下标是 1 ，所以返回 1 。
         */
        System.out.println(numberTwiceOthers.dominantIndex(new int[]{3, 6, 1, 0}));
        /*
          示例 2：
          输入：nums = [1,2,3,4]
          输出：-1
          解释：4 没有超过 3 的两倍大，所以返回 -1 。
         */
        System.out.println(numberTwiceOthers.dominantIndex(new int[]{1, 2, 3, 4}));
        /*
          示例 3：
          输入：nums = [1]
          输出：0
          解释：因为不存在其他数字，所以认为现有数字 1 至少是其他数字的两倍。
         */
        System.out.println(numberTwiceOthers.dominantIndex(new int[]{1}));
    }
}
