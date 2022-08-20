package com.interview.L0813;

public class PileBoxTest {
    public static void main(String[] args) {
        PileBox pileBox = new PileBox();
        /*
          示例1:
           输入：box = [[1, 1, 1], [2, 2, 2], [3, 3, 3]]
           输出：6
         */
        System.out.println(pileBox.pileBox(new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}));
        /*
          示例2:
           输入：box = [[1, 1, 1], [2, 3, 4], [2, 6, 7], [3, 4, 5]]
           输出：10
         */
        System.out.println(pileBox.pileBox(new int[][]{{1, 1, 1}, {2, 3, 4}, {2, 6, 7}, {3, 4, 5}}));
    }
}
