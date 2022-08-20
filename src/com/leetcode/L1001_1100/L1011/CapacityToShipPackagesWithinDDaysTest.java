package com.leetcode.L1001_1100.L1011;

public class CapacityToShipPackagesWithinDDaysTest {
    public static void main(String[] args) {
        CapacityToShipPackagesWithinDDays capacityToShipPackagesWithinDDays = new CapacityToShipPackagesWithinDDays();
        /* 示例 1：
         输入：weights = [1,2,3,4,5,6,7,8,9,10], D = 5
         输出：15
         解释：
         船舶最低载重 15 就能够在 5 天内送达所有包裹，如下所示：
         第 1 天：1, 2, 3, 4, 5
         第 2 天：6, 7
         第 3 天：8
         第 4 天：9
         第 5 天：10
         请注意，货物必须按照给定的顺序装运，因此使用载重能力为 14 的船舶并将包装分成 (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) 是不允许的。
         */
        System.out.println(capacityToShipPackagesWithinDDays.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
        /*
          示例 2：
          输入：weights = [3,2,2,4,1,4], D = 3
          输出：6
          解释：
          船舶最低载重 6 就能够在 3 天内送达所有包裹，如下所示：
          第 1 天：3, 2
          第 2 天：2, 4
          第 3 天：1, 4
         */
        System.out.println(capacityToShipPackagesWithinDDays.shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 5));
        /*
          示例 3：
          输入：weights = [1,2,3,1,1], D = 4
          输出：3
          解释：
          第 1 天：1
          第 2 天：2
          第 3 天：3
          第 4 天：1, 1
         */
        System.out.println(capacityToShipPackagesWithinDDays.shipWithinDays(new int[]{1, 2, 3, 1, 1}, 5));
    }
}
