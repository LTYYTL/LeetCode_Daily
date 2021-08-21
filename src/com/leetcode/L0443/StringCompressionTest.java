package com.leetcode.L0443;

public class StringCompressionTest {
    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        /**
         * 示例 1：
         * 输入：chars = ["a","a","b","b","c","c","c"]
         * 输出：返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]
         * 解释：
         * "aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。
         */
        System.out.println(stringCompression.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        /**
         * 示例 2：
         * 输入：chars = ["a"]
         * 输出：返回 1 ，输入数组的前 1 个字符应该是：["a"]
         * 解释：
         * 没有任何字符串被替代。
         */
        System.out.println(stringCompression.compress(new char[]{'a'}));
        /**
         * 示例 3：
         * 输入：chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
         * 输出：返回 4 ，输入数组的前 4 个字符应该是：["a","b","1","2"]。
         * 解释：
         * 由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被 “b12” 替代。
         * 注意每个数字在数组中都有它自己的位置。
         */
        System.out.println(stringCompression.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
}
