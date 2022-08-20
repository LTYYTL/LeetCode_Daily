package com.leetcode.L1_100.L0071;

public class SimplifyPathTest {
    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        /*
          示例 1：
          输入：path = "/home/"
          输出："/home"
          解释：注意，最后一个目录名后面没有斜杠。
         */
        System.out.println(simplifyPath.simplifyPath("/home/"));
        /*
          示例 2：
          输入：path = "/../"
          输出："/"
          解释：从根目录向上一级是不可行的，因为根目录是你可以到达的最高级。
         */
        System.out.println(simplifyPath.simplifyPath("/../"));
        /*
          示例 3：
          输入：path = "/home//foo/"
          输出："/home/foo"
          解释：在规范路径中，多个连续斜杠需要用一个斜杠替换。
         */
        System.out.println(simplifyPath.simplifyPath("/home//foo/"));
        /*
          示例 4：
          输入：path = "/a/./b/../../c/"
          输出："/c"
         */
        System.out.println(simplifyPath.simplifyPath("/a/./b/../../c/"));
    }
}
