package com.leetcode.L601_700.L0623;

import com.util.TreeNode;

public class AddOneRowTreeTest {
    public static void main(String[] args) {
        AddOneRowTree addOneRowTree = new AddOneRowTree();
        /**
         * 示例 1:
         * 输入: root = [4,2,6,3,1,5], val = 1, depth = 2
         * 输出: [4,1,1,2,null,null,6,3,1,5]
         */
        System.out.println(addOneRowTree.addOneRow(new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(1)), new TreeNode(6, new TreeNode(5), null)), 1, 2));
        /**
         * 示例 2:
         * 输入: root = [4,2,null,3,1], val = 1, depth = 3
         * 输出:  [4,2,null,1,1,3,null,null,1]
         */
    }
}
