package com.LCP.L0051;

/**
 * LCP 51. 烹饪料理
 * 欢迎各位勇者来到力扣城，城内设有烹饪锅供勇者制作料理，为自己恢复状态。
 * 勇者背包内共有编号为 0 ~ 4 的五种食材，其中 materials[j] 表示第 j 种食材的数量。
 * 通过这些食材可以制作若干料理，cookbooks[i][j] 表示制作第 i 种料理需要第 j 种食材的数量，而 attribute[i] = [x,y] 表示第 i 道料理的美味度 x 和饱腹感 y。
 * 在饱腹感不小于 limit 的情况下，请返回勇者可获得的最大美味度。如果无法满足饱腹感要求，则返回 -1。
 * 注意：
 * 每种料理只能制作一次。
 *
 * 示例 1：
 * 输入：materials = [3,2,4,1,2]
 * cookbooks = [[1,1,0,1,2],[2,1,4,0,0],[3,2,4,1,0]]
 * attribute = [[3,2],[2,4],[7,6]]
 * limit = 5
 * 输出：7
 * 解释：
 * 食材数量可以满足以下两种方案：
 * 方案一：制作料理 0 和料理 1，可获得饱腹感 2+4、美味度 3+2
 * 方案二：仅制作料理 2， 可饱腹感为 6、美味度为 7
 * 因此在满足饱腹感的要求下，可获得最高美味度 7
 *
 * 示例 2：
 * 输入：materials = [10,10,10,10,10]
 * cookbooks = [[1,1,1,1,1],[3,3,3,3,3],[10,10,10,10,10]]
 * attribute = [[5,5],[6,6],[10,10]]
 * limit = 1
 * 输出：11
 * 解释：通过制作料理 0 和 1，可满足饱腹感，并获得最高美味度 11
 *
 * 提示：
 * materials.length == 5
 * 1 <= cookbooks.length == attribute.length <= 8
 * cookbooks[i].length == 5
 * attribute[i].length == 2
 * 0 <= materials[i], cookbooks[i][j], attribute[i][j] <= 20
 * 1 <= limit <= 100
 */
public class Cooking {

    //结果
    int res = -1;

    /**
     * 方法：回溯算法
     * @param materials
     * @param cookbooks
     * @param attribute
     * @param limit
     * @return
     */
    public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
        int n = cookbooks.length;
        dfs(materials,cookbooks,attribute,limit,0,0,new boolean[n],new int[5]);
        return res;
    }

    /**
     * 深度优先搜索
     * @param materials 各食材数量
     * @param cookbooks 每个食物需要食材的数量
     * @param attribute 食物的饱和度和美物读
     * @param limit     饱和度限制
     * @param sumx      美味度和
     * @param sumy      饱和度和
     * @param valid     是否被做过
     * @param needs     已经使用的食材数
     */
    private void dfs(int[] materials, int[][] cookbooks, int[][] attribute, int limit, int sumx, int sumy, boolean[] valid, int[] needs) {
        //满足最小饱和度要求
        if (sumy >= limit)
            //存储最大值
            res = Math.max(res,sumx);

        //遍历
        for (int i = 0; i < attribute.length; i++) {
            //被制作过
            if (valid[i])
                continue;
            //增加已经使用的食材数
            addNeed(needs,cookbooks,i);
            //默认是可制作的
            boolean can = true;
            //遍历
            for (int j = 0; j < materials.length; j++) {
                //超过食材数
                if (materials[j] < needs[j]) {
                    //回退
                    decNeed(needs,cookbooks,i);
                    //不可制作
                    can = false;
                    break;
                }
            }
            //可制作
            if (can) {
                //变为已制作
                valid[i] = true;
                //深度优先搜索
                dfs(materials, cookbooks, attribute, limit, sumx + attribute[i][0], sumy + attribute[i][1], valid, needs);
                //回退
                decNeed(needs, cookbooks, i);
                valid[i] = false;
            }
        }
    }

    private void addNeed(int[] needs,int[][] cookbooks,int index){
        needs[0] += cookbooks[index][0];
        needs[1] += cookbooks[index][1];
        needs[2] += cookbooks[index][2];
        needs[3] += cookbooks[index][3];
        needs[4] += cookbooks[index][4];
    }

    private void decNeed(int[] needs,int[][] cookbooks,int index){
        needs[0] -= cookbooks[index][0];
        needs[1] -= cookbooks[index][1];
        needs[2] -= cookbooks[index][2];
        needs[3] -= cookbooks[index][3];
        needs[4] -= cookbooks[index][4];
    }
}
