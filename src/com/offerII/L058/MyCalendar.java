package com.offerII.L058;

import java.util.TreeMap;

/**
 * 剑指 Offer II 058. 日程表
 * 请实现一个 MyCalendar 类来存放你的日程安排。如果要添加的时间内没有其他安排，则可以存储这个新的日程安排。
 * MyCalendar 有一个 book(int start, int end)方法。它意味着在 start 到 end 时间内增加一个日程安排，注意，这里的时间是半开区间，即 [start, end), 实数 x 的范围为，  start <= x < end。
 * 当两个日程安排有一些时间上的交叉时（例如两个日程安排都在同一时间内），就会产生重复预订。
 * 每次调用 MyCalendar.book方法时，如果可以将日程安排成功添加到日历中而不会导致重复预订，返回 true。否则，返回 false 并且不要将该日程安排添加到日历中。
 * 请按照以下步骤调用 MyCalendar 类: MyCalendar cal = new MyCalendar(); MyCalendar.book(start, end)
 *
 * 示例:
 * 输入:
 * ["MyCalendar","book","book","book"]
 * [[],[10,20],[15,25],[20,30]]
 * 输出: [null,true,false,true]
 * 解释:
 * MyCalendar myCalendar = new MyCalendar();
 * MyCalendar.book(10, 20); // returns true
 * MyCalendar.book(15, 25); // returns false ，第二个日程安排不能添加到日历中，因为时间 15 已经被第一个日程安排预定了
 * MyCalendar.book(20, 30); // returns true ，第三个日程安排可以添加到日历中，因为第一个日程安排并不包含时间 20
 *
 * 提示：
 *
 * 每个测试用例，调用 MyCalendar.book 函数最多不超过 1000次。
 * 0 <= start < end <= 109
 *
 * 注意：本题与主站 729 题相同： <a href="https://leetcode-cn.com/problems/my-calendar-i/">https://leetcode-cn.com/problems/my-calendar-i/</a>
 */
public class MyCalendar {
    /**
     * 方法：线段树
     */
    TreeMap<Integer,Integer> map;
    public MyCalendar() {
        map = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        //早于开始时间，并且最近的时间
        Integer prev = map.floorKey(start);
        //晚于开始时间，并且最近的时间
        Integer next = map.ceilingKey(start);
        //早于开始时间，早于开始时间结束，并且晚于开始时间，在结束时间之后开始，才满足条件
        if ((prev == null || map.get(prev) <= start) && (next == null || end <= next)){
            map.put(start,end);
            return true;
        }
        return false;
    }
}
