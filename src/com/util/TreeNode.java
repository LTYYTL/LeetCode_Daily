package com.util;

public class TreeNode<E> {
       public TreeNode root;
       public E val;
       public TreeNode left;
       public TreeNode right;

       public TreeNode(E e) {
             val = e;
       }

    /**
     * 通过数组构建树
     * @param nums
     */
    public TreeNode(E[] nums){
             root = createBinaryTree(nums,0);
    }

    /**
     * 私有方法
     * @param array 数组
     * @param index 节点的位置
     * @return
     */
       private TreeNode createBinaryTree(E[] array, int index) {
               TreeNode tn = null;
               if (index < array.length){
                       E value = array[index];
                       tn = new TreeNode(value);
                       tn.left = createBinaryTree(array, 2*index+1);
                       tn.right = createBinaryTree(array, 2*index+2);
                       return tn;
               }
               return tn;
        }

        @Override
        public String toString() {
                return "TreeNode{" +
                        "val=" + val +
                        ", left=" + left +
                        ", right=" + right +
                        '}';
        }
}
