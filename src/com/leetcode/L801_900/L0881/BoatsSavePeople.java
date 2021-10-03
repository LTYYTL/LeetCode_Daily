package com.leetcode.L801_900.L0881;

import java.util.Arrays;

/**
 * 881. 救生艇
 * 第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。
 * 每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。
 * 返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
 *
 * 示例 1：
 * 输入：people = [1,2], limit = 3
 * 输出：1
 * 解释：1 艘船载 (1, 2)
 *
 * 示例 2：
 * 输入：people = [3,2,2,1], limit = 3
 * 输出：3
 * 解释：3 艘船分别载 (1, 2), (2) 和 (3)
 *
 * 示例 3：
 * 输入：people = [3,5,3,4], limit = 5
 * 输出：4
 * 解释：4 艘船分别载 (3), (3), (4), (5)
 *
 * 提示：
 * 1 <= people.length <= 50000
 * 1 <= people[i] <= limit <= 30000
 */
public class BoatsSavePeople {
    /**
     * 方法：双指针
     * @param people
     * @param limit
     * @return
     */
    public int numRescueBoats(int[] people, int limit) {
        //排序
        Arrays.sort(people);
        //双指针
        int left = 0;
        int right = people.length - 1;
        //结果集
        int res = 0;
        //遍历数组
        while (left <= right){
            //等于最大限制
            if (people[right] == limit){
                right--;
                //前后相加大于最大限制，只要最大
            }else if (people[right] + people[left] > limit){
                right--;
                //前后相加小于等于最大限制，两个都要
            }else if (people[right] + people[left] <= limit){
                left++;
                right--;
            }
            res++;
        }
        return res;
    }
}
