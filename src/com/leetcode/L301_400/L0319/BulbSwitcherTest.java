package com.leetcode.L301_400.L0319;

public class BulbSwitcherTest {
    public static void main(String[] args) {
        BulbSwitcher bulbSwitcher = new BulbSwitcher();
        /*
          示例 1：
          输入：n = 3
          输出：1
          解释：
          初始时, 灯泡状态 [关闭, 关闭, 关闭].
          第一轮后, 灯泡状态 [开启, 开启, 开启].
          第二轮后, 灯泡状态 [开启, 关闭, 开启].
          第三轮后, 灯泡状态 [开启, 关闭, 关闭].
          你应该返回 1，因为只有一个灯泡还亮着。
         */
        System.out.println(bulbSwitcher.bulbSwitch(3));
        /*
          示例 2：
          输入：n = 0
          输出：0
         */
        System.out.println(bulbSwitcher.bulbSwitch(0));
        /*
          示例 3：
          输入：n = 1
          输出：1
         */
        System.out.println(bulbSwitcher.bulbSwitch(1));
    }
}
