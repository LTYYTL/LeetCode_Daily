package com.interview.L0508;

import java.util.Arrays;

public class DrawLineTest {
    public static void main(String[] args) {
        DrawLine drawLine = new DrawLine();
        /**
         * 示例1:
         *  输入：length = 1, w = 32, x1 = 30, x2 = 31, y = 0
         *  输出：[3]
         *  说明：在第0行的第30位到第31为画一条直线，屏幕表示为[0b000000000000000000000000000000011]
         */
        System.out.println(Arrays.toString(drawLine.drawLine(1, 32, 30, 31, 0)));
        /**
         * 示例2:
         *  输入：length = 3, w = 96, x1 = 0, x2 = 95, y = 0
         *  输出：[-1, -1, -1]
         */
        System.out.println(Arrays.toString(drawLine.drawLine(3, 96, 0, 95, 0)));
    }
}
