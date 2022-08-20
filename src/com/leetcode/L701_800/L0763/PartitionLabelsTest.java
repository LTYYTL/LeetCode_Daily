package com.leetcode.L701_800.L0763;

public class PartitionLabelsTest {
    public static void main(String[] args) {
        PartitionLabels partitionLabels = new PartitionLabels();
        /*
          示例 1：
          输入：S = "ababcbacadefegdehijhklij"
          输出：[9,7,8]
          解释：
          划分结果为 "ababcbaca", "defegde", "hijhklij"。
          每个字母最多出现在一个片段中。
          像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
         */
        System.out.println(partitionLabels.partitionLabels("ababcbacadefegdehijhklij").toString());
    }
}
