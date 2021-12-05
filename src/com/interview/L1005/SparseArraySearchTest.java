package com.interview.L1005;

public class SparseArraySearchTest {
    public static void main(String[] args) {
        SparseArraySearch sparseArraySearch = new SparseArraySearch();
        /**
         * 示例1:
         *  输入: words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
         *  输出：-1
         *  说明: 不存在返回-1。
         */
        System.out.println(sparseArraySearch.findString(new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""}, "ta"));
        /**
         * 示例2:
         *  输入：words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ball"
         *  输出：4
         */
        System.out.println(sparseArraySearch.findString(new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""}, "ball"));

    }
}
