package com.leetcode.L1301_1400.L1305;

import com.util.TreeNode;

public class AllElementsBSTTest {
    public static void main(String[] args) {
        AllElementsBST allElementsBST = new AllElementsBST();
        /*
          示例 1：
          输入：root1 = [2,1,4], root2 = [1,0,3]
          输出：[0,1,1,2,3,4]
         */
        System.out.println(allElementsBST.getAllElements(new TreeNode(2, new TreeNode(1), new TreeNode(4)), new TreeNode(1, new TreeNode(0), new TreeNode(3))));
        /*
          示例 2：
          输入：root1 = [1,null,8], root2 = [8,1]
          输出：[1,1,8,8]
         */
        System.out.println(allElementsBST.getAllElements(new TreeNode(1, null, new TreeNode(8)), new TreeNode(8, new TreeNode(1), null)));

    }
}
