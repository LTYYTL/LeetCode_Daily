package com.leetcode.L1601_1700.L1609;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1609. 奇偶树
 * 如果一棵二叉树满足下述几个条件，则可以称为 奇偶树 ：
 * (1)二叉树根节点所在层下标为 0 ，根的子节点所在层下标为 1 ，根的孙节点所在层下标为 2 ，依此类推。
 * (2)偶数下标 层上的所有节点的值都是 奇 整数，从左到右按顺序 严格递增
 * (3)奇数下标 层上的所有节点的值都是 偶 整数，从左到右按顺序 严格递减
 * 给你二叉树的根节点，如果二叉树为 奇偶树 ，则返回 true ，否则返回 false 。
 *
 * 示例 1：
 * 输入：root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
 * 输出：true
 * 解释：每一层的节点值分别是：
 * 0 层：[1]
 * 1 层：[10,4]
 * 2 层：[3,7,9]
 * 3 层：[12,8,6,2]
 * 由于 0 层和 2 层上的节点值都是奇数且严格递增，而 1 层和 3 层上的节点值都是偶数且严格递减，因此这是一棵奇偶树。
 *
 * 示例 2：
 * 输入：root = [5,4,2,3,3,7]
 * 输出：false
 * 解释：每一层的节点值分别是：
 * 0 层：[5]
 * 1 层：[4,2]
 * 2 层：[3,3,7]
 * 2 层上的节点值不满足严格递增的条件，所以这不是一棵奇偶树。
 *
 * 示例 3：
 * 输入：root = [5,9,1,3,5,7]
 * 输出：false
 * 解释：1 层上的节点值应为偶数。
 *
 * 示例 4：
 * 输入：root = [1]
 * 输出：true
 *
 * 示例 5：
 * 输入：root = [11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17]
 * 输出：true
 *
 * 提示：
 * 树中节点数在范围 [1, 105] 内
 * 1 <= Node.val <= 106
 */
public class EvenOddTree {
    /**
     * 方法：广度优先搜索
     */
    public boolean isEvenOddTree(TreeNode root) {
        //存储节点
        Queue<TreeNode> queue = new LinkedList<>();
        //根节点加入队列
        queue.offer(root);
        //层号
        int step = 0;
        //遍历
        while (!queue.isEmpty()) {
            //当前层节点个数
            int size = queue.size();
            //前一个数
            int pre = 0;
            //遍历
            for (int i = 0; i < size; i++) {
                //队首节点出队
                TreeNode cur = queue.poll();
                //左子树不为空加入队列
                if (cur.left != null)
                    queue.offer(cur.left);
                //右子树不为空加入队列
                if (cur.right != null)
                    queue.offer(cur.right);
                //当前层第一个节点，没有前一个节点
                if (i == 0){
                    //在偶数层，但是是偶数，返回false
                    if (step % 2 == 0 && cur.val % 2 == 0)
                        return false;
                    //在奇数层，但是是奇数，返回false
                    if (step % 2 != 0 && cur.val % 2 != 0)
                        return false;
                    //记录数值，作为下一个节点的前节点
                    pre = cur.val;
                    continue;
                }
                //偶数层
                if (step % 2 == 0){
                    //不是奇数或者不是严格递增，返回false
                    if (cur.val % 2 == 0 || pre >= cur.val)
                        return false;
                }else {//奇数层
                    //不是偶数或者不是严格递减，返回false
                    if (cur.val % 2 != 0 || pre <= cur.val)
                        return false;
                }
                //记录数值，作为下一个节点的前节点
                pre = cur.val;
            }
            //层号+1
            step++;
        }
        return true;
    }
}
