package com.leetcode.L1101_1200.L1109;


import java.util.Arrays;

public class CorporateFlightBookingsTest {
    public static void main(String[] args) {
        CorporateFlightBookings corporateFlightBookings = new CorporateFlightBookings();
        /**
         * 示例 1：
         * 输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
         * 输出：[10,55,45,25,25]
         * 解释：
         * 航班编号        1   2   3   4   5
         * 预订记录 1 ：   10  10
         * 预订记录 2 ：       20  20
         * 预订记录 3 ：       25  25  25  25
         * 总座位数：      10  55  45  25  25
         * 因此，answer = [10,55,45,25,25]
         */
        System.out.println(Arrays.toString(corporateFlightBookings.corpFlightBookings(new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}},5)));
        System.out.println(Arrays.toString(corporateFlightBookings.corpFlightBookings_diff(new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}},5)));
        /**
         * 示例 2：
         * 输入：bookings = [[1,2,10],[2,2,15]], n = 2
         * 输出：[10,25]
         * 解释：
         * 航班编号        1   2
         * 预订记录 1 ：   10  10
         * 预订记录 2 ：       15
         * 总座位数：      10  25
         * 因此，answer = [10,25]
         */
        System.out.println(Arrays.toString(corporateFlightBookings.corpFlightBookings(new int[][]{{1, 2, 10}, {2, 2, 15}},2)));
        System.out.println(Arrays.toString(corporateFlightBookings.corpFlightBookings_diff(new int[][]{{1, 2, 10}, {2, 2, 15}},2)));
    }
}
