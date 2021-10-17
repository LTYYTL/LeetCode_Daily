package com.leetcode.L701_800.L0735;

import java.util.Stack;

/**
 * 735. 行星碰撞
 * 给定一个整数数组 asteroids，表示在同一行的行星。
 * 对于数组中的每一个元素，其绝对值表示行星的大小，正负表示行星的移动方向（正表示向右移动，负表示向左移动）。每一颗行星以相同的速度移动。
 * 找出碰撞后剩下的所有行星。碰撞规则：两个行星相互碰撞，较小的行星会爆炸。如果两颗行星大小相同，则两颗行星都会爆炸。两颗移动方向相同的行星，永远不会发生碰撞。
 *
 * 示例 1：
 * 输入：asteroids = [5,10,-5]
 * 输出：[5,10]
 * 解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。
 *
 * 示例 2：
 * 输入：asteroids = [8,-8]
 * 输出：[]
 * 解释：8 和 -8 碰撞后，两者都发生爆炸。
 *
 * 示例 3：
 * 输入：asteroids = [10,2,-5]
 * 输出：[10]
 * 解释：2 和 -5 发生碰撞后剩下 -5 。10 和 -5 发生碰撞后剩下 10 。
 *
 * 示例 4：
 * 输入：asteroids = [-2,-1,1,2]
 * 输出：[-2,-1,1,2]
 * 解释：-2 和 -1 向左移动，而 1 和 2 向右移动。 由于移动方向相同的行星不会发生碰撞，所以最终没有行星发生碰撞。
 *
 * 提示：
 * 2 <= asteroids.length <= 104
 * -1000 <= asteroids[i] <= 1000
 * asteroids[i] != 0
 */
public class AsteroidCollision {
    /**
     * 方法：栈
     * @param asteroids
     * @return
     */
    public int[] asteroidCollision(int[] asteroids) {
        //存放行星
        Stack<Integer> stack = new Stack();
        //存入第一颗行星
        stack.push(asteroids[0]);
        //遍历
        for (int i = 1; i < asteroids.length; i++) {
            //标志位，用于判断是否加入当前行星
            boolean flag = true;
            //当两颗行星方向不同时
            while (!stack.isEmpty() && asteroids[i] * stack.peek() < 0){
                //前面是向左的行星
                if (stack.peek() < 0)
                    break;
                else if (Math.abs(asteroids[i]) > Math.abs(stack.peek()))//当前行星比前面的大，前面的粉碎
                    stack.pop();
                else if (Math.abs(asteroids[i]) == Math.abs(stack.peek())) {//两颗行星一样大，一起粉碎
                    stack.pop();
                    flag = false;//不向栈中加入当前行星
                    break;
                }else {//当前行星比前面的小，当前的粉碎
                    flag = false;
                    break;
                }
            }
            if (flag){
                stack.push(asteroids[i]);
            }
        }
        //输出存在行星
        int[] ans = new int[stack.size()];
        for (int t = ans.length - 1; t >= 0; --t) {
            ans[t] = stack.pop();
        }
        return ans;
    }
}
