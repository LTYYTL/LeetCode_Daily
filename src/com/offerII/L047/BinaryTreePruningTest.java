package com.offerII.L047;

import com.util.TreeNode;

public class BinaryTreePruningTest {
    public static void main(String[] args) {
        BinaryTreePruning binaryTreePruning = new BinaryTreePruning();
        /*
          示例 1:
          输入: [1,null,0,0,1]
          输出: [1,null,0,null,1]
          解释:
          只有红色节点满足条件“所有不包含 1 的子树”。
          右图为返回的答案。
         */
        System.out.println(binaryTreePruning.pruneTree(new TreeNode(1, null, new TreeNode(0, new TreeNode(0), new TreeNode(1)))));
        /*
          示例 2:
          输入: [1,0,1,0,0,0,1]
          输出: [1,null,1,null,1]
          解释:
         */
        TreeNode rl = new TreeNode(0, new TreeNode(0), new TreeNode(0));
        TreeNode rr = new TreeNode(1, new TreeNode(0), new TreeNode(1));
        System.out.println(binaryTreePruning.pruneTree(new TreeNode(1, rl, rr)));
        /*
          示例 3:
          输入: [1,1,0,1,1,0,1,0]
          输出: [1,1,0,1,1,null,1]
          解释:
         */
    }
}
