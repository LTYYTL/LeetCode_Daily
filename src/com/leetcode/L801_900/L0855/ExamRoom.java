package com.leetcode.L801_900.L0855;

import java.util.*;

/**
 * 855. 考场就座
 * 在考场里，有 n 个座位排成一行，编号为 0 到 n - 1。
 * 当学生进入考场后，他必须坐在离最近的人最远的座位上。如果有多个这样的座位，他会坐在编号最小的座位上。(另外，如果考场里没有人，那么学生就坐在 0 号座位上。)
 * 设计一个模拟所述考场的类。
 * 实现 ExamRoom 类：
 * ExamRoom(int n) 用座位的数量 n 初始化考场对象。
 * int seat() 返回下一个学生将会入座的座位编号。
 * void leave(int p) 指定坐在座位 p 的学生将离开教室。保证座位 p 上会有一位学生。
 * <p>
 * 示例 1：
 * 输入：
 * ["ExamRoom", "seat", "seat", "seat", "seat", "leave", "seat"]
 * [[10], [], [], [], [], [4], []]
 * 输出：
 * [null, 0, 9, 4, 2, null, 5]
 * 解释：
 * ExamRoom examRoom = new ExamRoom(10);
 * examRoom.seat(); // 返回 0，房间里没有人，学生坐在 0 号座位。
 * examRoom.seat(); // 返回 9，学生最后坐在 9 号座位。
 * examRoom.seat(); // 返回 4，学生最后坐在 4 号座位。
 * examRoom.seat(); // 返回 2，学生最后坐在 2 号座位。
 * examRoom.leave(4);
 * examRoom.seat(); // 返回 5，学生最后坐在 5 号座位。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 109
 * 保证有学生正坐在座位 p 上。
 * seat 和 leave 最多被调用 104 次。
 */
public class ExamRoom {
    // 将端点 p 映射到以 p 为左端点的线段
    private final Map<Integer, int[]> startMap;
    // 将端点 p 映射到以 p 为右端点的线段
    private final Map<Integer, int[]> endMap;
    // 根据线段长度从小到大存放所有线段
    private final TreeSet<int[]> pq;
    private final int N;

    public ExamRoom(int N) {
        this.N = N;
        this.startMap = new HashMap<>();
        this.endMap = new HashMap<>();
        this.pq = new TreeSet<>((a, b) -> {
            int distA = distance(a);
            int distB = distance(b);
            // 如果长度相同，就比较索引
            if (distA == distB) {
                return b[0] - a[0];
            }
            return distA - distB;
        });
        // 在有序集合中先放一个虚拟线段
        addInterval(new int[]{-1, N});
    }

    public int seat() {
        // 从有序集合拿出最长的线段
        int[] longest = pq.last();
        int x = longest[0];
        int y = longest[1];
        int seat;
        if (x == -1) { // 情况一
            seat = 0;
        } else if (y == N) { // 情况二
            seat = N - 1;
        } else { // 情况三
            seat = (y - x) / 2 + x;
        }
        // 将最长的线段分成两段
        int[] left = new int[]{x, seat};
        int[] right = new int[]{seat, y};
        removeInterval(longest);
        addInterval(left);
        addInterval(right);
        return seat;
    }

    public void leave(int p) {
        // 将 p 左右的线段找出来
        int[] right = startMap.get(p);
        int[] left = endMap.get(p);
        // 合并两个线段成为一个线段
        int[] merged = new int[]{left[0], right[1]};
        removeInterval(left);
        removeInterval(right);
        addInterval(merged);
    }


    /* 增加一个线段 */
    private void addInterval(int[] intv) {
        pq.add(intv);
        startMap.put(intv[0], intv);
        endMap.put(intv[1], intv);
    }

    /* 去除一个线段 */
    private void removeInterval(int[] intv) {
        pq.remove(intv);
        startMap.remove(intv[0]);
        endMap.remove(intv[1]);
    }

    /* 计算一个线段的长度 */
    private int distance(int[] intv) {
        int x = intv[0];
        int y = intv[1];
        if (x == -1) {
            return y;
        }
        if (y == N) {
            return N - 1 - x;
        }
        // 中点和端点之间的长度
        return (y - x) / 2;
    }
}
