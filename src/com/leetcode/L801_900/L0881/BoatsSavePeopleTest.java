package com.leetcode.L801_900.L0881;

public class BoatsSavePeopleTest {
    public static void main(String[] args) {
        BoatsSavePeople boatsSavePeople = new BoatsSavePeople();
        /**
         * 示例 1：
         * 输入：people = [1,2], limit = 3
         * 输出：1
         * 解释：1 艘船载 (1, 2)
         */
        System.out.println(boatsSavePeople.numRescueBoats(new int[]{1, 2}, 3));
        /**
         * 示例 2：
         * 输入：people = [3,2,2,1], limit = 3
         * 输出：3
         * 解释：3 艘船分别载 (1, 2), (2) 和 (3)
         */
        System.out.println(boatsSavePeople.numRescueBoats(new int[]{3, 2, 2, 1}, 3));
        /**
         * 示例 3：
         * 输入：people = [3,5,3,4], limit = 5
         * 输出：4
         * 解释：4 艘船分别载 (3), (3), (4), (5)
         */
        System.out.println(boatsSavePeople.numRescueBoats(new int[]{3, 5, 3, 4}, 5));
    }
}
