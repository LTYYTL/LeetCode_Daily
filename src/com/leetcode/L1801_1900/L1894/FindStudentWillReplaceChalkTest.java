package com.leetcode.L1801_1900.L1894;

public class FindStudentWillReplaceChalkTest {
    public static void main(String[] args) {
        FindStudentWillReplaceChalk findStudentWillReplaceChalk = new FindStudentWillReplaceChalk();
        /**
         * 示例 1：
         * 输入：chalk = [5,1,5], k = 22
         * 输出：0
         * 解释：学生消耗粉笔情况如下：
         * - 编号为 0 的学生使用 5 支粉笔，然后 k = 17 。
         * - 编号为 1 的学生使用 1 支粉笔，然后 k = 16 。
         * - 编号为 2 的学生使用 5 支粉笔，然后 k = 11 。
         * - 编号为 0 的学生使用 5 支粉笔，然后 k = 6 。
         * - 编号为 1 的学生使用 1 支粉笔，然后 k = 5 。
         * - 编号为 2 的学生使用 5 支粉笔，然后 k = 0 。
         * 编号为 0 的学生没有足够的粉笔，所以他需要补充粉笔。
         */
        System.out.println(findStudentWillReplaceChalk.chalkReplacer(new int[]{5, 1, 5}, 22));
        System.out.println(findStudentWillReplaceChalk.chalkReplacer_binary(new int[]{5, 1, 5}, 22));
        /**
         * 示例 2：
         * 输入：chalk = [3,4,1,2], k = 25
         * 输出：1
         * 解释：学生消耗粉笔情况如下：
         * - 编号为 0 的学生使用 3 支粉笔，然后 k = 22 。
         * - 编号为 1 的学生使用 4 支粉笔，然后 k = 18 。
         * - 编号为 2 的学生使用 1 支粉笔，然后 k = 17 。
         * - 编号为 3 的学生使用 2 支粉笔，然后 k = 15 。
         * - 编号为 0 的学生使用 3 支粉笔，然后 k = 12 。
         * - 编号为 1 的学生使用 4 支粉笔，然后 k = 8 。
         * - 编号为 2 的学生使用 1 支粉笔，然后 k = 7 。
         * - 编号为 3 的学生使用 2 支粉笔，然后 k = 5 。
         * - 编号为 0 的学生使用 3 支粉笔，然后 k = 2 。
         * 编号为 1 的学生没有足够的粉笔，所以他需要补充粉笔
         */
        System.out.println(findStudentWillReplaceChalk.chalkReplacer(new int[]{3, 4, 1, 2}, 25));
        System.out.println(findStudentWillReplaceChalk.chalkReplacer_binary(new int[]{3, 4, 1, 2}, 25));
    }
}
