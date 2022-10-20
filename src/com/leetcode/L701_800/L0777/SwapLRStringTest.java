package com.leetcode.L701_800.L0777;

public class SwapLRStringTest {
    public static void main(String[] args) {
        SwapLRString swapLRString = new SwapLRString();
        /*
          示例 :
          输入: start = "RXXLRXRXL", end = "XRLXXRRLX"
          输出: True
          解释:
          我们可以通过以下几步将start转换成end:
          RXXLRXRXL ->
          XRXLRXRXL ->
          XRLXRXRXL ->
          XRLXXRRXL ->
          XRLXXRRLX
         */
        System.out.println(swapLRString.canTransform("RXXLRXRXL", "XRLXXRRLX"));
    }
}
