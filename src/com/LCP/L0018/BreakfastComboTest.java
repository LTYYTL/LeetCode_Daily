package com.LCP.L0018;

public class BreakfastComboTest {
    public static void main(String[] args) {
        BreakfastCombo breakfastCombo = new BreakfastCombo();
        /*
          示例 1：
          输入：staple = [10,20,5], drinks = [5,5,2], x = 15
          输出：6
          解释：小扣有 6 种购买方案，所选主食与所选饮料在数组中对应的下标分别是：
          第 1 种方案：staple[0] + drinks[0] = 10 + 5 = 15；
          第 2 种方案：staple[0] + drinks[1] = 10 + 5 = 15；
          第 3 种方案：staple[0] + drinks[2] = 10 + 2 = 12；
          第 4 种方案：staple[2] + drinks[0] = 5 + 5 = 10；
          第 5 种方案：staple[2] + drinks[1] = 5 + 5 = 10；
          第 6 种方案：staple[2] + drinks[2] = 5 + 2 = 7。
         */
        int[] staple = {10, 20, 5};
        int[] drinks = {5, 5, 2};
        //方法一：双指针
        System.out.println(breakfastCombo.breakfastNumber(staple, drinks, 15));
        //方法二：二分查找
        System.out.println(breakfastCombo.breakfastNumber_BinarySearch(staple, drinks, 15));
        /*
          示例 2：
          输入：staple = [2,1,1], drinks = [8,9,5,1], x = 9
          输出：8
          解释：小扣有 8 种购买方案，所选主食与所选饮料在数组中对应的下标分别是：
          第 1 种方案：staple[0] + drinks[2] = 2 + 5 = 7；
          第 2 种方案：staple[0] + drinks[3] = 2 + 1 = 3；
          第 3 种方案：staple[1] + drinks[0] = 1 + 8 = 9；
          第 4 种方案：staple[1] + drinks[2] = 1 + 5 = 6；
          第 5 种方案：staple[1] + drinks[3] = 1 + 1 = 2；
          第 6 种方案：staple[2] + drinks[0] = 1 + 8 = 9；
          第 7 种方案：staple[2] + drinks[2] = 1 + 5 = 6；
          第 8 种方案：staple[2] + drinks[3] = 1 + 1 = 2；
         */
        int[] staple1 = {2, 1, 1};
        int[] drinks1 = {8, 9, 5, 1};
        //方法一：双指针
        System.out.println(breakfastCombo.breakfastNumber(staple1, drinks1, 9));
        //方法二：二分查找
        System.out.println(breakfastCombo.breakfastNumber_BinarySearch(staple1, drinks1, 9));
    }
}
