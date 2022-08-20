package com.offerII.L113;

import java.util.Arrays;

public class CourseScheduleIITest {
    public static void main(String[] args) {
        CourseScheduleII courseScheduleII = new CourseScheduleII();
        /*
          示例 1：
          输入：numCourses = 2, prerequisites = [[1,0]]
          输出：[0,1]
          解释：总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
         */
        System.out.println(Arrays.toString(courseScheduleII.findOrder(2, new int[][]{{1, 0}})));
        /*
          示例 2：
          输入：numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
          输出：[0,2,1,3]
          解释：总共有 4 门课程。要学习课程 3，你应该先完成课程 1 和课程 2。并且课程 1 和课程 2 都应该排在课程 0 之后。
          因此，一个正确的课程顺序是 [0,1,2,3] 。另一个正确的排序是 [0,2,1,3] 。
         */
        System.out.println(Arrays.toString(courseScheduleII.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}})));
        /*
          示例 3：
          输入：numCourses = 1, prerequisites = []
          输出：[0]
         */
        System.out.println(Arrays.toString(courseScheduleII.findOrder(1, new int[][]{})));
    }
}
