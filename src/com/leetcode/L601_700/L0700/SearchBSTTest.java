package com.leetcode.L601_700.L0700;

import com.util.TreeNode;

public class SearchBSTTest {
    public static void main(String[] args) {
        SearchBST searchBST = new SearchBST();

        /*
          例如，
          给定二叉搜索树:

                  4
                 / \
                2   7
               / \
              1   3
          和值: 2
          你应该返回如下子树:

                2
               / \
              1   3
          在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。
         */
        //构建二叉树
        TreeNode root = new TreeNode(4);
        TreeNode rl = new TreeNode(2);
        TreeNode rr = new TreeNode(7);
        TreeNode rll = new TreeNode(1);
        TreeNode rlr = new TreeNode(3);

        root.left = rl;
        root.right = rr;
        rl.left = rll;
        rl.right = rlr;

        //输出二叉树
        System.out.println(root);
        //方法一：递归
        System.out.println(searchBST.searchBST(root, 2));
        //方法二：迭代
        System.out.println(searchBST.searchBST_iteration(root,2));
    }
}
