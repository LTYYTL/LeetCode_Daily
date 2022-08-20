package com.interview.L0507;

public class ExchangeTest {
    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        /*
          示例1:
           输入：num = 2（或者0b10）
           输出 1 (或者 0b01)
         */
        System.out.println(exchange.exchangeBits(2));
        /*
          示例2:
           输入：num = 3
           输出：3
         */
        System.out.println(exchange.exchangeBits(3));
    }
}
