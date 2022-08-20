package com.interview.L0403;

import com.util.ListNode;
import com.util.TreeNode;

public class ListDepthTest {
    public static void main(String[] args) {
        ListDepth listDepth = new ListDepth();
        /*
          示例：
          输入：[1,2,3,4,5,null,7,8]

                  1
                 /  \
                2    3
               / \    \
              4   5    7
             /
            8

          输出：[[1],[2,3],[4,5,7],[8]]
         */
        TreeNode rl = new TreeNode(2, new TreeNode(4, new TreeNode(8), null), new TreeNode(5));
        TreeNode rr = new TreeNode(3, null, new TreeNode(7));
        for (ListNode listNode : listDepth.listOfDepth(new TreeNode(1, rl, rr))) {
            System.out.println(listNode);
        }
    }
}
