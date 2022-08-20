package com.leetcode.L401_500.L0423;

public class ReconstructDigitsEnglishTest {
    public static void main(String[] args) {
        ReconstructDigitsEnglish reconstructDigitsEnglish = new ReconstructDigitsEnglish();
        /*
          示例 1：
          输入：s = "owoztneoer"
          输出："012"
         */
        System.out.println(reconstructDigitsEnglish.originalDigits("owoztneoer"));
        /*
          示例 2：
          输入：s = "fviefuro"
          输出："45"
         */
        System.out.println(reconstructDigitsEnglish.originalDigits("fviefuro"));
    }
}
