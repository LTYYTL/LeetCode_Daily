package com.leetcode.L201_300.L0207;

public class CourseScheduleTest {
    public static void main(String[] args) {
        CourseSchedule courseSchedule = new CourseSchedule();
        /*
          示例 1：
          输入：numCourses = 2, prerequisites = [[1,0]]
          输出：true
          解释：总共有 2 门课程。学习课程 1 之前，你需要完成课程 0 。这是可能的。
         */
        System.out.println(courseSchedule.canFinish(2, new int[][]{{1, 0}}));
        /*
          示例 2：
          输入：numCourses = 2, prerequisites = [[1,0],[0,1]]
          输出：false
          解释：总共有 2 门课程。学习课程 1 之前，你需要先完成课程 0 ；并且学习课程 0 之前，你还应先完成课程 1 。这是不可能的。
         */
        System.out.println(courseSchedule.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}
