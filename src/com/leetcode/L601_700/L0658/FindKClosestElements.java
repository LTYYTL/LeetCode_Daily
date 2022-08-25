package com.leetcode.L601_700.L0658;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 658. 找到 K 个最接近的元素
 * 给定一个 排序好 的数组 arr ，两个整数 k 和 x ，从数组中找到最靠近 x（两数之差最小）的 k 个数。返回的结果必须要是按升序排好的。
 * 整数 a 比整数 b 更接近 x 需要满足：
 * (1)|a - x| < |b - x| 或者
 * (2)|a - x| == |b - x| 且 a < b
 * <p>
 * 示例 1：
 * 输入：arr = [1,2,3,4,5], k = 4, x = 3
 * 输出：[1,2,3,4]
 * <p>
 * 示例 2：
 * 输入：arr = [1,2,3,4,5], k = 4, x = -1
 * 输出：[1,2,3,4]
 * <p>
 * 提示：
 * 1 <= k <= arr.length
 * 1 <= arr.length <= 104
 * arr 按 升序 排列
 * -104 <= arr[i], x <= 104
 */
public class FindKClosestElements {
    /**
     * 方法：堆
     */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // 加入集合
        List<Integer> res = new ArrayList<>();
        for (int i : arr) {
            res.add(i);
        }

        // 排序
        res.sort(((o1, o2) -> {
            int a = Math.abs(o1 - x);
            int b = Math.abs(o2 - x);
            if (a != b) {
                return a - b;
            } else {
                return o1 - o2;
            }
        }));
        // 截取长度
        res = res.subList(0, k);
        //排序
        Collections.sort(res);

        return res;
    }
}
