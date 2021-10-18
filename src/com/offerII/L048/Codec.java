package com.offerII.L048;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer II 048. 序列化与反序列化二叉树
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * 提示: 输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 *
 * 示例 1：
 * 输入：root = [1,2,3,null,null,4,5]
 * 输出：[1,2,3,null,null,4,5]
 *
 * 示例 2：
 * 输入：root = []
 * 输出：[]
 *
 * 示例 3：
 * 输入：root = [1]
 * 输出：[1]
 *
 * 示例 4：
 * 输入：root = [1,2]
 * 输出：[1,2]
 *
 * 提示：
 * 树中结点数在范围 [0, 104] 内
 * -1000 <= Node.val <= 1000
 */
public class Codec {

    String SEP = ",";
    String NULL = "#";

    /**
     * 方法一：前序遍历
     * @param root
     * @return
     */
    public String serialize_pre(TreeNode<Integer> root){
        StringBuilder sb = new StringBuilder();
        preOrder(root, sb);
        return sb.toString();
    }
    private void preOrder(TreeNode<Integer> root, StringBuilder sb) {
        if (root == null){
            sb.append(NULL).append(SEP);
            return;
        }
        sb.append(root.val).append(SEP);
        preOrder(root.left,sb);
        preOrder(root.right,sb);
    }

    public TreeNode deserialize_pre(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s : data.split(SEP)) {
            nodes.add(s);
        }
        return deserialize_pre(nodes);
    }

    private TreeNode deserialize_pre(LinkedList<String> nodes) {
        if (nodes.isEmpty())
            return null;
        //取队首元素
        String first = nodes.removeFirst();
        if (first.equals(NULL))
            return null;
        //转换成数字
        TreeNode<Integer> root = new TreeNode<>(Integer.parseInt(first));
        root.left = deserialize_pre(nodes);
        root.right = deserialize_pre(nodes);;
        return root;
    }

    /**
     * 方法二：后序遍历
     * @param root
     * @return
     */
    public String serialize_last(TreeNode<Integer> root){
        StringBuilder sb = new StringBuilder();
        lastOrder(root, sb);
        return sb.toString();
    }
    private void lastOrder(TreeNode<Integer> root, StringBuilder sb) {
        if (root == null){
            sb.append(NULL).append(SEP);
            return;
        }

        lastOrder(root.left,sb);
        lastOrder(root.right,sb);
        sb.append(root.val).append(SEP);
    }

    public TreeNode deserialize_last(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s : data.split(SEP)) {
            nodes.add(s);
        }
        return deserialize_last(nodes);
    }

    private TreeNode deserialize_last(LinkedList<String> nodes) {
        if (nodes.isEmpty())
            return null;
        //取队尾元素
        String last = nodes.removeLast();
        if (last.equals(NULL))
            return null;
        //转换成数字
        TreeNode<Integer> root = new TreeNode<>(Integer.parseInt(last));
        //先构造右子树，在构造左子树
        root.right = deserialize_last(nodes);
        root.left = deserialize_last(nodes);;
        return root;
    }

    /**
     * 方法三：层序遍历
     * @param root
     * @return
     */
    public String serialize(TreeNode<Integer> root) {
        if (root == null)
            return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode<Integer> cur = queue.poll();
            /*层序遍历代代码*/
            if (cur == null){
                sb.append(NULL).append(SEP);
                continue;
            }

            sb.append(cur.val).append(SEP);

            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        //空置情况
        if (data.isEmpty())
            return null;
        String[] nodes = data.split(SEP);
        TreeNode<Integer> root = new TreeNode<>(Integer.parseInt(nodes[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < nodes.length;) {
            //在队里中的都是父节点
            TreeNode<Integer> parent = queue.poll();
            //左子树
            String left = nodes[i++];
            if (!left.equals(NULL)){
                parent.left = new TreeNode(Integer.parseInt(left));
                queue.offer(parent.left);
            }else {
                parent.left = null;
            }

            //右子树
            String right = nodes[i++];
            if (!right.equals(NULL)){
                parent.right = new TreeNode(Integer.parseInt(right));
                queue.offer(parent.right);
            }else {
                parent.right = null;
            }
        }
        return root;
    }
}
