package com.leetcode.L101_200.L0165;

public class CompareVersionNumbersTest {
    public static void main(String[] args) {
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        /*
          示例 1：
          输入：version1 = "1.01", version2 = "1.001"
          输出：0
          解释：忽略前导零，"01" 和 "001" 都表示相同的整数 "1"
         */
        System.out.println(compareVersionNumbers.compareVersion("1.01", "1.001"));
        System.out.println(compareVersionNumbers.compareVersion_tow("1.01", "1.001"));
        /*
          示例 2：
          输入：version1 = "1.0", version2 = "1.0.0"
          输出：0
          解释：version1 没有指定下标为 2 的修订号，即视为 "0"
         */
        System.out.println(compareVersionNumbers.compareVersion("1.0", "1.0.0"));
        System.out.println(compareVersionNumbers.compareVersion_tow("1.0", "1.0.0"));
        /*
          示例 3：
          输入：version1 = "0.1", version2 = "1.1"
          输出：-1
          解释：version1 中下标为 0 的修订号是 "0"，version2 中下标为 0 的修订号是 "1" 。0 < 1，所以 version1 < version2
         */
        System.out.println(compareVersionNumbers.compareVersion("0.1", "1.1"));
        System.out.println(compareVersionNumbers.compareVersion_tow("0.1", "1.1"));
        /*
          示例 4：
          输入：version1 = "1.0.1", version2 = "1"
          输出：1
         */
        System.out.println(compareVersionNumbers.compareVersion("1.0.1", "1"));
        System.out.println(compareVersionNumbers.compareVersion_tow("1.0.1", "1"));
        /*
          示例 5：
          输入：version1 = "7.5.2.4", version2 = "7.5.3"
          输出：-1
         */
        System.out.println(compareVersionNumbers.compareVersion("7.5.2.4", "7.5.3"));
        System.out.println(compareVersionNumbers.compareVersion_tow("7.5.2.4", "7.5.3"));
    }
}
