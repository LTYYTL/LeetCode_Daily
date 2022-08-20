package com.leetcode.L101_200.L0104;

import com.util.TreeNode;

public class BinaryTreeDepthTest {
    public static void main(String[] args) {
        BinaryTreeDepth binaryTreeDepth = new BinaryTreeDepth();
        /*
          示例：
          给定二叉树 [3,9,20,null,null,15,7]，
              3
             / \
            9  20
              /  \
             15   7
          返回它的最大深度 3 。
         */
        TreeNode<Integer> root = new TreeNode(3);
        TreeNode<Integer> rl = new TreeNode(9);
        TreeNode<Integer> rr = new TreeNode(20);
        TreeNode<Integer> rrl = new TreeNode(15);
        TreeNode<Integer> rrr = new TreeNode(7);

        root.left = rl;
        root.right = rr;
        rr.left = rrl;
        rr.right = rrr;

        System.out.println(root);
        //方法一：递归
        System.out.println(binaryTreeDepth.maxDepth(root));
        //方法二：深度优先搜索
        System.out.println(binaryTreeDepth.maxDepth_DFS(root));
        //方法三：广度优先搜索
        System.out.println(binaryTreeDepth.maxDepth_BFS(root));


    }
}
