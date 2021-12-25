package com.leetcode.L1601_1700.L1609;

import com.util.TreeNode;

public class EvenOddTreeTest {
    public static void main(String[] args) {
        EvenOddTree evenOddTree = new EvenOddTree();
        /**
         * 示例 1：
         * 输入：root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
         * 输出：true
         * 解释：每一层的节点值分别是：
         * 0 层：[1]
         * 1 层：[10,4]
         * 2 层：[3,7,9]
         * 3 层：[12,8,6,2]
         * 由于 0 层和 2 层上的节点值都是奇数且严格递增，而 1 层和 3 层上的节点值都是偶数且严格递减，因此这是一棵奇偶树。
         */
        TreeNode rll = new TreeNode(3,new TreeNode(12),new TreeNode(8));
        TreeNode rl = new TreeNode(10,rll,null);
        TreeNode rr = new TreeNode(4,new TreeNode(7,new TreeNode(6),null),new TreeNode(9,null,new TreeNode(2)));
        System.out.println(evenOddTree.isEvenOddTree(new TreeNode<>(1, rl, rr)));
        /**
         * 示例 2：
         * 输入：root = [5,4,2,3,3,7]
         * 输出：false
         * 解释：每一层的节点值分别是：
         * 0 层：[5]
         * 1 层：[4,2]
         * 2 层：[3,3,7]
         * 2 层上的节点值不满足严格递增的条件，所以这不是一棵奇偶树。
         */
        System.out.println(evenOddTree.isEvenOddTree(new TreeNode<>(5, new TreeNode(4, new TreeNode(3), new TreeNode(3)), new TreeNode(2, new TreeNode(7), null))));
        /**
         * 示例 3：
         * 输入：root = [5,9,1,3,5,7]
         * 输出：false
         * 解释：1 层上的节点值应为偶数。
         */
        System.out.println(evenOddTree.isEvenOddTree(new TreeNode<>(5, new TreeNode(9, new TreeNode(3), new TreeNode(5)), new TreeNode(1, new TreeNode(7), null))));

    }
}
