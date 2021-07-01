package com.LCP.L0007;

public class SendMessageTest {
    public static void main(String[] args) {
        SendMessage sendMessage = new SendMessage();
        /**
         * 示例 1：
         * 输入：n = 5, relation = [[0,2],[2,1],[3,4],[2,3],[1,4],[2,0],[0,4]], k = 3
         * 输出：3
         * 解释：信息从小 A 编号 0 处开始，经 3 轮传递，到达编号 4。共有 3 种方案，分别是 0->2->0->4， 0->2->1->4， 0->2->3->4。
         */
        System.out.println(sendMessage.numWays(5, new int[][]{{0, 2}, {2, 1}, {3, 4}, {2, 3}, {1, 4}, {2, 0}, {0, 4}}, 3));
        /**
         * 示例 2：
         * 输入：n = 3, relation = [[0,2],[2,1]], k = 2
         * 输出：0
         * 解释：信息不能从小 A 处经过 2 轮传递到编号 2
         */
        System.out.println(sendMessage.numWays(3, new int[][]{{0, 2}, {2, 1}}, 2));
    }
}
