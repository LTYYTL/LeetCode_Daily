package com.leetcode.L301_400.L0306;

/**
 * 306. 累加数
 * 累加数 是一个字符串，组成它的数字可以形成累加序列。
 * 一个有效的 累加序列 必须 至少 包含 3 个数。除了最开始的两个数以外，字符串中的其他数都等于它之前两个数相加的和。
 * 给你一个只包含数字 '0'-'9' 的字符串，编写一个算法来判断给定输入是否是 累加数 。如果是，返回 true ；否则，返回 false 。
 * 说明：累加序列里的数 不会 以 0 开头，所以不会出现 1, 2, 03 或者 1, 02, 3 的情况。
 *
 * 示例 1：
 * 输入："112358"
 * 输出：true
 * 解释：累加序列为: 1, 1, 2, 3, 5, 8 。1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
 *
 * 示例 2：
 * 输入："199100199"
 * 输出：true
 * 解释：累加序列为: 1, 99, 100, 199。1 + 99 = 100, 99 + 100 = 199
 *
 * 提示：
 * 1 <= num.length <= 35
 * num 仅由数字（0 - 9）组成
 *
 * 进阶：你计划如何处理由过大的整数输入导致的溢出?
 */
public class AdditiveNumber {

    /**
     * 方法：回溯算法
     * @param num
     * @return
     */
    public boolean isAdditiveNumber(String num) {
        //深度优先搜索
        return dfs(num,0,0,0,0);
    }

    /**
     * 深度优先搜索
     * @param num
     * @param index
     * @param count
     * @param prev
     * @param prevprev
     * @return
     */
    private boolean dfs(String num, int index, int count, long prev, long prevprev) {
        //当前索引超过最大长度
        if (index >= num.length())
            //判断数的个数
            return count > 2;
        //当前数字
        long current = 0;
        //遍历
        for (int i = index; i < num.length(); i++) {
            //获取当前数字
            char c = num.charAt(i);
            //剪枝：不能是前导0，但可以是单独的0
            if (num.charAt(index) == '0' && i > index){
                return false;
            }
            //组成的数
            current = current * 10 + (c -'0');
            //前面已经有两个数
            if (count >= 2){
                //计算前两个数的和
                long sum = prev + prevprev;
                //如果当前数比和大，不满足条件
                if (current > sum)
                    return false;
                //如果当钱数比和小，说明还可以添加新数字
                if (current < sum)
                    continue;
            }
            // 当前满足条件了，或者还不到两个数，向下一层探索
            if (dfs(num, i+1, count+1, current, prev))
                return true;
        }

        return false;
    }

}
