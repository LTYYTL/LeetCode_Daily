package com.leetcode.L401_500.L0477;

/**
 * 477. 汉明距离总和
 * 两个整数的 汉明距离 指的是这两个数字的二进制数对应位不同的数量。
 * 计算一个数组中，任意两个数之间汉明距离的总和。
 *
 * 示例:
 * 输入: 4, 14, 2
 * 输出: 6
 * 解释: 在二进制表示中，4表示为0100，14表示为1110，2表示为0010。（这样表示是为了体现后四位之间关系）
 * 所以答案为：
 * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
 *
 * 注意:
 * 数组中元素的范围为从 0到 10^9。
 * 数组的长度不超过 10^4。
 */
public class TotalHammingDistance {
    /**
     * 方法一：双指针
     * @param nums
     * @return
     */
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        //两两成对，记录不同的位数
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                res += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return res;
    }

    /**
     * 方法二：位运算
     * @param nums
     * @return
     */
    public int totalHammingDistance_bit(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < 30; i++) {
            //记录1的个数
            int c = 0;
            //统计1的个数
            for (int num : nums) {
                c += (num>>i) & 1;
            }
            //用1的个数*0的个数，获得在第i个位置两两不同数对的数量
            res += c * (n-c);
        }
        return res;
    }
}
