package com.leetcode.L1901_2000.L1996;

import java.util.Arrays;

/**
 * 1996. 游戏中弱角色的数量
 * 你正在参加一个多角色游戏，每个角色都有两个主要属性：攻击 和 防御 。
 * 给你一个二维整数数组 properties ，其中 properties[i] = [attacki, defensei] 表示游戏中第 i 个角色的属性。
 * 如果存在一个其他角色的攻击和防御等级 都严格高于 该角色的攻击和防御等级，则认为该角色为 弱角色 。
 * 更正式地，如果认为角色 i 弱于 存在的另一个角色 j ，那么 attackj > attacki 且 defensej > defensei 。
 * 返回 弱角色 的数量。
 *
 * 示例 1：
 * 输入：properties = [[5,5],[6,3],[3,6]]
 * 输出：0
 * 解释：不存在攻击和防御都严格高于其他角色的角色。
 *
 * 示例 2：
 * 输入：properties = [[2,2],[3,3]]
 * 输出：1
 * 解释：第一个角色是弱角色，因为第二个角色的攻击和防御严格大于该角色。
 *
 * 示例 3：
 * 输入：properties = [[1,5],[10,4],[4,3]]
 * 输出：1
 * 解释：第三个角色是弱角色，因为第二个角色的攻击和防御严格大于该角色。
 *
 * 提示：
 * 2 <= properties.length <= 105
 * properties[i].length == 2
 * 1 <= attacki, defensei <= 105
 */
public class NumWeakCharacters {
    /**
     * 方法：排序
     * @param properties
     * @return
     */
    public int numberOfWeakCharacters(int[][] properties) {
        //按照攻击力从小到大排序，防御力按从大到小排序（可以避免攻击力相同，防御力不同的情况）
        Arrays.sort(properties, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        //个数
        int res = 0;
        //最大防御力
        int max = 0;
        //倒序，因为防御力是减小的，所以只用可考虑防御力就可以
        for (int i = properties.length - 1; i >= 0; i--) {
            //当前防御力小于最大防御力，证明存在弱角色
            if (properties[i][1] < max)
                res++;
            else//记录最大防御力
                max = properties[i][1];
        }
        return res;
    }
}
