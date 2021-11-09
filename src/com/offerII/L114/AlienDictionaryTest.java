package com.offerII.L114;

public class AlienDictionaryTest {
    public static void main(String[] args) {
        AlienDictionary alienDictionary = new AlienDictionary();
        /**
         * 示例 1：
         * 输入：words = ["wrt","wrf","er","ett","rftt"]
         * 输出："wertf"
         */
        System.out.println(alienDictionary.alienOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"}));
        /**
         * 示例 2：
         * 输入：words = ["z","x"]
         * 输出："zx"
         */
        System.out.println(alienDictionary.alienOrder(new String[]{"z","x"}));
        /**
         * 示例 3：
         * 输入：words = ["z","x","z"]
         * 输出：""
         * 解释：不存在合法字母顺序，因此返回 "" 。
         */
        System.out.println(alienDictionary.alienOrder(new String[]{"z","x","z"}));
    }
}
