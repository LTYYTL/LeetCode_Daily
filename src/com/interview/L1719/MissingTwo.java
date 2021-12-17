package com.interview.L1719;

/**
 * 面试题 17.19. 消失的两个数字
 * 给定一个数组，包含从 1 到 N 所有的整数，但其中缺了两个数字。你能在 O(N) 时间内只用 O(1) 的空间找到它们吗？
 * 以任意顺序返回这两个数字均可。
 *
 * 示例 1:
 * 输入: [1]
 * 输出: [2,3]
 *
 * 示例 2:
 * 输入: [2,3]
 * 输出: [1,4]
 *
 * 提示：
 * nums.length <= 30000
 */
public class MissingTwo {
    /**
     * 方法：位运算
     * @param nums
     * @return
     */
    public int[] missingTwo(int[] nums) {
        //计算出n的大小
        int n = nums.length + 2;
        //异或值
        int xor = 0;
        //制作出除了消失的两个数其他的数都出现两次的情况
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        for (int num : nums) {
            xor ^= num;
        }
        int x = 0, y = 0, m = 1;
        // 2. 循环左移，计算 m,寻找第一个不同的位
        while((xor & m) == 0)
            m <<= 1;
        // 3. 遍历 nums 分组，相同的分到相同组
        // 4. 当 num & m != 0
        // 4. 当 num & m == 0
        for (int i = 1; i <= n; i++) {
            if((i & m) != 0) x ^= i;
            else y ^= i;
        }
        for(int num: nums) {
            if((num & m) != 0) x ^= num;
            else y ^= num;
        }
        return new int[] {x, y};          // 5. 返回出现一次的数字
    }
}
