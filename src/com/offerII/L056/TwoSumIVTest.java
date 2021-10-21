package com.offerII.L056;

import com.util.TreeNode;

public class TwoSumIVTest {
    public static void main(String[] args) {
        TwoSumIV twoSumIV = new TwoSumIV();
        /**
         * 示例 1：
         * 输入: root = [5,3,6,2,4,null,7], k = 9
         * 输出: true
         */
        TreeNode rl = new TreeNode(3,new TreeNode(2),new TreeNode(4));
        TreeNode rr = new TreeNode(6,null,new TreeNode(7));
        System.out.println(twoSumIV.findTarget(new TreeNode(5, rl,rr), 9));
        System.out.println(twoSumIV.findTarget_set(new TreeNode(5, rl,rr), 9));
        /**
         * 示例 2：
         * 输入: root = [5,3,6,2,4,null,7], k = 28
         * 输出: false
         */
        System.out.println(twoSumIV.findTarget(new TreeNode(5, rl,rr), 28));
        System.out.println(twoSumIV.findTarget_set(new TreeNode(5, rl,rr), 28));
        /**
         * 示例 3：
         * 输入: root = [2,1,3], k = 4
         * 输出: true
         */
        System.out.println(twoSumIV.findTarget(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 4));
        System.out.println(twoSumIV.findTarget_set(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 4));
        /**
         * 示例 4：
         * 输入: root = [2,1,3], k = 1
         * 输出: false
         */
        System.out.println(twoSumIV.findTarget(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 1));
        System.out.println(twoSumIV.findTarget_set(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 1));
        /**
         * 示例 5：
         * 输入: root = [2,1,3], k = 3
         * 输出: true
         */
        System.out.println(twoSumIV.findTarget(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 3));
        System.out.println(twoSumIV.findTarget_set(new TreeNode(2, new TreeNode(1), new TreeNode(3)), 3));
    }
}
