## [二叉树的层序遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal/)

## 题目描述
```
给你一个二叉树，请你返回其按层序遍历得到的节点值。
（即逐层地，从左到右访问所有节点）。

示例：
二叉树：[3,9,20,null,null,15,7],
     3
    / \
   9  20
     /  \
    15   7
返回其层次遍历结果：
[
  [3],
  [9,20],
  [15,7]
]
```

## 难度：中等

## 方法

#### 1.递归

- 思路
```
通过递归的方式进行层序遍历
1、levelOrder(当前节点，节点所在层数，结果list)
2、分情况讨论：
（1）当前节点为空：直接返回
（2）当前节点所在层数等于结果list长度，即结果list中存在当前层的list
3、将当前节点添加到所在层的list中
4、继续当前节点左子树、右子树的递归调用
```
- 图示

![LevelOrder](https://github.com/LTYYTL/LeetCode_Daily/blob/master/src/com/leetcode/L0102/LevelOrder.png)

- 代码

```java_holder_method_tree
        /** 
         * 方法一：递归
         * @param root
         * @return
         */
        public List<List<Integer>> levelOrder(TreeNode<Integer> root) {
            //结果list
            List<List<Integer>> res = new ArrayList<>();
            //空值情况
            if (root == null)
                return res;
            //调用函数，根节点在0层
            return levelOrder(root,0,res);
        }
    
        /**
         *
         * @param root  当前节点
         * @param level 层数
         * @param res   结果list
         * @return
         */
        private List<List<Integer>> levelOrder(TreeNode<Integer> root, int level, List<List<Integer>> res) {
            //节点为空
            if (root == null)
                return res;
            //当前list长度等于当前层数，
            //因为是从0开始的，当层数为2时，list中已经存在0层，1层，没有2层，但list长度为2
            //在list中加入层的list
            if (res.size() == level){
                res.add(new ArrayList<>());
            }
            //将当前节点的val值添加到其所在层的list中
            res.get(level).add(root.val);
            //左子树，层数+1
            levelOrder(root.left, level+1, res);
            //右子树，层数+1
            levelOrder(root.right, level+1,res);
            return res;
        }
```

#### 2.广度优先搜索
- 思路
```
通过应用队列完成广度优先搜索
1、构建queue队列，用于储存同一层的节点，即当前队列长度为本层有的节点数
2、用while循环来保证树中所有点都访问过
3、循环遍历队列中同层的节点，并将其节点值存入到层list中，在循环过程中还要判断当前节点是否有左、右子树，有将其加入队列中
4、同层循环遍历遍历结束后，将层list添加到结果list中，重复步骤3，继续下一层的遍历
```
- 图示

![LevelOrder_BSF](https://github.com/LTYYTL/LeetCode_Daily/blob/master/src/com/leetcode/L0102/LevelOrder_BSF.png)

- 代码

```java_holder_method_tree
        /**
         * 方法二：广度优先搜索
         * @param root
         * @return
         */
        public List<List<Integer>> levelOrder_BFS(TreeNode<Integer> root){
            //结果list
            List<List<Integer>> res = new ArrayList<>();
            //空值情况
            if (root == null)
                return res;
            //节点队列
            Queue<TreeNode> queue = new LinkedList<>();
            //将根节点加入节点队列
            queue.add(root);
            //队列为空，跳出循环
            while(!queue.isEmpty()){
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
            return res;
        }
```
