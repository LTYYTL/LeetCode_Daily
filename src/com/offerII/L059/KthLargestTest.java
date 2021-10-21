package com.offerII.L059;

public class KthLargestTest {
    public static void main(String[] args) {
        /**
         * 示例：
         * 输入：
         * ["KthLargest", "add", "add", "add", "add", "add"]
         * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
         * 输出：
         * [null, 4, 5, 5, 8, 8]
         * 解释：
         * KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
         * kthLargest.add(3);   // return 4
         * kthLargest.add(5);   // return 5
         * kthLargest.add(10);  // return 5
         * kthLargest.add(9);   // return 8
         * kthLargest.add(4);   // return 8
         */
        KthLargest kthLargest = new KthLargest(3,new int[]{4,5,8,2});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));

    }
}
