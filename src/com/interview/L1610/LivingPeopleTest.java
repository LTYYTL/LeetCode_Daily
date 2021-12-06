package com.interview.L1610;

public class LivingPeopleTest {
    public static void main(String[] args) {
        LivingPeople livingPeople = new LivingPeople();
        /**
         * 示例：
         * 输入：
         * birth = {1900, 1901, 1950}
         * death = {1948, 1951, 2000}
         * 输出： 1901
         */
        System.out.println(livingPeople.maxAliveYear(new int[]{1900, 1901, 1950}, new int[]{1948, 1951, 2000}));
    }
}
