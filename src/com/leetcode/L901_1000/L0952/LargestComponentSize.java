package com.leetcode.L901_1000.L0952;

import com.util.UF;

import java.util.Arrays;

/**
 * 952. 按公因数计算最大组件大小
 * 给定一个由不同正整数的组成的非空数组 nums ，考虑下面的图：
 * (1)有 nums.length 个节点，按从 nums[0] 到 nums[nums.length - 1] 标记；
 * (2)只有当 nums[i] 和 nums[j] 共用一个大于 1 的公因数时，nums[i] 和 nums[j]之间才有一条边。
 * 返回 图中最大连通组件的大小 。
 * <p>
 * 示例 1：
 * 输入：nums = [4,6,15,35]
 * 输出：4
 * <p>
 * 示例 2：
 * 输入：nums = [20,50,9,63]
 * 输出：2
 * <p>
 * 示例 3：
 * 输入：nums = [2,3,6,7,4,12,21,39]
 * 输出：8
 * <p>
 * 提示：
 * 1 <= nums.length <= 2 * 104
 * 1 <= nums[i] <= 105
 * nums 中所有值都 不同
 */
public class LargestComponentSize {
    /**
     * 方法：并查集
     *
     * @param nums
     * @return
     */
    public int largestComponentSize(int[] nums) {
        //获取最大值
        int max = Arrays.stream(nums).max().getAsInt();
        //并查集
        UF uf = new UF(max + 1);

        //遍历
        for (int num : nums) {
            //计算公因数
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    //公因数放入一个并查集中
                    uf.union(num, i);
                    uf.union(num, num / i);
                }
            }
        }

        //结果
        int res = 0;
        //计算每个节点的最大组件
        int[] contains = new int[max + 1];
        for (int num : nums) {
            //获取根节点
            int root = uf.find(num);
            //记录个数
            contains[root]++;
            //记录最大值
            res = Math.max(res, contains[root]);
        }
        return res;
    }
}
