package com.leetcode.L1101_1200.L1128;

/**
 * 1128. 等价多米诺骨牌对的数量
 * 给你一个由一些多米诺骨牌组成的列表 dominoes。
 * 如果其中某一张多米诺骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。
 * 形式上，dominoes[i] = [a, b] 和 dominoes[j] = [c, d] 等价的前提是 a==c 且 b==d，或是 a==d 且 b==c。
 * 在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i, j) 的数量。
 *
 * 示例：
 * 输入：dominoes = [[1,2],[2,1],[3,4],[5,6]]
 * 输出：1
 *
 * 提示：
 * 1 <= dominoes.length <= 40000
 * 1 <= dominoes[i][j] <= 9
 */
public class NumberEquivalentDominoPairs {
    /**
     * 方法：数学
     * 思路：元对中的元素均不大于 99，因此我们可以将每一个二元对拼接成一个两位的正整数，即(x,y)→10x+y。
     * 这样就无需使用哈希表统计元素数量，而直接使用长度为 100100 的数组即可。
     * @param dominoes
     * @return
     */
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] nums = new int[100];
        int res = 0;
        for (int[] dominoe : dominoes){
            //判断大小，将小的放在前面
            int val = dominoe[0] < dominoe[1] ? dominoe[0] * 10 + dominoe[1] :dominoe[1] * 10 + dominoe[0];
            res += nums[val];
            nums[val]++;
        }
        return res;
    }
}
