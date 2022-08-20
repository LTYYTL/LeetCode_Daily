package com.offer.L0660;

import java.util.Arrays;

public class BuildArrayProductsTest {
    public static void main(String[] args) {
        BuildArrayProducts buildArrayProducts = new BuildArrayProducts();
        /*
          示例:
          输入: [1,2,3,4,5]
          输出: [120,60,40,30,24]
         */
        System.out.println(Arrays.toString(buildArrayProducts.constructArr(new int[]{1, 2, 3, 4, 5})));
    }
}
