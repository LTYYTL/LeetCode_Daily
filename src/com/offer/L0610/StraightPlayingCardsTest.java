package com.offer.L0610;

public class StraightPlayingCardsTest {
    public static void main(String[] args) {
        StraightPlayingCards straightPlayingCards = new StraightPlayingCards();
        /**
         * 示例 1:
         * 输入: [1,2,3,4,5]
         * 输出: True
         */
        System.out.println(straightPlayingCards.isStraight(new int[]{1, 2, 3, 4, 5}));
        System.out.println(straightPlayingCards.isStraight_sort(new int[]{1, 2, 3, 4, 5}));
        /**
         * 示例 2:
         * 输入: [0,0,1,2,5]
         * 输出: True
         */
        System.out.println(straightPlayingCards.isStraight(new int[]{0, 0, 1, 2, 5}));
        System.out.println(straightPlayingCards.isStraight_sort(new int[]{0, 0, 1, 2, 5}));
    }
}
