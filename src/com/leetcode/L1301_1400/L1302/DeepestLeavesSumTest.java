package com.leetcode.L1301_1400.L1302;

import com.util.TreeNode;

public class DeepestLeavesSumTest {
    public static void main(String[] args) {
        DeepestLeavesSum deepestLeavesSum = new DeepestLeavesSum();
        /*
          示例 1：
          输入：root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
          输出：15
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, new TreeNode(7), null),
                        new TreeNode(5)
                ),
                new TreeNode(3,
                        null,
                        new TreeNode(6, null, new TreeNode(8))
                )
        );
        System.out.println(deepestLeavesSum.deepestLeavesSum(root));
        /*
          示例 2：
          输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
          输出：19
         */
    }
}
