package com.leetcode.L501_600.L0599;

import java.util.Arrays;

public class MinIndexSumTest {
    public static void main(String[] args) {
        MinIndexSum minIndexSum = new MinIndexSum();
        /**
         * 示例 1:
         * 输入: list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
         * 输出: ["Shogun"]
         * 解释: 他们唯一共同喜爱的餐厅是“Shogun”。
         */
        System.out.println(
                Arrays.toString(
                    minIndexSum.findRestaurant(
                            new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                            new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}
                    )
                )
        );
        /**
         * 示例 2:
         * 输入:list1 = ["Shogun", "Tapioca Express", "Burger King", "KFC"]，list2 = ["KFC", "Shogun", "Burger King"]
         * 输出: ["Shogun"]
         * 解释: 他们共同喜爱且具有最小索引和的餐厅是“Shogun”，它有最小的索引和1(0+1)。
         */
        System.out.println(
                Arrays.toString(
                        minIndexSum.findRestaurant(
                                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                                new String[]{"KFC", "Shogun", "Burger King"}
                        )
                )
        );
    }
}
