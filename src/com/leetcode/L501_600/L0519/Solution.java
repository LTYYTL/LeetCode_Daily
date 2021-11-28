package com.leetcode.L501_600.L0519;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 519. 随机翻转矩阵
 * 给你一个 m x n 的二元矩阵 matrix ，且所有值被初始化为 0 。
 * 请你设计一个算法，随机选取一个满足 matrix[i][j] == 0 的下标 (i, j) ，并将它的值变为 1 。
 * 所有满足 matrix[i][j] == 0 的下标 (i, j) 被选取的概率应当均等。
 *
 * 尽量最少调用内置的随机函数，并且优化时间和空间复杂度。
 *
 * 实现 Solution 类：
 * (1)Solution(int m, int n) 使用二元矩阵的大小 m 和 n 初始化该对象
 * (2)int[] flip() 返回一个满足 matrix[i][j] == 0 的随机下标 [i, j] ，并将其对应格子中的值变为 1
 * (3)void reset() 将矩阵中所有的值重置为 0
 *
 * 示例：
 * 输入
 * ["Solution", "flip", "flip", "flip", "reset", "flip"]
 * [[3, 1], [], [], [], [], []]
 * 输出
 * [null, [1, 0], [2, 0], [0, 0], null, [2, 0]]
 * 解释
 * Solution solution = new Solution(3, 1);
 * solution.flip();  // 返回 [1, 0]，此时返回 [0,0]、[1,0] 和 [2,0] 的概率应当相同
 * solution.flip();  // 返回 [2, 0]，因为 [1,0] 已经返回过了，此时返回 [2,0] 和 [0,0] 的概率应当相同
 * solution.flip();  // 返回 [0, 0]，根据前面已经返回过的下标，此时只能返回 [0,0]
 * solution.reset(); // 所有值都重置为 0 ，并可以再次选择下标返回
 * solution.flip();  // 返回 [2, 0]，此时返回 [0,0]、[1,0] 和 [2,0] 的概率应当相同
 *
 * 提示：
 * 1 <= m, n <= 104
 * 每次调用flip 时，矩阵中至少存在一个值为 0 的格子。
 * 最多调用 1000 次 flip 和 reset 方法。
 */
public class Solution {
    //随机数
    private Random random;
    //长度
    private int m;
    private int n;
    //总个数
    private int total;
    //索引映射的位置
    private Map<Integer,Integer> map;

    //初始化
    public Solution(int m, int n) {
        this.random = new Random();
        this.m = m;
        this.n = n;
        this.total = m * n;
        this.map = new HashMap<>();
    }

    public int[] flip() {
        //随机索引
        int x = random.nextInt(total);
        //总数减少
        total--;
        //判断当前索引是否已经被选取过了
        int index = map.getOrDefault(x,x);
        // 将位置 x 对应的映射设置为位置 total 对应的映射
        map.put(x,map.getOrDefault(total,total));
        return new int[]{index/n, index%n};
    }

    public void reset() {
        total = m * n;
        map.clear();
    }

}
