package com.interview.L0402;

import com.util.TreeNode;

/**
 * 面试题 04.02. 最小高度树
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 *
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *           0
 *          / \
 *        -3   9
 *        /   /
 *      -10  5
 */
public class ConvertSortedArrayBinarySearchTree {
    /**
     * 方法：递归
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArray(nums,0,nums.length - 1);
    }

    /**
     * 二分查找
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private TreeNode sortedArray(int[] nums, int left, int right) {
        if (left > right)
            return null;
        //中间的数
        int mid = (right - left) /2 + left;
        //以中间的数为根节点
        TreeNode root = new TreeNode(nums[mid]);
        //左区间
        root.left = sortedArray(nums,left,mid-1);
        //右区间
        root.right = sortedArray(nums,mid+1,right);
        return root;
    }
}
