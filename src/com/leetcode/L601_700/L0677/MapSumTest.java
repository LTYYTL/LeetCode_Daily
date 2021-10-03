package com.leetcode.L601_700.L0677;

public class MapSumTest {
    public static void main(String[] args) {
        /**
         * MapSum mapSum = new MapSum();
         * mapSum.insert("apple", 3);
         * mapSum.sum("ap");           // return 3 (apple = 3)
         * mapSum.insert("app", 2);
         * mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
         */
        MapSum mapSum = new MapSum();
        mapSum.insert("apple",3);
        System.out.println(mapSum.sum("ap"));
        mapSum.insert("app",2);
        System.out.println(mapSum.sum("ap"));
    }
}
