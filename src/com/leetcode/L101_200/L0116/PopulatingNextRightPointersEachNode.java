package com.leetcode.L101_200.L0116;
import com.util.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 116. 填充每个节点的下一个右侧节点指针
 * 给定一个完美二叉树，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有 next 指针都被设置为 NULL。
 *
 * 示例：
 * 输入：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":null,"right":null,"val":4},"next":null,"right":{"$id":"4","left":null,"next":null,"right":null,"val":5},"val":2},"next":null,"right":{"$id":"5","left":{"$id":"6","left":null,"next":null,"right":null,"val":6},"next":null,"right":{"$id":"7","left":null,"next":null,"right":null,"val":7},"val":3},"val":1}
 * 输出：{"$id":"1","left":{"$id":"2","left":{"$id":"3","left":null,"next":{"$id":"4","left":null,"next":{"$id":"5","left":null,"next":{"$id":"6","left":null,"next":null,"right":null,"val":7},"right":null,"val":6},"right":null,"val":5},"right":null,"val":4},"next":{"$id":"7","left":{"$ref":"5"},"next":null,"right":{"$ref":"6"},"val":3},"right":{"$ref":"4"},"val":2},"next":null,"right":{"$ref":"7"},"val":1}
 * 解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。
 *
 * 提示：
 * 你只能使用常量级额外空间。
 * 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 */
public class PopulatingNextRightPointersEachNode {
    /**
     * 方法：广度优先遍历
     * @param root
     * @return
     */
    public Node connect(Node root) {
        //空值情况
        if (root == null){
            return null;
        }
        //节点队列
        Queue<Node> queue = new LinkedList<>();
        //将根节点加入节点队列
        queue.add(root);
        //队列为空，跳出循环
        while (!queue.isEmpty()){
            //当前队列长度，即本层的节点数
            int size = queue.size();
            //前一个节点
            Node prve = new Node();
            //将本层循环
            for (int i = 0; i < size; i++){
                //获得当前队首节点
                Node node = queue.poll();
                //前一个节点不为空时，将前一节点的next指向当前节点
                if(prve != null)
                    prve.next = node;
                //将当前节点的左孩子加入队列
                if (node.left != null){
                    queue.add(node.left);
                }
                //将当前节点的右孩子加入队列
                if (node.right != null){
                    queue.add(node.right);
                }
                //将当节点作为下一个节点的前一个节点
                prve = node;
            }
        }
        return root;
    }
}
