package com.leetcode.L701_800.L0768;

public class MaxChunksSortedIITest {
    public static void main(String[] args) {
        MaxChunksSortedII maxChunksSortedII = new MaxChunksSortedII();
        /**
         * 示例 1:
         * 输入: arr = [5,4,3,2,1]
         * 输出: 1
         * 解释:
         * 将数组分成2块或者更多块，都无法得到所需的结果。
         * 例如，分成 [5, 4], [3, 2, 1] 的结果是 [4, 5, 1, 2, 3]，这不是有序的数组。
         */
        System.out.println(maxChunksSortedII.maxChunksToSorted(new int[]{5, 4, 3, 2, 1}));
        /**
         * 示例 2:
         * 输入: arr = [2,1,3,4,4]
         * 输出: 4
         * 解释:
         * 我们可以把它分成两块，例如 [2, 1], [3, 4, 4]。
         * 然而，分成 [2, 1], [3], [4], [4] 可以得到最多的块数。
         */
        System.out.println(maxChunksSortedII.maxChunksToSorted(new int[]{2, 1, 3, 4, 4}));
    }
}
