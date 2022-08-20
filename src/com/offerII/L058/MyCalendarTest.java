package com.offerII.L058;

public class MyCalendarTest {
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        /* * 示例：
          输入：
          ["MyCalendar", "book", "book", "book"]
          [[], [10, 20], [15, 25], [20, 30]]
          输出：
          [null, true, false, true]

          解释：
          MyCalendar myCalendar = new MyCalendar();
          myCalendar.book(10, 20); // return True
          myCalendar.book(15, 25); // return False ，这个日程安排不能添加到日历中，因为时间 15 已经被另一个日程安排预订了。
          myCalendar.book(20, 30); // return True ，这个日程安排可以添加到日历中，因为第一个日程安排预订的每个时间都小于 20 ，且不包含时间 20 。
         */
        System.out.println(myCalendar.book(10, 20));
        System.out.println(myCalendar.book(15, 25));
        System.out.println(myCalendar.book(20, 30));
    }
}
