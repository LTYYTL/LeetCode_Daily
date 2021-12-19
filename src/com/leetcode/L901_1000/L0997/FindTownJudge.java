package com.leetcode.L901_1000.L0997;

import java.util.ArrayList;
import java.util.List;

/**
 * 997. 找到小镇的法官
 * 在一个小镇里，按从 1 到 n 为 n 个人进行编号。传言称，这些人中有一个是小镇上的秘密法官。
 * 如果小镇的法官真的存在，那么：
 * (1)小镇的法官不相信任何人。
 * (2)每个人（除了小镇法官外）都信任小镇的法官。
 * (3)只有一个人同时满足条件 1 和条件 2 。
 * 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示编号为 a 的人信任编号为 b 的人。
 *
 * 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的编号。否则，返回 -1。
 *
 * 示例 1：
 * 输入：n = 2, trust = [[1,2]]
 * 输出：2
 *
 * 示例 2：
 * 输入：n = 3, trust = [[1,3],[2,3]]
 * 输出：3
 *
 * 示例 3：
 * 输入：n = 3, trust = [[1,3],[2,3],[3,1]]
 * 输出：-1
 *
 * 示例 4：
 * 输入：n = 3, trust = [[1,2],[2,3]]
 * 输出：-
 *
 * 示例 5：
 * 输入：n = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
 * 输出：3
 *
 * 提示：
 * 1 <= n <= 1000
 * 0 <= trust.length <= 104
 * trust[i].length == 2
 * trust[i] 互不相同
 * trust[i][0] != trust[i][1]
 * 1 <= trust[i][0], trust[i][1] <= n
 */
public class FindTownJudge {
    //长度
    private int size;

    /**
     * 方法：图
     * @param n
     * @param trust
     * @return
     */
    public int findJudge(int n, int[][] trust) {
        //编号从1开始
        this.size = n+1;
        //构建图
        List<Integer>[] greps = creatGreps(trust);
        //获取入度
        int[] in = getInt(greps);
        //获取出度
        int[] out = getOut(greps);
        //遍历，编号从1开始
        for (int i = 1; i < size; i++) {
            //出度为0，即不信任任何人，入度为n-1即被所有人信任
            if (in[i] == n-1 && out[i] == 0)
                return i;
        }
        return -1;
    }

    /**
     * 获取出度
     * @param greps
     * @return
     */
    private int[] getOut(List<Integer>[] greps) {
        int[] out = new int[size];
        for (int i = 0; i < greps.length; i++) {
            out[i] = greps[i].size();
        }
        return out;
    }

    /**
     * 获取入度
     * @param greps
     * @return
     */
    private int[] getInt(List<Integer>[] greps) {
        int[] in = new int[size];
        for (List<Integer> grep : greps) {
            for (Integer i : grep) {
                in[i]++;
            }
        }
        return in;
    }

    /**
     * 构件图
     * @param trust
     * @return
     */
    private List<Integer>[] creatGreps(int[][] trust) {
        List<Integer>[] greps = new List[size];
        for (int i = 0; i < size; i++) {
            greps[i] = new ArrayList<>();
        }
        for (int[] ints : trust) {
            int a = ints[0];
            int b = ints[1];
            greps[a].add(b);
        }
        return greps;
    }
}
