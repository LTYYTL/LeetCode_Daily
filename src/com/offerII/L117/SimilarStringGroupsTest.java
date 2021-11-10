package com.offerII.L117;

public class SimilarStringGroupsTest {
    public static void main(String[] args) {
        SimilarStringGroups similarStringGroups = new SimilarStringGroups();
        /**
         * 示例 1：
         * 输入：strs = ["tars","rats","arts","star"]
         * 输出：2
         */
        System.out.println(similarStringGroups.numSimilarGroups(new String[]{"tars", "rats", "arts", "star"}));
        /**
         * 示例 2：
         * 输入：strs = ["omv","ovm"]
         * 输出：1
         */
        System.out.println(similarStringGroups.numSimilarGroups(new String[]{"omv", "ovm"}));
    }
}
