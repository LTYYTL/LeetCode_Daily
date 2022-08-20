package com.interview.L0801;

public class ThreeStepsProblemTest {
    public static void main(String[] args) {
        ThreeStepsProblem threeStepsProblem = new ThreeStepsProblem();
        /*
          示例1:
           输入：n = 3
           输出：4
           说明: 有四种走法
         */
        System.out.println(threeStepsProblem.waysToStep(3));
        /*
          示例2:
           输入：n = 5
           输出：13
         */
        System.out.println(threeStepsProblem.waysToStep(5));
    }
}
