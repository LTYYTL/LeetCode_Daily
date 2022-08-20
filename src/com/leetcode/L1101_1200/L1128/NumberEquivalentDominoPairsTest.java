package com.leetcode.L1101_1200.L1128;

public class NumberEquivalentDominoPairsTest {
    public static void main(String[] args) {
        NumberEquivalentDominoPairs numberEquivalentDominoPairs = new NumberEquivalentDominoPairs();
        /*
          示例：
          输入：dominoes = [[1,2],[2,1],[3,4],[5,6]]
          输出：1
         */
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        System.out.println(numberEquivalentDominoPairs.numEquivDominoPairs(dominoes));
    }
}
