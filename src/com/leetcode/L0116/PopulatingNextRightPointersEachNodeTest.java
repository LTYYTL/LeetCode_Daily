package com.leetcode.L0116;

import com.util.Node;

public class PopulatingNextRightPointersEachNodeTest {
    public static void main(String[] args) {
        PopulatingNextRightPointersEachNode populatingNextRightPointersEachNode = new PopulatingNextRightPointersEachNode();
        Node rll = new Node(4);
        Node rlr = new Node(5);
        Node rrl = new Node(6);
        Node rrr = new Node(7);
        Node rl = new Node(2,rll,rlr,null);
        Node rr = new Node(3,rrl,rrr,null);
        Node root = new Node(1,rl,rr,null);
        System.out.println(root);

        System.out.println(populatingNextRightPointersEachNode.connect(root));
    }
}
