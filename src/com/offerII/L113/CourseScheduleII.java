package com.offerII.L113;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer II 113. 课程顺序
 * 现在总共有 numCourses 门课需要选，记为 0 到 numCourses-1。
 * 给定一个数组 prerequisites ，它的每一个元素 prerequisites[i] 表示两门课程之间的先修顺序。 例如 prerequisites[i] = [ai, bi] 表示想要学习课程 ai ，需要先完成课程 bi 。
 * 请根据给出的总课程数  numCourses 和表示先修顺序的 prerequisites 得出一个可行的修课序列。
 * 可能会有多个正确的顺序，只要任意返回一种就可以了。如果不可能完成所有课程，返回一个空数组。
 *
 * 示例 1:
 * 输入: numCourses = 2, prerequisites = [[1,0]]
 * 输出: [0,1]
 * 解释: 总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
 *
 * 示例 2:
 * 输入: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
 * 输出: [0,1,2,3] or [0,2,1,3]
 * 解释: 总共有 4 门课程。要学习课程 3，你应该先完成课程 1 和课程 2。并且课程 1 和课程 2 都应该排在课程 0 之后。
 *  因此，一个正确的课程顺序是 [0,1,2,3] 。另一个正确的排序是 [0,2,1,3] 。
 *
 * 示例 3:
 * 输入: numCourses = 1, prerequisites = []
 * 输出: [0]
 * 解释: 总共 1 门课，直接修第一门课就可。
 *
 * 提示:
 * 1 <= numCourses <= 2000
 * 0 <= prerequisites.length <= numCourses * (numCourses - 1)
 * prerequisites[i].length == 2
 * 0 <= ai, bi < numCourses
 * ai != bi
 * prerequisites 中不存在重复元素
 *
 * 注意：本题与主站 210 题相同：<a href="https://leetcode-cn.com/problems/course-schedule-ii/">https://leetcode-cn.com/problems/course-schedule-ii/</a>
 */
public class CourseScheduleII {
    /**
     * 方法：拓扑排序
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //特殊情况
        if (numCourses == 0) return new int[0];
        //构建图
        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edge.add(new ArrayList<>());
        }
        //记录每门课的先修课程数量
        int[] count = new int[numCourses];
        //遍历
        for (int[] prerequisite : prerequisites) {
            //先修课
            int from = prerequisite[1];
            //当前课
            int to = prerequisite[0];
            //构建图
            edge.get(from).add(to);
            //记录入度
            count[to]++;
        }

        //将入度为0的入队
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0)
                queue.add(i);
        }

        //索引
        int index = 0;
        //结果
        int[] res = new int[numCourses];
        //遍历
        while (!queue.isEmpty()){
            //队首元素
            Integer cur = queue.poll();
            //存入结果中，索引+1
            res[index++] = cur;
            //遍历其后修课
            for (Integer i : edge.get(cur)) {
                //入度-1
                count[i]--;
                //入度为0的入队
                if (count[i] == 0)
                    queue.offer(i);
            }
        }
        //遍历完成
        if (index == numCourses)
            return res;
        return new int[0];
    }
}
