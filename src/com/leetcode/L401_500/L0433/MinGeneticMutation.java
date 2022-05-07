package com.leetcode.L401_500.L0433;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 433. 最小基因变化
 * 基因序列可以表示为一条由 8 个字符组成的字符串，其中每个字符都是 'A'、'C'、'G' 和 'T' 之一。
 * 假设我们需要调查从基因序列 start 变为 end 所发生的基因变化。一次基因变化就意味着这个基因序列中的一个字符发生了变化。
 * 例如，"AACCGGTT" --> "AACCGGTA" 就是一次基因变化。
 * 另有一个基因库 bank 记录了所有有效的基因变化，只有基因库中的基因才是有效的基因序列。
 * 给你两个基因序列 start 和 end ，以及一个基因库 bank ，请你找出并返回能够使 start 变化为 end 所需的最少变化次数。如果无法完成此基因变化，返回 -1 。
 * 注意：起始基因序列 start 默认是有效的，但是它并不一定会出现在基因库中。
 * <p>
 * 示例 1：
 * 输入：start = "AACCGGTT", end = "AACCGGTA", bank = ["AACCGGTA"]
 * 输出：1
 * <p>
 * 示例 2：
 * 输入：start = "AACCGGTT", end = "AAACGGTA", bank = ["AACCGGTA","AACCGCTA","AAACGGTA"]
 * 输出：2
 * <p>
 * 示例 3：
 * 输入：start = "AAAAACCC", end = "AACCCCCC", bank = ["AAAACCCC","AAACCCCC","AACCCCCC"]
 * 输出：3
 * <p>
 * 提示：
 * start.length == 8
 * end.length == 8
 * 0 <= bank.length <= 10
 * bank[i].length == 8
 * start、end 和 bank[i] 仅由字符 ['A', 'C', 'G', 'T'] 组成
 */
public class MinGeneticMutation {
    /**
     * 方法：广度优先搜索
     *
     * @param start
     * @param end
     * @param bank
     * @return
     */
    public int minMutation(String start, String end, String[] bank) {
        //开始和结束相等
        if (start.equals(end))
            return 0;
        //队列
        Queue<String> queue = new LinkedList<>();
        //存储已访问字符串
        Set<String> visit = new HashSet<>();

        //将与开始字符串相差一个字符的放入队列
        for (String s : bank) {
            if (isValid(s, start) == 1) {
                //加入队列
                queue.add(s);
                //已访问
                visit.add(s);
            }
        }

        //最小改变次数
        int min = 1;
        //遍历
        while (!queue.isEmpty()) {
            //当前层个数
            int size = queue.size();
            //遍历
            for (int i = 0; i < size; i++) {
                //队首元素
                String cur = queue.poll();
                //结束字符串直接返回
                if (cur.equals(end))
                    return min;
                //遍历基因库寻找下一个相差一个字符的字符串
                for (String s : bank) {
                    if (!visit.contains(s) && isValid(s, cur) == 1) {
                        queue.add(s);
                        visit.add(s);
                    }
                }
            }
            //层数+1
            min++;
        }

        return -1;
    }

    /**
     * 记录俩个字符串相差字符个数
     *
     * @param s
     * @param start
     * @return
     */
    private int isValid(String s, String start) {
        int res = 0;
        for (int i = 0; i < start.length(); i++) {
            if (s.charAt(i) != start.charAt(i))
                res++;
        }
        return res;
    }

}
