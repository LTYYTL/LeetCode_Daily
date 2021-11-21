package com.leetcode.L501_600.L0559;

import java.util.ArrayList;

public class MaxDepthNTreeTest {
    public static void main(String[] args) {
        MaxDepthNTree maxDepthNTree = new MaxDepthNTree();
        /**
         * 示例 1：
         * 输入：root = [1,null,3,2,4,null,5,6]
         * 输出：3
         */
        Node n3 = new Node(3,new ArrayList<>(){{
            add(new Node(5));
            add(new Node(6));
        }});
        Node n1 = new Node(1,new ArrayList<>(){{
            add(n3);
            add(new Node(2));
            add(new Node(4));
        }});
        System.out.println(maxDepthNTree.maxDepth(n1));
        /**
         * 示例 2：
         * 输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
         * 输出：5
         */
    }
}
