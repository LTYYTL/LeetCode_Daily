package com.leetcode.L901_1000.L0937;

import java.util.Arrays;

public class ReorderDataLogFilesTest {
    public static void main(String[] args) {
        ReorderDataLogFiles reorderDataLogFiles = new ReorderDataLogFiles();
        /*
          示例 1：
          输入：logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
          输出：["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
          解释：
          字母日志的内容都不同，所以顺序为 "art can", "art zero", "own kit dig" 。
          数字日志保留原来的相对顺序 "dig1 8 1 5 1", "dig2 3 6" 。
         */
        System.out.println(
                Arrays.toString(
                        reorderDataLogFiles.reorderLogFiles(new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"})
                )
        );
        /*
          示例 2：
          输入：logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
          输出：["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
         */
        System.out.println(
                Arrays.toString(
                        reorderDataLogFiles.reorderLogFiles(new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"})
                )
        );
    }
}
