package com.leetcode.L0454;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 454. 四数相加 II
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过 231 - 1 。
 *
 * 例如:
 * 输入:
 * A = [ 1, 2]
 * B = [-2,-1]
 * C = [-1, 2]
 * D = [ 0, 2]
 * 输出:
 * 2
 *
 * 解释:
 * 两个元组如下:
 * 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
 * 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
 */
public class FourSumII {
    /**
     * 方法：哈希表
     * @param A
     * @param B
     * @param C
     * @param D
     * @return
     */
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        //结果个数
        int res = 0;
        //存储A+B的和
        Map<Integer,Integer> countAB = new HashMap<>();
        //计算A+B的和
        for (int i = 0; i < A.length; ++i){
            for (int j = 0; j < B.length; ++j){
                int sum = A[i] + B[j];
                //记录和出现次数
                if (countAB.containsKey(sum)){
                    countAB.put(sum,countAB.get(sum)+1);
                }else {
                    countAB.put(sum, 1);
                }
            }
        }
        //计算C+D的和的相反数
        for (int i = 0; i < C.length; ++i){
            for (int j = 0; j < D.length; ++j){
                int sum = -(C[i] + D[j]);
                //当C+D的和的相反数出现在map中，说明A+B+C+D的和为0，获得map中的次数即是总次数
                if (countAB.containsKey(sum))
                    res+=countAB.get(sum);
            }
        }
        return res;
    }
}
