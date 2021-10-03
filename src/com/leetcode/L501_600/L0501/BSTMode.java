package com.leetcode.L501_600.L0501;

import com.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 501. 二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 *
 * 假定 BST 有如下定义：
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 *
 * 例如：
 * 给定 BST [1,null,2,2],
 *
 *    1
 *     \
 *      2
 *     /
 *    2
 * 返回[2].
 *
 * 提示：如果众数超过1个，不需考虑输出顺序
 * 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
 */
public class BSTMode {
    List<Integer> list = new ArrayList<>();
    //当前节点值
    int current = 0;
    //当前节点的数量
    int count = 0;
    //最大重复数
    int max = 0;

    /**
     * 方法：递归
     * 原理：二叉搜索树的中序遍历是一个有序数列
     * @param root
     * @return
     */
    public int[] findMode(TreeNode<Integer> root) {
        inOrder(root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }

    /**
     * 递归的中序遍历
     * @param root
     */
    private void inOrder(TreeNode<Integer> root) {
        //终止条件
        if (root == null)
            return;
        //遍历左子树
        inOrder(root.left);

        //获取当前节点值
        int temp = root.val;
        if (temp == current){
            //如果节点值等于current，count就加1
            count++;
        }else {
            //否则，就表示遇到了一个新的值，current和count都要
            //重新赋值
            current = temp;
            count = 1;
        }

        if (count == max){
            //如果count == maxCount，就把当前节点加入到集合中
            list.add(temp);
        }else if (count > max){
            //否则，当前节点的值重复量是最多的，直接把list清空，然后
            //把当前节点的值加入到集合中
            list.clear();
            list.add(temp);
            max = count;
        }

        //遍历右子树
        inOrder(root.right);

    }

    /**
     * 迭代的中序遍历
     * @param root
     */
    private void inOrder_iteration(TreeNode<Integer> root) {
        //终止条件
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }

            //获取当前节点值
            root = stack.pop();
            int temp = root.val;
            if (temp == current){
                //如果节点值等于current，count就加1
                count++;
            }else {
                //否则，就表示遇到了一个新的值，current和count都要
                //重新赋值
                current = temp;
                count = 1;
            }

            if (count == max){
                //如果count == maxCount，就把当前节点加入到集合中
                list.add(temp);
            }else if (count > max){
                //否则，当前节点的值重复量是最多的，直接把list清空，然后
                //把当前节点的值加入到集合中
                list.clear();
                list.add(temp);
                max = count;
            }

            root = root.right;
        }


    }
}
