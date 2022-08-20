package com.offerII.L119;


import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer II 119. 最长连续序列
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 *
 * 示例 1：
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 *
 * 示例 2：
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 *
 * 提示：
 * 0 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 *
 * 进阶：可以设计并实现时间复杂度为 O(n) 的解决方案吗？
 *
 * 注意：本题与主站 128 题相同： <a href="https://leetcode-cn.com/problems/longest-consecutive-sequence/">https://leetcode-cn.com/problems/longest-consecutive-sequence/</a>
 */
public class LongestConsecutiveSeq {
    /**
     * 方法：并查集
     * @param nums
     * @return
     */
    public int longestConsecutive(int[] nums) {
        //长度
        int n = nums.length;
        //创建并查集
        UF uf = new UF(n);
        //数组数字与索引映射
        Map<Integer,Integer> map = new HashMap<>();

        //映射
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        //遍历
        for (int i = 0; i < nums.length; i++) {
            //相邻数字存在
            if (map.containsKey(nums[i]+1)){
                //获取其索引
                int index = map.get(nums[i]+1);
                //合并
                uf.union(i,index);
            }
        }

        //结果集
        int res = 0;
        //遍历
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res,nums[uf.find(i)]-nums[i]);
        }
        return res + 1;
    }

    static class UF {
        int[] parent;

        public UF(int n) {
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);

            if (rootP == rootQ)
                return;
            parent[rootP] = rootQ;
        }

        public int find(int x) {
            while (parent[x] != x){
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return parent[x];
        }
    }
}
