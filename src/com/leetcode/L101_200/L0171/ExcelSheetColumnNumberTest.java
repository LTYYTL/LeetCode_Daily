package com.leetcode.L101_200.L0171;

public class ExcelSheetColumnNumberTest {
    public static void main(String[] args) {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        /*
          示例 1:
          输入: columnTitle = "A"
          输出: 1
         */
        System.out.println(excelSheetColumnNumber.titleToNumber("A"));
        /*
          示例 2:
          输入: columnTitle = "AB"
          输出: 28
         */
        System.out.println(excelSheetColumnNumber.titleToNumber("AB"));
        /*
          示例 3:
          输入: columnTitle = "ZY"
          输出: 701
         */
        System.out.println(excelSheetColumnNumber.titleToNumber("ZY"));
        /*
          示例 4:
          输入: columnTitle = "FXSHRXW"
          输出: 2147483647
         */
        System.out.println(excelSheetColumnNumber.titleToNumber("FXSHRXW"));
    }
}
