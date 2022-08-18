package com.leetcode.L401_500.L0478;

import java.util.Random;

/**
 * 478. 在圆内随机生成点
 * 给定圆的半径和圆心的位置，实现函数 randPoint ，在圆中产生均匀随机点。
 * <p>
 * 实现 Solution 类:
 * （1）Solution(double radius, double x_center, double y_center) 用圆的半径 radius 和圆心的位置 (x_center, y_center) 初始化对象
 * （2）randPoint() 返回圆内的一个随机点。圆周上的一点被认为在圆内。答案作为数组返回 [x, y] 。
 * <p>
 * 示例 1：
 * 输入:
 * ["Solution","randPoint","randPoint","randPoint"]
 * [[1.0, 0.0, 0.0], [], [], []]
 * 输出: [null, [-0.02493, -0.38077], [0.82314, 0.38945], [0.36572, 0.17248]]
 * 解释:
 * Solution solution = new Solution(1.0, 0.0, 0.0);
 * solution.randPoint ();//返回[-0.02493，-0.38077]
 * solution.randPoint ();//返回[0.82314,0.38945]
 * solution.randPoint ();//返回[0.36572,0.17248]
 * <p>
 * 提示：
 * 0 < radius <= 108
 * -107 <= x_center, y_center <= 107
 * randPoint 最多被调用 3 * 104 次
 */
public class Solution {
    /**
     * 方法：数学
     */
    //随机数
    private final Random random;
    //坐标
    private final double xc;
    private final double yc;
    private final double r;

    //初始化
    public Solution(double radius, double x_center, double y_center) {
        this.random = new Random();
        xc = x_center;
        yc = y_center;
        r = radius;
    }

    //随机
    public double[] randPoint() {
        //循环
        while (true) {
            //获取x值
            double x = random.nextDouble() * (2 * r) - r;
            //获取y值
            double y = random.nextDouble() * (2 * r) - r;
            //在圆内
            if (x * x + y * y <= r * r) {
                return new double[]{xc + x, yc + y};
            }
        }
    }
}
