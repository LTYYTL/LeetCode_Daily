package com.leetcode.L401_500.L0475;

public class HeatersTest {
    public static void main(String[] args) {
        Heaters heaters = new Heaters();
        /**
         * 示例 1:
         * 输入: houses = [1,2,3], heaters = [2]
         * 输出: 1
         * 解释: 仅在位置2上有一个供暖器。如果我们将加热半径设为1，那么所有房屋就都能得到供暖。
         */
        System.out.println(heaters.findRadius(new int[]{1, 2, 3}, new int[]{2}));
        /**
         * 示例 2:
         * 输入: houses = [1,2,3,4], heaters = [1,4]
         * 输出: 1
         * 解释: 在位置1, 4上有两个供暖器。我们需要将加热半径设为1，这样所有房屋就都能得到供暖。
         */
        System.out.println(heaters.findRadius(new int[]{1, 2, 3, 4}, new int[]{1, 4}));
        /**
         * 示例 3：
         * 输入：houses = [1,5], heaters = [2]
         * 输出：3
         */
        System.out.println(heaters.findRadius(new int[]{1, 5}, new int[]{2}));
    }
}
