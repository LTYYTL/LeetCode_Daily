package com.leetcode.L0752;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 752. 打开转盘锁
 * 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。
 * 每个拨轮可以自由旋转：例如把 '9' 变为  '0'，'0' 变为 '9' 。每次旋转都只能旋转一个拨轮的一位数字。
 * 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。
 * 列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
 * 字符串 target 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。
 *
 * 示例 1:
 * 输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
 * 输出：6
 * 解释：
 * 可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
 * 注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
 * 因为当拨动到 "0102" 时这个锁就会被锁定。
 *
 * 示例 2:
 * 输入: deadends = ["8888"], target = "0009"
 * 输出：1
 * 解释：
 * 把最后一位反向旋转一次即可 "0000" -> "0009"。
 *
 * 示例 3:
 * 输入: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
 * 输出：-1
 * 解释：
 * 无法旋转到目标数字且不被锁定。
 *
 * 示例 4:
 * 输入: deadends = ["0000"], target = "8888"
 * 输出：-1
 *
 * 提示：
 * 死亡列表 deadends 的长度范围为 [1, 500]。
 * 目标数字 target 不会在 deadends 之中。
 * 每个 deadends 和 target 中的字符串的数字会在 10,000 个可能的情况 '0000' 到 '9999' 中产生。
 */
public class OpenTheLock {
    /**
     * 方法一：单向BFS
     * @param deadends
     * @param target
     * @return
     */
    public int openLock(String[] deadends, String target) {
        //将死亡数字加入其中
        Set<String> deadend = new HashSet<>();
        for (String s : deadends) {
            deadend.add(s);
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        //存入尝试过的组合，避免重复尝试
        Set<String> visited = new HashSet<>();
        visited.add("0000");

        int step = 0;

        while (!queue.isEmpty()){
            int size = queue.size();

            //将当前队列中的所有节点向四周扩散
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                //判断密码是否合法
                if (deadend.contains(cur))
                    continue;
                //判断是否到达终点
                if (cur.equals(target))
                    return step;

                //四个位置分别波动，将未遍历的加入其中
                for (int j = 0; j < 4; j++) {
                    //向上波动
                    String up = up(cur,j);
                    if (!visited.contains(up)){
                        queue.offer(up);
                        visited.add(up);
                    }

                    //向下波动
                    String down = down(cur,j);
                    if (!visited.contains(down)){
                        queue.offer(down);
                        visited.add(down);
                    }
                }
            }
            //增加步数
            step++;
        }
        //如果穷举都没有目标密码，返回-1
        return -1;
    }

    /**
     * 方法二：双向BFS
     * @param deadends
     * @param target
     * @return
     */
    public int openLock_BFS(String[] deadends, String target) {
        //将死亡数字加入其中
        Set<String> deadend = new HashSet<>();
        for (String s : deadends) {
            deadend.add(s);
        }
        Set<String> q1 = new HashSet<>();
        Set<String> q2 = new HashSet<>();
        //初始化终点和起点
        q1.add("0000");
        q2.add(target);
        //存入尝试过的组合，避免重复尝试
        Set<String> visited = new HashSet<>();

        int step = 0;

        while (!q1.isEmpty() && !q2.isEmpty()){
            //在遍历过程中不能修改哈希集合
            //用temp存储q1的扩散结果
            Set<String > temp = new HashSet<>();

            for (String cur : q1) {
                if (deadend.contains(cur))
                    continue;

                if (q2.contains(cur))
                    return step;

                visited.add(cur);

                //四个位置分别波动，将未遍历的加入其中
                for (int j = 0; j < 4; j++) {
                    //向上波动
                    String up = up(cur,j);
                    if (!visited.contains(up)){
                        temp.add(up);
                    }

                    //向下波动
                    String down = down(cur,j);
                    if (!visited.contains(down)){
                        temp.add(down);
                    }
                }
            }

            //增加步数
            step++;
            //temp相当于q1，将q1个q2交换，下次从q2开始扩散
            q1 = q2;
            q2 = temp;
        }
        //如果穷举都没有目标密码，返回-1
        return -1;
    }


    /**
     * 向下波动
     * @param cur
     * @param j
     * @return
     */
    private String down(String cur, int j) {
        char[] chars = cur.toCharArray();
        if (chars[j] == '0'){
            chars[j] = '9';
        }else {
            chars[j]--;
        }
        return new String(chars);
    }

    /**
     * 向上波动
     * @param cur
     * @param j
     * @return
     */
    private String up(String cur, int j) {
        char[] chars = cur.toCharArray();
        if (chars[j] == '9'){
            chars[j] = '0';
        }else {
            chars[j]++;
        }
        return new String(chars);
    }
}
