package com.leetcode.L101_200.L0102;

import com.util.TreeNode;

public class LevelOrderTest {
    public static void main(String[] args) {
        LevelOrder levelOrder = new LevelOrder();
        /*
          示例：
          二叉树：[3,9,20,null,null,15,7],
              3
             / \
            9  20
              /  \
             15   7
          返回其层次遍历结果：
          [
            [3],
            [9,20],
            [15,7]
          ]
         */
        //构建二叉树
        TreeNode root = new TreeNode(3);
        TreeNode rl = new TreeNode(9);
        TreeNode rr = new TreeNode(20);
        TreeNode rrl = new TreeNode(15);
        TreeNode rrr = new TreeNode(7);

        root.left = rl;
        root.right = rr;
        rr.left = rrl;
        rr.right = rrr;
        //方法一：递归
        System.out.println(levelOrder.levelOrder(root));
        //方法二：广度优先搜索
        System.out.println(levelOrder.levelOrder_BFS(root));

    }
}
