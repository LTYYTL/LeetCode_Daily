package com.leetcode.L201_300.L0229;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 229. 求众数 II
 * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 *
 * 示例 1：
 * 输入：[3,2,3]
 * 输出：[3]
 *
 * 示例 2：
 * 输入：nums = [1]
 * 输出：[1]
 *
 * 示例 3：
 * 输入：[1,1,1,3,3,2,2,2]
 * 输出：[1,2]
 *
 * 提示：
 * 1 <= nums.length <= 5 * 104
 * -109 <= nums[i] <= 109
 *
 *
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1)的算法解决此问题。
 */
public class MajorityElementII {
    /**
     * 方法：map映射
     * @param nums
     * @return
     */
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        //记录次数
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //长度
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        //遍历map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            //将符合条件的存入
            if (value > n /3)
                res.add(key);
        }
        return res;
    }

    /**
     * 方法二：摩尔投票
     * @param nums
     * @return
     */
    public List<Integer> majorityElement_more(int[] nums) {
        int element1 = 0;
        int element2 = 0;
        int count1 = 0;
        int count2 = 0;
        //寻找众数
        for (int num : nums) {
            if (num == element1 && count1 > 0)
                count1++;
            else if (num == element2 && count2 > 0)
                count2++;
            else if (count1 == 0){
                element1 = num;
                count1++;
            }else if (count2 == 0){
                element2 = num;
                count2++;
            }else {//三个都不一样
                count1--;
                count2--;
            }
        }
        //记录长度
        int cnt1 = 0;
        int cnt2 = 0;
        for (int num : nums) {
            if (count1 > 0 && num == element1) {
                cnt1++;
            }
            if (count2 > 0 && num == element2) {
                cnt2++;
            }
        }
        // 检测元素出现的次数是否满足要求
        List<Integer> ans = new ArrayList<>();
        if (count1 > 0 && cnt1 > nums.length / 3) {
            ans.add(element1);
        }
        if (count2 > 0 && cnt2 > nums.length / 3) {
            ans.add(element2);
        }

        return ans;
    }
}
