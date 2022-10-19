package com.leetcode.L1601_1700.L1700;

public class StudentsEatLunchTest {
    public static void main(String[] args) {
        StudentsEatLunch studentsEatLunch = new StudentsEatLunch();
        /*
          示例 1：
          输入：students = [1,1,0,0], sandwiches = [0,1,0,1]
          输出：0
          解释：
          - 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [1,0,0,1]。
          - 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [0,0,1,1]。
          - 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = [0,1,1]，三明治栈为 sandwiches = [1,0,1]。
          - 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [1,1,0]。
          - 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = [1,0]，三明治栈为 sandwiches = [0,1]。
          - 最前面的学生放弃最顶上的三明治，并回到队列的末尾，学生队列变为 students = [0,1]。
          - 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = [1]，三明治栈为 sandwiches = [1]。
          - 最前面的学生拿走最顶上的三明治，剩余学生队列为 students = []，三明治栈为 sandwiches = []。
          所以所有学生都有三明治吃。
         */
        System.out.println(studentsEatLunch.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
        /*
          示例 2：
          输入：students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
          输出：3
         */
        System.out.println(studentsEatLunch.countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1, 1}));
    }
}
