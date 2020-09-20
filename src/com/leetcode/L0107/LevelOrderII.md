## [二叉树的层序遍历II](https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/)

## 题目描述
```
给定一个二叉树，返回其节点值自底向上的层次遍历。 
（即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

例如：
给定二叉树 [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
返回其自底向上的层次遍历为：
[
  [15,7],
  [9,20],
  [3]
]
```

## 难度：简单

## 方法

#### 1.广度优先搜索
- 思路
```
通过应用队列完成广度优先搜索
1、构建queue队列，用于储存同一层的节点，即当前队列长度为本层有的节点数
2、用while循环来保证树中所有点都访问过
3、循环遍历队列中同层的节点，并将其节点值存入到层list中，在循环过程中还要判断当前节点是否有左、右子树，有将其加入队列中
4、同层循环遍历遍历结束后，将层list添加到结果list中，重复步骤3，继续下一层的遍历
5、完全遍历完成后，所得结果为从顶向下的层序遍历结果，用Collections的反转方法反转即可
```
- 图示

![LevelOrderII_BFS](https://github.com/LTYYTL/LeetCode_Daily/blob/master/src/com/leetcode/L0107/LevelOrderII_BFS.png)

- 代码

```java_holder_method_tree
    /**
     * 方法一：广度优先遍历
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        //空树
        if (root == null){
            return res;
        }
        //节点队列
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        //将根节点添加到队列
        queue.add(root);
        //队列为空，跳出循环
        while (!queue.isEmpty()){
            //获得当前队列的长度，即本层的节点数
            int size = queue.size();
            //临时变量
            List<Integer> list = new ArrayList<>();
            //将本层节点循环输出
            for (int i = 0; i < size; i++){
                //获得当前队首节点
                TreeNode<Integer> temp = queue.poll();
                list.add(temp.val);
                //将当前节点的孩子放入队列中
                if (temp.left != null)
                    queue.add(temp.left);

                if (temp.right != null)
                    queue.add(temp.right);
            }
            res.add(list);
        }
        //反转
        Collections.reverse(res);
        return res;
    }
```
