package com.leetcode.L401_500.L0429;

import java.util.ArrayList;
import java.util.List;

public class NTreeLevelTraversalTest {
    public static void main(String[] args) {
        NTreeLevelTraversal nTreeLevelTraversal = new NTreeLevelTraversal();
        /*
          示例 1：
          输入：root = [1,null,3,2,4,null,5,6]
          输出：[[1],[3,2,4],[5,6]]
         */
        List<Node> l3 = new ArrayList<>() {{
            add(new Node(5));
            add(new Node(6));
        }};
        List<Node> l2 = new ArrayList<>() {{
            add(new Node(3, l3));
            add(new Node(2));
            add(new Node(4));
        }};
        Node root = new Node(1, l2);
        System.out.println(nTreeLevelTraversal.levelOrder(root));
        /*
          示例 2：
          输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
          输出：[[1],[2,3,4,5],[6,7,8,9,10],[11,12,13],[14]]
         */
    }
}
