package com.leetcode.L601_700.L0630;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 630. 课程表 III
 * 这里有 n 门不同的在线课程，按从 1 到 n 编号。给你一个数组 courses ，
 * 其中 courses[i] = [durationi, lastDayi] 表示第 i 门课将会 持续 上 durationi 天课，并且必须在不晚于 lastDayi 的时候完成。
 * 你的学期从第 1 天开始。且不能同时修读两门及两门以上的课程。
 * 返回你最多可以修读的课程数目。
 *
 * 示例 1：
 * 输入：courses = [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
 * 输出：3
 * 解释：
 * 这里一共有 4 门课程，但是你最多可以修 3 门：
 * 首先，修第 1 门课，耗费 100 天，在第 100 天完成，在第 101 天开始下门课。
 * 第二，修第 3 门课，耗费 1000 天，在第 1100 天完成，在第 1101 天开始下门课程。
 * 第三，修第 2 门课，耗时 200 天，在第 1300 天完成。
 * 第 4 门课现在不能修，因为将会在第 3300 天完成它，这已经超出了关闭日期。
 *
 * 示例 2：
 * 输入：courses = [[1,2]]
 * 输出：1
 *
 * 示例 3：
 * 输入：courses = [[3,2],[4,3]]
 * 输出：0
 *
 * 提示:
 * 1 <= courses.length <= 104
 * 1 <= durationi, lastDayi <= 104
 */
public class CourseScheduleIII {
    /**
     * 方法：堆
     * @param courses
     * @return
     */
    public int scheduleCourse(int[][] courses) {
        //按照课程截止时间排序
        Arrays.sort(courses,(a,b) -> (a[1] - b[1]));
        //学习时间长的在队首
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        //总学习时长
        int total = 0;
        //遍历
        for (int[] cours : courses) {
            //如果总时长不会超过截止时间，那么当前这门可以选择
            if (total + cours[0] <= cours[1]){
                //加入总时长
                total += cours[0];
                //放入队列
                queue.add(cours);
            //如果出现冲突，选择学习时间短的课程
            }else if (!queue.isEmpty() && queue.peek()[0] > cours[0]){
                total = total - queue.poll()[0] + cours[0];
                queue.add(cours);
            }
        }
        return queue.size();
    }
}
