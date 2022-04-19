package com.leetcode.L301_400.L0386;

import java.util.ArrayList;
import java.util.List;

/**
 * 386. 字典序排数
 * 给你一个整数 n ，按字典序返回范围 [1, n] 内所有整数。
 * 你必须设计一个时间复杂度为 O(n) 且使用 O(1) 额外空间的算法。
 *
 * 示例 1
 * 输入：n = 13
 * 输出：[1,10,11,12,13,2,3,4,5,6,7,8,9]
 *
 * 示例 2：
 * 输入：n = 2
 * 输出：[1,2]
 *
 * 提示：
 * 1 <= n <= 5 * 104
 */
public class LexicographicalNumbers {
    /**
     * 方法：深度优先搜索
     * @param n
     * @return
     */
    public List<Integer> lexicalOrder(int n) {
        //结果集
        List<Integer> ret = new ArrayList<Integer>();
        //初始值
        int number = 1;
        //遍历
        for (int i = 0; i < n; i++) {
            //加入结果集
            ret.add(number);
            //扩到10倍不超过
            if (number * 10 <= n) {
                number *= 10;
            } else {
                //number % 10 == 9表示这一层已经遍历完成
                //number + 1 > n超过范围
                while (number % 10 == 9 || number + 1 > n) {
                    number /= 10;
                }
                //进入下一个数
                number++;
            }
        }
        return ret;
    }
}

