package com.offerII.L037;

import java.util.Arrays;

public class AsteroidCollisionTest {
    public static void main(String[] args) {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        /**
         * 示例 1：
         * 输入：asteroids = [5,10,-5]
         * 输出：[5,10]
         * 解释：10 和 -5 碰撞后只剩下 10 。 5 和 10 永远不会发生碰撞。
         */
        System.out.println(Arrays.toString(asteroidCollision.asteroidCollision(new int[]{5, 10, -5})));
        /**
         * 示例 2：
         * 输入：asteroids = [8,-8]
         * 输出：[]
         * 解释：8 和 -8 碰撞后，两者都发生爆炸。
         */
        System.out.println(Arrays.toString(asteroidCollision.asteroidCollision(new int[]{8,-8})));
        /**
         * 示例 3：
         * 输入：asteroids = [10,2,-5]
         * 输出：[10]
         * 解释：2 和 -5 发生碰撞后剩下 -5 。10 和 -5 发生碰撞后剩下 10 。
         */
        System.out.println(Arrays.toString(asteroidCollision.asteroidCollision(new int[]{10,2,-5})));
        /**
         * 示例 4：
         * 输入：asteroids = [-2,-1,1,2]
         * 输出：[-2,-1,1,2]
         * 解释：-2 和 -1 向左移动，而 1 和 2 向右移动。 由于移动方向相同的行星不会发生碰撞，所以最终没有行星发生碰撞。
         */
        System.out.println(Arrays.toString(asteroidCollision.asteroidCollision(new int[]{-2,-1,1,2})));
    }
}
