package com.leetcode.L1601_1700.L1610;

import java.util.ArrayList;
import java.util.List;

public class MaxVisiblePointTest {
    public static void main(String[] args) {
        MaxVisiblePoint maxVisiblePoint = new MaxVisiblePoint();
        /**
         * 示例 1：
         * 输入：points = [[2,1],[2,2],[3,3]], angle = 90, location = [1,1]
         * 输出：3
         * 解释：阴影区域代表你的视野。在你的视野中，所有的点都清晰可见，尽管 [2,2] 和 [3,3]在同一条直线上，你仍然可以看到 [3,3] 。
         */
        List<List<Integer>> points = new ArrayList<>(){{
            add(new ArrayList<>(){{add(2);add(1);}});
            add(new ArrayList<>(){{add(2);add(2);}});
            add(new ArrayList<>(){{add(3);add(3);}});
        }};
        System.out.println(maxVisiblePoint.visiblePoints(points, 90, new ArrayList<>() {{
            add(1);
            add(1);
        }}));
        /**
         * 示例 2：
         * 输入：points = [[2,1],[2,2],[3,4],[1,1]], angle = 90, location = [1,1]
         * 输出：4
         * 解释：在你的视野中，所有的点都清晰可见，包括你所在位置的那个点。
         */
        points.clear();
        points = new ArrayList<>(){{
            add(new ArrayList<>(){{add(2);add(1);}});
            add(new ArrayList<>(){{add(2);add(2);}});
            add(new ArrayList<>(){{add(3);add(4);}});
            add(new ArrayList<>(){{add(1);add(1);}});
        }};
        System.out.println(maxVisiblePoint.visiblePoints(points, 90, new ArrayList<>() {{
            add(1);
            add(1);
        }}));
        /**
         * 示例 3：
         * 输入：points = [[1,0],[2,1]], angle = 13, location = [1,1]
         * 输出：1
         * 解释：如图所示，你只能看到两点之一。
         */
        points.clear();
        points = new ArrayList<>(){{
            add(new ArrayList<>(){{add(1);add(0);}});
            add(new ArrayList<>(){{add(2);add(1);}});
        }};
        System.out.println(maxVisiblePoint.visiblePoints(points, 13, new ArrayList<>() {{
            add(1);
            add(1);
        }}));
    }
}
