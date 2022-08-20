package com.leetcode.L601_700.L0630;

public class CourseScheduleIIITest {
    public static void main(String[] args) {
        CourseScheduleIII courseScheduleIII = new CourseScheduleIII();
        /*
          示例 1：
          输入：courses = [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
          输出：3
          解释：
          这里一共有 4 门课程，但是你最多可以修 3 门：
          首先，修第 1 门课，耗费 100 天，在第 100 天完成，在第 101 天开始下门课。
          第二，修第 3 门课，耗费 1000 天，在第 1100 天完成，在第 1101 天开始下门课程。
          第三，修第 2 门课，耗时 200 天，在第 1300 天完成。
          第 4 门课现在不能修，因为将会在第 3300 天完成它，这已经超出了关闭日期。
         */
        System.out.println(courseScheduleIII.scheduleCourse(new int[][]{{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}}));
        /*
          示例 2：
          输入：courses = [[1,2]]
          输出：1
         */
        System.out.println(courseScheduleIII.scheduleCourse(new int[][]{{1, 2}}));
        /*
          示例 3：
          输入：courses = [[3,2],[4,3]]
          输出：0
         */
        System.out.println(courseScheduleIII.scheduleCourse(new int[][]{{3, 2}, {4, 3}}));
    }
}
