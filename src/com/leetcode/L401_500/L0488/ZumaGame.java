package com.leetcode.L401_500.L0488;

/**
 * 488. 祖玛游戏
 * 你正在参与祖玛游戏的一个变种。
 * 在这个祖玛游戏变体中，桌面上有 一排 彩球，每个球的颜色可能是：红色 'R'、黄色 'Y'、蓝色 'B'、绿色 'G' 或白色 'W' 。你的手中也有一些彩球。
 * 你的目标是 清空 桌面上所有的球。每一回合：
 * 从你手上的彩球中选出 任意一颗 ，然后将其插入桌面上那一排球中：两球之间或这一排球的任一端。
 * 接着，如果有出现 三个或者三个以上 且 颜色相同 的球相连的话，就把它们移除掉。
 * 如果这种移除操作同样导致出现三个或者三个以上且颜色相同的球相连，则可以继续移除这些球，直到不再满足移除条件。
 * 如果桌面上所有球都被移除，则认为你赢得本场游戏。
 * 重复这个过程，直到你赢了游戏或者手中没有更多的球。
 * 给你一个字符串 board ，表示桌面上最开始的那排球。另给你一个字符串 hand ，表示手里的彩球。请你按上述操作步骤移除掉桌上所有球，计算并返回所需的 最少 球数。如果不能移除桌上所有的球，返回 -1 。
 *
 * 示例 1：
 * 输入：board = "WRRBBW", hand = "RB"
 * 输出：-1
 * 解释：无法移除桌面上的所有球。可以得到的最好局面是：
 * - 插入一个 'R' ，使桌面变为 WRRRBBW 。WRRRBBW -> WBBW
 * - 插入一个 'B' ，使桌面变为 WBBBW 。WBBBW -> WW
 * 桌面上还剩着球，没有其他球可以插入。
 *
 * 示例 2：
 * 输入：board = "WWRRBBWW", hand = "WRBRW"
 * 输出：2
 * 解释：要想清空桌面上的球，可以按下述步骤：
 * - 插入一个 'R' ，使桌面变为 WWRRRBBWW 。WWRRRBBWW -> WWBBWW
 * - 插入一个 'B' ，使桌面变为 WWBBBWW 。WWBBBWW -> WWWW -> empty
 * 只需从手中出 2 个球就可以清空桌面。
 *
 * 示例 3：
 * 输入：board = "G", hand = "GGGGG"
 * 输出：2
 * 解释：要想清空桌面上的球，可以按下述步骤：
 * - 插入一个 'G' ，使桌面变为 GG 。
 * - 插入一个 'G' ，使桌面变为 GGG 。GGG -> empty
 * 只需从手中出 2 个球就可以清空桌面。
 *
 * 示例 4：
 * 输入：board = "RBYYBBRRB", hand = "YRBGB"
 * 输出：3
 * 解释：要想清空桌面上的球，可以按下述步骤：
 * - 插入一个 'Y' ，使桌面变为 RBYYYBBRRB 。RBYYYBBRRB -> RBBBRRB -> RRRB -> B
 * - 插入一个 'B' ，使桌面变为 BB 。
 * - 插入一个 'B' ，使桌面变为 BBB 。BBB -> empty
 * 只需从手中出 3 个球就可以清空桌面。
 *
 * 提示：
 * 1 <= board.length <= 16
 * 1 <= hand.length <= 5
 * board 和 hand 由字符 'R'、'Y'、'B'、'G' 和 'W' 组成
 * 桌面上一开始的球中，不会有三个及三个以上颜色相同且连着的球
 */
public class ZumaGame {
    //结果
    private int res = Integer.MAX_VALUE;
    //记录颜色个数
    private final int[] map = new int[26];
    //颜色
    private final char[] colors = {'R', 'Y', 'B', 'G', 'W'};

    /**
     * 方法：回溯算法
     * @param board
     * @param hand
     * @return
     */
    public int findMinStep(String board, String hand) {
        //记录手中每个颜色的个数
        for (int i = 0; i < hand.length(); i++) {
            map[hand.charAt(i)-'A']++;
        }
        //深度优先搜索
        dfs(new StringBuilder(board),0);

        //如果为最大值说明没有结果直接返回-1
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    /**
     * 深度优先搜索
     * @param board
     * @param step
     */
    private void dfs(StringBuilder board, int step) {
        //当前步数比现存结果还大，肯定不满足
        if (step >= res){
            return;
        }
        //全部消除完
        if (board.length() == 0){
            //取最小值
            res = Math.min(res,step);
            return;
        }
        //遍历
        for (int i = 0; i < board.length(); i++) {
            //当前位置的颜色
            char c = board.charAt(i);
            //指针
            int j = i+1;
            //查看两个颜色是否相同，相同指针向后移
            while (j < board.length() && board.charAt(j) == c)
                j++;
            //当前颜色只有一个时，且手中有两个及以上的颜色时
            if (j == i+1 && map[c - 'A'] >= 2){
                //构建临时变量便于修改
                StringBuilder temp = new StringBuilder(board);
                //添加两个颜色
                temp.insert(i,c+""+c);
                //数量减少
                map[c-'A'] -= 2;
                //对消除后的字符串继续深度优先搜索，因为添加了两个颜色，步数+2
                dfs(remove(temp),step+2);
                //回退颜色
                map[c-'A'] += 2;
            }else if (j == i+2){//当前颜色有连续俩个时，且手中有一个及以上的颜色
                if (map[c-'A'] >= 1){
                    //构建临时变量便于修改
                    StringBuilder temp = new StringBuilder(board);
                    //添加一个颜色
                    temp.insert(i,c);
                    //数量减少
                    map[c-'A']--;
                    //对消除后的字符串继续深度优先搜索，因为添加了两个颜色，步数+1
                    dfs(remove(temp),step+1);
                    //回退颜色
                    map[c-'A']++;
                }
                //在相同颜色中间插入不同颜色球*
                for (char color : colors) {
                    if (c == color)
                        continue;
                    if (map[color-'A'] >= 1){
                        StringBuilder temp = new StringBuilder(board);
                        temp.insert(i+1,color);
                        map[color-'A']--;
                        dfs(remove(temp),step+1);
                        map[color-'A']++;
                    }
                }
            }
        }
    }

    /**
     * 进行消除
     * @param sb
     * @return
     */
    private StringBuilder remove(StringBuilder sb) {
        //可以消除
        boolean flag = true;
        while (flag){
            //改变标志位
            flag = false;
            //双指针寻找可以消除的地方
            for (int i = 0; i < sb.length(); i++) {
                int j = i+1;
                //寻找连续颜色
                while (j < sb.length() && sb.charAt(j) == sb.charAt(i))
                    j++;
                //长度大于等于3，可以删除
                if (j -i >= 3){
                    sb.delete(i,j);
                    //改变标志位，因为消除完后，新的字符串可能还可以消除
                    flag = true;
                }
            }
        }
        return sb;
    }
}
