package com.offer.L0450;

import java.util.Arrays;

/**
 * 剑指 Offer 45. 把数组排成最小的数
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 * 示例 1:
 * 输入: [10,2]
 * 输出: "102"
 *
 * 示例 2:
 * 输入: [3,30,34,5,9]
 * 输出: "3033459"
 *
 * 提示:
 * 0 < nums.length <= 100
 *
 * 说明:
 * 输出结果可能非常大，所以你需要返回一个字符串而不是整数
 * 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0
 */
public class ArrangeArraySmallestNumber {
    /**
     * 方法：排序
     */
    public String minNumber(int[] nums) {
        //转换数字为字符串
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        //快排
        quickSort(strs,0,strs.length-1);
        //结果
        StringBuilder res = new StringBuilder();
        //字符串拼接
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    /**
     * 快速排序
     */
    private void quickSort(String[] strs, int l, int r) {
        if (l >= r)
            return;
        int i = l;
        int j = r;
        String temp = strs[i];
        while (i < j){
            while (i < j && (strs[j]+strs[l]).compareTo(strs[l]+strs[j])>= 0) j--;
            while (i < j && (strs[i]+strs[l]).compareTo(strs[l]+strs[i])<= 0) i++;
            temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
        }
        strs[i] = strs[l];
        strs[l] = temp;

        quickSort(strs,l,i-1);
        quickSort(strs,i+1,r);
    }

    /**
     * 方法：排序
     */
    public String minNumber_sort(int[] nums) {
        //转换数字为字符串
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        //快排
        Arrays.sort(strs, (x,y) -> (x+y).compareTo(y+x));
        //结果
        StringBuilder res = new StringBuilder();
        //字符串拼接
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }
}
