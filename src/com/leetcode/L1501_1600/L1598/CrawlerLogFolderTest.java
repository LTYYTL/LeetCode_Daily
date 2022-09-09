package com.leetcode.L1501_1600.L1598;

public class CrawlerLogFolderTest {
    public static void main(String[] args) {
        CrawlerLogFolder crawlerLogFolder = new CrawlerLogFolder();
        /*
          示例 1：
          输入：logs = ["d1/","d2/","../","d21/","./"]
          输出：2
          解释：执行 "../" 操作变更文件夹 2 次，即可回到主文件夹
         */
        System.out.println(crawlerLogFolder.minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
        /*
          示例 2：
          输入：logs = ["d1/","d2/","./","d3/","../","d31/"]
          输出：3
         */
        System.out.println(crawlerLogFolder.minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}));
        /*
          示例 3：
          输入：logs = ["d1/","../","../","../"]
          输出：0
         */
        System.out.println(crawlerLogFolder.minOperations(new String[]{"d1/", "../", "../", "../"}));
    }
}
