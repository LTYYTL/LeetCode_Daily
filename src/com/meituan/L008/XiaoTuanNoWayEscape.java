package com.meituan.L008;

import java.io.*;
import java.util.*;

/**
 * meituan-008. 小团无路可逃
 * 小团惹小美生气了，小美要去找小团“讲道理”。小团望风而逃，他们住的地方可以抽象成一棵有n个结点的树，小美位于 x 位置，小团位于 y 位置。
 * 小团和小美每个单位时间内都可以选择不动或者向相邻的位置转移，很显然最终小团会无路可逃，只能延缓一下被“讲道理”的时间，请问最多经过多少个单位时间后，小团会被追上。
 *
 * 格式：
 * 输入：
 * - 输入第一行包含三个整数 n，x，y，分别表示树上的结点数量，小美所在的位置和小团所在的位置。
 * - 接下来有 n-1 行，每行两个整数 u，v，表示 u 号位置和 v 号位置之间有一条边，即 u 号位置和 v 号位置彼此相邻。
 * 输出：
 * - 输出仅包含一个整数，表示小美追上小团所需的时间。
 *
 * 示例：
 * 输入：
 *      5 1 2
 *      2 1
 *      3 1
 *      4 2
 *      5 3
 * 输出：2
 *
 * 提示：
 * 1 <= n <= 50000
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class XiaoTuanNoWayEscape {
    public static void main(String[] args) throws IOException {
        //输入输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] distance = reader.readLine().split(" ");
        //节点数
        int n = Integer.parseInt(distance[0]);
        //小美位置
        int x = Integer.parseInt(distance[1]);
        //小团位置
        int y = Integer.parseInt(distance[2]);

        //记录点之间的连接
        List<List<Integer>> e = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            e.add(new ArrayList<>());
        }

        for (int i = 0; i < n-1; i++) {
            String[] data = reader.readLine().split(" ");
            int e1 = Integer.parseInt(data[0]);
            int e2 = Integer.parseInt(data[1]);
            //双向相连
            e.get(e1).add(e2);
            e.get(e2).add(e1);
        }
        //存储到达key的距离：key：点，value：距离
        Map<Integer, Integer> distanceX = new HashMap<>();
        Map<Integer, Integer> distanceY = new HashMap<>();
        //广度优先搜索，获取到每个点的距离
        bfs(e, new boolean[n + 1], distanceX, x);
        bfs(e, new boolean[n + 1], distanceY, y);

        int max = 0;
        for (Map.Entry<Integer, Integer> entry : distanceX.entrySet()) {
            //点
            int node = entry.getKey();
            //距离
            int disX = entry.getValue();
            //小团到这个点的距离
            int distY = distanceY.get(node);
            if (disX > distY){
                max = Math.max(max,disX);
            }
        }
        writer.write(""+max);

        //关闭输入输出流
        reader.close();
        writer.close();
    }

    /**
     * 广度优先搜索
     * @param e
     * @param vis
     * @param map
     * @param pos
     */
    private static void bfs(List<List<Integer>> e, boolean[] vis, Map<Integer, Integer> map, int pos) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(pos);
        int dis = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                map.put(cur,dis);
                vis[cur] = true;
                for (Integer child : e.get(cur)) {
                    if (!vis[child])
                        queue.add(child);
                }
            }
            dis++;
        }
    }
}
