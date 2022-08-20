package com.leetcode.L901_1000.L0954;

import java.util.Map;
import java.util.TreeMap;

/**
 * 954. 二倍数对数组
 * 给定一个长度为偶数的整数数组 arr，
 * 只有对 arr 进行重组后可以满足 “对于每个 0 <= i < len(arr) / 2，都有 arr[2 * i + 1] = 2 * arr[2 * i]” 时，返回 true；否则，返回 false。
 *
 * 示例 1：
 * 输入：arr = [3,1,3,6]
 * 输出：false
 *
 * 示例 2：
 * 输入：arr = [2,1,2,6]
 * 输出：false
 *
 * 示例 3：
 * 输入：arr = [4,-2,2,-4]
 * 输出：true
 * 解释：可以用 [-2,-4] 和 [2,4] 这两组组成 [-2,-4,2,4] 或是 [2,4,-2,-4]
 *
 * 提示：
 * 0 <= arr.length <= 3 * 104
 * arr.length 是偶数
 * -105 <= arr[i] <= 105
 */
public class ArrayDoubledPairs {
    /**
     * 方法：map映射
     */
    public boolean canReorderDoubled(int[] arr) {
        //存储每个数字出现的次数，按照绝对值大小排序，绝对值一样，按数大小排序
        TreeMap<Integer, Integer> map = new TreeMap<>((o1, o2) -> {
            int a = Math.abs(o1);
            int b = Math.abs(o2);
            if (a == b)
                return o1 - o2;
            return a - b;
        });

        //加入map
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        //遍历
        while (!map.isEmpty()) {
            //获取开始元素
            Map.Entry<Integer, Integer> entry = map.firstEntry();
            //获取key
            int key = entry.getKey();
            //判断2倍是否存在并且能完全用掉
            if (!map.containsKey(key * 2) || entry.getValue() > map.get(key * 2))
                return false;
            //剩余元素
            int diff = map.get(key*2) - entry.getValue();
            //移除使用过的元素
            map.remove(key);
            map.put(key*2,diff);
            //移除没有的元素
            if (map.get(key*2) == 0)
                map.remove(key*2);
        }

        return true;
    }
}
