package com.LCP.L0029;

public class OrchestraPositionTest {
    public static void main(String[] args) {
        OrchestraPosition orchestraPosition = new OrchestraPosition();
        /*
          示例 1：
          输入：num = 3, Xpos = 0, Ypos = 2
          输出：3
         */
        System.out.println(orchestraPosition.orchestraLayout(3, 0, 2));
        /*
          示例 2：
          输入：num = 4, Xpos = 1, Ypos = 2
          输出：5
         */
        System.out.println(orchestraPosition.orchestraLayout(4, 1, 2));
    }
}
