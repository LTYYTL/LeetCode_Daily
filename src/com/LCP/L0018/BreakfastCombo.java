package com.LCP.L0018;

import java.util.Arrays;



/**
 * LCP 18. 早餐组合
 * 小扣在秋日市集选择了一家早餐摊位，一维整型数组 staple 中记录了每种主食的价格，一维整型数组 drinks 中记录了每种饮料的价格。
 * 小扣的计划选择一份主食和一款饮料，且花费不超过 x 元。请返回小扣共有多少种购买方案。
 * 注意：答案需要以 1e9 + 7 (1000000007) 为底取模，如：计算初始结果为：1000000008，请返回 1
 *
 * 示例 1：
 * 输入：staple = [10,20,5], drinks = [5,5,2], x = 15
 * 输出：6
 * 解释：小扣有 6 种购买方案，所选主食与所选饮料在数组中对应的下标分别是：
 * 第 1 种方案：staple[0] + drinks[0] = 10 + 5 = 15；
 * 第 2 种方案：staple[0] + drinks[1] = 10 + 5 = 15；
 * 第 3 种方案：staple[0] + drinks[2] = 10 + 2 = 12；
 * 第 4 种方案：staple[2] + drinks[0] = 5 + 5 = 10；
 * 第 5 种方案：staple[2] + drinks[1] = 5 + 5 = 10；
 * 第 6 种方案：staple[2] + drinks[2] = 5 + 2 = 7。
 *
 * 示例 2：
 * 输入：staple = [2,1,1], drinks = [8,9,5,1], x = 9
 * 输出：8
 * 解释：小扣有 8 种购买方案，所选主食与所选饮料在数组中对应的下标分别是：
 * 第 1 种方案：staple[0] + drinks[2] = 2 + 5 = 7；
 * 第 2 种方案：staple[0] + drinks[3] = 2 + 1 = 3；
 * 第 3 种方案：staple[1] + drinks[0] = 1 + 8 = 9；
 * 第 4 种方案：staple[1] + drinks[2] = 1 + 5 = 6；
 * 第 5 种方案：staple[1] + drinks[3] = 1 + 1 = 2；
 * 第 6 种方案：staple[2] + drinks[0] = 1 + 8 = 9；
 * 第 7 种方案：staple[2] + drinks[2] = 1 + 5 = 6；
 * 第 8 种方案：staple[2] + drinks[3] = 1 + 1 = 2；
 *
 * 提示：
 * 1 <= staple.length <= 10^5
 * 1 <= drinks.length <= 10^5
 * 1 <= staple[i],drinks[i] <= 10^5
 * 1 <= x <= 2*10^5
 */
public class BreakfastCombo {
    //用于取模
    final static int mod = 1000000007;
    /**
     * 方法一：双指针
     * @param staple 主食数组
     * @param drinks 饮料数组
     * @param x      总金额
     * @return 方案数
     */
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int res = 0;
        //空值情况
        if (staple.length == 0 || drinks.length == 0 || x == 0)
            return (int) ((long) res % mod);
        //数组排序
        Arrays.sort(staple);
        Arrays.sort(drinks);
        //双指针
        //i指向staple[]的最小值
        //j指向drinks[]的最大值
        int i = 0;
        int j = drinks.length - 1;
        //
        while (i < staple.length && j >= 0){
            //当前staple[i]+drinks[j]的值比x小时，即staple[i]与drink[]从0~j的值的和都比x小
            if (staple[i] + drinks[j] <= x){
                //总方案数=目前总方案数+本次循环的方案数（0~j）个，因为j为索引且从0开始，所以要+1
                res = (res + j + 1) % mod;
                //向后移动指向staple[]的指针
                i++;
            }else {
                //向前移动指向drink[]的指针
                j--;
            }
        }
        //方案总数对100000007取模
        return res % mod;
    }

    /**
     * 方法二：二分查找
     * @param staple 主食数组
     * @param drinks 饮料数组
     * @param x      总金额
     * @return 方案数
     */
    public int breakfastNumber_BinarySearch(int[] staple, int[] drinks, int x) {
        int res = 0;
        //空值情况
        if (staple.length == 0 || drinks.length == 0 || x == 0)
            return (int) ((long) res % mod);
        //数组排序
        Arrays.sort(staple);
        Arrays.sort(drinks);
        //遍历staple[]数组，找寻与staple[i]最合适的drinks[]的最大值
        //因为都是升序排列，所以drinks[]的最大值位置，即staple[i]与drink[]的值组合的方案数
        for (int j : staple) {
            //在x中除去staple[i]之后能花多少钱
            int diff = x - j;
            //当差值小于等于0，证明staple[i]及以上的都不能满足条件，直接跳出循环
            if (diff <= 0) {
                break;
            }
            //调用二分查找，在drinks[]中找寻与差值最接近的数的位置，即从前到此位置的所有数都能满足条件
            int temp = binarySearch(drinks, diff);
            //当两部分的和等于0了，证明其后的其他值都不能在满足条件，直接跳出循环
            if (temp == 0) {
                break;
            }
            res = (res + temp) % mod;
        }
        //方案总数对100000007取模
        return res % mod;
    }

    /**
     * 二分查找
     * @param drinks
     * @param diff
     * @return
     */
    private int binarySearch(int[] drinks,int diff){
        //起点
        int star = 0;
        //结点
        int end = drinks.length;
        //循环终止条件：star>=end
        while (star < end){
            //找寻中点
            int mid = star + (end - star)/2;
            //判断中点值与差值的大小
            //大时：查找star~mid之间的数
            //小时：查找mid+1~end之间的数
            if (drinks[mid] > diff)
                end = mid;
            else
                star = mid + 1;
        }
        return star;
    }
}
