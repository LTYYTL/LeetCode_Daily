package com.leetcode.L0001;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoNumSum {
    /**
     * 方法一：暴力法
     * 时间复杂度：O(n^2)，对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n) 的时间。因此时间复杂度为 O(n^2)
     * 空间复杂度：O(1)。
     *
     * @param nums   数组
     * @param target 目标值
     * @return 满足条件的索引组成的数组
     */
    public int[] twoSum(int[] nums, int target) {
        //从索引为0的位置开始遍历
        for (int i = 0 ; i < nums.length ; i++){
            //与目标值的差值
            int temp = target - nums[i];
            //从索引为i+1的位置开始遍历，其目的可以省去已经遍历过一遍的数字组合
            for (int j = i +1; j < nums.length; j++){
                //当前值与差值相等时，即将当前的索引和差值所在索引放入int[]中
                if (temp == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 方法二：哈希表
     * @param nums   数组
     * @param target 目标值
     * @return 满足条件的索引组成的数组
     */
    public int[] twoSum_hash(int[] nums, int target){
        //存储每个值及所在的索引
        Map<Integer,Integer> map = new HashMap<>();
        //遍历数组
        for (int i = 0 ; i < nums.length ; i++){
            //与目标值的差值
            int temp = target - nums[i];
            //判断当前的差值存在map中
            if(map.containsKey(temp)){
                //存在即将当前的索引和差值所在索引放入int[]中
                return new int[]{map.get(temp),i};
            }
            //将当前值及其索引存入map
            map.put(nums[i],i);
        }
        return null;
    }
}
