package com.leetcode.L2001_2100.L2049;

/**
 * 2049. 统计最高分的节点数目
 * 给你一棵根节点为 0 的 二叉树 ，它总共有 n 个节点，节点编号为 0 到 n - 1 。
 * 同时给你一个下标从 0 开始的整数数组 parents 表示这棵树，其中 parents[i] 是节点 i 的父节点。由于节点 0 是根，所以 parents[0] == -1 。
 *
 * 一个子树的 大小 为这个子树内节点的数目。每个节点都有一个与之关联的 分数 。
 * 求出某个节点分数的方法是，将这个节点和与它相连的边全部 删除 ，剩余部分是若干个 非空 子树，这个节点的 分数 为所有这些子树 大小的乘积 。
 *
 * 请你返回有 最高得分 节点的 数目 。
 *
 * 示例 1:
 * 输入：parents = [-1,2,0,2,0]
 * 输出：3
 * 解释：
 * - 节点 0 的分数为：3 * 1 = 3
 * - 节点 1 的分数为：4 = 4
 * - 节点 2 的分数为：1 * 1 * 2 = 2
 * - 节点 3 的分数为：4 = 4
 * - 节点 4 的分数为：4 = 4
 * 最高得分为 4 ，有三个节点得分为 4 （分别是节点 1，3 和 4 ）。
 *
 * 示例 2：
 * 输入：parents = [-1,2,0]
 * 输出：2
 * 解释：
 * - 节点 0 的分数为：2 = 2
 * - 节点 1 的分数为：2 = 2
 * - 节点 2 的分数为：1 * 1 = 1
 * 最高分数为 2 ，有两个节点分数为 2 （分别为节点 0 和 1 ）。
 *
 * 提示：
 * n == parents.length
 * 2 <= n <= 105
 * parents[0] == -1
 * 对于 i != 0 ，有 0 <= parents[i] <= n - 1
 * parents 表示一棵二叉树。
 */
public class CountNodesHighestScore {
    //最大分数
    long maxScore = 0;
    //有最大分数的个数
    int ans = 0;
    //长度
    int n;

    /**
     * 方法：深度优先搜索
     * @param parents
     * @return
     */
    public int countHighestScoreNodes(int[] parents) {
        //长度
        this.n = parents.length;
        //初始化所有节点
        Node[] nodes = new Node[n];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node();
        }

        //记录每个点的子节点
        for (int i = 1; i < parents.length; i++) {
            //父节点
            int parent = parents[i];
            //向父节点加入当前节点
            nodes[parent].addChild(nodes[i]);
        }

        //深度优先搜索
        dfs(nodes[0]);

        return ans;
    }

    /**
     * 深度优先搜索
     * @param node
     * @return
     */
    private int dfs(Node node) {
        //空节点
        if (node == null)
            return 0;
        //左子树节点个数
        int leftCount = dfs(node.left);
        //右子树节点个数
        int rightCount = dfs(node.right);
        //除去左右子树和节点本身，剩余的节点个数
        int remain =  n - leftCount - rightCount - 1;

        //计算分数
        long score = help(leftCount) * help(rightCount) * help(remain);
        //与最大分数相等，个数+1
        if (score == maxScore){
            ans++;
        }else if (score > maxScore){//比最大分数还要大，重新记录最大分数和节点个数
            maxScore = score;
            ans = 1;
        }

        return leftCount + rightCount + 1;
    }

    /**
     * 将为0的值变成1
     * @param count
     * @return
     */
    private long help(int count) {
        return count == 0 ? 1 : count;
    }
}

/**
 * 方法：树形结构
 */
class Node{
    Node left;
    Node right;

    public void addChild(Node child){
        if (this.left == null)
            this.left = child;
        else
            this.right = child;
    }
}
