package com.leetcode.L1442;

/**
 * 1442. 形成两个异或相等数组的三元组数目
 * 给你一个整数数组 arr 。
 * 现需要从数组中取三个下标 i、j 和 k ，其中 (0 <= i < j <= k < arr.length) 。
 *
 * a 和 b 定义如下：
 * a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
 * b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
 * 注意：^ 表示 按位异或 操作。
 *
 * 请返回能够令 a == b 成立的三元组 (i, j , k) 的数目。
 *
 * 示例 1：
 * 输入：arr = [2,3,1,6,7]
 * 输出：4
 * 解释：满足题意的三元组分别是 (0,1,2), (0,2,2), (2,3,4) 以及 (2,4,4)
 *
 * 示例 2：
 * 输入：arr = [1,1,1,1,1]
 * 输出：10
 *
 * 示例 3：
 * 输入：arr = [2,3]
 * 输出：0
 *
 * 示例 4：
 * 输入：arr = [1,3,5,7,9]
 * 输出：3
 *
 * 示例 5：
 * 输入：arr = [7,11,12,9,5,2,7,17,22]
 * 输出：8
 *
 * 提示：
 * 1 <= arr.length <= 300
 * 1 <= arr[i] <= 10^8
 */
public class CountTripletsThatCanFormTwoArraysEqualXOR {
    /**
     * 方法：双指针
     * 解题思路：因为a=b，所以a^b=0
     * @param arr
     * @return
     */
    public int countTriplets(int[] arr) {
        //所有可能的组合
        int total = 0;
        int length = arr.length;
        //判断数组从i到j的元素的异或结果是否是0
        for (int i = 0; i < length; i++) {
            int xor = arr[i];
            for (int j = i+1; j < length; j++) {
                xor ^= arr[j];
                //如果数组从i到j的异或结果是0，那他们可能的组合就是j-i
                if (xor == 0)
                    total += (j-i);
            }
        }
        return total;
    }
}
