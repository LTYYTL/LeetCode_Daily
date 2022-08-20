package com.offerII.L045;

import com.util.TreeNode;

public class FindBottomLeftTreeValueTest {
    public static void main(String[] args) {
        FindBottomLeftTreeValue findBottomLeftTreeValue = new FindBottomLeftTreeValue();
        /*
          示例 1:
          输入: root = [2,1,3]
          输出: 1
         */
        System.out.println(findBottomLeftTreeValue.findBottomLeftValue(new TreeNode(2, new TreeNode(1), new TreeNode(3))));
        /*
          示例 2:
          输入: [1,2,3,4,null,5,6,null,null,7]
          输出: 7
         */
        TreeNode rl = new TreeNode(2, new TreeNode(4), null);
        TreeNode rr = new TreeNode(3, new TreeNode(5, new TreeNode(7), null), new TreeNode(6));
        TreeNode root = new TreeNode(1, rl, rr);

        System.out.println(findBottomLeftTreeValue.findBottomLeftValue(root));
    }
}
