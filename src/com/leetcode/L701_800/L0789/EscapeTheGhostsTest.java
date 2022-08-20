package com.leetcode.L701_800.L0789;

public class EscapeTheGhostsTest {
    public static void main(String[] args) {
        EscapeTheGhosts escapeTheGhosts = new EscapeTheGhosts();
        /*
          示例 1：
          输入：ghosts = [[1,0],[0,3]], target = [0,1]
          输出：true
          解释：你可以直接一步到达目的地 (0,1) ，在 (1, 0) 或者 (0, 3) 位置的阻碍者都不可能抓住你。
         */
        System.out.println(escapeTheGhosts.escapeGhosts(new int[][]{{1, 0}, {0, 3}}, new int[]{0, 1}));
        /*
          示例 2：
          输入：ghosts = [[1,0]], target = [2,0]
          输出：false
          解释：你需要走到位于 (2, 0) 的目的地，但是在 (1, 0) 的阻碍者位于你和目的地之间。
         */
        System.out.println(escapeTheGhosts.escapeGhosts(new int[][]{{1, 0}}, new int[]{2, 0}));
        /*
          示例 3：
          输入：ghosts = [[2,0]], target = [1,0]
          输出：false
          解释：阻碍者可以和你同时达到目的地。
         */
        System.out.println(escapeTheGhosts.escapeGhosts(new int[][]{{2, 0}}, new int[]{1, 0}));
        /*
          示例 4：
          输入：ghosts = [[5,0],[-10,-2],[0,-5],[-2,-2],[-7,1]], target = [7,7]
          输出：false
         */
        System.out.println(escapeTheGhosts.escapeGhosts(new int[][]{{5, 0}, {-10, -2}, {0, -5}, {-2, -2}, {-7, 1}}, new int[]{7, 7}));
    }
}
