package com.leetcode.L1401_1500.L1441;

import java.util.ArrayList;
import java.util.List;

/**
 * 1441. 用栈操作构建数组
 * 给你一个数组 target 和一个整数 n。每次迭代，需要从  list = { 1 , 2 , 3 ..., n } 中依次读取一个数字。
 * 请使用下述操作来构建目标数组 target ：
 * (1)"Push"：从 list 中读取一个新元素， 并将其推入数组中。
 * (2)"Pop"：删除数组中的最后一个元素。
 * 如果目标数组构建完成，就停止读取更多元素。
 * 题目数据保证目标数组严格递增，并且只包含 1 到 n 之间的数字。
 * <p>
 * 请返回构建目标数组所用的操作序列。如果存在多个可行方案，返回任一即可。
 * <p>
 * 示例 1：
 * 输入：target = [1,3], n = 3
 * 输出：["Push","Push","Pop","Push"]
 * 解释：
 * 读取 1 并自动推入数组 -> [1]
 * 读取 2 并自动推入数组，然后删除它 -> [1]
 * 读取 3 并自动推入数组 -> [1,3]
 * <p>
 * 示例 2：
 * 输入：target = [1,2,3], n = 3
 * 输出：["Push","Push","Push"]
 * <p>
 * 示例 3：
 * 输入：target = [1,2], n = 4
 * 输出：["Push","Push"]
 * 解释：只需要读取前 2 个数字就可以停止。
 * <p>
 * 提示：
 * 1 <= target.length <= 100
 * 1 <= n <= 100
 * 1 <= target[i] <= n
 * target 严格递增
 */
public class BuildArrayStackOperations {
    /**
     * 方法：模拟
     */
    public List<String> buildArray(int[] target, int n) {
        // 结果
        List<String> res = new ArrayList<>();

        // 当前数字
        int cur = 1;
        // 索引
        int index = 0;
        // 遍历
        while (index < target.length) {
            // 目标数组当前数字
            int i = target[index];
            // 可以构建
            if (i == cur) {
                // 记录操作
                res.add("Push");
                // 索引后移
                index++;
            } else {// 不可以构建
                // 进入再移除
                res.add("Push");
                res.add("Pop");
            }
            // 数字后移
            cur++;
        }

        return res;
    }
}
