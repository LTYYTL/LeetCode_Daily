package com.leetcode.L301_400.L0352;

import java.util.*;

/**
 * 352. 将数据流变为多个不相交区间
 *  给你一个由非负整数 a1, a2, ..., an 组成的数据流输入，请你将到目前为止看到的数字总结为不相交的区间列表。
 *
 * 实现 SummaryRanges 类：
 * （1）SummaryRanges() 使用一个空数据流初始化对象。
 * （2）void addNum(int val) 向数据流中加入整数 val 。
 * （3）int[][] getIntervals() 以不相交区间 [starti, endi] 的列表形式返回对数据流中整数的总结。
 *
 *
 * 示例：
 * 输入：
 * ["SummaryRanges", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals"]
 * [[], [1], [], [3], [], [7], [], [2], [], [6], []]
 * 输出：
 * [null, null, [[1, 1]], null, [[1, 1], [3, 3]], null, [[1, 1], [3, 3], [7, 7]], null, [[1, 3], [7, 7]], null, [[1, 3], [6, 7]]]
 * 解释：
 * SummaryRanges summaryRanges = new SummaryRanges();
 * summaryRanges.addNum(1);      // arr = [1]
 * summaryRanges.getIntervals(); // 返回 [[1, 1]]
 * summaryRanges.addNum(3);      // arr = [1, 3]
 * summaryRanges.getIntervals(); // 返回 [[1, 1], [3, 3]]
 * summaryRanges.addNum(7);      // arr = [1, 3, 7]
 * summaryRanges.getIntervals(); // 返回 [[1, 1], [3, 3], [7, 7]]
 * summaryRanges.addNum(2);      // arr = [1, 2, 3, 7]
 * summaryRanges.getIntervals(); // 返回 [[1, 3], [7, 7]]
 * summaryRanges.addNum(6);      // arr = [1, 2, 3, 6, 7]
 * summaryRanges.getIntervals(); // 返回 [[1, 3], [6, 7]]
 *
 * 提示：
 * 0 <= val <= 104
 * 最多调用 addNum 和 getIntervals 方法 3 * 104 次
 *
 * 进阶：如果存在大量合并，并且与数据流的大小相比，不相交区间的数量很小，该怎么办?
 */
public class SummaryRanges {

    // 存储右边界
    private final int[] father = new int[10001];
    // 使用有序的set存储左边界
    private final Set<Integer> set = new TreeSet<>();

    public SummaryRanges() {
        // 元素值的范围为 0~10000，所以，初始化为-1
        Arrays.fill(father, -1);
    }

    public void addNum(int val) {
        if (father[val] == -1) {
            father[val] = val;
            // 将当前元素加入set中
            set.add(val);
            // 先合并右边，再合并左边
            union(val, val + 1);
            union(val - 1, val);
        }
    }

    private int find(int x) {
        if (father[x] != x) return father[x] = find(father[x]);
        return father[x];
    }

    private void union(int x, int y) {
        if (x >= 0 && x <= 10000 && father[x] != -1 && father[y] != -1) {
            int fx = find(x);
            int fy = find(y);
            if (fx != fy) {
                father[fx] = fy;
                // 可以合并，set中删除右边的那个数
                set.remove(y);
            }
        }
    }

    public int[][] getIntervals() {
        List<int[]> list = new ArrayList<>();

        // 遍历set拿到左边界
        for (int start : set) {
            int end = find(start);
            list.add(new int[] {start, end});
        }

        return list.toArray(new int[list.size()][2]);
    }

}
