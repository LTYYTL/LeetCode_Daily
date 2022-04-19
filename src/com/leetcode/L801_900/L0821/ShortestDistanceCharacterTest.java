package com.leetcode.L801_900.L0821;

import java.util.Arrays;

public class ShortestDistanceCharacterTest {
    public static void main(String[] args) {
        ShortestDistanceCharacter shortestDistanceCharacter = new ShortestDistanceCharacter();
        /**
         * 示例 1：
         * 输入：s = "loveleetcode", c = "e"
         * 输出：[3,2,1,0,1,0,0,1,2,2,1,0]
         * 解释：字符 'e' 出现在下标 3、5、6 和 11 处（下标从 0 开始计数）。
         * 距下标 0 最近的 'e' 出现在下标 3 ，所以距离为 abs(0 - 3) = 3 。
         * 距下标 1 最近的 'e' 出现在下标 3 ，所以距离为 abs(1 - 3) = 2 。
         * 对于下标 4 ，出现在下标 3 和下标 5 处的 'e' 都离它最近，但距离是一样的 abs(4 - 3) == abs(4 - 5) = 1 。
         * 距下标 8 最近的 'e' 出现在下标 6 ，所以距离为 abs(8 - 6) = 2 。
         */
        System.out.println(Arrays.toString(shortestDistanceCharacter.shortestToChar("loveleetcode", 'e')));
        /**
         * 示例 2：
         * 输入：s = "aaab", c = "b"
         * 输出：[3,2,1,0]
         */
        System.out.println(Arrays.toString(shortestDistanceCharacter.shortestToChar("aaab", 'b')));
    }
}
