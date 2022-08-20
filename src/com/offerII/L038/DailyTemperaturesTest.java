package com.offerII.L038;

import java.util.Arrays;

public class DailyTemperaturesTest {
    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        /*
          示例 1:
          输入: temperatures = [73,74,75,71,69,72,76,73]
          输出: [1,1,4,2,1,1,0,0]
         */
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        /*
          示例 2:
          输入: temperatures = [30,40,50,60]
          输出: [1,1,1,0]
         */
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{30, 40, 50, 60})));
        /*
          示例 3:
          输入: temperatures = [30,60,90]
          输出: [1,1,0]
         */
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{30, 60, 90})));
    }
}
