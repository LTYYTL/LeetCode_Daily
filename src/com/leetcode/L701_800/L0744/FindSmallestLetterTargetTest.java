package com.leetcode.L701_800.L0744;

public class FindSmallestLetterTargetTest {
    public static void main(String[] args) {
        FindSmallestLetterTarget findSmallestLetterTarget = new FindSmallestLetterTarget();
        /*
          示例 1：
          输入: letters = ["c", "f", "j"]，target = "a"
          输出: "c"
         */
        System.out.println(findSmallestLetterTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        /*
          示例 2:
          输入: letters = ["c","f","j"], target = "c"
          输出: "f"
         */
        System.out.println(findSmallestLetterTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
        /*
          示例 3:
          输入: letters = ["c","f","j"], target = "d"
          输出: "f"
         */
        System.out.println(findSmallestLetterTarget.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd'));
    }
}
