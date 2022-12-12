package com.leetcode.L1701_1800.L1732;

public class FindHighestAltitudeTest {
    public static void main(String[] args) {
        FindHighestAltitude findHighestAltitude = new FindHighestAltitude();
        /*
          示例 1：
          输入：gain = [-5,1,5,0,-7]
          输出：1
          解释：海拔高度依次为 [0,-5,-4,1,1,-6] 。最高海拔为 1 。
         */
        System.out.println(findHighestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
        /*
          示例 2：
          输入：gain = [-4,-3,-2,-1,4,3,2]
          输出：0
          解释：海拔高度依次为 [0,-4,-7,-9,-10,-6,-3,-1] 。最高海拔为 0 。
         */
        System.out.println(findHighestAltitude.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }
}
