package com.offerII.L115;

import java.util.*;

/**
 * 剑指 Offer II 115. 重建序列
 * 请判断原始的序列 org 是否可以从序列集 seqs 中唯一地 重建 。
 * 序列 org 是 1 到 n 整数的排列，其中 1 ≤ n ≤ 104。重建 是指在序列集 seqs 中构建最短的公共超序列，即  seqs 中的任意序列都是该最短序列的子序列。
 *
 * 示例 1：
 * 输入: org = [1,2,3], seqs = [[1,2],[1,3]]
 * 输出: false
 * 解释：[1,2,3] 不是可以被重建的唯一的序列，因为 [1,3,2] 也是一个合法的序列。
 *
 * 示例 2：
 * 输入: org = [1,2,3], seqs = [[1,2]]
 * 输出: false
 * 解释：可以重建的序列只有 [1,2]。
 *
 * 示例 3：
 * 输入: org = [1,2,3], seqs = [[1,2],[1,3],[2,3]]
 * 输出: true
 * 解释：序列 [1,2], [1,3] 和 [2,3] 可以被唯一地重建为原始的序列 [1,2,3]。
 *
 * 示例 4：
 * 输入: org = [4,1,5,2,6,3], seqs = [[5,2,6,3],[4,1,5,2]]
 * 输出: true
 *
 * 提示：
 * 1 <= n <= 104
 * org 是数字 1 到 n 的一个排列
 * 1 <= segs[i].length <= 105
 * seqs[i][j] 是 32 位有符号整数
 *
 * 注意：本题与主站 444 题相同：https://leetcode-cn.com/problems/sequence-reconstruction/
 */
public class ReconstructionSequence {
    /**
     * 方法：拓扑排序
     * @param org
     * @param seqs
     * @return
     */
    public boolean sequenceReconstruction(int[] org, List<List<Integer>> seqs) {
        int n = org.length;

        //构建有向图
        Map<Integer, List<Integer>> g = new HashMap<>();    //图

        int[] inDegree = new int[n+1];    //入度，数字从 1 到 n
        Arrays.fill(inDegree, -1);  //初始化

        for(List<Integer> seq : seqs){
            for(int x : seq){
                if(x < 1 || x > n){ // seqs 中的数字必定包含在 org 中 [1,n]
                    return false;
                }
                if(! g.containsKey(x)){  //初始化邻接表
                    g.put(x, new ArrayList<>());
                }
                if(inDegree[x] == -1){  //节点入度置为 0
                    inDegree[x] = 0;
                }
            }

            int m = seq.size() - 1;
            for(int i=0; i<m; i++){   //构建有向图
                int x1 = seq.get(i);
                int x2 = seq.get(i + 1);
                g.get(x1).add(x2);   //邻接表
                inDegree[x2] ++;    //更新入度
            }
        }

        //初始化队列
        Queue<Integer> q = new LinkedList<>();
        int index = 0;  //用来遍历 org
        for(int i=1; i<=n; i++){    //遍历数字 1 到 n
            if(inDegree[i] == 0){
                if(q.size() == 0 && org[index ++] == i){
                    q.offer(i);
                }else{
                    return false;
                }
            }
        }

        //拓扑排序
        while(! q.isEmpty()){
            int v = q.poll();
            for(int i : g.get(v)){  //遍历邻接点
                inDegree[i] --; //更新入度
                if(inDegree[i] == 0){
                    if(q.size() == 0 && org[index ++] == i){
                        q.offer(i);
                    }else{
                        return false;
                    }
                }
            }
        }

        return index == n;
    }

}
