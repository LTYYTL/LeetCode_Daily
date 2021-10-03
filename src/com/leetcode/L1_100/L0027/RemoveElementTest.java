package com.leetcode.L1_100.L0027;

public class RemoveElementTest {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        /*** 示例 1：
         * 输入：nums = [3,2,2,3], val = 3
         * 输出：2, nums = [2,2]
         * 解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
         */
        System.out.println(removeElement.removeElement(new int[]{3, 2, 2, 3}, 2));
        /**
         * 示例 2：
         * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
         * 输出：5, nums = [0,1,4,0,3]
         * 解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。
         */
        System.out.println(removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
