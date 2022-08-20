package com.interview.L0301;

public class TripleInOneTest {
    public static void main(String[] args) {

        /* * 示例1:
           输入：
          ["TripleInOne", "push", "push", "pop", "pop", "pop", "isEmpty"]
          [[1], [0, 1], [0, 2], [0], [0], [0], [0]]
           输出：
          [null, null, null, 1, -1, -1, true]
          说明：当栈为空时`pop, peek`返回-1，当栈满时`push`不压入元素。
         */
        TripleInOne tripleInOne = new TripleInOne(1);
        tripleInOne.push(0, 1);
        tripleInOne.push(0, 2);
        System.out.println(tripleInOne.pop(0));
        System.out.println(tripleInOne.pop(0));
        System.out.println(tripleInOne.pop(0));
        System.out.println(tripleInOne.isEmpty(0));
        /*
          示例2:
           输入：
          ["TripleInOne", "push", "push", "push", "pop", "pop", "pop", "peek"]
          [[2], [0, 1], [0, 2], [0, 3], [0], [0], [0], [0]]
           输出：
          [null, null, null, null, 2, 1, -1, -1]
         */
    }
}
