package com.leetcode.L0726;

public class NumberAtomsTest {
    public static void main(String[] args) {
        NumberAtoms numberAtoms = new NumberAtoms();
        /**
         * 示例 1：
         * 输入：formula = "H2O"
         * 输出："H2O"
         * 解释：
         * 原子的数量是 {'H': 2, 'O': 1}。
         */
        System.out.println(numberAtoms.countOfAtoms("H2O"));
        /**
         * 示例 2：
         * 输入：formula = "Mg(OH)2"
         * 输出："H2MgO2"
         * 解释：
         * 原子的数量是 {'H': 2, 'Mg': 1, 'O': 2}。
         */
        System.out.println(numberAtoms.countOfAtoms("Mg(OH)2"));
        /**
         * 示例 3：
         * 输入：formula = "K4(ON(SO3)2)2"
         * 输出："K4N2O14S4"
         * 解释：
         * 原子的数量是 {'K': 4, 'N': 2, 'O': 14, 'S': 4}。
         */
        System.out.println(numberAtoms.countOfAtoms("K4(ON(SO3)2)2"));
        /**
         * 示例 4：
         * 输入：formula = "Be32"
         * 输出："Be32"
         */
        System.out.println(numberAtoms.countOfAtoms("Be32"));
    }
}
