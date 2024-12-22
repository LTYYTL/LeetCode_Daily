package com.util;

import java.util.Arrays;

public class ArrayUtil {

    public static String toString(int[] arr){
        return Arrays.toString(arr);
    }

    public static String toString(int[][] arr){
        return Arrays.deepToString(arr);
    }

    public static void reverseRows(int[][] arr){
        int i = 0;
        int j = arr.length - 1;

        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[][] score, int i1, int i2){
        int[] tmp = Arrays.copyOf(score[i1], score[i1].length);
        score[i1] = score[i2];
        score[i2] = tmp;
    }
}
