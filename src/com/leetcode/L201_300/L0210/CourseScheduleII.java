package com.leetcode.L201_300.L0210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 210. 课程表 II
 * 现在你总共有 numCourses 门课需要选，记为 0 到 numCourses - 1。给你一个数组 prerequisites ，其中 prerequisites[i] = [ai, bi] ，表示在选修课程 ai 前 必须 先选修 bi 。
 * 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示：[0,1] 。
 * 返回你为了学完所有课程所安排的学习顺序。可能会有多个正确的顺序，你只要返回 任意一种 就可以了。如果不可能完成所有课程，返回 一个空数组 。
 *
 * 示例 1：
 * 输入：numCourses = 2, prerequisites = [[1,0]]
 * 输出：[0,1]
 * 解释：总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
 *
 * 示例 2：
 * 输入：numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
 * 输出：[0,2,1,3]
 * 解释：总共有 4 门课程。要学习课程 3，你应该先完成课程 1 和课程 2。并且课程 1 和课程 2 都应该排在课程 0 之后。
 * 因此，一个正确的课程顺序是 [0,1,2,3] 。另一个正确的排序是 [0,2,1,3] 。
 *
 * 示例 3：
 * 输入：numCourses = 1, prerequisites = []
 * 输出：[0]
 *
 * 提示：
 * 1 <= numCourses <= 2000
 * 0 <= prerequisites.length <= numCourses * (numCourses - 1)
 * prerequisites[i].length == 2
 * 0 <= ai, bi < numCourses
 * ai != bi
 * 所有[ai, bi] 匹配 互不相同
 *
 * 拓展：
 * 这个问题相当于查找一个循环是否存在于有向图中。如果存在循环，则不存在拓扑排序，因此不可能选取所有课程进行学习。
 * 通过 DFS 进行拓扑排序 - 一个关于Coursera的精彩视频教程（21分钟），介绍拓扑排序的基本概念。
 * 拓扑排序也可以通过 BFS 完成。
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
