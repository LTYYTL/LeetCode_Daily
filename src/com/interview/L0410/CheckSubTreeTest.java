package com.interview.L0410;

import com.util.TreeNode;

public class CheckSubTreeTest {
    public static void main(String[] args) {
        CheckSubTree checkSubTree = new CheckSubTree();
        /**
         * 示例1:
         *  输入：t1 = [1, 2, 3], t2 = [2]
         *  输出：true
         */
        TreeNode rl = new TreeNode(2);
        TreeNode rr = new TreeNode(3);
        System.out.println(checkSubTree.checkSubTree(new TreeNode(1, rl, rr), rl));

    }
}
