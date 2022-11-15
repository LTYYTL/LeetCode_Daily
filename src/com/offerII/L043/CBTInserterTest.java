package com.offerII.L043;

import com.util.TreeNode;

public class CBTInserterTest {
    public static void main(String[] args) {
        /*
          示例 1：
          输入：inputs = ["CBTInserter","insert","get_root"], inputs = [[[1]],[2],[]]
          输出：[null,1,[1,2]]
         */
        CBTInserter cbtInserter = new CBTInserter(new TreeNode(1));
        System.out.println(cbtInserter.insert(2));
        System.out.println(cbtInserter.get_root());
        /*
          示例 2：
          输入：inputs = ["CBTInserter","insert","insert","get_root"], inputs = [[[1,2,3,4,5,6]],[7],[8],[]]
          输出：[null,3,4,[1,2,3,4,5,6,7,8]]
         */
        TreeNode rll = new TreeNode(4);
        TreeNode rlr = new TreeNode(5);
        TreeNode rl = new TreeNode(2, rll, rlr);

        TreeNode rrl = new TreeNode(6);
        TreeNode rr = new TreeNode(3, rrl, null);

        TreeNode root = new TreeNode(1, rl, rr);
        CBTInserter cbtInserter1 = new CBTInserter(root);
        System.out.println(cbtInserter1.insert(7));
        System.out.println(cbtInserter1.insert(8));
        System.out.println(cbtInserter1.get_root());
    }
}
