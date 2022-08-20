package com.LCS.L0001;

public class DownloadPluginTest {
    public static void main(String[] args) {
        DownloadPlugin downloadPlugin = new DownloadPlugin();
        /*
          示例 1：
          输入：n = 2
          输出：2
          解释：
          以下两个方案，都能实现 2 分钟内下载 2 个插件
          方案一：第一分钟带宽加倍，带宽可每分钟下载 2 个插件；第二分钟下载 2 个插件
          方案二：第一分钟下载 1 个插件，第二分钟下载 1 个插件
         */
        System.out.println(downloadPlugin.leastMinutes(2));
        /*
          示例 2：
          输入：n = 4
          输出：3
          解释：
          最少需要 3 分钟可完成 4 个插件的下载，以下是其中一种方案:
          第一分钟带宽加倍，带宽可每分钟下载 2 个插件;
          第二分钟下载 2 个插件;
          第三分钟下载 2 个插件。
         */
        System.out.println(downloadPlugin.leastMinutes(4));
    }
}
