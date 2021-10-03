package com.leetcode.L101_200.L0135;

import java.util.Arrays;

/**
 * 135. 分发糖果
 * 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
 * 每个孩子至少分配到 1 个糖果。
 * 相邻的孩子中，评分高的孩子必须获得更多的糖果。
 * 那么这样下来，老师至少需要准备多少颗糖果呢？
 *
 * 示例 1:
 * 输入: [1,0,2]
 * 输出: 5
 * 解释: 你可以分别给这三个孩子分发 2、1、2 颗糖果。
 *
 * 示例 2:
 * 输入: [1,2,2]
 * 输出: 4
 * 解释: 你可以分别给这三个孩子分发 1、2、1 颗糖果。
 *      第三个孩子只得到 1 颗糖果，这已满足上述两个条件。
 */
public class Candy {
    /**
     * 方法：贪心算法
     *
     * 解题思路：
     * 规则定义： 设学生 AA 和学生 BB 左右相邻，AA 在 BB 左边；
     * 左规则： 当 ratings_B>ratings_A时，BB 的糖比 AA 的糖数量多。
     * 右规则： 当 ratings_A>ratings_B时，AA 的糖比 BB 的糖数量多。
     * 相邻的学生中，评分高的学生必须获得更多的糖果 等价于 所有学生满足左规则且满足右规则。
     *
     * 算法流程：
     * 先从左至右遍历学生成绩 ratings，按照以下规则给糖，并记录在 left 中：
     * 先给所有学生 1 颗糖；
     * 若 ratings_i>ratings_{i-1}，则第 i 名学生糖比第 i - 1 名学生多 1 个。
     * 若 ratings_i<=ratings_{i-1}，则第 i 名学生糖数量不变。（交由从右向左遍历时处理。）
     * 经过此规则分配后，可以保证所有学生糖数量 满足左规则 。
     * 同理，在此规则下从右至左遍历学生成绩并记录在 right 中，可以保证所有学生糖数量 满足右规则 。
     * 最终，取以上 2 轮遍历 left 和 right 对应学生糖果数的 最大值 ，这样则 同时满足左规则和右规则 ，即得到每个同学的最少糖果数量。
     *
     * 复杂度分析：
     * 时间复杂度 O(N) ： 遍历两遍数组即可得到结果；
     * 空间复杂度 O(N) ： 需要借用left，right的线性额外空间。
     *
     * 作者：jyd
     * 链接：https://leetcode-cn.com/problems/candy/solution/candy-cong-zuo-zhi-you-cong-you-zhi-zuo-qu-zui-da-/
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {
        //结果变量
        int sum = 0;
        //左规则
        int[] left = new int[ratings.length];
        //右规则
        int[] right = new int[ratings.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        //从左到右
        for (int i = 1; i < left.length; ++i){
            if (ratings[i] > ratings[i-1])
                left[i] = left[i-1] + 1;
        }
        sum = left[ratings.length - 1];
        //从右到左
        for (int i = ratings.length - 2; i >= 0; --i){
            if (ratings[i] > ratings[i + 1])
                right[i] = right[i+1]+1;
            sum+=Math.max(left[i],right[i]);
        }
        return sum;
    }
}
