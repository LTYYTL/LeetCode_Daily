package com.leetcode.L901_1000.L0922;

/**
 * 922. 按奇偶排序数组 II
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 * 示例：
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 * 提示：
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        //结果数组
        int[] res = new int[A.length];
        //判断数组数组长度是否为偶数
        if(A.length % 2 != 0){
            return null;
        }
        //奇数
        int odd = 1;
        //偶数
        int even = 0;
        //遍历数组
        for (int j : A) {
            //偶数情况
            if (j % 2 == 0) {
                //偶数存在偶数索引位
                res[even] = j;
                even += 2;
            } else {//奇数情况
                //奇数存在奇数索引位
                res[odd] = j;
                odd += 2;
            }
        }
        return res;
    }
}
