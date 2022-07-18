package com.leetcode.L501_600.L0565;

/**
 * 565. 数组嵌套
 * 索引从0开始长度为N的数组A，包含0到N - 1的所有整数。找到最大的集合S并返回其大小，其中 S[i] = {A[i], A[A[i]], A[A[A[i]]], ... }且遵守以下的规则。
 * 假设选择索引为i的元素A[i]为S的第一个元素，S的下一个元素应该是A[A[i]]，之后是A[A[A[i]]]... 以此类推，不断添加直到S出现重复的元素。
 * <p>
 * 示例 1:
 * 输入: A = [5,4,0,3,1,6,2]
 * 输出: 4
 * 解释:
 * A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.
 * 其中一种最长的 S[K]:
 * S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
 * <p>
 * 提示：
 * 1 <= nums.length <= 105
 * 0 <= nums[i] < nums.length
 * A中不含有重复的元素。
 * 通过次数42,553提交次数68,179
 */
public class ArrayNesting {
    /**
     * 方法：模拟
     *
     * @param nums
     * @return
     */
    public int arrayNesting(int[] nums) {
        //结果
        int res = 0;
        //长度
        int n = nums.length;
        //记录是否被访问
        boolean[] vis = new boolean[n];
        //遍历
        for (int i = 0; i < n; i++) {
            //当前长度
            int cnt = 0;
            //遍历，直到遇到已经访问的点
            while (!vis[i]) {
                //变成已访问
                vis[i] = true;
                //移动索引
                i = nums[i];
                //增加长度
                cnt++;
            }
            //最大长度
            res = Math.max(cnt, res);
        }

        return res;

    }
}
