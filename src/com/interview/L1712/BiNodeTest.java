package com.interview.L1712;

import com.util.TreeNode;

public class BiNodeTest {
    public static void main(String[] args) {
        BiNode biNode = new BiNode();
        /**
         * 示例：
         * 输入： [4,2,5,1,3,null,6,0]
         * 输出： [0,null,1,null,2,null,3,null,4,null,5,null,6]
         */
        TreeNode rll = new TreeNode(1,new TreeNode(0),null);
        TreeNode rl = new TreeNode(2,rll,new TreeNode(3));
        TreeNode rr = new TreeNode(5,null,new TreeNode(6));
        System.out.println(biNode.convertBiNode(new TreeNode(4, rl, rr)));
    }
}
