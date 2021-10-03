package com.leetcode.L1_100.L0060;

/**
 * 60. 第k个排列
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 * 说明：
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 *
 * 示例 1:
 * 输入: n = 3, k = 3
 * 输出: "213"
 *
 * 示例 2:
 * 输入: n = 4, k = 9
 * 输出: "2314"
 */
public class KthPermutation {

    /**
     * 方法：数学
     * 为了便于理解，我们这里给出一个例子的具体操作：n=4,k=14。
     * 首先我们将所有排列按首位分组：
     *
     * 1 + (2, 3, 4的全排列)
     * 2 + (1, 3, 4的全排列)
     * 3 + (1, 2, 4的全排列)
     * 4 + (2, 3, 4的全排列)
     * 接下来我们确定第 k=14 个排列在哪一组中。每组的排列个数是 3!=6个，所以第14个排列在第3组中，所以首位已经可以确定，是3。
     *
     * 然后我们再将第3组的排列继续分组：
     *
     * 31 + (2, 4的全排列)
     * 32 + (1, 4的全排列)
     * 34 + (1, 2的全排列)
     * 接下来我们判断第 k=14 个排列在哪个小组中。我们先求第 14 个排列在第三组中排第几，由于前两组每组有6个排列，所以第14个排列在第3组排第 14−6∗2=2。
     * 在第三组中每个小组的排列个数是 2!=2个，所以第 k 个排列在第1个小组，所以可以确定它的第二位数字是1。
     *
     * 作者：acw_weian
     * 链接：https://leetcode-cn.com/problems/permutation-sequence/solution/di-kge-pai-lie-shu-xue-gui-na-on2-by-acw_weian/
     * @param n
     * @param k
     * @return
     */
    public String getPermutation(int n, int k) {
        //空值情况
        if (n == 0 || k==0)
            return "";
        //结果字符串
        StringBuffer res = new StringBuffer();
        //计算n!,fact[i] = i!
        //n! = n * (n-1)!
        int[] fact = new int[n+1];
        //0!=1!=1
        fact[0] = fact[1] = 1;
        //n! = n * (n-1)!
        for (int i = 2; i <= n; ++i){
            fact[i] = fact[i - 1] * i;
        }
        //当前数是否已经被使用过，state[i]表示i的状态，即state[1]表示数字1的状态
        boolean[] state = new boolean[n+1];
        //双循环
        //外循环确定是排序中的第几位数
        //内循环确定当前位的数是什么
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                //当前数字没有被使用
                if (!state[j]){
                    //第i位数后面的可能排列有（n-i）!种
                    //其中i表示当前确定的是第几位（i之前的位都已经确定完）
                    if (k <= fact[n-i]){
                        //当前数符合条件将其加入，并改变状态
                        res.append(j);
                        state[j] = true;
                    }
                    //刨去不符合条件的排列组合个数，即k不在此组中切换到下一组
                    k -= fact[n-i];
                }
            }
        }

        return res.toString();
    }




}
