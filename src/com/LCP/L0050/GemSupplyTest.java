package com.LCP.L0050;

public class GemSupplyTest {
    public static void main(String[] args) {
        GemSupply gemSupply = new GemSupply();
        /*
          示例 1：
          输入：gem = [3,1,2], operations = [[0,2],[2,1],[2,0]]
          输出：2
          解释：
          第 1 次操作，勇者 0 将一半的宝石赠送给勇者 2， gem = [2,1,3]
          第 2 次操作，勇者 2 将一半的宝石赠送给勇者 1， gem = [2,2,2]
          第 3 次操作，勇者 2 将一半的宝石赠送给勇者 0， gem = [3,2,1]
          返回 3 - 1 = 2
         */
        System.out.println(gemSupply.giveGem(new int[]{3, 1, 2}, new int[][]{{0, 2}, {2, 1}, {2, 0}}));
        /*
          示例 2：
          输入：gem = [100,0,50,100], operations = [[0,2],[0,1],[3,0],[3,0]]
          输出：75
          解释：
          第 1 次操作，勇者 0 将一半的宝石赠送给勇者 2， gem = [50,0,100,100]
          第 2 次操作，勇者 0 将一半的宝石赠送给勇者 1， gem = [25,25,100,100]
          第 3 次操作，勇者 3 将一半的宝石赠送给勇者 0， gem = [75,25,100,50]
          第 4 次操作，勇者 3 将一半的宝石赠送给勇者 0， gem = [100,25,100,25]
          返回 100 - 25 = 75
         */
        System.out.println(gemSupply.giveGem(new int[]{100, 0, 50, 100}, new int[][]{{0, 2}, {2, 1}, {3, 0}, {3, 0}}));
        /*
          示例 3：
          输入：gem = [0,0,0,0], operations = [[1,2],[3,1],[1,2]]
          输出：0
         */
        System.out.println(gemSupply.giveGem(new int[]{0, 0, 0, 0}, new int[][]{{1, 2}, {3, 1}, {1, 2}}));
    }
}
