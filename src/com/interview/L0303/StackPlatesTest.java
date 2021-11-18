package com.interview.L0303;

public class StackPlatesTest {
    public static void main(String[] args) {
        /**
         * 示例1:
         *  输入：
         * ["StackOfPlates", "push", "push", "popAt", "pop", "pop"]
         * [[1], [1], [2], [1], [], []]
         *  输出：
         * [null, null, null, 2, 1, -1]
         */
        StackOfPlates stackOfPlates = new StackOfPlates(1);
        stackOfPlates.push(1);
        stackOfPlates.push(2);
        System.out.println(stackOfPlates.popAt(1));
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        /**
         * 示例2:
         *  输入：
         * ["StackOfPlates", "push", "push", "push", "popAt", "popAt", "popAt"]
         * [[2], [1], [2], [3], [0], [0], [0]]
         *  输出：
         * [null, null, null, null, 2, 1, 3]
         */
        stackOfPlates = new StackOfPlates(2);
        stackOfPlates.push(1);
        stackOfPlates.push(2);
        stackOfPlates.push(3);
        System.out.println(stackOfPlates.popAt(0));
        System.out.println(stackOfPlates.popAt(0));
        System.out.println(stackOfPlates.popAt(0));
    }
}
