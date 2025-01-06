package com.leetcode.L2201_2300.L2241;

import com.util.ArrayUtil;

import java.util.Arrays;

public class ATMTest {
    public static void main(String[] args) {

        /*
         * 示例 1：
         * 输入：
         * ["ATM", "deposit", "withdraw", "deposit", "withdraw", "withdraw"]
         * [[], [[0,0,1,2,1]], [600], [[0,1,0,1,1]], [600], [550]]
         * 输出：
         * [null, null, [0,0,1,0,1], null, [-1], [0,1,0,0,1]]
         * 解释：
         * ATM atm = new ATM();
         * atm.deposit([0,0,1,2,1]); // 存入 1 张 $100 ，2 张 $200 和 1 张 $500 的钞票。
         * atm.withdraw(600);        // 返回 [0,0,1,0,1] 。机器返回 1 张 $100 和 1 张 $500 的钞票。机器里剩余钞票的数量为 [0,0,0,2,0] 。
         * atm.deposit([0,1,0,1,1]); // 存入 1 张 $50 ，1 张 $200 和 1 张 $500 的钞票。
         *                           // 机器中剩余钞票数量为 [0,1,0,3,1] 。
         * atm.withdraw(600);        // 返回 [-1] 。机器会尝试取出 $500 的钞票，然后无法得到剩余的 $100 ，所以取款请求会被拒绝。
         *                           // 由于请求被拒绝，机器中钞票的数量不会发生改变。
         * atm.withdraw(550);        // 返回 [0,1,0,0,1] ，机器会返回 1 张 $50 的钞票和 1 张 $500 的钞票。
         */
         ATM atm = new ATM();
         atm.deposit(new int[]{0,0,1,2,1}); // 存入 1 张 $100 ，2 张 $200 和 1 张 $500 的钞票。
         System.out.println(Arrays.toString(atm.withdraw(600)));        // 返回 [0,0,1,0,1] 。机器返回 1 张 $100 和 1 张 $500 的钞票。机器里剩余钞票的数量为 [0,0,0,2,0] 。
         atm.deposit(new int[]{0,1,0,1,1}); // 存入 1 张 $50 ，1 张 $200 和 1 张 $500 的钞票。
         // 机器中剩余钞票数量为 [0,1,0,3,1] 。
         System.out.println(ArrayUtil.toString(atm.withdraw(600)));        // 返回 [-1] 。机器会尝试取出 $500 的钞票，然后无法得到剩余的 $100 ，所以取款请求会被拒绝。
         // 由于请求被拒绝，机器中钞票的数量不会发生改变。
        System.out.println(ArrayUtil.toString(atm.withdraw(550)));          // 返回 [0,1,0,0,1] ，机器会返回 1 张 $50 的钞票和 1 张 $500 的钞票。
    }
}
