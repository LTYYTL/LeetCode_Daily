package com.leetcode.L2201_2300.L2269;

public class KBeautyValueFinderTest {
    public static void main(String[] args) {
        KBeautyValueFinder kBeautyValueFinder = new KBeautyValueFinder();
        /*
         * 示例 1：
         * 输入：num = 240, k = 2
         * 输出：2
         * 解释：以下是 num 里长度为 k 的子字符串：
         * - "240" 中的 "24" ：24 能整除 240 。
         * - "240" 中的 "40" ：40 能整除 240 。
         * 所以，k 美丽值为 2 。
         */
        System.out.println(kBeautyValueFinder.divisorSubstrings(240, 2));
        /*
         * 示例 2：
         * 输入：num = 430043, k = 2
         * 输出：2
         * 解释：以下是 num 里长度为 k 的子字符串：
         * - "430043" 中的 "43" ：43 能整除 430043 。
         * - "430043" 中的 "30" ：30 不能整除 430043 。
         * - "430043" 中的 "00" ：0 不能整除 430043 。
         * - "430043" 中的 "04" ：4 不能整除 430043 。
         * - "430043" 中的 "43" ：43 能整除 430043 。
         * 所以，k 美丽值为 2 。
         */
        System.out.println(kBeautyValueFinder.divisorSubstrings(430043, 2));
    }
}
