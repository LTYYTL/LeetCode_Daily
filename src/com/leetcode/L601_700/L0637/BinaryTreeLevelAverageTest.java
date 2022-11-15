package com.leetcode.L601_700.L0637;

import com.util.TreeNode;

public class BinaryTreeLevelAverageTest {
    public static void main(String[] args) {
        BinaryTreeLevelAverage binaryTreeLevelAverage = new BinaryTreeLevelAverage();
        /*
          示例 1：
          输入：
              3
             / \
            9  20
              /  \
             15   7
          输出：[3, 14.5, 11]
          解释：
          第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
         */
        //构建二叉树
        TreeNode r1 = new TreeNode(3);
        TreeNode r2 = new TreeNode(9);
        TreeNode r3 = new TreeNode(20);
        TreeNode r4 = new TreeNode(15);
        TreeNode r5 = new TreeNode(7);
        r1.left = r2;
        r1.right = r3;
        r3.left = r4;
        r3.right = r5;
        System.out.println(binaryTreeLevelAverage.averageOfLevels(r1).toString());
    }
}
