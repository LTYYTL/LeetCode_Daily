package com.leetcode.L601_700.L0606;

import com.util.TreeNode;

/**
 * 606. 根据二叉树创建字符串
 * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
 * 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 *
 * 示例 1:
 * 输入: 二叉树: [1,2,3,4]
 *        1
 *      /   \
 *     2     3
 *    /
 *   4
 * 输出: "1(2(4))(3)"
 * 解释: 原本将是“1(2(4)())(3())”，
 * 在你省略所有不必要的空括号对之后，
 * 它将是“1(2(4))(3)”。
 *
 * 示例 2:
 * 输入: 二叉树: [1,2,3,null,4]
 *        1
 *      /   \
 *     2     3
 *      \
 *       4
 * 输出: "1(2()(4))(3)"
 * 解释: 和第一个示例相似，
 * 除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
 */
public class ConstructStringBST {
    /**
     * 方法：前序遍历
     * @param root
     * @return
     */
    public String tree2str(TreeNode root) {
        //结果
        StringBuilder str = new StringBuilder();
        //前序遍历
        pre(root,str);
        //对结果进行修饰
        return str.substring(1, str.length() - 1);
    }

    /**
     * 前序遍历
     * @param root
     * @param str
     */
    private void pre(TreeNode root, StringBuilder str) {
        //处理空值
        if (root == null){
            str.append("()");
            return;
        }
        //加入括号
        str.append("(");
        //加入数
        str.append(root.val);
        //左节点存在或者不存在但右节点存在都遍历左节点
        if (root.left != null || root.right != null)
            pre(root.left,str);
        //右节点存在的情况
        if (root.right != null)
            pre(root.right,str);
        str.append(")");
    }
}
