package com.leetcode.L1401_1500.L1436;

import java.util.ArrayList;
import java.util.List;

public class DestinationCityTest {
    public static void main(String[] args) {
        DestinationCity destinationCity = new DestinationCity();
        /**
         * 示例 1：
         * 输入：paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
         * 输出："Sao Paulo"
         * 解释：从 "London" 出发，最后抵达终点站 "Sao Paulo" 。本次旅行的路线是 "London" -> "New York" -> "Lima" -> "Sao Paulo" 。
         */
        List<List<String>> paths = new ArrayList<>();
        List<String> a1 = new ArrayList<>();
        a1.add("London");
        a1.add("New York");
        List<String> a2 = new ArrayList<>();
        a2.add("New York");
        a2.add("Lima");
        List<String> a3 = new ArrayList<>();
        a3.add("Lima");
        a3.add("Sao Paulo");
        paths.add(a1);
        paths.add(a2);
        paths.add(a3);
        System.out.println(destinationCity.destCity(paths));
        /**
         * 示例 2：
         * 输入：paths = [["B","C"],["D","B"],["C","A"]]
         * 输出："A"
         * 解释：所有可能的线路是：
         * "D" -> "B" -> "C" -> "A".
         * "B" -> "C" -> "A".
         * "C" -> "A".
         * "A".
         * 显然，旅行终点站是 "A" 。
         */
    }
}
