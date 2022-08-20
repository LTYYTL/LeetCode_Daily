package com.LCP.L0039;

public class UAVPhalanxTest {
    public static void main(String[] args) {
        UAVPhalanx phalanx = new UAVPhalanx();
        /*
          示例 1：
          输入：source = [[1,3],[5,4]], target = [[3,1],[6,5]]
          输出：1
          解释：
          最佳方案为
          将 [0,1] 处的无人机移动至 [0,0] 处；
          将 [0,0] 处的无人机移动至 [0,1] 处；
          将 [1,0] 处的无人机移动至 [1,1] 处；
          将 [1,1] 处的无人机移动至 [1,0] 处，其灯光颜色切换为颜色编号为 6 的灯光；
          因此从source 到 target 所需要的最少灯光切换次数为 1。
         */
        System.out.println(phalanx.minimumSwitchingTimes(new int[][]{{1, 3}, {5, 4}}, new int[][]{{3, 1}, {6, 5}}));
        /*
          示例 2：
          输入：source = [[1,2,3],[3,4,5]], target = [[1,3,5],[2,3,4]]
          输出：0
          解释：
          仅需调整无人机的位置布局，便可完成图案切换。因此不需要无人机切换颜色
         */
        System.out.println(phalanx.minimumSwitchingTimes(new int[][]{{1, 2, 3}, {3, 4, 5}}, new int[][]{{1, 3, 5}, {2, 3, 4}}));
    }
}
