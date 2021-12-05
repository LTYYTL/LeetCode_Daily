package com.interview.L0803;

public class MagicIndexTest {
    public static void main(String[] args) {
        MagicIndex magicIndex = new MagicIndex();
        /**
         * 示例1:
         *  输入：nums = [0, 2, 3, 4, 5]
         *  输出：0
         *  说明: 0下标的元素为0
         */
        System.out.println(magicIndex.findMagicIndex(new int[]{0, 2, 3, 4, 5}));
        /**
         * 示例2:
         *  输入：nums = [1, 1, 1]
         *  输出：1
         */
        System.out.println(magicIndex.findMagicIndex(new int[]{1, 1, 1}));
    }
}
