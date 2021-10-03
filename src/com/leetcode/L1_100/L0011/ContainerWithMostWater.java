package com.leetcode.L1_100.L0011;

/**
 * 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 *
 * 示例：
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class ContainerWithMostWater {
    /**
     * 方法：双指针
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int max = 0;
        //左指针
        int left = 0;
        //右指针
        int right = height.length-1;
        while(left < right){
            //计算宽度
            int wide = right - left;
            //取高度最小的为高
            int high  = Math.min(height[left],height[right]);
            //保留最大的容水数
            max = Math.max(wide*high,max);
            //左边的比右边高，移动右指针
            //左边的比右边低，移动左指针
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
