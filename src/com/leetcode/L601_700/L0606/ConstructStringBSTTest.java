package com.leetcode.L601_700.L0606;

import com.util.TreeNode;

public class ConstructStringBSTTest {
    public static void main(String[] args) {
        ConstructStringBST constructStringBST = new ConstructStringBST();
        /*
          示例 1:
          输入: 二叉树: [1,2,3,4]
                 1
               /   \
              2     3
             /
            4
          输出: "1(2(4))(3)"
          解释: 原本将是“1(2(4)())(3())”，
          在你省略所有不必要的空括号对之后，
          它将是“1(2(4))(3)”。
         */
        System.out.println(constructStringBST.tree2str(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null), new TreeNode(3))));
        /*
          示例 2:
          输入: 二叉树: [1,2,3,null,4]
                 1
               /   \
              2     3
               \
                4
          输出: "1(2()(4))(3)"
          解释: 和第一个示例相似，
          除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
         */
        System.out.println(constructStringBST.tree2str(new TreeNode(1,
                new TreeNode(2, null, new TreeNode(4)), new TreeNode(3))));
    }
}
