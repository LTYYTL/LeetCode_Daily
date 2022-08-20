package com.leetcode.L2001_2100.L2043;

public class BankTest {
    public static void main(String[] args) {
        /*
          示例：
          输入：
          ["Bank", "withdraw", "transfer", "deposit", "transfer", "withdraw"]
          [[[10, 100, 20, 50, 30]], [3, 10], [5, 1, 20], [5, 20], [3, 4, 15], [10, 50]]
          输出：
          [null, true, true, true, false, false]
          解释：
          Bank bank = new Bank([10, 100, 20, 50, 30]);
          bank.withdraw(3, 10);    // 返回 true ，账户 3 的余额是 $20 ，所以可以取款 $10 。
                                   // 账户 3 余额为 $20 - $10 = $10 。
          bank.transfer(5, 1, 20); // 返回 true ，账户 5 的余额是 $30 ，所以可以转账 $20 。
                                   // 账户 5 的余额为 $30 - $20 = $10 ，账户 1 的余额为 $10 + $20 = $30 。
          bank.deposit(5, 20);     // 返回 true ，可以向账户 5 存款 $20 。
                                   // 账户 5 的余额为 $10 + $20 = $30 。
          bank.transfer(3, 4, 15); // 返回 false ，账户 3 的当前余额是 $10 。
                                   // 所以无法转账 $15 。
          bank.withdraw(10, 50);   // 返回 false ，交易无效，因为账户 10 并不存在。
         */
        Bank bank = new Bank(new long[]{10, 100, 20, 50, 30});
        System.out.println(bank.withdraw(3, 10));
        System.out.println(bank.transfer(5, 1, 20));
        System.out.println(bank.deposit(5, 20));
        System.out.println(bank.transfer(3, 4, 15));
        System.out.println(bank.withdraw(10, 50));
    }
}
