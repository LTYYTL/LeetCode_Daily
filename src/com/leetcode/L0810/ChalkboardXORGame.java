package com.leetcode.L0810;

/**
 * 810. 黑板异或游戏
 * 黑板上写着一个非负整数数组 nums[i] 。Alice 和 Bob 轮流从黑板上擦掉一个数字，Alice 先手。
 * 如果擦除一个数字后，剩余的所有数字按位异或运算得出的结果等于 0 的话，当前玩家游戏失败。
 * (另外，如果只剩一个数字，按位异或运算得到它本身；如果无数字剩余，按位异或运算结果为 0。）
 * 并且，轮到某个玩家时，如果当前黑板上所有数字按位异或运算结果等于 0，这个玩家获胜。
 * 假设两个玩家每步都使用最优解，当且仅当 Alice 获胜时返回 true。
 *
 * 示例：
 * 输入: nums = [1, 1, 2]
 * 输出: false
 * 解释:
 * Alice 有两个选择: 擦掉数字 1 或 2。
 * 如果擦掉 1, 数组变成 [1, 2]。剩余数字按位异或得到 1 XOR 2 = 3。那么 Bob 可以擦掉任意数字，因为 Alice 会成为擦掉最后一个数字的人，她总是会输。
 * 如果 Alice 擦掉 2，那么数组变成[1, 1]。剩余数字按位异或得到 1 XOR 1 = 0。Alice 仍然会输掉游戏。
 *
 * 提示：
 * 1 <= N <= 1000
 * 0 <= nums[i] <= 2^16
 */
public class ChalkboardXORGame {
    /**
     * 方法：数学
     * 解题思路：
     * 1、假设此时偶数数组所有数的异或值为0，那么Alice就直接获胜。(规则2)
     * 2、如果此时偶数数组所有数的异或值不为0。得到结论：至少有 2 个以上的数使其数组的异或值不为0(记作aa, bb)。Alice会选这两个数中的一个，假设他选了aa。此时Bob有两种方式：
     *  （1）选剩下的bb, 那么此时数组长度又回到了偶数。情况一：此时数组异或值为0，那么Alice获胜。情况二：数组异或值不为0，那么又回到了步骤2，这一步可以一直到数组的数被选完，然后轮到Alice选，空数组Alice获胜(规则三)。
     *  （2）如果bob不选bb，那么轮到Alice选时，他也跳过b，因为 bb 有可能是此时唯一的数选完后数组的异或值为0。详细看图。
     * 3、我们知道偶数先选方是一定获胜的！那么对于Bob也是同理，如果Alice是奇数方，然后选去一个数字后数组变为偶数，那么Bob此时一定会获胜。那么此时Alice只有一种情况会赢，那就是在他第一次选的时候，黑板上所有数的异或值就已经为0了(规则二)。
     *
     * 作者：Xiaohu9527
     * 链接：https://leetcode-cn.com/problems/chalkboard-xor-game/solution/jian-dan-de-bang-ni-li-jie-zhe-dao-ti-by-kaxa/
     * @param nums
     * @return
     */
    public boolean xorGame(int[] nums) {
        int n = nums.length;
        int x = 0;
        if (n%2==0)
            return true;
        for (int num : nums) {
            x ^= num;
        }
        return x == 0;
    }
}
