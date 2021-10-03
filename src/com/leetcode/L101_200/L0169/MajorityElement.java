package com.leetcode.L101_200.L0169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 169. 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * 示例 1：
 * 输入：[3,2,3]
 * 输出：3
 *
 * 示例 2：
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 *
 * 进阶：
 * 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 */
public class MajorityElement {
    /**
     * 方法一：map映射
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        //记录每个元素的次数
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        //遍历map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //元素
            int key = entry.getKey();
            //次数
            int count = entry.getValue();
            if(count > n)
                return key;
        }
        return -1;
    }

    /**
     * 方法二：排序
     * @param nums
     * @return
     */
    public int majorityElement_sort(int[] nums) {
        //排序
        Arrays.sort(nums);
        //大于n/2数量的元素一定在中间
        return nums[nums.length/2];
    }

    /**
     * 方法三：摩尔投票法
     * @param nums
     * @return
     */
    public int majorityElement_moore(int[] nums){
        //目标值
        int target = nums[0];
        //投票数
        int count = 1;
        //遍历
        for (int i = 1; i < nums.length; i++) {
            //当前值与目标值相等，投票数+1
            if (target == nums[i]){
                count++;
            }else if (--count == 0){//不同时，投票数-1，当=0时，换目标值
                target = nums[i];
                count = 1;
            }
        }
        return target;
    }
}
