package com.leetcode.L1601_1700.L1678;

public class GoalTest {
    public static void main(String[] args) {
        Goal goal = new Goal();
        /*
          示例 1：
          输入：command = "G()(al)"
          输出："Goal"
          解释：Goal 解析器解释命令的步骤如下所示：
          G -> G
          () -> o
          (al) -> al
          最后连接得到的结果是 "Goal"
         */
        System.out.println(goal.interpret("G()(al)"));
        /*
          示例 2：
          输入：command = "G()()()()(al)"
          输出："Gooooal"
         */
        System.out.println(goal.interpret("G()()()()(al)"));
        /*
          示例 3：
          输入：command = "(al)G(al)()()G"
          输出："alGalooG"
         */
        System.out.println(goal.interpret("(al)G(al)()()G"));
    }
}
