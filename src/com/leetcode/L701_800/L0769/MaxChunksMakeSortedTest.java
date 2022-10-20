package com.leetcode.L701_800.L0769;

public class MaxChunksMakeSortedTest {
    public static void main(String[] args) {
        MaxChunksMakeSorted maxChunksMakeSorted = new MaxChunksMakeSorted();
        /*
          示例 1:
          输入: arr = [4,3,2,1,0]
          输出: 1
          解释:
          将数组分成2块或者更多块，都无法得到所需的结果。
          例如，分成 [4, 3], [2, 1, 0] 的结果是 [3, 4, 0, 1, 2]，这不是有序的数组。
         */
        System.out.println(maxChunksMakeSorted.maxChunksToSorted(new int[]{4, 3, 2, 1, 0}));
        /*
          示例 2:
          输入: arr = [1,0,2,3,4]
          输出: 4
          解释:
          我们可以把它分成两块，例如 [1, 0], [2, 3, 4]。
          然而，分成 [1, 0], [2], [3], [4] 可以得到最多的块数。
         */
        System.out.println(maxChunksMakeSorted.maxChunksToSorted(new int[]{1, 0, 2, 3, 4}));

    }
}
