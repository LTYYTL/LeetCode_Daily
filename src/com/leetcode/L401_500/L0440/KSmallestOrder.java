package com.leetcode.L401_500.L0440;

/**
 * 440. 字典序的第K小数字
 * 给定整数 n 和 k，返回  [1, n] 中字典序第 k 小的数字。
 *
 * 示例 1:
 * 输入: n = 13, k = 2
 * 输出: 10
 * 解释: 字典序的排列是 [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]，所以第二小的数字是 10。
 *
 * 示例 2:
 * 输入: n = 1, k = 1
 * 输出: 1
 *
 * 提示:
 * 1 <= k <= n <= 109
 */
public class KSmallestOrder {
    /**
     * 方法：模拟
     * 作者：Meng_Xi
     * 链接：<a href="https://leetcode-cn.com/problems/k-th-smallest-in-lexicographical-order/solution/tou-liao-liang-wei-da-lao-de-tu-he-ti-ji-fs9r/">https://leetcode-cn.com/problems/k-th-smallest-in-lexicographical-order/solution/tou-liao-liang-wei-da-lao-de-tu-he-ti-ji-fs9r/</a>
     *
     * @param n
     * @param k
     * @return
     */
    public int findKthNumber(int n, int k) {
        //从根节点下面的第一个结点1开始遍历，由于数据范围很大，所以用long
        long cur = 1;
        //从1出发开始往后按字典序从小到大的顺序走k-1步到达的就是 字典序的第K小数字
        k -= 1;

        while (k > 0) {
            //得到以当前结点为根的所有子树节点数目
            int nodes = getNodes(n, cur);
            //如果k要大于当前根节点下所有子树结点的数目，就向右侧节点走(->2->3->4->5->6->7->8->9)：字典序上升nodes位
            if (k >= nodes) {
                //减去已经遍历的个数
                k -= nodes;
                //根节点右移
                cur ++;
            }
            //如果k小于当前根节点下所有子树结点的数目，说明答案就在当前根节点的子树结点中
            else {
                //减去根节点的数量1
                k -= 1;
                //将根结点移动到下一层（每一层右10个结点）
                cur *= 10;
            }
        }
        //最终k = 0时，就找到了答案
        return (int)cur;
    }

    // 计算以cur为根的子树节点数目，所有节点的值必须 <= n
    private int getNodes(int n, long cur){
        // 记录子树中的全部节点数目
        long totalNodes = 0;
        // 当前节点右侧右边节点的值
        long next = cur + 1;
        while(cur <= n){
            //取整行结点的个数，可能全部都满了，也可能是叶子结点，没有充满
            totalNodes += Math.min(n - cur + 1, next - cur);
            //cur - cur在当前层的第一个结点， next - cur右侧根结点的第一个结点
            next *= 10;
            cur *= 10;
        }
        return (int)totalNodes;
    }

}
