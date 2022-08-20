package com.offer.L0260;

import com.util.TreeNode;

public class TreeSubstructureTest {
    public static void main(String[] args) {
        TreeSubstructure treeSubstructure = new TreeSubstructure();
        /*
          示例 1：
          输入：A = [3,4,5,1,2], B = [4,1]
          输出：true
         */
        TreeNode rll = new TreeNode(1);
        TreeNode rlr = new TreeNode(2);
        TreeNode rl = new TreeNode(4, rll, rlr);

        TreeNode rr = new TreeNode(5);
        TreeNode A = new TreeNode(3, rl, rr);

        System.out.println(treeSubstructure.isSubStructure(A, rl));
    }
}
