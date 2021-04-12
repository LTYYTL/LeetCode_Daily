package com.leetcode.L0179;

import java.util.Arrays;

/**
 * 179. 最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 *
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 *
 * 示例 3：
 * 输入：nums = [1]
 * 输出："1"
 *
 * 示例 4：
 * 输入：nums = [10]
 * 输出："10"
 *
 * 提示：
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 109
 */
public class LargestNumber {
    /**
     * 方法：排序
     * @param nums
     * @return
     */
    public String largestNumber(int[] nums) {
        //数组长度
        int n = nums.length;
        //字符串数组
        String[] numsToWord = new String[n];
        //将数字转成字符
        for (int i = 0; i < n; ++i){
            numsToWord[i] = String.valueOf(nums[i]);
        }
        //给字符串数组排序
        //判断【3，30】顺序
        //比较330，303大小，最终确定【3，30】
        Arrays.sort(numsToWord,(a,b) ->{
            return (b+a).compareTo(a+b);
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String s:numsToWord) {
            stringBuilder.append(s);
        }
        String res = stringBuilder.toString();
        //判断【0，0】情况
        return res.charAt(0) == '0' ? "0":res;
    }
}
