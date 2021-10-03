package com.leetcode.L301_400.L0349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * 349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1：
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 *
 * 示例 2：
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 *
 * 说明：
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class IntersectionArray {
    /**
     * 方法一：Set集合
     * @param nums1 数组1
     * @param nums2 数组2
     * @return 两个数组的交集数组
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        //空值情况
        if(nums1.length == 0 || nums2.length == 0 || nums1 == null || nums2 == null)
            return new int[0];
        //利用set集合无重复的性质
        TreeSet<Integer> set = new TreeSet<>();
        //将nums1中的数存入set中，并且去除重复项
        for(int num : nums1){
            set.add(num);
        }
        //用于存储两个数组的交集
        List<Integer> list = new ArrayList<>();
        //遍历nums2数组
        for (int num : nums2){
            //判断nums2中的数是否已经存在set中
            if (set.contains(num)){
                //存在即为两个数组的交集
                list.add(num);
                //将交集的数从set中移除，避免存入重复的交集
                set.remove(num);
            }
        }
        //将list中交集转换成数组
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); ++i){
            res[i] = list.get(i);
        }
        return res;
    }

    /**
     * 方法二：双指针
     * @param nums1 数组1
     * @param nums2 数组2
     * @return 两个数组的交集数组
     */
    public int[] intersection_doublePointer(int[] nums1, int[] nums2) {
        //空值情况
        if(nums1.length == 0 || nums2.length == 0 || nums1 == null || nums2 == null)
            return new int[0];
        //将两个数组排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //分别指向两个数组的指针
        int i = 0;
        int j = 0;
        //利用set集合无重复的性质，即去除出现重复交集
        TreeSet<Integer> set = new TreeSet<>();
        //分情况讨论
        //1、当 nums1[i] = nums2[j]时，当前的值为两个数组的交集，将其存入set中，并将两个指针向后移动一位
        //2、当 nums1[i] > nums2[j]时，说明当前nums1[i]的值偏大，应将nums2的指针向后移动一位（nums2已增序排列）
        //2、当 nums1[i] < nums2[j]时，说明当前nums2[j]的值偏大，应将nums1的指针向后移动一位（nums1已增序排列）
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else {
                i++;
            }
        }
        //将set中交集转换成数组
        int[] res = new int[set.size()];
        //set无序，没有get方法，故如此遍历
        int index = 0;
        for (int num : set){
            res[index++] = num;
        }
        return res;
    }
}
