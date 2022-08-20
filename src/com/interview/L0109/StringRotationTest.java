package com.interview.L0109;

public class StringRotationTest {
    public static void main(String[] args) {
        StringRotation stringRotation = new StringRotation();
        /*
          示例1:
          输入：s1 = "waterbottle", s2 = "erbottlewat"
          输出：True
         */
        System.out.println(stringRotation.isFlipedString("aba", "bab"));
        /*
          示例2:
          输入：s1 = "aa", s2 = "aba"
          输出：False
         */
        System.out.println(stringRotation.isFlipedString("aa", "aba"));
    }
}
