package com.leetcode.L701_800.L0731;

public class MyCalendarTwoTest {
    public static void main(String[] args) {
        /**
         * 示例：
         * MyCalendar();
         * MyCalendar.book(10, 20); // returns true
         * MyCalendar.book(50, 60); // returns true
         * MyCalendar.book(10, 40); // returns true
         * MyCalendar.book(5, 15); // returns false
         * MyCalendar.book(5, 10); // returns true
         * MyCalendar.book(25, 55); // returns true
         * 解释：
         * 前两个日程安排可以添加至日历中。 第三个日程安排会导致双重预订，但可以添加至日历中。
         * 第四个日程安排活动（5,15）不能添加至日历中，因为它会导致三重预订。
         * 第五个日程安排（5,10）可以添加至日历中，因为它未使用已经双重预订的时间10。
         * 第六个日程安排（25,55）可以添加至日历中，因为时间 [25,40] 将和第三个日程安排双重预订；
         * 时间 [40,50] 将单独预订，时间 [50,55）将和第二个日程安排双重预订。
         */
        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        System.out.println(myCalendarTwo.book(10, 20));
        System.out.println(myCalendarTwo.book(50, 60));
        System.out.println(myCalendarTwo.book(10, 40));
        System.out.println(myCalendarTwo.book(5, 15));
        System.out.println(myCalendarTwo.book(5, 10));
        System.out.println(myCalendarTwo.book(25, 55));
    }
}
