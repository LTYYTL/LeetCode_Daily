package com.leetcode.L1501_1600.L1583;

public class CountUnhappyFriendsTest {
    public static void main(String[] args) {
        CountUnhappyFriends countUnhappyFriends = new CountUnhappyFriends();
        /*
          示例 1：
          输入：n = 4, preferences = [[1, 2, 3], [3, 2, 0], [3, 1, 0], [1, 2, 0]], pairs = [[0, 1], [2, 3]]
          输出：2
          解释：
          朋友 1 不开心，因为：
          - 1 与 0 配对，但 1 与 3 的亲近程度比 1 与 0 高，且
          - 3 与 1 的亲近程度比 3 与 2 高。
          朋友 3 不开心，因为：
          - 3 与 2 配对，但 3 与 1 的亲近程度比 3 与 2 高，且
          - 1 与 3 的亲近程度比 1 与 0 高。
          朋友 0 和 2 都是开心的。
         */
        System.out.println(countUnhappyFriends.unhappyFriends(4,
                new int[][]{{1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}},
                new int[][]{{0, 1}, {2, 3}})
        );
        /*
          示例 2：
          输入：n = 2, preferences = [[1], [0]], pairs = [[1, 0]]
          输出：0
          解释：朋友 0 和 1 都开心。
         */
        /*
          示例 3：
          输入：n = 4, preferences = [[1, 3, 2], [2, 3, 0], [1, 3, 0], [0, 2, 1]], pairs = [[1, 3], [0, 2]]
          输出：4
         */
    }
}
