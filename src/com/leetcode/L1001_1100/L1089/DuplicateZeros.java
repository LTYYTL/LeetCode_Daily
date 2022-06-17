package com.leetcode.L1001_1100.L1089;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1089. 复写零
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 * 注意：请不要在超过该数组长度的位置写入元素。
 * <p>
 * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。
 * <p>
 * 示例 1：
 * 输入：[1,0,2,3,0,4,5,0]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 * <p>
 * 示例 2：
 * 输入：[1,2,3]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,2,3]
 * <p>
 * 提示：
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {
    /**
     * 方法：栈
     *
     * @param arr
     */
    public void duplicateZeros(int[] arr) {
        //栈
        Deque<Integer> queue = new ArrayDeque<>();
        int i = 0;
        while (queue.size() < arr.length) {
            //是0则多添加一个0
            if (arr[i] == 0) {
                queue.offerLast(arr[i]);
            }
            queue.offerLast(arr[i]);
            i++;
        }
        //有可能最后也是一个0，会多一个元素
        if (queue.size() > arr.length) {
            queue.pollLast();
        }
        //倒序放回原来数组
        for (int j = arr.length - 1; j >= 0; j--) {
            arr[j] = queue.pollLast();
        }
    }
}
