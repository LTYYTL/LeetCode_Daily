package com.leetcode.L501_600.L0563;

import com.util.TreeNode;

public class BinaryTreeTiltTest {
    public static void main(String[] args) {
        BinaryTreeTilt binaryTreeTilt = new BinaryTreeTilt();
        /*
          示例 1：
          输入：root = [1,2,3]
          输出：1
          解释：
          节点 2 的坡度：|0-0| = 0（没有子节点）
          节点 3 的坡度：|0-0| = 0（没有子节点）
          节点 1 的坡度：|2-3| = 1（左子树就是左子节点，所以和是 2 ；右子树就是右子节点，所以和是 3 ）
          坡度总和：0 + 0 + 1 = 1
         */
        System.out.println(binaryTreeTilt.findTilt(new TreeNode<>(1, new TreeNode(2), new TreeNode(3))));
        /*
          示例 2：
          输入：root = [4,2,9,3,5,null,7]
          输出：15
          解释：
          节点 3 的坡度：|0-0| = 0（没有子节点）
          节点 5 的坡度：|0-0| = 0（没有子节点）
          节点 7 的坡度：|0-0| = 0（没有子节点）
          节点 2 的坡度：|3-5| = 2（左子树就是左子节点，所以和是 3 ；右子树就是右子节点，所以和是 5 ）
          节点 9 的坡度：|0-7| = 7（没有左子树，所以和是 0 ；右子树正好是右子节点，所以和是 7 ）
          节点 4 的坡度：|(3+5+2)-(9+7)| = |10-16| = 6（左子树值为 3、5 和 2 ，和是 10 ；右子树值为 9 和 7 ，和是 16 ）
          坡度总和：0 + 0 + 0 + 2 + 7 + 6 = 15
         */
        TreeNode rl = new TreeNode(2, new TreeNode(3), new TreeNode(5));
        TreeNode rr = new TreeNode(9, null, new TreeNode(7));
        System.out.println(binaryTreeTilt.findTilt(new TreeNode<>(4, rl, rr)));
        /*
          示例 3：
          输入：root = [21,7,14,1,1,2,2,3,3]
          输出：9
         */
        TreeNode rll = new TreeNode(1, new TreeNode(3), new TreeNode(3));
        rl = new TreeNode(7, rll, new TreeNode(1));
        rr = new TreeNode(14, new TreeNode(2), new TreeNode(2));
        System.out.println(binaryTreeTilt.findTilt(new TreeNode<>(21, rl, rr)));

    }
}
