package com.interview.L0806;

import java.util.ArrayList;
import java.util.List;

public class HanotaTest {
    public static void main(String[] args) {
        Hanota hanota = new Hanota();
        /**
         * 示例1:
         *  输入：A = [2, 1, 0], B = [], C = []
         *  输出：C = [2, 1, 0]
         */
        List<Integer> c = new ArrayList<>();
        hanota.hanota(new ArrayList<>(){{add(2);add(1);add(0);}},new ArrayList<>(),c);
        System.out.println(c);
        /**
         * 示例2:
         *  输入：A = [1, 0], B = [], C = []
         *  输出：C = [1, 0]
         */
        c.clear();
        hanota.hanota(new ArrayList<>(){{add(1);add(0);}},new ArrayList<>(),c);
        System.out.println(c);
    }
}
