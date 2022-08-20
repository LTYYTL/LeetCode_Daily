package com.leetcode.L301_400.L0334;

public class IncreasingTripletSubTest {
    public static void main(String[] args) {
        IncreasingTripletSub increasingTripletSub = new IncreasingTripletSub();
        /*
          示例 1：
          输入：nums = [1,2,3,4,5]
          输出：true
          解释：任何 i < j < k 的三元组都满足题意
         */
        System.out.println(increasingTripletSub.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        /*
          示例 2：
          输入：nums = [5,4,3,2,1]
          输出：false
          解释：不存在满足题意的三元组
         */
        System.out.println(increasingTripletSub.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        /*
          示例 3：
          输入：nums = [2,1,5,0,4,6]
          输出：true
          解释：三元组 (3, 4, 5) 满足题意，因为 nums[3] == 0 < nums[4] == 4 < nums[5] == 6
         */
        System.out.println(increasingTripletSub.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }
}
