package com.LCP.L0019;

public class AutumnLeavesCollectionTest {
    public static void main(String[] args) {
        AutumnLeavesCollection autumnLeavesCollection = new AutumnLeavesCollection();
        /* * 示例 1：
          输入：leaves = "rrryyyrryyyrr"
          输出：2
          解释：调整两次，将中间的两片红叶替换成黄叶，得到 "rrryyyyyyyyrr"
         */
        System.out.println(autumnLeavesCollection.minimumOperations("rrryyyrryyyrr"));
        /*
          示例 2：
          输入：leaves = "ryr"
          输出：0
          解释：已符合要求，不需要额外操作
         */
        System.out.println(autumnLeavesCollection.minimumOperations("ryr"));
    }
}
