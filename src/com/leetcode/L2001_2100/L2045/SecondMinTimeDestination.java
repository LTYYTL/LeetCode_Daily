package com.leetcode.L2001_2100.L2045;

import java.util.*;

/**
 * 2045. 到达目的地的第二短时间
 * 城市用一个 双向连通 图表示，图中有 n 个节点，从 1 到 n 编号（包含 1 和 n）。图中的边用一个二维整数数组 edges 表示，其中每个 edges[i] = [ui, vi] 表示一条节点 ui 和节点 vi 之间的双向连通边。每组节点对由 最多一条 边连通，顶点不存在连接到自身的边。穿过任意一条边的时间是 time 分钟。
 * 每个节点都有一个交通信号灯，每 change 分钟改变一次，从绿色变成红色，再由红色变成绿色，循环往复。所有信号灯都 同时 改变。你可以在 任何时候 进入某个节点，但是 只能 在节点 信号灯是绿色时 才能离开。如果信号灯是  绿色 ，你 不能 在节点等待，必须离开。
 * 第二小的值 是 严格大于 最小值的所有值中最小的值。
 * 例如，[2, 3, 4] 中第二小的值是 3 ，而 [2, 2, 4] 中第二小的值是 4 。
 * 给你 n、edges、time 和 change ，返回从节点 1 到节点 n 需要的 第二短时间 。
 *
 * 注意：
 * 你可以 任意次 穿过任意顶点，包括 1 和 n 。
 * 你可以假设在 启程时 ，所有信号灯刚刚变成 绿色 。
 *
 * 示例 1：
 * 输入：n = 5, edges = [[1,2],[1,3],[1,4],[3,4],[4,5]], time = 3, change = 5
 * 输出：13
 * 解释：
 * 上面的左图展现了给出的城市交通图。
 * 右图中的蓝色路径是最短时间路径。
 * 花费的时间是：
 * - 从节点 1 开始，总花费时间=0
 * - 1 -> 4：3 分钟，总花费时间=3
 * - 4 -> 5：3 分钟，总花费时间=6
 * 因此需要的最小时间是 6 分钟。
 * 右图中的红色路径是第二短时间路径。
 * - 从节点 1 开始，总花费时间=0
 * - 1 -> 3：3 分钟，总花费时间=3
 * - 3 -> 4：3 分钟，总花费时间=6
 * - 在节点 4 等待 4 分钟，总花费时间=10
 * - 4 -> 5：3 分钟，总花费时间=13
 * 因此第二短时间是 13 分钟。
 *
 * 示例 2：
 * 输入：n = 2, edges = [[1,2]], time = 3, change = 2
 * 输出：11
 * 解释：
 * 最短时间路径是 1 -> 2 ，总花费时间 = 3 分钟
 * 最短时间路径是 1 -> 2 -> 1 -> 2 ，总花费时间 = 11 分钟
 *
 * 提示：
 * 2 <= n <= 104
 * n - 1 <= edges.length <= min(2 * 104, n * (n - 1) / 2)
 * edges[i].length == 2
 * 1 <= ui, vi <= n
 * ui != vi
 * 不含重复边
 * 每个节点都可以从其他节点直接或者间接到达
 */
public class SecondMinTimeDestination {
    /**
     * 方法：广度优先搜索
     * @param n
     * @param edges
     * @param time
     * @param change
     * @return
     */
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        //获得无向图
        List<Integer>[] grep = createGrep(n, edges);
        //dist1[i]:记录到i最短路径
        int[] dist1 = new int[n+1];
        //dist2[i]；记录到i的次最短路径
        int[] dist2 = new int[n+1];
        Arrays.fill(dist1,Integer.MAX_VALUE);
        Arrays.fill(dist2,Integer.MAX_VALUE);
        //队列
        Queue<int[]> queue = new LinkedList<>();
        //将第一个点加入队列
        queue.add(new int[]{1,0});
        //遍历
        while (dist2[n] == Integer.MAX_VALUE){
            //队首元素
            int[] cur = queue.poll();
            //点
            int curNode = cur[0];
            //步长
            int curStep = cur[1];
            //遍历下一个点
            for (Integer next : grep[curNode]) {
                //更新最短和次短的步长
                if (curStep + 1 < dist1[next]) {
                    dist1[next] = curStep + 1;
                    queue.add(new int[]{next, curStep + 1});
                }else if (curStep + 1 > dist1[next] && curStep + 1 < dist2[next]){
                    dist2[next] = curStep + 1;
                    queue.add(new int[]{next,curStep+1});
                }
            }
        }

        // 计算次最短路径的时间
        int result = 0;
        for (int i = 0; i < dist2[n]; i++) {
            // 需要加入等红绿灯的时间 由于红绿转换 所以循环是时间 2*change
            if (result % (2 * change) >= change) { //遇到红灯
                // 比如time等于3 change=5 这个时候result如果等于6 就需要等4分钟 （2*5）-6%10 = 10-6 = 4
                result = result + (2 * change - result % (2 * change));
            }
            // 加上路径的时间
            result = result + time;
        }
        return result;
    }

    /**
     * 构建无向图
     * @param n
     * @param edges
     * @return
     */
    private List<Integer>[] createGrep(int n,int[][] edges){
        List<Integer>[] grep = new List[n+1];
        for (int i = 0; i <= n; i++) {
            grep[i] = new ArrayList<Integer>();
        }

        for (int[] edge : edges) {
            int form = edge[0];
            int to = edge[1];
            grep[form].add(to);
            grep[to].add(form);
        }

        return grep;
    }
}
