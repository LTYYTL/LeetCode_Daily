package com.leetcode.L1601_1700.L1610;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1610. 可见点的最大数目
 * 给你一个点数组 points 和一个表示角度的整数 angle ，你的位置是 location ，其中 location = [posx, posy] 且 points[i] = [xi, yi] 都表示 X-Y 平面上的整数坐标。
 * 最开始，你面向东方进行观测。你 不能 进行移动改变位置，但可以通过 自转 调整观测角度。换句话说，posx 和 posy 不能改变。
 * 你的视野范围的角度用 angle 表示， 这决定了你观测任意方向时可以多宽。设 d 为你逆时针自转旋转的度数，那么你的视野就是角度范围 [d - angle/2, d + angle/2] 所指示的那片区域。
 * 对于每个点，如果由该点、你的位置以及从你的位置直接向东的方向形成的角度 位于你的视野中 ，那么你就可以看到它。
 * 同一个坐标上可以有多个点。你所在的位置也可能存在一些点，但不管你的怎么旋转，总是可以看到这些点。同时，点不会阻碍你看到其他点。
 * 返回你能看到的点的最大数目。
 *
 * 示例 1：
 * 输入：points = [[2,1],[2,2],[3,3]], angle = 90, location = [1,1]
 * 输出：3
 * 解释：阴影区域代表你的视野。在你的视野中，所有的点都清晰可见，尽管 [2,2] 和 [3,3]在同一条直线上，你仍然可以看到 [3,3] 。
 *
 * 示例 2：
 * 输入：points = [[2,1],[2,2],[3,4],[1,1]], angle = 90, location = [1,1]
 * 输出：4
 * 解释：在你的视野中，所有的点都清晰可见，包括你所在位置的那个点。
 *
 * 示例 3：
 * 输入：points = [[1,0],[2,1]], angle = 13, location = [1,1]
 * 输出：1
 * 解释：如图所示，你只能看到两点之一。
 *
 * 提示：
 * 1 <= points.length <= 105
 * points[i].length == 2
 * location.length == 2
 * 0 <= angle < 360
 * 0 <= posx, posy, xi, yi <= 100
 */
public class MaxVisiblePoint {
    /**
     * 方法：数学+滑动窗口
     * @param points
     * @param angle
     * @param location
     * @return
     */
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        //跟人在同一个位置点的个数
        int same = 0;
        //记录每个点与人之间的夹角（弧度制）
        List<Double> list = new ArrayList<>();
        //获取人的位置
        int x = location.get(0);
        int y = location.get(1);
        //遍历
        for (List<Integer> point : points) {
            //当前点坐标
            int a = point.get(0);
            int b = point.get(1);
            //跟人的位置一样
            if (a == x && b == y)
                same++;
            else//计算点与人之间的夹角（弧度制）
                list.add(Math.atan2(b-y,a-x));
        }
        //排序
        Collections.sort(list);
        //长度
        int size = list.size();
        //由于存在pi+angle>180° 的情况，可以在原数组中将每个元素pi+360° 添加到原数组的后面，这样即可防止反转的问题。
        for (int i = 0; i < size; i++) {
            list.add(list.get(i) + 2 * Math.PI);
        }
        //转换成弧度制
        double angleDegree = angle * Math.PI /180;
        //结果
        int max = 0;
        //滑动窗口
        int i = 0;
        int j = 0;
        //遍历
        while (i < size){
            //保证不越界且在范围内扩大窗口
            while (j < 2*size && list.get(j) - list.get(i) <= angleDegree){
                j++;
            }
            //计算当前范围内的最大点数
            max = Math.max(max,j-i);
            //缩小窗口
            i++;
        }
        return max + same;
    }
}
