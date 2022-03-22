package com.leetcode.L2201_2300.L2211;

/**
 * 2211. 统计道路上的碰撞次数
 * 在一条无限长的公路上有 n 辆汽车正在行驶。汽车按从左到右的顺序按从 0 到 n - 1 编号，每辆车都在一个 独特的 位置。
 * 给你一个下标从 0 开始的字符串 directions ，长度为 n 。
 * directions[i] 可以是 'L'、'R' 或 'S' 分别表示第 i 辆车是向 左 、向 右 或者 停留 在当前位置。每辆车移动时 速度相同 。
 *
 * 碰撞次数可以按下述方式计算：
 * (1)当两辆移动方向 相反 的车相撞时，碰撞次数加 2 。
 * (2)当一辆移动的车和一辆静止的车相撞时，碰撞次数加 1 。
 * 碰撞发生后，涉及的车辆将无法继续移动并停留在碰撞位置。除此之外，汽车不能改变它们的状态或移动方向。
 *
 * 返回在这条道路上发生的 碰撞总次数 。
 *
 * 示例 1：
 * 输入：directions = "RLRSLL"
 * 输出：5
 * 解释：
 * 将会在道路上发生的碰撞列出如下：
 * - 车 0 和车 1 会互相碰撞。由于它们按相反方向移动，碰撞数量变为 0 + 2 = 2 。
 * - 车 2 和车 3 会互相碰撞。由于 3 是静止的，碰撞数量变为 2 + 1 = 3 。
 * - 车 3 和车 4 会互相碰撞。由于 3 是静止的，碰撞数量变为 3 + 1 = 4 。
 * - 车 4 和车 5 会互相碰撞。在车 4 和车 3 碰撞之后，车 4 会待在碰撞位置，接着和车 5 碰撞。碰撞数量变为 4 + 1 = 5 。
 * 因此，将会在道路上发生的碰撞总次数是 5 。
 *
 * 示例 2：
 * 输入：directions = "LLRR"
 * 输出：0
 * 解释：
 * 不存在会发生碰撞的车辆。因此，将会在道路上发生的碰撞总次数是 0 。
 *
 * 提示：
 * 1 <= directions.length <= 105
 * directions[i] 的值为 'L'、'R' 或 'S'
 */
public class CountCollisionsRoad {
    /**
     * 方法：模拟
     *
     * 分析题意：
     * 当两辆移动方向 相反 的车相撞时，碰撞次数加 2 。--> 两辆车被撞停，答案 + 2。
     * 当一辆移动的车和一辆静止的车相撞时，碰撞次数加 1 。--> 一辆车被撞停，答案 +1。
     * 显然，左侧的 ’L’ 和右侧的 ’R’ 不会被撞停；而中间的车辆都会最终停止，因此统计中间的、一开始没有停止的车辆数（即不是 ’S’ 的车辆数）即可。
     * 作者：newhar
     * 链接：https://leetcode-cn.com/problems/count-collisions-on-a-road/solution/da-an-hui-bei-zhuang-ting-de-che-liang-s-yyfl/
     * @param directions
     * @return
     */
    public int countCollisions(String directions) {
        //结果
        int res = 0;
        //左指针
        int l = 0;
        //右指针
        int r = directions.length() - 1;
        //除去左边向左走的车辆
        while (l <= r && directions.charAt(l) == 'L') ++l;
        //除去右边向右走的车辆
        while (l <= r && directions.charAt(r) == 'R') --r;
        //遍历l~r之间运动的车
        for (int i = l; i <= r; ++i){
            //中间段中遇到’L‘或’R‘一定会发生碰撞
            if (directions.charAt(i) == 'L' || directions.charAt(i) == 'R')
                res++;
        }

        return res;
    }
}
