package com.offerII.L041;

public class MovingAverageTest {
    public static void main(String[] args) {
        /*
          示例：
          输入：
          inputs = ["MovingAverage", "next", "next", "next", "next"]
          inputs = [[3], [1], [10], [3], [5]]
          输出：
          [null, 1.0, 5.5, 4.66667, 6.0]
          解释：
          MovingAverage movingAverage = new MovingAverage(3);
          movingAverage.next(1); // 返回 1.0 = 1 / 1
          movingAverage.next(10); // 返回 5.5 = (1 + 10) / 2
          movingAverage.next(3); // 返回 4.66667 = (1 + 10 + 3) / 3
          movingAverage.next(5); // 返回 6.0 = (10 + 3 + 5) / 3
         */
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }
}
