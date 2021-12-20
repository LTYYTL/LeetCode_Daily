package com.leetcode.L401_500.L0475;

import java.util.Arrays;

/**
 * 475. 供暖器
 * 冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
 * 在加热器的加热半径范围内的每个房屋都可以获得供暖。
 * 现在，给出位于一条水平线上的房屋 houses 和供暖器 heaters 的位置，请你找出并返回可以覆盖所有房屋的最小加热半径。
 * 说明：所有供暖器都遵循你的半径标准，加热的半径也一样。
 *
 * 示例 1:
 * 输入: houses = [1,2,3], heaters = [2]
 * 输出: 1
 * 解释: 仅在位置2上有一个供暖器。如果我们将加热半径设为1，那么所有房屋就都能得到供暖。
 *
 * 示例 2:
 * 输入: houses = [1,2,3,4], heaters = [1,4]
 * 输出: 1
 * 解释: 在位置1, 4上有两个供暖器。我们需要将加热半径设为1，这样所有房屋就都能得到供暖。
 *
 * 示例 3：
 * 输入：houses = [1,5], heaters = [2]
 * 输出：3
 *
 * 提示：
 * 1 <= houses.length, heaters.length <= 3 * 104
 * 1 <= houses[i], heaters[i] <= 109
 */
public class Heaters {
    /**
     * 方法：二分查找
     * @param houses
     * @param heaters
     * @return
     */
    public int findRadius(int[] houses, int[] heaters) {
        //对供暖器排序
        Arrays.sort(heaters);
        //半径
        int max = 0;
        //遍历
        for (int house : houses) {
            //找到在当前房子前面最近的供暖器的位置
            int i = find(house,heaters);
            //第二个供暖器
            int j = i + 1;
            //在当前房子前面的最近供暖器离房子的距离
            int left = i < 0 ? Integer.MAX_VALUE : house - heaters[i];
            //在当前房子后面的最近供暖器离房子的距离
            int right = j >= heaters.length ? Integer.MAX_VALUE : heaters[j] - house;
            //供暖器到房子的最小距离
            int dis = Math.min(left,right);
            //最小的供暖器半径
            max = Math.max(max,dis);
        }
        return max;
    }

    //二分查找
    private int find(int target, int[] heaters) {
        //双指针
        int low = 0;
        int high = heaters.length - 1;
        //特殊情况
        if (heaters[low] > target)
            return -1;
        while (low < high){
            int mid = (high - low + 1)/2 + low;
            if (heaters[mid] > target){
                high = mid - 1;
            }else {
                low = mid;
            }
        }

        return low;
    }
}
