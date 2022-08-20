package com.leetcode.L401_500.L0449;

import com.util.TreeNode;

public class CodecTest {
    public static void main(String[] args) {
        /* * 示例 1：
          输入：root = [2,1,3]
          输出：[2,1,3]
         */
        Codec codec = new Codec();
        String serialize = codec.serialize(new TreeNode(2, new TreeNode(1), new TreeNode(3)));
        System.out.println(serialize);
        TreeNode deserialize = codec.deserialize(serialize);
        System.out.println(deserialize);
    }
}
