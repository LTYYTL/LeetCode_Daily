package com.leetcode.L301_400.L0387;

public class FirstUniqueCharTest {
    public static void main(String[] args) {
        FirstUniqueChar firstUniqueChar = new FirstUniqueChar();
        /** * 示例1：
         * s = "leetcode"
         * 返回 0
         */
        //方法一：map法
        System.out.println(firstUniqueChar.firstUniqChar("leetcode"));
        //方法二：Array数组记录
        System.out.println(firstUniqueChar.firstUniqChar_Array("leetcode"));
        //方法三：索引位置比较
        System.out.println(firstUniqueChar.firstUniqChar_appearIndex("leetcode"));
        /**
         * 示例2：
         * s = "loveleetcode"
         * 返回 2
         */
        //方法一：map法
        System.out.println(firstUniqueChar.firstUniqChar("loveleetcode"));
        //方法二：Array数组记录
        System.out.println(firstUniqueChar.firstUniqChar_Array("loveleetcode"));
        //方法三：索引位置比较
        System.out.println(firstUniqueChar.firstUniqChar_appearIndex("loveleetcode"));
    }
}
