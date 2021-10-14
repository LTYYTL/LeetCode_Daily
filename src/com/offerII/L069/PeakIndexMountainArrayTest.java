package com.offerII.L069;

public class PeakIndexMountainArrayTest {
    public static void main(String[] args) {
        PeakIndexMountainArray peakIndexMountainArray = new PeakIndexMountainArray();
        /**
         * 示例 1：
         * 输入：arr = [0,1,0]
         * 输出：1
         */
        System.out.println(peakIndexMountainArray.peakIndexInMountainArray(new int[]{0, 1, 0}));
        /**
         * 示例 2：
         * 输入：arr = [1,3,5,4,2]
         * 输出：2
         */
        System.out.println(peakIndexMountainArray.peakIndexInMountainArray(new int[]{1,3,5,4,2}));
        /**
         * 示例 3：
         * 输入：arr = [0,10,5,2]
         * 输出：1
         */
        System.out.println(peakIndexMountainArray.peakIndexInMountainArray(new int[]{0,10,5,2}));
        /**
         * 示例 4：
         * 输入：arr = [3,4,5,1]
         * 输出：2
         */
        System.out.println(peakIndexMountainArray.peakIndexInMountainArray(new int[]{3,4,5,1}));
        /**
         * 示例 5：
         * 输入：arr = [24,69,100,99,79,78,67,36,26,19]
         * 输出：2
         */
        System.out.println(peakIndexMountainArray.peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
    }
}
