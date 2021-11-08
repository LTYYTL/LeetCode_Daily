package com.offerII.L109;


public class OpenTheLockTest {
    public static void main(String[] args) {
        OpenTheLock openTheLock = new OpenTheLock();
        /**
         * 示例 1:
         * 输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
         * 输出：6
         * 解释：
         * 可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
         * 注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
         * 因为当拨动到 "0102" 时这个锁就会被锁定。
         */
        System.out.println(openTheLock.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
        /**
         * 示例 2:
         * 输入: deadends = ["8888"], target = "0009"
         * 输出：1
         * 解释：
         * 把最后一位反向旋转一次即可 "0000" -> "0009"。
         */
        System.out.println(openTheLock.openLock_BFS(new String[]{"8888"}, "0009"));

    }
}
