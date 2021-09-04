package com.offer.L0380;

import java.util.Arrays;

public class StringArrangementTest {
    public static void main(String[] args) {
        StringArrangement stringArrangement = new StringArrangement();
        /**
         * 输入：s = "abc"
         * 输出：["abc","acb","bac","bca","cab","cba"]
         */
        System.out.println(Arrays.toString(stringArrangement.permutation("abc")));
    }
}
