package com.offer.L0500;

public class TheFirstCharacterOnlyOnceTest {
    public static void main(String[] args) {
        TheFirstCharacterOnlyOnce theFirstCharacterOnlyOnce = new TheFirstCharacterOnlyOnce();
        /**
         * 示例:
         * s = "abaccdeff"
         * 返回 "b"
         */
        System.out.println(theFirstCharacterOnlyOnce.firstUniqChar("abaccdeff"));
        System.out.println(theFirstCharacterOnlyOnce.firstUniqChar_sort("abaccdeff"));
    }
}
