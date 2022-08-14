package com.leetcode.L1201_1300.L1282;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1282. 用户分组
 * 有 n 个人被分成数量未知的组。每个人都被标记为一个从 0 到 n - 1 的唯一ID 。
 * 给定一个整数数组 groupSizes ，其中 groupSizes[i] 是第 i 个人所在的组的大小。例如，如果 groupSizes[1] = 3 ，则第 1 个人必须位于大小为 3 的组中。
 * 返回一个组列表，使每个人 i 都在一个大小为 groupSizes[i] 的组中。
 * 每个人应该 恰好只 出现在 一个组 中，并且每个人必须在一个组中。如果有多个答案，返回其中 任何 一个。可以 保证 给定输入 至少有一个 有效的解。
 * <p>
 * 示例 1：
 * 输入：groupSizes = [3,3,3,3,3,1,3]
 * 输出：[[5],[0,1,2],[3,4,6]]
 * 解释：
 * 第一组是 [5]，大小为 1，groupSizes[5] = 1。
 * 第二组是 [0,1,2]，大小为 3，groupSizes[0] = groupSizes[1] = groupSizes[2] = 3。
 * 第三组是 [3,4,6]，大小为 3，groupSizes[3] = groupSizes[4] = groupSizes[6] = 3。
 * 其他可能的解决方案有 [[2,1,6],[5],[0,4,3]] 和 [[5],[0,6,2],[4,3,1]]。
 * <p>
 * 示例 2：
 * 输入：groupSizes = [2,1,3,3,3,2]
 * 输出：[[1],[0,5],[2,3,4]]
 * <p>
 * 提示：
 * groupSizes.length == n
 * 1 <= n <= 500
 * 1 <= groupSizes[i] <= n
 */
public class GroupPeople {
    /**
     * 方法：map映射
     *
     * @param groupSizes
     * @return
     */
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        //存储组大小
        Map<Integer, List<Integer>> map = new HashMap<>();
        //结果
        List<List<Integer>> res = new ArrayList<>();
        //遍历
        for (int i = 0; i < groupSizes.length; i++) {
            //当前id对应的组的大小
            int size = groupSizes[i];
            //获取同样组大小的id集合
            List<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<>());
            //加入
            list.add(i);
            //如果加入当前id后集合已经满足条件
            if (list.size() == size) {
                //加入结果
                res.add(new ArrayList<>(list));
                //集合清空
                list.clear();
            }
            //放到对应大小位置
            map.put(groupSizes[i], list);
        }
        return res;
    }
}
