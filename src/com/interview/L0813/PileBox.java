package com.interview.L0813;

import java.util.Arrays;

/**
 * 面试题 08.13. 堆箱子
 * 堆箱子。给你一堆n个箱子，箱子宽 wi、深 di、高 hi。箱子不能翻转，将箱子堆起来时，下面箱子的宽度、高度和深度必须大于上面的箱子。
 * 实现一种方法，搭出最高的一堆箱子。箱堆的高度为每个箱子高度的总和。
 *
 * 输入使用数组[wi, di, hi]表示每个箱子。
 *
 * 示例1:
 *  输入：box = [[1, 1, 1], [2, 2, 2], [3, 3, 3]]
 *  输出：6
 *
 * 示例2:
 *  输入：box = [[1, 1, 1], [2, 3, 4], [2, 6, 7], [3, 4, 5]]
 *  输出：10
 *
 * 提示:
 * 箱子的数目不大于3000个。
 */
public class PileBox {
    /**
     * 方法：动态规划
     * @param box
     * @return
     */
    public int pileBox(int[][] box) {
        //长度
        int len = box.length;
        //空值情况
        if (len == 0)
            return 0;
        //按照宽度排序
        Arrays.sort(box,(a,b)->(a[0]-b[0]));
        //dp[i]：表示i为底可堆的高度
        int[] dp = new int[len];
        //初始化
        dp[0] = box[0][2];
        //结果
        int res = box[0][2];
        //从第二个箱子开始算
        for (int i = 1; i < len; i++) {
            //以当前箱子为底的最大值
            int max = 0;
            //遍历从j~i的箱子
            for (int j = 0; j < i; j++) {
                //满足长宽高都大的条件
                if (box[j][0] < box[i][0] && box[j][1] < box[i][1] && box[j][2] < box[i][2])
                    max = Math.max(max,dp[j]);
            }
            //需要+上当前箱子的高度
            dp[i] = max + box[i][2];
            //最大值
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
