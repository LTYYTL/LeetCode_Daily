package com.leetcode.L1101_1200.L1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1200. 最小绝对差
 * 给你个整数数组 arr，其中每个元素都 不相同。
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 * <p>
 * 示例 1：
 * 输入：arr = [4,2,1,3]
 * 输出：[[1,2],[2,3],[3,4]]
 * <p>
 * 示例 2：
 * 输入：arr = [1,3,6,10,15]
 * 输出：[[1,3]]
 * <p>
 * 示例 3：
 * 输入：arr = [3,8,-10,23,19,-4,-14,27]
 * 输出：[[-14,-10],[19,23],[23,27]]
 * <p>
 * 提示：
 * 2 <= arr.length <= 10^5
 * -10^6 <= arr[i] <= 10^6
 */
public class MinAbsoluteDiff {
    /**
     * 方法：排序
     *
     * @param arr
     * @return
     */
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //排序
        Arrays.sort(arr);
        //记录最小差
        int min = Integer.MAX_VALUE;
        //结果
        List<List<Integer>> res = new ArrayList<>();
        //遍历
        for (int i = 1; i < arr.length; i++) {
            //计算差值的绝对值
            int abs = Math.abs(arr[i] - arr[i - 1]);
            //比记录最小差还小
            if (min > abs) {
                //改变最小差
                min = abs;
                //清空
                res.clear();
            }
            //是最小值
            if (min == abs) {
                //记录数对
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                //加入结果集
                res.add(list);
            }
        }
        return res;
    }
}
