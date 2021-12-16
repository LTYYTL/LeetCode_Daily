package com.leetcode.L801_900.L0851;

import java.util.Arrays;

public class LoudRichTest {
    public static void main(String[] args) {
        LoudRich loudRich = new LoudRich();
        /**
         * 示例 1：
         * 输入：richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], quiet = [3,2,5,4,6,1,7,0]
         * 输出：[5,5,2,5,4,5,6,7]
         * 解释：
         * answer[0] = 5，
         * person 5 比 person 3 有更多的钱，person 3 比 person 1 有更多的钱，person 1 比 person 0 有更多的钱。
         * 唯一较为安静（有较低的安静值 quiet[x]）的人是 person 7，
         * 但是目前还不清楚他是否比 person 0 更有钱。
         * answer[7] = 7，
         * 在所有拥有的钱肯定不少于 person 7 的人中（这可能包括 person 3，4，5，6 以及 7），
         * 最安静（有较低安静值 quiet[x]）的人是 person 7。
         * 其他的答案也可以用类似的推理来解释。
         */
        System.out.println(Arrays.toString(loudRich.loudAndRich(new int[][]{{1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}}, new int[]{3, 2, 5, 4, 6, 1, 7, 0})));
        /**
         * 示例 2：
         * 输入：richer = [], quiet = [0]
         * 输出：[0]
         */
    }
}
