package com.leetcode.L801_900.L0855;

import java.util.Set;
import java.util.TreeSet;

public class ExamRoomTest {
    public static void main(String[] args) {
        /*
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
         */
        ExamRoom examRoom = new ExamRoom(10);
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        examRoom.leave(4);
        System.out.println(examRoom.seat());

        Set<Integer> set = new TreeSet<>((a,b)->{
            return b-a;
        });
        set.add(2);
        set.add(6);
        set.add(4);
        System.out.println(set);
    }
}
