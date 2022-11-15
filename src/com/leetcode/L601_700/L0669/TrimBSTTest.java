package com.leetcode.L601_700.L0669;

import com.util.TreeNode;

public class TrimBSTTest {
    public static void main(String[] args) {
        TrimBST trimBST = new TrimBST();
        /*
          示例 1：
          输入：root = [1,0,2], low = 1, high = 2
          输出：[1,null,2]
         */
        System.out.println(trimBST.trimBST(new TreeNode(new Integer[]{1, 0, 2}).root, 1, 2));
        /*
          示例 2：
          输入：root = [3,0,4,null,2,null,null,1], low = 1, high = 3
          输出：[3,2,null,1]
         */
        System.out.println(trimBST.trimBST(new TreeNode(new Integer[]{3, 0, 4, null, 2, null, null, 1}).root, 1, 3));
    }
}
