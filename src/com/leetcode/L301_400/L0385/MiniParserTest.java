package com.leetcode.L301_400.L0385;

public class MiniParserTest {
    public static void main(String[] args) {
        MiniParser miniParser = new MiniParser();
        /**
         * 示例 1：
         * 输入：s = "324",
         * 输出：324
         * 解释：你应该返回一个 NestedInteger 对象，其中只包含整数值 324。
         */
        System.out.println(miniParser.deserialize("324"));
        /**
         * 示例 2：
         * 输入：s = "[123,[456,[789]]]",
         * 输出：[123,[456,[789]]]
         * 解释：返回一个 NestedInteger 对象包含一个有两个元素的嵌套列表：
         * 1. 一个 integer 包含值 123
         * 2. 一个包含两个元素的嵌套列表：
         *     i.  一个 integer 包含值 456
         *     ii. 一个包含一个元素的嵌套列表
         *          a. 一个 integer 包含值 789
         */
        System.out.println(miniParser.deserialize("[123,[456,[789]]]"));
    }
}
