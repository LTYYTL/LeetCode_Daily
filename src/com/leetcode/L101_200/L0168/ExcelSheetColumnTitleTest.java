package com.leetcode.L101_200.L0168;

public class ExcelSheetColumnTitleTest {
    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        /**
         * 示例 1:
         * 输入: 1
         * 输出: "A"
         */
        System.out.println(excelSheetColumnTitle.convertToTitle(1));
        /**
         * 示例 2:
         * 输入: 28
         * 输出: "AB"
         */
        System.out.println(excelSheetColumnTitle.convertToTitle(28));
        /**
         * 示例 3:
         * 输入: 701
         * 输出: "ZY"
         */
        System.out.println(excelSheetColumnTitle.convertToTitle(701));
    }
}
