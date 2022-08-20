package com.interview.L0105;

public class OneAwayTest {
    public static void main(String[] args) {
        OneAway oneAway = new OneAway();
        /*
          示例 1:
          输入:
          first = "pale"
          second = "ple"
          输出: True
         */
        System.out.println(oneAway.oneEditAway("pale", "ple"));
        /*
          示例 2:
          输入:
          first = "pales"
          second = "pal"
          输出: False
         */
        System.out.println(oneAway.oneEditAway("pales", "pal"));
    }
}
