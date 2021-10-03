package com.leetcode.L1101_1200.L1104;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 1104. 二叉树寻路
 * 在一棵无限的二叉树上，每个节点都有两个子节点，树中的节点 逐行 依次按 “之” 字形进行标记。
 * 如下图所示，在奇数行（即，第一行、第三行、第五行……）中，按从左到右的顺序进行标记；
 * 而偶数行（即，第二行、第四行、第六行……）中，按从右到左的顺序进行标记。
 * 给你树上某一个节点的标号 label，请你返回从根节点到该标号为 label 节点的路径，该路径是由途经的节点标号所组成的。
 *
 * 示例 1：
 * 输入：label = 14
 * 输出：[1,3,4,14]
 *
 * 示例 2：
 * 输入：label = 26
 * 输出：[1,2,6,10,26]
 *
 * 提示：
 * 1 <= label <= 10^6
 */
public class PathInZigzagLabelledBinaryTree {
    /**
     * 方法一：数学
     * @param label
     * @return
     */
    public List<Integer> pathInZigZagTree(int label) {
        // 记录目标数所在层数
        int level = 1;
        while((Math.pow(2,level) - 1) < label){
            level++;
        }
        // 判断当前层
        //偶数层：找到镜像数
        label = level % 2 == 0 ? getReverse(label, level) : label;
        // 存放结果
        LinkedList<Integer> res = new LinkedList<>();
        // 向上找父节点
        while(level > 1){
            // 偶数层就找对应的镜像数
            res.add(level % 2 == 0 ? getReverse(label, level) : label);
            //父节点
            label = label >>>1;
            level--;
        }
        // 题目要我们找的是从小到大的顺序，而我们找到的是从大到小的顺序
        Collections.reverse(res);
        res.addFirst(1);
        return res;
    }

    // 位运算快速求2的幂，
    // 求label的镜像数：
    //2^(level - 1) + 2^level- 1 - label
    public int getReverse(int label, int level) {
        return (1 << level - 1) + (1 << level) - 1 - label;
    }
}
// 用level表示层数的我真是一个伞兵，label和level，真容易看岔
