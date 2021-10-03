package com.leetcode.L701_800.L0773;

import java.util.*;

/**
 * 773. 滑动谜题
 * 在一个 2 x 3 的板上（board）有 5 块砖瓦，用数字 1~5 来表示, 以及一块空缺用 0 来表示.
 * 一次移动定义为选择 0 与一个相邻的数字（上下左右）进行交换.
 * 最终当板 board 的结果是 [[1,2,3],[4,5,0]] 谜板被解开。
 * 给出一个谜板的初始状态，返回最少可以通过多少次移动解开谜板，如果不能解开谜板，则返回 -1 。
 *
 * 示例：
 * 输入：board = [[1,2,3],[4,0,5]]
 * 输出：1
 * 解释：交换 0 和 5 ，1 步完成
 *
 * 输入：board = [[1,2,3],[5,4,0]]
 * 输出：-1
 * 解释：没有办法完成谜板
 *
 * 输入：board = [[4,1,2],[5,0,3]]
 * 输出：5
 * 解释：
 * 最少完成谜板的最少移动次数是 5 ，
 * 一种移动路径:
 * 尚未移动: [[4,1,2],[5,0,3]]
 * 移动 1 次: [[4,1,2],[0,5,3]]
 * 移动 2 次: [[0,1,2],[4,5,3]]
 * 移动 3 次: [[1,0,2],[4,5,3]]
 * 移动 4 次: [[1,2,0],[4,5,3]]
 * 移动 5 次: [[1,2,3],[4,5,0]]
 * 输入：board = [[3,2,4],[1,5,0]]
 * 输出：14
 *
 * 提示：
 * board 是一个如上所述的 2 x 3 的数组.
 * board[i][j] 是一个 [0, 1, 2, 3, 4, 5] 的排列.
 */
public class SlidingPuzzle {
    int[][] neighbors = {{1, 3}, {0, 2, 4},{1, 5}, {0, 4}, {1, 3, 5}, {2, 4}};

    /**
     * f方法：广度优先搜索
     * @param board
     * @return
     */
    public int slidingPuzzle(int[][] board) {
        //将初始化的顺序存储
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                sb.append(board[i][j]);
            }
        }

        //判断初始化的顺序是否满足条件
        String initial = sb.toString();
        if ("123450".equals(initial)) {
            return 0;
        }

        //步数
        int step = 0;
        //广度优先的队列
        Queue<String> queue = new LinkedList<String>();
        //存储初值
        queue.offer(initial);

        //记录出现过的顺序
        Set<String> seen = new HashSet<String>();
        seen.add(initial);

        //遍历队列
        while (!queue.isEmpty()) {
            //增加步数
            ++step;
            //队列长度
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                //获取队头元素
                String status = queue.poll();
                //遍历所有交换位置后的可能
                for (String nextStatus : get(status)) {
                    //判断是否已经出现过
                    if (!seen.contains(nextStatus)) {
                        //是否是目标值
                        if ("123450".equals(nextStatus)) {
                            return step;
                        }
                        //加入队列
                        queue.offer(nextStatus);
                        //记录遍历过
                        seen.add(nextStatus);
                    }
                }
            }
        }

        return -1;
    }

    // 枚举 status 通过一次交换操作得到的状态
    public List<String> get(String status) {
        List<String> ret = new ArrayList<String>();
        char[] array = status.toCharArray();
        //记录0的位置
        int x = status.indexOf('0');
        //对0进行移动
        for (int y : neighbors[x]) {
            //交换元素位置
            swap(array, x, y);
            //存储
            ret.add(new String(array));
            //复原
            swap(array, x, y);
        }
        return ret;
    }

    //交换元素
    public void swap(char[] array, int x, int y) {
        char temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
