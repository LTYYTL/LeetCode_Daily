package com.leetcode.L0350;

import java.util.*;

/**
 * 350. 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 *
 * 示例 2:
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 *
 * 进阶：
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class IntersectionArrayII {
    /**
     * 方法一：哈希表
     * @param nums1 数组1
     * @param nums2 数组2
     * @return 两个数组的交集数组
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        //记录每个数出现的次数
        Map<Integer,Integer> map = new HashMap<>();
        //记录nums1中每个数的次数
        for (int i = 0; i < nums1.length ; i++){
            int key = nums1[i];
            //判断num1[i]是否已经存在map中，
            //没存在：将其加入
            //存在：在原来的基础上次数+1
            if (map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else {
                map.put(key,1);
            }
        }
        //用于存储两个数组的交集
        List<Integer> list = new ArrayList<>();
        //遍历nums2获得交集
        for (int i = 0 ; i<nums2.length ; i++){
            int key = nums2[i];
            //当前值存在于map中，并且次数大于0，存入list中，将其的次数-1
            if (map.containsKey(key) && map.get(key) > 0){
                map.put(key,map.get(key)-1);
                list.add(key);
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
    public int[] intersect_doublePointer(int[] nums1,int[] nums2){
        //将两个数组排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //分别指向两个数组的指针
        int i = 0;
        int j = 0;
        //用于存储两个数组的交集
        List<Integer> list = new ArrayList<>();
        //分情况讨论
        //1、当 nums1[i] = nums2[j]时，当前的值为两个数组的交集，将其存入list中，并将两个指针向后移动一位
        //2、当 nums1[i] > nums2[j]时，说明当前nums1[i]的值偏大，应将nums2的指针向后移动一位（nums2已增序排列）
        //2、当 nums1[i] < nums2[j]时，说明当前nums2[j]的值偏大，应将nums1的指针向后移动一位（nums1已增序排列）
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else {
                i++;
            }
        }
        //将list中交集转换成数组
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); ++k){
            res[k] = list.get(k);
        }
        return res;
    }
}
