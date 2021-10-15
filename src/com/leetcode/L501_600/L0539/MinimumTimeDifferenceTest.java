package com.leetcode.L501_600.L0539;

import java.util.ArrayList;
import java.util.List;

public class MinimumTimeDifferenceTest {
    public static void main(String[] args) {
        MinimumTimeDifference minimumTimeDifference = new MinimumTimeDifference();
        /**
         * 示例 1：
         * 输入：timePoints = ["23:59","00:00"]
         * 输出：1
         */
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:00");
        System.out.println(minimumTimeDifference.findMinDifference(timePoints));
        /**
         * 示例 2：
         * 输入：timePoints = ["00:00","23:59","00:00"]
         * 输出：0
         */
        timePoints.clear();
        timePoints.add("23:59");
        timePoints.add("00:00");
        timePoints.add("00:00");
        System.out.println(minimumTimeDifference.findMinDifference(timePoints));
    }
}
