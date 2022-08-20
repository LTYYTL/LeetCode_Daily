package com.leetcode.L501_600.L0592;

public class FractionAdditionSubTest {
    public static void main(String[] args) {
        FractionAdditionSub fractionAdditionSub = new FractionAdditionSub();
        /*
          示例 1:
          输入: expression = "-1/2+1/2"
          输出: "0/1"
         */
        System.out.println(fractionAdditionSub.fractionAddition("-1/2+1/2"));
        /*
          示例 2:
          输入: expression = "-1/2+1/2+1/3"
          输出: "1/3"
         */
        System.out.println(fractionAdditionSub.fractionAddition("-1/2+1/2+1/3"));
        /*
          示例 3:
          输入: expression = "1/3-1/2"
          输出: "-1/6"
         */
        System.out.println(fractionAdditionSub.fractionAddition("1/3-1/2"));
    }
}
