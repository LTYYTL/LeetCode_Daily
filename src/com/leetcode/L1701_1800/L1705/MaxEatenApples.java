package com.leetcode.L1701_1800.L1705;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 1705. 吃苹果的最大数目
 * 有一棵特殊的苹果树，一连 n 天，每天都可以长出若干个苹果。
 * 在第 i 天，树上会长出 apples[i] 个苹果，这些苹果将会在 days[i] 天后（也就是说，第 i + days[i] 天时）腐烂，变得无法食用。
 * 也可能有那么几天，树上不会长出新的苹果，此时用 apples[i] == 0 且 days[i] == 0 表示。
 * 你打算每天 最多 吃一个苹果来保证营养均衡。注意，你可以在这 n 天之后继续吃苹果。
 * 给你两个长度为 n 的整数数组 days 和 apples ，返回你可以吃掉的苹果的最大数目。
 *
 * 示例 1：
 * 输入：apples = [1,2,3,5,2], days = [3,2,1,4,2]
 * 输出：7
 * 解释：你可以吃掉 7 个苹果：
 * - 第一天，你吃掉第一天长出来的苹果。
 * - 第二天，你吃掉一个第二天长出来的苹果。
 * - 第三天，你吃掉一个第二天长出来的苹果。过了这一天，第三天长出来的苹果就已经腐烂了。
 * - 第四天到第七天，你吃的都是第四天长出来的苹果。
 *
 * 示例 2：
 * 输入：apples = [3,0,0,0,0,2], days = [3,0,0,0,0,2]
 * 输出：5
 * 解释：你可以吃掉 5 个苹果：
 * - 第一天到第三天，你吃的都是第一天长出来的苹果。
 * - 第四天和第五天不吃苹果。
 * - 第六天和第七天，你吃的都是第六天长出来的苹果。
 *
 * 提示：
 * apples.length == n
 * days.length == n
 * 1 <= n <= 2 * 104
 * 0 <= apples[i], days[i] <= 2 * 104
 * 只有在 apples[i] = 0 时，days[i] = 0 才成立
 */
public class MaxEatenApples {
    /**
     * 方法：堆
     * @param apples
     * @param days
     * @return
     */
    public int eatenApples(int[] apples, int[] days) {
        //存储苹果{腐烂时间，数量}，按腐烂时间排序
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        //长度
        int n = apples.length;
        //结果
        int res = 0;
        //时间
        int time = 0;
        //遍历，有苹果生长
        while (time < n){
            //堆顶苹果已经腐烂，出堆
            while (!queue.isEmpty() && queue.peek()[0] <= time)
                queue.poll();
            //当前时间有苹果生长
            if (apples[time] > 0)
                //加入堆中{腐烂时间，数量}
                queue.offer(new int[]{time + days[time],apples[time]});
            //队列不为空
            if (!queue.isEmpty()){
                //堆顶
                int[] cur = queue.peek();
                //当前的苹果已经吃完，出堆
                if (--cur[1] == 0)
                    queue.poll();
                //结果+1
                res++;
            }
            //时间+1
            time++;
        }
        //没有苹果生长，但是还有苹果
        while (!queue.isEmpty()){
            //堆顶元素
            int[] cur = queue.poll();
            //获取数量和腐烂时间小的那个，数量小，即都吃完也没腐烂，腐烂时间小，即腐烂之前能吃多少吃多少
            int diff = Math.min(cur[0] - time,cur[1]);
            //时间向后推移
            time += diff;
            //每天最多一个，时间推后多少，就吃了几个苹果
            res += diff;
            //堆顶苹果已经腐烂，出堆
            while (!queue.isEmpty() && queue.peek()[0] <= time)
                queue.poll();
        }

        return res;
    }
}
