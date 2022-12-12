package com.leetcode.L801_900.L0808;

public class SoupServingsTest {
    public static void main(String[] args) {
        SoupServings soupServings = new SoupServings();
        /*
          示例 1:
          输入: n = 50
          输出: 0.62500
          解释:如果我们选择前两个操作，A 首先将变为空。
          对于第三个操作，A 和 B 会同时变为空。
          对于第四个操作，B 首先将变为空。
          所以 A 变为空的总概率加上 A 和 B 同时变为空的概率的一半是 0.25 *(1 + 1 + 0.5 + 0)= 0.625。
         */
        System.out.println(soupServings.soupServings(50));
        /*
          示例 2:
          输入: n = 100
          输出: 0.71875
         */
        System.out.println(soupServings.soupServings(100));
    }
}
