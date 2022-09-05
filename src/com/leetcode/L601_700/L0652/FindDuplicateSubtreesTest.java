package com.leetcode.L601_700.L0652;

import com.util.TreeNode;

public class FindDuplicateSubtreesTest {
    public static void main(String[] args) {
        FindDuplicateSubtrees findDuplicateSubtrees = new FindDuplicateSubtrees();
        /* * 示例 1：
          输入：root = [1,2,3,4,null,2,4,null,null,4]
          输出：[[2,4],[4]]
         */
        System.out.println(findDuplicateSubtrees.findDuplicateSubtrees(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, new TreeNode(2, new TreeNode(4), null), new TreeNode(4)))));
        /*
          示例 2：
          输入：root = [2,1,1]
          输出：[[1]]
         */
        System.out.println(findDuplicateSubtrees.findDuplicateSubtrees(new TreeNode(2,
                new TreeNode(1),
                new TreeNode(1))));
        /*
          示例 3：
          输入：root = [2,2,2,3,null,3,null]
          输出：[[2,3],[3]]
         */
    }
}
