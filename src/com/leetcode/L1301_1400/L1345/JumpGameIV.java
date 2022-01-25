package com.leetcode.L1301_1400.L1345;

import java.util.*;

/**
 * 1345. 跳跃游戏 IV
 * 给你一个整数数组 arr ，你一开始在数组的第一个元素处（下标为 0）。
 * 每一步，你可以从下标 i 跳到下标：
 * （1）i + 1 满足：i + 1 < arr.length
 * （2）i - 1 满足：i - 1 >= 0
 * （3）j 满足：arr[i] == arr[j] 且 i != j
 * 请你返回到达数组最后一个元素的下标处所需的 最少操作次数 。
 * 注意：任何时候你都不能跳到数组外面。
 *
 * 示例 1：
 * 输入：arr = [100,-23,-23,404,100,23,23,23,3,404]
 * 输出：3
 * 解释：那你需要跳跃 3 次，下标依次为 0 --> 4 --> 3 --> 9 。下标 9 为数组的最后一个元素的下标。
 *
 * 示例 2：
 * 输入：arr = [7]
 * 输出：0
 * 解释：一开始就在最后一个元素处，所以你不需要跳跃。
 *
 * 示例 3：
 * 输入：arr = [7,6,9,6,9,6,9,7]
 * 输出：1
 * 解释：你可以直接从下标 0 处跳到下标 7 处，也就是数组的最后一个元素处。
 *
 * 示例 4：
 * 输入：arr = [6,1,9]
 * 输出：2
 *
 * 示例 5：
 * 输入：arr = [11,22,7,7,7,7,7,7,7,22,13]
 * 输出：3
 *
 * 提示：
 * 1 <= arr.length <= 5 * 10^4
 * -10^8 <= arr[i] <= 10^8
 */
public class JumpGameIV {
    /**
     * 方法：广度优先搜索
     * @param arr
     * @return
     */
    public int minJumps(int[] arr) {
        //一个的情况
        if (arr.length == 1)
            return 0;
        //两个的情况
        if (arr.length == 2)
            return 1;
        //构建无向图
        Map<Integer, List<Integer>> map =createMap(arr);
        //dis[i]：到i的最短距离
        int[] dis = new int[arr.length];
        Arrays.fill(dis,Integer.MAX_VALUE);
        //队列
        Queue<Integer> queue = new LinkedList<>();
        //加入队列，{索引，步长}
        queue.add(0);
        //访问
        boolean[] vis = new boolean[arr.length];
        vis[0] = true;
        int step = 0;
        //遍历
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                //队首元素
                int cur = queue.poll();
                if (cur == arr.length - 1)
                    return step;
                //向前跳情况
                if (cur + 1 < arr.length && !vis[cur+1]){
                    vis[cur+1] = true;
                    queue.add(cur+1);
                }
                //向后跳情况
                if (cur - 1 >= 0 && !vis[cur-1]){
                    vis[cur-1] = true;
                    queue.add(cur-1);
                }
                // 把它相边的直接入队
                if (map.containsKey(arr[cur])) {
                    for (int next : map.get(arr[cur])) {
                        if (next != cur && !vis[next]) {
                            queue.offer(next);
                            vis[next] = true;
                        }
                        // 剪枝：这个元素相连的都处理过了，后面再遍历到再处理肯定都已经访问过了，不如直接移除，可以减少遍历的次数
                        map.remove(arr[cur]);
                    }
                }
            }
           step++;

        }
        return -1;
    }

    /**
     * 方法：构建无向图
     * @param arr
     * @return
     */
    private Map<Integer, List<Integer>> createMap(int[] arr) {
        //key为值，value为值相同的索引
        Map<Integer,List<Integer>> map = new HashMap<>();
        //遍历
        for (int i = 0; i < arr.length; i++) {
            //获取当前索引对应值
            int cur = arr[i];
            //获取对应的索引集合
            List<Integer> list = map.getOrDefault(cur, new ArrayList<>());
            //加入集合
            list.add(i);
            map.put(cur,list);
        }
        return map;
    }

}
