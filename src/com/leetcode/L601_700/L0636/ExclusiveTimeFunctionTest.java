package com.leetcode.L601_700.L0636;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExclusiveTimeFunctionTest {
    public static void main(String[] args) {
        ExclusiveTimeFunctions exclusiveTimeFunctions = new ExclusiveTimeFunctions();
        /*
          示例 1：
          输入：n = 2, logs = ["0:start:0","1:start:2","1:end:5","0:end:6"]
          输出：[3,4]
          解释：
          函数 0 在时间戳 0 的起始开始执行，执行 2 个单位时间，于时间戳 1 的末尾结束执行。
          函数 1 在时间戳 2 的起始开始执行，执行 4 个单位时间，于时间戳 5 的末尾结束执行。
          函数 0 在时间戳 6 的开始恢复执行，执行 1 个单位时间。
          所以函数 0 总共执行 2 + 1 = 3 个单位时间，函数 1 总共执行 4 个单位时间。
         */
        List<String> list = new ArrayList<>() {{
            add("0:start:0");
            add("1:start:2");
            add("1:end:5");
            add("0:end:6");
        }};
        System.out.println(Arrays.toString(exclusiveTimeFunctions.exclusiveTime(2, list)));
        /*
          示例 2：
          输入：n = 1, logs = ["0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7"]
          输出：[8]
          解释：
          函数 0 在时间戳 0 的起始开始执行，执行 2 个单位时间，并递归调用它自身。
          函数 0（递归调用）在时间戳 2 的起始开始执行，执行 4 个单位时间。
          函数 0（初始调用）恢复执行，并立刻再次调用它自身。
          函数 0（第二次递归调用）在时间戳 6 的起始开始执行，执行 1 个单位时间。
          函数 0（初始调用）在时间戳 7 的起始恢复执行，执行 1 个单位时间。
          所以函数 0 总共执行 2 + 4 + 1 + 1 = 8 个单位时间。
         */
        list.clear();
        list = new ArrayList<>() {{
            add("0:start:0");
            add("0:start:2");
            add("0:end:5");
            add("0:start:6");
            add("0:end:6");
            add("0:end:7");
        }};
        System.out.println(Arrays.toString(exclusiveTimeFunctions.exclusiveTime(1, list)));
        /*
          示例 3：
          输入：n = 2, logs = ["0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7"]
          输出：[7,1]
          解释：
          函数 0 在时间戳 0 的起始开始执行，执行 2 个单位时间，并递归调用它自身。
          函数 0（递归调用）在时间戳 2 的起始开始执行，执行 4 个单位时间。
          函数 0（初始调用）恢复执行，并立刻调用函数 1 。
          函数 1在时间戳 6 的起始开始执行，执行 1 个单位时间，于时间戳 6 的末尾结束执行。
          函数 0（初始调用）在时间戳 7 的起始恢复执行，执行 1 个单位时间，于时间戳 7 的末尾结束执行。
          所以函数 0 总共执行 2 + 4 + 1 = 7 个单位时间，函数 1 总共执行 1 个单位时间。
         */
        list.clear();
        list = new ArrayList<>() {{
            add("0:start:0");
            add("0:start:2");
            add("0:end:5");
            add("1:start:6");
            add("1:end:6");
            add("0:end:7");
        }};
        System.out.println(Arrays.toString(exclusiveTimeFunctions.exclusiveTime(2, list)));
        /*
          示例 4：
          输入：n = 2, logs = ["0:start:0","0:start:2","0:end:5","1:start:7","1:end:7","0:end:8"]
          输出：[8,1]
         */
        list.clear();
        list = new ArrayList<>() {{
            add("0:start:0");
            add("0:start:2");
            add("0:end:5");
            add("1:start:7");
            add("1:end:7");
            add("0:end:8");
        }};
        System.out.println(Arrays.toString(exclusiveTimeFunctions.exclusiveTime(2, list)));
        /*
          示例 5：
          输入：n = 1, logs = ["0:start:0","0:end:0"]
          输出：[1]
         */
        list.clear();
        list = new ArrayList<>() {{
            add("0:start:0");
            add("0:end:0");
        }};
        System.out.println(Arrays.toString(exclusiveTimeFunctions.exclusiveTime(1, list)));
    }
}
