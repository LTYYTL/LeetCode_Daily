package com.leetcode.L501_600.L0501;

import com.util.TreeNode;

import java.util.Arrays;

public class BSTModeTest {
    public static void main(String[] args) {
        BSTMode bstMode = new BSTMode();
        /*
          例如：
          给定 BST [1,null,2,2],

             1
              \
               2
              /
             2
          返回[2].
         */
        TreeNode root = new TreeNode(1);
        TreeNode rr = new TreeNode(2);
        TreeNode rrl = new TreeNode(2);

        root.right = rr;
        rr.left = rrl;

        System.out.println(Arrays.toString(bstMode.findMode(root)));
    }
}
