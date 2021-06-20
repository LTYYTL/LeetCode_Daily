package com.LSP.L0002;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LCS 02. 完成一半题目
 * 有 N 位扣友参加了微软与力扣举办了「以扣会友」线下活动。主办方提供了 2*N 道题目，整型数组 questions 中每个数字对应了每道题目所涉及的知识点类型。
 * 若每位扣友选择不同的一题，请返回被选的 N 道题目至少包含多少种知识点类型。
 *
 * 示例 1：
 * 输入：questions = [2,1,6,2]
 * 输出：1
 * 解释：有 2 位扣友在 4 道题目中选择 2 题。
 * 可选择完成知识点类型为 2 的题目时，此时仅一种知识点类型
 * 因此至少包含 1 种知识点类型。
 *
 * 示例 2：
 * 输入：questions = [1,5,1,3,4,5,2,5,3,3,8,6]
 * 输出：2
 * 解释：有 6 位扣友在 12 道题目中选择题目，需要选择 6 题。
 * 选择完成知识点类型为 3、5 的题目，因此至少包含 2 种知识点类型。
 *
 * 提示：
 * questions.length == 2*n
 * 2 <= questions.length <= 10^5
 * 1 <= questions[i] <= 1000
 */
public class CompleteHalfProblem {
    /**
     * 方法：map映射+排序
     * @param questions
     * @return
     */
    public int halfQuestions(int[] questions) {
        //结果集
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        //统计个数
        for (int question : questions) {
            map.put(question,map.getOrDefault(question,0)+1);
        }

        //将valuse值变成int[]
        Integer[] freqs = map.values().toArray(new Integer[map.size()]);

        //排序
        Arrays.sort(freqs);

        //一半的题目
        int left = questions.length/2;

        //想要覆盖最少的知识点，就选择出现最多的
        for (int i = freqs.length - 1; i >= 0; i--) {
            if (left > 0){
                left -= freqs[i];
                ans++;
            }
        }
        return ans;
    }
}
