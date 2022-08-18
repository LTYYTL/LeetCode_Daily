package com.interview.L1714;

import java.util.Arrays;
import java.util.PriorityQueue;


/**
 * 面试题 17.14. 最小K个数
 * 设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。
 *
 * 示例：
 * 输入： arr = [1,3,5,7,2,4,6,8], k = 4
 * 输出： [1,2,3,4]
 *
 * 提示：
 * 0 <= len(arr) <= 100000
 * 0 <= k <= min(100000, len(arr))
 */
public class SmallestK {
    /**
     * 方法：排序
     * @param arr
     * @param k
     * @return
     */
    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr[i];
        }
        return res;
    }

    /**
     * 方法：直接选择排序（超时）
     * @param arr
     * @param k
     * @return
     */
    public int[] smallestK_selection(int[] arr, int k){
        int[] res = new int[k];
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            swap(arr,i,min);
        }
        return Arrays.copyOf(arr,k);
    }

    /**
     * 方法：冒泡排序带标志位的(超时)
     * @param arr
     * @param k
     * @return
     */
    public int[] smallestK_bubble(int[] arr, int k){
        int N = arr.length;
        //进行N-1轮排序
        for (int i = 0; i < N-1; i++) {
            boolean flag = false;
            //尾部有N-i-1个排序完成
            for (int j = 0; j < N-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    flag = true;
                }
            }
            //没有交换证明有序了，直接退出
            if (!flag) break;
        }

        return Arrays.copyOf(arr,k);
    }

    /**
     * 方法：快速排序
     * @param arr
     * @param k
     * @return
     */
    public int[] smallestK_quick(int[] arr, int k){
        quickSort(arr,0,arr.length-1);
        return Arrays.copyOf(arr,k);
    }

    private void quickSort(int[] arr, int l, int r) {
        //子数组长度为1时，终止递归
        if (l >= r)
            return;
        // 哨兵划分操作（以 arr[l] 作为基准数）
        int i = l;
        int j = r;
        while (i < j){
            while (i < j && arr[j] >= arr[l]) j--;
            while (i < j && arr[i] <= arr[l]) i++;
            //交换i，j元素
            swap(arr,i,j);
        }
        //交换基准的位置
        swap(arr,i,l);
        // 递归左（右）子数组执行哨兵划分
        quickSort(arr,l,i-1);
        quickSort(arr,i+1,r);
    }

    /**
     * 方法：小根堆
     * @param arr
     * @param k
     * @return
     */
    public int[] smallestK_heap(int[] arr, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : arr) {
            queue.offer(i);
        }
        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = queue.poll();
        }
        return res;
    }

    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
