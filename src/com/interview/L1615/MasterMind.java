package com.interview.L1615;

import java.util.HashMap;

/**
 * 面试题 16.15. 珠玑妙算
 * 珠玑妙算游戏（the game of master mind）的玩法如下。
 * 计算机有4个槽，每个槽放一个球，颜色可能是红色（R）、黄色（Y）、绿色（G）或蓝色（B）。例如，计算机可能有RGGB 4种（槽1为红色，槽2、3为绿色，槽4为蓝色）。
 * 作为用户，你试图猜出颜色组合。打个比方，你可能会猜YRGB。要是猜对某个槽的颜色，则算一次“猜中”；要是只猜对颜色但槽位猜错了，则算一次“伪猜中”。
 * 注意，“猜中”不能算入“伪猜中”。
 * 给定一种颜色组合solution和一个猜测guess，编写一个方法，返回猜中和伪猜中的次数answer，其中answer[0]为猜中的次数，answer[1]为伪猜中的次数。
 *
 * 示例：
 * 输入： solution="RGBY",guess="GGRR"
 * 输出： [1,1]
 * 解释： 猜中1次，伪猜中1次。
 *
 * 提示：
 * len(solution) = len(guess) = 4
 * solution和guess仅包含"R","G","B","Y"这4种字符
 */
public class MasterMind {
    /**
     * 方法：Map映射
     * @param solution
     * @param guess
     * @return
     */
    public int[] masterMind(String solution, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();

        //记录出现的次数
        for(char c : solution.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int fake = 0, real = 0;
        //记录伪猜中的次数
        for(char c : guess.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0){
                fake++;
                map.put(c, map.get(c) - 1);
            }
        }
        //记录猜中次数
        for(int i = 0; i < 4; i++){
            if(solution.charAt(i) == guess.charAt(i))
                real++;
        }
        //伪猜中中包含了猜中的次数

        return new int[]{real, fake - real};

    }
}
