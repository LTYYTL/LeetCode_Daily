package com.leetcode.L2301_2400.L2399;


public class CheckDistancesSameLettersTest {
    public static void main(String[] args) {
        CheckDistancesSameLetters checkDistancesSameLetters = new CheckDistancesSameLetters();
        /*
          示例 1：
          输入：s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
          输出：true
          解释：
          - 'a' 在下标 0 和下标 2 处出现，所以满足 distance[0] = 1 。
          - 'b' 在下标 1 和下标 5 处出现，所以满足 distance[1] = 3 。
          - 'c' 在下标 3 和下标 4 处出现，所以满足 distance[2] = 0 。
          注意 distance[3] = 5 ，但是由于 'd' 没有在 s 中出现，可以忽略。
          因为 s 是一个匀整字符串，返回 true 。
         */
        System.out.println(checkDistancesSameLetters.checkDistances("abaccb", new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        /*
          示例 2：
          输入：s = "aa", distance = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
          输出：false
          解释：
          - 'a' 在下标 0 和 1 处出现，所以两次出现之间的字母数量为 0 。
          但是 distance[0] = 1 ，s 不是一个匀整字符串。
         */
        System.out.println(checkDistancesSameLetters.checkDistances("aa", new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

    }
}
