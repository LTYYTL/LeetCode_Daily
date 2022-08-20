package com.interview.L0402;

public class ConvertSortedArrayBinarySearchTreeTest {
    public static void main(String[] args) {
        ConvertSortedArrayBinarySearchTree convertSortedArrayBinarySearchTree = new ConvertSortedArrayBinarySearchTree();
        /*
          示例 1：
          输入：nums = [-10,-3,0,5,9]
          输出：[0,-3,9,-10,null,5]
          解释：[0,-10,5,null,-3,null,9] 也将被视为正确答案：
         */
        System.out.println(convertSortedArrayBinarySearchTree.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
        /*
          示例 2：
          输入：nums = [1,3]
          输出：[3,1]
          解释：[1,3] 和 [3,1] 都是高度平衡二叉搜索树。
         */
        System.out.println(convertSortedArrayBinarySearchTree.sortedArrayToBST(new int[]{1, 3}));
    }
}
