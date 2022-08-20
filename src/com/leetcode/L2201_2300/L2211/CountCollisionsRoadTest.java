package com.leetcode.L2201_2300.L2211;

public class CountCollisionsRoadTest {
    public static void main(String[] args) {
        CountCollisionsRoad countCollisionsRoad = new CountCollisionsRoad();
        /*
          示例 1：
          输入：directions = "RLRSLL"
          输出：5
          解释：
          将会在道路上发生的碰撞列出如下：
          - 车 0 和车 1 会互相碰撞。由于它们按相反方向移动，碰撞数量变为 0 + 2 = 2 。
          - 车 2 和车 3 会互相碰撞。由于 3 是静止的，碰撞数量变为 2 + 1 = 3 。
          - 车 3 和车 4 会互相碰撞。由于 3 是静止的，碰撞数量变为 3 + 1 = 4 。
          - 车 4 和车 5 会互相碰撞。在车 4 和车 3 碰撞之后，车 4 会待在碰撞位置，接着和车 5 碰撞。碰撞数量变为 4 + 1 = 5 。
          因此，将会在道路上发生的碰撞总次数是 5 。
         */
        System.out.println(countCollisionsRoad.countCollisions("RLRSLL"));
        /*
          示例 2：
          输入：directions = "LLRR"
          输出：0
          解释：
          不存在会发生碰撞的车辆。因此，将会在道路上发生的碰撞总次数是 0 。
         */
        System.out.println(countCollisionsRoad.countCollisions("LLRR"));
    }
}
