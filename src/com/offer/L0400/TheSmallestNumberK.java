package com.offer.L0400;

import java.util.Arrays;

/**
 * 剑指 Offer 40. 最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 * 示例 1：
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 *
 * 示例 2：
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *
 * 限制：
 * 0 <= k <= arr.length <= 10000
 * 0 <= arr[i] <= 10000
 */
public class TheSmallestNumberK {
    /**
     * 方法：快速排序
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr,0,arr.length-1);
        return Arrays.copyOf(arr,k);
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int i = left;
        int j = right;
        while (i < j){
            while (i < j && arr[j] >= arr[left]) j--;
            while (i < j && arr[i] <= arr[left]) i++;
            swap(arr,i,j);
        }
        swap(arr,i,left);

        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }

    /**
     * 交换元素
     * @param arr
     * @param i
     * @param j
     */
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
