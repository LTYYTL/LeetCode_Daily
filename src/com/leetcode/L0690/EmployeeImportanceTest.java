package com.leetcode.L0690;

import java.util.Arrays;

public class EmployeeImportanceTest {
    public static void main(String[] args) {
        EmployeeImportance employeeImportance = new EmployeeImportance();
        /**
         * 示例：
         * 输入：[[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
         * 输出：11
         * 解释：
         * 员工 1 自身的重要度是 5 ，他有两个直系下属 2 和 3 ，而且 2 和 3 的重要度均为 3 。因此员工 1 的总重要度是 5 + 3 + 3 = 11 。
         */
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;
        employee1.subordinates = Arrays.asList(2,3);

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.importance = 3;

        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.importance = 3;

        //方法一：深度优先遍历
        System.out.println(employeeImportance.getImportance(Arrays.asList(employee1, employee2, employee3), 1));
        //方法二：广度优先遍历
        System.out.println(employeeImportance.getImportance_bfs(Arrays.asList(employee1, employee2, employee3), 1));
    }
}
