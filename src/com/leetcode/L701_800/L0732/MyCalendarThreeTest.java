package com.leetcode.L701_800.L0732;

public class MyCalendarThreeTest {
    public static void main(String[] args) {
        /**
         * 示例：
         * 输入：
         * ["MyCalendarThree", "book", "book", "book", "book", "book", "book"]
         * [[], [10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]]
         * 输出：
         * [null, 1, 1, 2, 3, 3, 3]
         * 解释：
         * MyCalendarThree myCalendarThree = new MyCalendarThree();
         * myCalendarThree.book(10, 20); // 返回 1 ，第一个日程安排可以预订并且不存在相交，所以最大 k 次预订是 1 次预订。
         * myCalendarThree.book(50, 60); // 返回 1 ，第二个日程安排可以预订并且不存在相交，所以最大 k 次预订是 1 次预订。
         * myCalendarThree.book(10, 40); // 返回 2 ，第三个日程安排 [10, 40) 与第一个日程安排相交，所以最大 k 次预订是 2 次预订。
         * myCalendarThree.book(5, 15); // 返回 3 ，剩下的日程安排的最大 k 次预订是 3 次预订。
         * myCalendarThree.book(5, 10); // 返回 3
         * myCalendarThree.book(25, 55); // 返回 3
         */
        MyCalendarThree myCalendarThree = new MyCalendarThree();
        System.out.println(myCalendarThree.book(10, 20));
        System.out.println(myCalendarThree.book(50, 60));
        System.out.println(myCalendarThree.book(10, 40));
        System.out.println(myCalendarThree.book(5, 15));
        System.out.println(myCalendarThree.book(5, 10));
        System.out.println(myCalendarThree.book(25, 55));


    }
}
