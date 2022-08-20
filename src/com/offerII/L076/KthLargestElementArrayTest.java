package com.offerII.L076;

public class KthLargestElementArrayTest {
    public static void main(String[] args) {
        KthLargestElementArray kthLargestElementArray = new KthLargestElementArray();
        /*
          示例 1:
          输入: [3,2,1,5,6,4] 和 k = 2
          输出: 5
         */
        System.out.println(kthLargestElementArray.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(kthLargestElementArray.findKthLargest_heap(new int[]{3, 2, 1, 5, 6, 4}, 2));
        System.out.println(kthLargestElementArray.findKthLargest_quickSort(new int[]{3, 2, 1, 5, 6, 4}, 2));
        /*
          示例 2:
          输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
          输出: 4
         */
        System.out.println(kthLargestElementArray.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        System.out.println(kthLargestElementArray.findKthLargest_heap(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        System.out.println(kthLargestElementArray.findKthLargest_quickSort(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
