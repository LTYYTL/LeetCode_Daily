package com.leetcode.L401_500.L0470;

/**
 * 470. 用 Rand7() 实现 Rand10()
 * 已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。
 * 不要使用系统的 Math.random() 方法。
 *
 * 示例 1:
 * 输入: 1
 * 输出: [7]
 *
 * 示例 2:
 * 输入: 2
 * 输出: [8,4]
 *
 * 示例 3:
 * 输入: 3
 * 输出: [8,1,10]
 *
 * 提示:
 * rand7 已定义。
 * 传入参数: n 表示 rand10 的调用次数。
 *
 * 进阶:
 * rand7()调用次数的 期望值 是多少 ?
 * 你能否尽量少调用 rand7() ?
 */
public class ImplementRand10UsingRand7 {
    /**
     * 方法：数学
     * @return
     */
    public int rand10() {
        while(true) {
            int num = (rand7() - 1) * 7 + rand7(); // 等概率生成[1,49]范围的随机数
            if(num <= 40) return num % 10 + 1; // 拒绝采样，并返回[1,10]范围的随机数
        }
    }

    /**
     * 模拟生成1~7
     * @return
     */
    private int rand7() {
        return (int) (Math.random() * 6 + 1);
    }
}
