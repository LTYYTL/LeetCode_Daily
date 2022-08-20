package com.leetcode.L401_500.L0500;

import java.util.Arrays;

public class KeyboardRowTest {
    public static void main(String[] args) {
        KeyboardRow keyboardRow = new KeyboardRow();
        /*
          示例 1：
          输入：words = ["Hello","Alaska","Dad","Peace"]
          输出：["Alaska","Dad"]
         */
        System.out.println(Arrays.toString(keyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
        /*
          示例 2：
          输入：words = ["omk"]
          输出：[]
         */
        System.out.println(Arrays.toString(keyboardRow.findWords(new String[]{"omk"})));
        /*
          示例 3：
          输入：words = ["adsdf","sfd"]
          输出：["adsdf","sfd"]
         */
        System.out.println(Arrays.toString(keyboardRow.findWords(new String[]{"adsdf", "sfd"})));
    }
}
