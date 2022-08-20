package com.offerII.L007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 剑指 Offer II 007. 数组中和为 0 的三个数
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a ，b ，c ，使得 a + b + c = 0 ？请找出所有和为 0 且 不重复 的三元组。
 *
 * 示例 1：
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 *
 * 示例 2：
 * 输入：nums = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：nums = [0]
 * 输出：[]
 *
 * 提示：
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 *
 *
 * 注意：本题与主站 15 题相同：<a href="https://leetcode-cn.com/problems/3sum/">https://leetcode-cn.com/problems/3sum/</a>
 */
public class Sum3 {
    /**
     * 方法：双指针
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        //排序
        Arrays.sort(nums);
        //三数和为0，从nums【0】开始
        return nSum(nums,3,0,0);
    }

    /**
     * n数和模板
     * @param nums 排序数组
     * @param n    个数
     * @param target 目标值
     * @param start  开始位置
     * @return
     */
    private List<List<Integer>> nSum(int[] nums,int n,int target,int start){
        //结果
        List<List<Integer>> res = new ArrayList<>();
        //数组长度
        int size = nums.length;
        //特殊情况
        if (size < 2 || n < 2)
            return res;
        //两数和，双指针
        if (n == 2){
            int low = start;
            int high = size-1;
            while (low < high){
                //和
                int sum = nums[low] + nums[high];
                int left = nums[low];
                int right = nums[high];
                if (sum < target){
                    while (low < high && nums[low] == left) low++;//去重
                }else if (sum > target){
                    while (low < high && nums[high] == right) high--;//去重
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(left);
                    list.add(right);
                    res.add(list);
                    while (low < high && nums[low] == left) low++;//去重
                    while (low < high && nums[high] == right) high--;//去重
                }

            }
        }else {
            //固定nums[i]
            for (int i = start; i < size; i++) {
                List<List<Integer>> arr = nSum(nums, n - 1, target - nums[i], i + 1);
                for (List<Integer> list : arr) {
                    list.add(nums[i]);
                    res.add(list);
                }
                //去重
                while (i < size-1 && nums[i] == nums[i+1]) i++;
            }
        }
        return res;
    }

}
