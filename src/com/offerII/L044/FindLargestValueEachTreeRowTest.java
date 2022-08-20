package com.offerII.L044;

import com.util.TreeNode;

public class FindLargestValueEachTreeRowTest {
    public static void main(String[] args) {
        FindLargestValueEachTreeRow findLargestValueEachTreeRow = new FindLargestValueEachTreeRow();
        /* * 示例1：
          输入: root = [1,3,2,5,3,null,9]
          输出: [1,3,9]
          解释:
                    1
                   / \
                  3   2
                 / \   \
                5   3   9
         */
        TreeNode rl = new TreeNode(3, new TreeNode(5), new TreeNode(3));
        TreeNode rr = new TreeNode(2, null, new TreeNode(9));
        System.out.println(findLargestValueEachTreeRow.largestValues(new TreeNode(1, rl, rr)));

        /*
          示例2：
          输入: root = [1,2,3]
          输出: [1,3]
          解释:
                    1
                   / \
                  2   3
         */
        System.out.println(findLargestValueEachTreeRow.largestValues(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        /*
          示例3：
          输入: root = [1]
          输出: [1]
         */
        System.out.println(findLargestValueEachTreeRow.largestValues(new TreeNode(1)));
        /*
          示例4：
          输入: root = [1,null,2]
          输出: [1,2]
          解释:
                     1
                      \
                       2
         */
        System.out.println(findLargestValueEachTreeRow.largestValues(new TreeNode(1, null, new TreeNode(2))));
        /*
          示例5：
          输入: root = []
          输出: []
         */
        System.out.println(findLargestValueEachTreeRow.largestValues(null));
    }
}
