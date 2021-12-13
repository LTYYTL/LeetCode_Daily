package com.interview.L1615;

import java.util.Arrays;

public class MasterMindTest {
    public static void main(String[] args) {
        MasterMind masterMindLCCI = new MasterMind();
        /**
         * 示例：
         * 输入： solution="RGBY",guess="GGRR"
         * 输出： [1,1]
         * 解释： 猜中1次，伪猜中1次。
         */
        System.out.println(Arrays.toString(masterMindLCCI.masterMind("RGBY", "GGRR")));
    }
}
