package com.leetcode.L901_1000.L0998;

import com.util.TreeNode;

public class MaxBinaryTreeIITest {
    public static void main(String[] args) {
        MaxBinaryTreeII maxBinaryTreeII = new MaxBinaryTreeII();
        /*
          示例 1：
          输入：root = [4,1,3,null,null,2], val = 5
          输出：[5,4,null,1,3,null,null,2]
          解释：a = [1,4,2,3], b = [1,4,2,3,5]
         */
        System.out.println(maxBinaryTreeII.insertIntoMaxTree(new TreeNode(4, new TreeNode(1), new TreeNode(3, new TreeNode(2), null)), 5));
        /*
          示例 2：
          输入：root = [5,2,4,null,1], val = 3
          输出：[5,2,4,null,1,null,3]
          解释：a = [2,1,5,4], b = [2,1,5,4,3]
         */
        /*
          示例 3：
          输入：root = [5,2,3,null,1], val = 4
          输出：[5,2,4,null,1,3]
          解释：a = [2,1,5,3], b = [2,1,5,3,4]
         */
    }
}
