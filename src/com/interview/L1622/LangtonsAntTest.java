package com.interview.L1622;

public class LangtonsAntTest {
    public static void main(String[] args) {
        LangtonsAnt langtonsAnt = new LangtonsAnt();
        /* * 示例 1:
          输入: 0
          输出: ["R"]
         */
        System.out.println(langtonsAnt.printKMoves(0));
        /*
          示例 2:
          输入: 2
          输出:
          [
            "_X",
            "LX"
          ]
         */
        System.out.println(langtonsAnt.printKMoves(2));
        /*
          示例 3:
          输入: 5
          输出:
          [
            "_U",
            "X_",
            "XX"
         */
        System.out.println(langtonsAnt.printKMoves(5));
    }
}
