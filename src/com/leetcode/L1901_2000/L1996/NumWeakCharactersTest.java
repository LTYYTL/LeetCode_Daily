package com.leetcode.L1901_2000.L1996;

public class NumWeakCharactersTest {
    public static void main(String[] args) {
        NumWeakCharacters numWeakCharacters = new NumWeakCharacters();
        /*
          示例 1：
          输入：properties = [[5,5],[6,3],[3,6]]
          输出：0
          解释：不存在攻击和防御都严格高于其他角色的角色。
         */
        System.out.println(numWeakCharacters.numberOfWeakCharacters(new int[][]{{5, 5}, {6, 3}, {3, 6}}));
        /*
          示例 2：
          输入：properties = [[2,2],[3,3]]
          输出：1
          解释：第一个角色是弱角色，因为第二个角色的攻击和防御严格大于该角色。
         */
        System.out.println(numWeakCharacters.numberOfWeakCharacters(new int[][]{{2, 2}, {3, 3}}));
        /*
          示例 3：
          输入：properties = [[1,5],[10,4],[4,3]]
          输出：1
          解释：第三个角色是弱角色，因为第二个角色的攻击和防御严格大于该角色。
         */
        System.out.println(numWeakCharacters.numberOfWeakCharacters(new int[][]{{1, 5}, {10, 4}, {4, 3}}));
    }
}
