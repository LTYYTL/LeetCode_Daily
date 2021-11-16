package com.leetcode.L301_400.L0391;

import java.util.HashSet;
import java.util.Set;

/**
 * 391. 完美矩形
 * 给你一个数组 rectangles ，其中 rectangles[i] = [xi, yi, ai, bi] 表示一个坐标轴平行的矩形。这个矩形的左下顶点是 (xi, yi) ，右上顶点是 (ai, bi) 。
 * 如果所有矩形一起精确覆盖了某个矩形区域，则返回 true ；否则，返回 false 。
 *
 * 示例 1：
 * 输入：rectangles = [[1,1,3,3],[3,1,4,2],[3,2,4,4],[1,3,2,4],[2,3,3,4]]
 * 输出：true
 * 解释：5 个矩形一起可以精确地覆盖一个矩形区域。
 *
 * 示例 2：
 * 输入：rectangles = [[1,1,2,3],[1,3,2,4],[3,1,4,2],[3,2,4,4]]
 * 输出：false
 * 解释：两个矩形之间有间隔，无法覆盖成一个矩形。
 *
 * 示例 3：
 * 输入：rectangles = [[1,1,3,3],[3,1,4,2],[1,3,2,4],[3,2,4,4]]
 * 输出：false
 * 解释：图形顶端留有空缺，无法覆盖成一个矩形。
 *
 * 示例 4：
 * 输入：rectangles = [[1,1,3,3],[3,1,4,2],[1,3,2,4],[2,2,4,4]]
 * 输出：false
 * 解释：因为中间有相交区域，虽然形成了矩形，但不是精确覆盖。
 *
 * 提示：
 * 1 <= rectangles.length <= 2 * 104
 * rectangles[i].length == 4
 * -105 <= xi, yi, ai, bi <= 105
 */
public class PerfectRectangle {
    /**
     * 方法：数学
     * @param rectangles
     * @return
     */
    public boolean isRectangleCover(int[][] rectangles) {
        //记录完美矩形的坐标
        int res_x1 = Integer.MAX_VALUE;
        int res_y1 = Integer.MAX_VALUE;
        int res_x2 = 0;
        int res_y2 = 0;

        //存储出现的点
        Set<String> set = new HashSet<>();

        //小矩形的面积和
        int sum_area = 0;
        //遍历
        for (int[] rectangle : rectangles) {
            //小矩形的坐标
            int x1 = rectangle[0];
            int y1 = rectangle[1];
            int x2 = rectangle[2];
            int y2 = rectangle[3];

            //完美矩形的坐标时左下点的最小值
            //完美矩形的坐标时右下点的最大值
            res_x1 = Math.min(res_x1,x1);
            res_y1 = Math.min(res_y1,y1);
            res_x2 = Math.max(res_x2,x2);
            res_y2 = Math.max(res_y2,y2);

            //小矩形的四个顶点
            String p1 = "("+ x1 + y1 +")";
            String p2 = "("+ x1 + y2 +")";
            String p3 = "("+ x2 + y1 +")";
            String p4 = "("+ x2 + y2 +")";

            //判断是否已经出现
            //一个点出现奇数次是顶点
            //一个点出现偶数次不是顶点
            addSet(set,p1);
            addSet(set,p2);
            addSet(set,p3);
            addSet(set,p4);
            //小矩形的和
            sum_area += (rectangle[2]- rectangle[0]) * (rectangle[3] - rectangle[1]);
        }
        //完美矩形的面积
        int res_area = (res_x2 - res_x1) *  (res_y2 - res_y1);
        //面积不等
        if (res_area != sum_area)
            return false;
        //所有小矩形拼起之后超过四个顶点
        if (set.size() != 4)
            return false;
        //判断完美矩形的四个顶点是否在集合中
        if (!set.contains("("+res_x1+res_y1+")")) return false;
        if (!set.contains("("+res_x1+res_y2+")")) return false;
        if (!set.contains("("+res_x2+res_y1+")")) return false;
        if (!set.contains("("+res_x2+res_y2+")")) return false;

        return true;
    }


    private void addSet(Set<String> set,String p){
        if (set.contains(p))
            set.remove(p);
        else
            set.add(p);
    }
}
