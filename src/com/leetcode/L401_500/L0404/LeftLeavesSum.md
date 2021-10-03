## [左叶子之和](https://leetcode-cn.com/problems/sum-of-left-leaves/)

## 题目描述
```
计算给定二叉树的所有左叶子之和。

示例：

    3
   / \
  9  20
    /  \
   15   7

在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24

```

## 难度：简单

## 方法

#### 1.递归

- 思路
```
通过递归的方式进行深度优先搜索
1、dfs(当前节点，左右标识符)
2、分情况讨论：
（1）当前节点为空：直接返回0
（2）当前节点既没有左孩子也没有右孩子，同是是父节点的左孩子：返回节点值
3、均不满足上述两种情况，则进入递归调用，因为是一棵二叉树，其左叶子节点的之和，会是左子树中左叶子之和+右子树中左叶子之和
```
- 图示

![LeftLeavesSum](https://github.com/LTYYTL/LeetCode_Daily/blob/master/src/com/leetcode/L0404/LeftLeavesSum.png)

- 代码

```java_holder_method_tree
        /**
             * 方法：递归
             * @param root
             * @return
             */
            public int sumOfLeftLeaves(TreeNode<Integer> root) {
                //调用深度优先搜索
                return  dfs(root,false);
        
            }
        
            /**
             * 深度优先搜索
             * @param root  当前节点
             * @param state 区分左右节点
             * @return
             */
            private int dfs(TreeNode<Integer> root, boolean state) {
                //当前节点为空，直接返回0
                if (root == null)
                    return 0;
                //当前节点没有左、右子树，且是左叶子节点，返回其节点值
                if (root.left == null && root.right == null && state) {
                    return root.val;
                }
                //递归调用，进入左子树找寻左子树的左叶子节点，进入右子树找寻右子树的左叶子节点
               return dfs(root.left, true) + dfs(root.right, false);
        
            }
```

