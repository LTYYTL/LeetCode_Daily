package com.leetcode.L901_1000.L0990;

public class SatisfiabilityEqualityEquationsTest {
    public static void main(String[] args) {
        SatisfiabilityEqualityEquations satisfiabilityEqualityEquations = new SatisfiabilityEqualityEquations();
        /*
          示例 1：
          输入：["a==b","b!=a"]
          输出：false
          解释：如果我们指定，a = 1 且 b = 1，那么可以满足第一个方程，但无法满足第二个方程。没有办法分配变量同时满足这两个方程。
         */
        System.out.println(satisfiabilityEqualityEquations.equationsPossible(new String[]{"a==b", "b!=a"}));
        /*
          示例 2：
          输入：["b==a","a==b"]
          输出：true
          解释：我们可以指定 a = 1 且 b = 1 以满足满足这两个方程。
         */
        System.out.println(satisfiabilityEqualityEquations.equationsPossible(new String[]{"b==a", "a==b"}));
        /*
          示例 3：
          输入：["a==b","b==c","a==c"]
          输出：true
         */
        System.out.println(satisfiabilityEqualityEquations.equationsPossible(new String[]{"a==b", "b==c", "a==c"}));
        /*
          示例 4：
          输入：["a==b","b!=c","c==a"]
          输出：false
         */
        System.out.println(satisfiabilityEqualityEquations.equationsPossible(new String[]{"a==b", "b!=c", "c==a"}));
        /*
          示例 5：
          输入：["c==c","b==d","x!=z"]
          输出：true
         */
        System.out.println(satisfiabilityEqualityEquations.equationsPossible(new String[]{"c==c", "b==d", "x!=z"}));
    }
}
