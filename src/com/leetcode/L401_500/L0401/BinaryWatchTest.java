package com.leetcode.L401_500.L0401;

public class BinaryWatchTest {
    public static void main(String[] args) {
        BinaryWatch binaryWatch = new BinaryWatch();
        /**
         * 示例 1：
         * 输入：turnedOn = 1
         * 输出：["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]
         */
        System.out.println(binaryWatch.readBinaryWatch(1).toString());
        /**
         * 示例 2：
         * 输入：turnedOn = 9
         * 输出：[]
         */
        System.out.println(binaryWatch.readBinaryWatch(9).toString());
    }
}
