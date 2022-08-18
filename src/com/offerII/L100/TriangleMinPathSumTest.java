package com.offerII.L100;

import java.util.ArrayList;
import java.util.List;

public class TriangleMinPathSumTest {
    public static void main(String[] args) {
        TriangleMinPathSum triangleMinPathSum = new TriangleMinPathSum();
        /**
         * 例如，给定三角形：
         * [
         *      [2],
         *     [3,4],
         *    [6,5,7],
         *   [4,1,8,3]
         * ]
         * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
         */

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);

        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        List<List<Integer>> res = new ArrayList<>();
        res.add(list1);
        res.add(list2);
        res.add(list3);
        res.add(list4);
        //查看是否为想要的数据
        System.out.println(res);
        //方法一：动态规划
        System.out.println(triangleMinPathSum.minimumTotal(res));
        //方法二：动态规划 + 空间优化（一维数组）
        System.out.println(triangleMinPathSum.minimumTotal_structure(res));


    }
}
