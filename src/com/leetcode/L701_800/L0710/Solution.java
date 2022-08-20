package com.leetcode.L701_800.L0710;

import java.util.HashMap;

/**
 * 710. 黑名单中的随机数
 * 给定一个整数 n 和一个 无重复 黑名单整数数组 blacklist 。设计一种算法，从 [0, n - 1] 范围内的任意整数中选取一个 未加入 黑名单 blacklist 的整数。
 * 任何在上述范围内且不在黑名单 blacklist 中的整数都应该有 同等的可能性 被返回。
 * <p>
 * 优化你的算法，使它最小化调用语言 内置 随机函数的次数。
 * <p>
 * 实现 Solution 类:
 * Solution(int n, int[] blacklist) 初始化整数 n 和被加入黑名单 blacklist 的整数
 * int pick() 返回一个范围为 [0, n - 1] 且不在黑名单 blacklist 中的随机整数
 * <p>
 * 示例 1：
 * 输入
 * ["Solution", "pick", "pick", "pick", "pick", "pick", "pick", "pick"]
 * [[7, [2, 3, 5]], [], [], [], [], [], [], []]
 * 输出
 * [null, 0, 4, 1, 6, 1, 0, 4]
 * 解释
 * Solution solution = new Solution(7, [2, 3, 5]);
 * solution.pick(); // 返回0，任何[0,1,4,6]的整数都可以。注意，对于每一个pick的调用，
 * // 0、1、4和6的返回概率必须相等(即概率为1/4)。
 * solution.pick(); // 返回 4
 * solution.pick(); // 返回 1
 * solution.pick(); // 返回 6
 * solution.pick(); // 返回 1
 * solution.pick(); // 返回 0
 * solution.pick(); // 返回 4
 * <p>
 * 提示:
 * 1 <= n <= 109
 * 0 <= blacklist.length <- min(105, n - 1)
 * 0 <= blacklist[i] < n
 * blacklist 中所有值都 不同
 * pick 最多被调用 2 * 104 次
 */
public class Solution {
    /**
     * 方法：map映射
     */
    int size;
    //存放黑名单数字与之互换的数字，key:黑名单数字、value：与之互换的数字
    HashMap<Integer, Integer> map = new HashMap<>();

    public Solution(int n, int[] blacklist) {
        //白名单的数字个数
        size = n - blacklist.length;
        //初始化黑名单数字索引
        for (int item : blacklist) {
            map.put(item, -1);
        }
        //索引
        int last = n - 1;
        //遍历
        for (int item : blacklist) {
            //当前超过长度，可以不用管
            if (item >= size) {
                continue;
            }
            //当前位置已经被占用（是黑名单中数据），位置前移
            while (map.containsKey(last)) {
                last--;
            }
            //将两个位置数交换（索引就是数字本身）
            map.put(item, last);
            last--;
        }
    }

    public int pick() {
        int index = (int) (Math.random() * size);
        //不存在黑名单映射直接就是这个数，存在于黑名单，返回它与之互换位置的数字（索引即是数字本身）
        return map.getOrDefault(index, index);
    }
}
