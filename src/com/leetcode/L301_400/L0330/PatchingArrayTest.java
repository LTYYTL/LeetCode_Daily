package com.leetcode.L301_400.L0330;

public class PatchingArrayTest {
    public static void main(String[] args) {
        PatchingArray patchingArray = new PatchingArray();
        /* 示例 1:
         输入: nums = [1,3], n = 6
         输出: 1
         解释:
         根据 nums 里现有的组合 [1], [3], [1,3]，可以得出 1, 3, 4。
         现在如果我们将 2 添加到 nums 中， 组合变为: [1], [2], [3], [1,3], [2,3], [1,2,3]。
         其和可以表示数字 1, 2, 3, 4, 5, 6，能够覆盖 [1, 6] 区间里所有的数。
         所以我们最少需要添加一个数字。
         */
        System.out.println(patchingArray.minPatches(new int[]{1, 3}, 6));
    }
}
