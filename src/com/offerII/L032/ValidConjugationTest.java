package com.offerII.L032;

public class ValidConjugationTest {
    public static void main(String[] args) {
        ValidConjugation validConjugation = new ValidConjugation();
        /*
          示例 1:
          输入: s = "anagram", t = "nagaram"
          输出: true
         */
        System.out.println(validConjugation.isAnagram("anagram", "nagaram"));
        /*
          示例 2:
          输入: s = "rat", t = "car"
          输出: false
         */
        System.out.println(validConjugation.isAnagram("rat", "car"));
        /*
          示例 3:
          输入: s = "a", t = "a"
          输出: false
         */
        System.out.println(validConjugation.isAnagram("a", "a"));
    }
}
