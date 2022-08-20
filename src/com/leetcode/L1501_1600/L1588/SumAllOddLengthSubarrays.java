package com.leetcode.L1501_1600.L1588;

/**
 * 1588. 所有奇数长度子数组的和
 * 给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
 * 子数组 定义为原数组中的一个连续子序列。
 * 请你返回 arr 中 所有奇数长度子数组的和 。
 *
 * 示例 1：
 * 输入：arr = [1,4,2,5,3]
 * 输出：58
 * 解释：所有奇数长度子数组和它们的和为：
 * [1] = 1
 * [4] = 4
 * [2] = 2
 * [5] = 5
 * [3] = 3
 * [1,4,2] = 7
 * [4,2,5] = 11
 * [2,5,3] = 10
 * [1,4,2,5,3] = 15
 * 我们将所有值求和得到 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 *
 * 示例 2：
 * 输入：arr = [1,2]
 * 输出：3
 * 解释：总共只有 2 个长度为奇数的子数组，[1] 和 [2]。它们的和为 3 。
 *
 * 示例 3：
 * 输入：arr = [10,11,12]
 * 输出：66
 *
 * 提示：
 * 1 <= arr.length <= 100
 * 1 <= arr[i] <= 1000
 */
public class SumAllOddLengthSubarrays {
    /**
     * 方法一：前缀和
     * @param arr
     * @return
     */
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        int[] prefixSums = new int[arr.length+1];
        //prefixSums[i]:从0到i的和
        for (int i = 0; i < arr.length; i++) {
            prefixSums[i+1] = prefixSums[i] + arr[i];
        }
        for (int start = 0; start < arr.length; start++) {
            //步长为2
            for (int length = 1; start+length <= arr.length; length+=2) {
                int end = start + length - 1;
                res += prefixSums[end+1] - prefixSums[start];
            }
        }
        return res;
    }

    /**
     * 方法二：数学
     * 核心思想：计算每个元素在奇数数组中出现的次数，然后直接arr[i] * count即可得到该元素贡献出的数值
     *
     * 如何计算？？？
     * 对于某个元素，以它构建奇数数组，那么
     * 从他左边取奇数个元素，再在它右边取奇数个元素，那么再加它本身，总和也是奇数
     * 从他左边取偶数个元素，再在它右边取偶数个元素，那么再加它本身，总和也是奇数
     * 那么有多少种取法？
     * 答案就是leftOdd * rightOdd(取奇数的取法) + leftEven * rightEven(取偶数的取法)
     *
     * 那么对于数组中的某个索引i，该如何计算呢？？？
     * 以[1,4,2,5,3]为例，假设i = 2
     * 那么它的左边有2个元素，而且要连续，那么可取的情况有[1,4,2],[4,2],[2]，即取2个、取1个、取0个
     * 右边也同理，[2,5,3],[2,5],[2]
     * 计算：1(左边奇数个为1) * 1(右边奇数个为1) + 2(左边偶数个为2) * 2(右边偶数个为2，包含0) = 5种情况
     *
     * 作者：codeppx
     * 链接：<a href="https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/solution/kan-zhe-pian-ba-duo-fang-fa-tou-xi-1588-cgdzf/">https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/solution/kan-zhe-pian-ba-duo-fang-fa-tou-xi-1588-cgdzf/</a>
     * @param arr
     * @return
     */
    public int sumOddLengthSubarrays_math(int[] arr) {
        int len = arr.length;

        int res = 0;
        int left, right;
        int leftOdd, rightOdd;
        int leftEven, rightEven;

        for (int i = 0; i < len; i++) {
            left = i + 1;//左边元素个数
            right = len - i;//右边元素个数
            leftOdd = left / 2;//左边奇数个数
            rightOdd = right / 2;//右边奇数个数

            leftEven = (left + 1) / 2;//左边偶数个数
            rightEven = (right + 1) / 2;//右边偶数个数

            res += arr[i] * (leftOdd * rightOdd + leftEven * rightEven);
        }


        return res;
    }

}
