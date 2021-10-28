package com.offerII.L066;

public class MapSumTest {
    public static void main(String[] args) {
        /** * 示例：
         * 输入：
         * inputs = ["MapSum", "insert", "sum", "insert", "sum"]
         * inputs = [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
         * 输出：
         * [null, null, 3, null, 5]
         * 解释：
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
