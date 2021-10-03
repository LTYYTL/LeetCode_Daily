package com.leetcode.L1701_1800.L1744;

import java.util.Arrays;

public class EatFavoriteCandyOnFavoriteDayTest {
    public static void main(String[] args) {
        EatFavoriteCandyOnFavoriteDay eatFavoriteCandyOnFavoriteDay = new EatFavoriteCandyOnFavoriteDay();
        /**
         * 示例 1：
         * 输入：candiesCount = [7,4,5,3,8], queries = [[0,2,2],[4,2,4],[2,13,1000000000]]
         * 输出：[true,false,true]
         * 提示：
         * 1- 在第 0 天吃 2 颗糖果(类型 0），第 1 天吃 2 颗糖果（类型 0），第 2 天你可以吃到类型 0 的糖果。
         * 2- 每天你最多吃 4 颗糖果。即使第 0 天吃 4 颗糖果（类型 0），第 1 天吃 4 颗糖果（类型 0 和类型 1），你也没办法在第 2 天吃到类型 4 的糖果。换言之，你没法在每天吃 4 颗糖果的限制下在第 2 天吃到第 4 类糖果。
         * 3- 如果你每天吃 1 颗糖果，你可以在第 13 天吃到类型 2 的糖果。
         */
        System.out.println(Arrays.toString(eatFavoriteCandyOnFavoriteDay.canEat(new int[]{7, 4, 5, 3, 8}, new int[][]{{0, 2, 2}, {4, 2, 4}, {2, 13, 1000000000}})));
        /**
         * 示例 2：
         * 输入：candiesCount = [5,2,6,4,1], queries = [[3,1,2],[4,10,3],[3,10,100],[4,100,30],[1,3,1]]
         * 输出：[false,true,true,false,false]
         */
        System.out.println(Arrays.toString(eatFavoriteCandyOnFavoriteDay.canEat(new int[]{5,2,6,4,1}, new int[][]{{3,1,2}, {4,10,3}, {3,10,100},{1, 3, 1}})));
    }
}
