package com.leetcode.L1801_1900.L1860;

import java.util.Arrays;

public class IncrementalMemoryLeakTest {
    public static void main(String[] args) {
        IncrementalMemoryLeak incrementalMemoryLeak = new IncrementalMemoryLeak();
        /** * 示例 1：
         * 输入：memory1 = 2, memory2 = 2
         * 输出：[3,1,0]
         * 解释：内存分配如下：
         * - 第 1 秒，内存条 1 被占用 1 位内存。内存条 1 现在有 1 位剩余可用内存。
         * - 第 2 秒，内存条 2 被占用 2 位内存。内存条 2 现在有 0 位剩余可用内存。
         * - 第 3 秒，程序意外退出，两个内存条分别有 1 位和 0 位剩余可用内存。
         */
        System.out.println(Arrays.toString(incrementalMemoryLeak.memLeak(2, 2)));
        /**
         * 示例 2：
         * 输入：memory1 = 8, memory2 = 11
         * 输出：[6,0,4]
         * 解释：内存分配如下：
         * - 第 1 秒，内存条 2 被占用 1 位内存，内存条 2 现在有 10 位剩余可用内存。
         * - 第 2 秒，内存条 2 被占用 2 位内存，内存条 2 现在有 8 位剩余可用内存。
         * - 第 3 秒，内存条 1 被占用 3 位内存，内存条 1 现在有 5 位剩余可用内存。
         * - 第 4 秒，内存条 2 被占用 4 位内存，内存条 2 现在有 4 位剩余可用内存。
         * - 第 5 秒，内存条 1 被占用 5 位内存，内存条 1 现在有 0 位剩余可用内存。
         * - 第 6 秒，程序意外退出，两个内存条分别有 0 位和 4 位剩余可用内存。
         */
        System.out.println(Arrays.toString(incrementalMemoryLeak.memLeak(8, 11)));
    }
}
