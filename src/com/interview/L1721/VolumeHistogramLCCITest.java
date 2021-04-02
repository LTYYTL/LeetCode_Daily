package com.interview.L1721;

public class VolumeHistogramLCCITest {
    public static void main(String[] args) {
        VolumeHistogramLCCI volumeHistogramLCCI = new VolumeHistogramLCCI();
        /**
         * 示例:
         * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
         * 输出: 6
         */
        System.out.println(volumeHistogramLCCI.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
