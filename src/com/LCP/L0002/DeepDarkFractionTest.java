package com.LCP.L0002;

import java.util.Arrays;

public class DeepDarkFractionTest {
    public static void main(String[] args) {
        DeepDarkFraction deepDarkFraction = new DeepDarkFraction();
        /*
          示例 1：
          输入：cont = [3, 2, 0, 2]
          输出：[13, 4]
          解释：原连分数等价于3 + (1 / (2 + (1 / (0 + 1 / 2))))。注意[26, 8], [-13, -4]都不是正确答案。
         */
        System.out.println(Arrays.toString(deepDarkFraction.fraction(new int[]{3, 2, 0, 2})));
        /*
          示例 2：
          输入：cont = [0, 0, 3]
          输出：[3, 1]
          解释：如果答案是整数，令分母为1即可。
         */
        System.out.println(Arrays.toString(deepDarkFraction.fraction(new int[]{0, 0, 3})));
    }
}
