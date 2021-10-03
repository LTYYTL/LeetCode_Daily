package com.leetcode.L601_700.L0633;

/**
 * 633. 平方数之和
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 *
 * 示例 1：
 * 输入：c = 5
 * 输出：true
 * 解释：1 * 1 + 2 * 2 = 5
 *
 * 示例 2：
 * 输入：c = 3
 * 输出：false
 *
 * 示例 3：
 * 输入：c = 4
 * 输出：true
 *
 * 示例 4：
 * 输入：c = 2
 * 输出：true
 *
 * 示例 5：
 * 输入：c = 1
 * 输出：true
 *
 * 提示：
 * 0 <= c <= 231 - 1
 */
public class SumSquareNumbers {
    /**
     * 方法一：双指针
     * 解题思路：
     * 可以假设 a≤b。初始时 a = 0，b =sqrt(c) ，进行如下操作：
     * 如果 a^2 + b^2 = c，我们找到了题目要求的一个解，返回 true；
     * 如果 a^2 + b^2 < c，此时需要将 a 的值加 1，继续查找；
     * 如果 a^2 + b^2 > c，此时需要将 b 的值减 1，继续查找。
     * 当 a = b 时，结束查找，此时如果仍然没有找到整数 a 和 b 满足 a^2 + b^2 = c，则说明不存在题目要求的解，返回false。
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        //双指针
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right){
            //平方和
            int sum = (int) (Math.pow(left,2) + Math.pow(right,2));
            if (sum > c){
                right--;
            }else if (sum < c){
                left++;
            }else {
                return true;
            }
        }
        return false;
    }


    /**
     * 方法二：数学
     * 费马平方和 : 奇质数能表示为两个平方数之和的充分必要条件是该质数被 4 除余 1 。
     * 翻译过来就是：当且仅当一个自然数的质因数分解中，满足 4k+3 形式的质数次方数均为偶数时，该自然数才能被表示为两个平方数之和。
     * 因此我们对 c 进行质因数分解，再判断满足 4k+3 形式的质因子的次方数是否均为偶数即可。
     * @param c
     * @return
     */
    public boolean judgeSquareSum_math(int c) {
        for (int i = 2, cnt = 0; i * i <= c; i++, cnt = 0) {
            while (c % i == 0 && ++cnt > 0) c /= i;
            if (i % 4 == 3 && cnt % 2 != 0) return false;
        }
        return c % 4 != 3;

    }
}
