package com.leetcode.L1601_1700.L1656;

public class OrderedStreamTest {
    public static void main(String[] args) {
        OrderedStream orderedStream = new OrderedStream(5);
        /**
         * 示例：
         * 输入
         * ["OrderedStream", "insert", "insert", "insert", "insert", "insert"]
         * [[5], [3, "ccccc"], [1, "aaaaa"], [2, "bbbbb"], [5, "eeeee"], [4, "ddddd"]]
         * 输出
         * [null, [], ["aaaaa"], ["bbbbb", "ccccc"], [], ["ddddd", "eeeee"]]
         * 解释
         * OrderedStream os= new OrderedStream(5);
         * os.insert(3, "ccccc"); // 插入 (3, "ccccc")，返回 []
         * os.insert(1, "aaaaa"); // 插入 (1, "aaaaa")，返回 ["aaaaa"]
         * os.insert(2, "bbbbb"); // 插入 (2, "bbbbb")，返回 ["bbbbb", "ccccc"]
         * os.insert(5, "eeeee"); // 插入 (5, "eeeee")，返回 []
         * os.insert(4, "ddddd"); // 插入 (4, "ddddd")，返回 ["ddddd", "eeeee"]
         */
        System.out.println(orderedStream.insert(3, "ccccc"));
        System.out.println(orderedStream.insert(1, "aaaaa"));
        System.out.println(orderedStream.insert(2, "bbbbb"));
        System.out.println(orderedStream.insert(5, "eeeee"));
        System.out.println(orderedStream.insert(4, "ddddd"));

    }
}
