package com.LCP.L0030;

public class MagicTowerGameTest {
    public static void main(String[] args) {
        MagicTowerGame magicTowerGame = new MagicTowerGame();
        /**
         * 示例 1：
         * 输入：nums = [100,100,100,-250,-60,-140,-50,-50,100,150]
         * 输出：1
         * 解释：初始血量为 1。至少需要将 nums[3] 调整至访问顺序末尾以满足要求。
         */
        System.out.println(magicTowerGame.magicTower(new int[]{100, 100, 100, -250, -60, -140, -50, -50, 100, 150}));
        /**
         * 示例 2：
         * 输入：nums = [-200,-300,400,0]
         * 输出：-1
         * 解释：调整访问顺序也无法完成全部房间的访问。
         */
        System.out.println(magicTowerGame.magicTower(new int[]{-200,-300,400,0}));
    }
}
