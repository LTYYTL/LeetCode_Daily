package com.leetcode.L1201_1300.L1282;

public class GroupPeopleTest {
    public static void main(String[] args) {
        GroupPeople groupPeople = new GroupPeople();
        /**
         * 示例 1：
         * 输入：groupSizes = [3,3,3,3,3,1,3]
         * 输出：[[5],[0,1,2],[3,4,6]]
         * 解释：
         * 第一组是 [5]，大小为 1，groupSizes[5] = 1。
         * 第二组是 [0,1,2]，大小为 3，groupSizes[0] = groupSizes[1] = groupSizes[2] = 3。
         * 第三组是 [3,4,6]，大小为 3，groupSizes[3] = groupSizes[4] = groupSizes[6] = 3。
         * 其他可能的解决方案有 [[2,1,6],[5],[0,4,3]] 和 [[5],[0,6,2],[4,3,1]]。
         */
        System.out.println(groupPeople.groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3}));
        /**
         * 示例 2：
         * 输入：groupSizes = [2,1,3,3,3,2]
         * 输出：[[1],[0,5],[2,3,4]]
         */
        System.out.println(groupPeople.groupThePeople(new int[]{2, 1, 3, 3, 3, 2}));
    }
}
