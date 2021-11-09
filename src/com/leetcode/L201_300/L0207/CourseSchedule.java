package com.leetcode.L201_300.L0207;

import java.util.*;

/**
 * 207. 课程表
 * 你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。
 * 在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。
 * 例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。
 * 请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 * 输入：numCourses = 2, prerequisites = [[1,0]]
 * 输出：true
 * 解释：总共有 2 门课程。学习课程 1 之前，你需要完成课程 0 。这是可能的。
 *
 * 示例 2：
 * 输入：numCourses = 2, prerequisites = [[1,0],[0,1]]
 * 输出：false
 * 解释：总共有 2 门课程。学习课程 1 之前，你需要先完成课程 0 ；并且学习课程 0 之前，你还应先完成课程 1 。这是不可能的。
 *
 * 提示：
 * 1 <= numCourses <= 105
 * 0 <= prerequisites.length <= 5000
 * prerequisites[i].length == 2
 * 0 <= ai, bi < numCourses
 * prerequisites[i] 中的所有课程对 互不相同
 */
public class CourseSchedule {
    /**
     * 方法：拓扑排序
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //转换成图
        List<List<Integer>> edge = new ArrayList<>();
        //创建每门课之后修的课程
        for (int i = 0; i < numCourses; i++) {
            edge.add(new ArrayList<>());
        }

        //每个点的入度
        int[] count = new int[numCourses];
        //遍历
        for (int[] prerequisite : prerequisites) {
            //先修课
            int from = prerequisite[1];
            //当前课
            int to = prerequisite[0];
            //构建图
            edge.get(from).add(to);
            //当前课有一个入度
            count[to]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        //将入度为0的入队
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0)
                queue.add(i);
        }
        //记录课程个数
        int vis = 0;
        //遍历
        while (!queue.isEmpty()){
            //课程+1
            vis++;
            //队首元素
            Integer cur = queue.poll();
            //遍历其之后的课程
            for (Integer v : edge.get(cur)) {
                //其课程的入度-1
                count[v]--;
                //入度为0存入队列
                if (count[v] == 0)
                    queue.add(v);
            }
        }
        //所有课程都遍历了
        return vis == numCourses;
    }

}
