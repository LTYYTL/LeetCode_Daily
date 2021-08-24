package com.meituan.L009;

import java.io.*;

/**
 * meituan-009. 小团的装饰物
 * 小团正在装饰自己的书桌，他的书桌上从左到右有 m 个空位需要放上装饰物。商店中每个整数价格的装饰物恰好有一种，且每种装饰物的数量无限多。
 * 小团去商店的时候，想到了一个购买方案，他要让右边的装饰物价格是左边的倍数。
 * 用数学语言来说，假设小团的 m 个装饰物价格为 a[1], a[2], ..., a[m] ，那么对于任意的 1≤i≤j≤m ，a[j] 是 a[i] 的倍数。
 * 小团是一个节约的人，他希望最贵的装饰物不超过 n 元。现在，请你计算小团有多少种购买的方案？
 *
 * 格式：
 * 输入：
 * - 输入包含两个数，n 和 m 。
 * 输出：
 * - 输出一个数，结果对 998244353 取模，表示购买的方案数。
 *
 * 示例：
 * 输入：4 2
 * 输出：8
 * 解释：[1,1][1,2][1,3][1,4][2,2][2,4][3,3][4,4] 共 8 种。
 *
 * 提示：
 * 对于 40% 的数据，n, m ≤ 10
 * 对于 100% 的数据，1 ≤ n, m ≤ 1000
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class XiaoTuanDecoration {
    /**
     * 方法：动态规划
     */
    static int mod = 998244353;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] data = reader.readLine().split(" ");
        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);

        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= n; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = j; k<=n; k+=j){
                    dp[i][k] = (dp[i][k] + dp[i-1][j])%mod;
                }
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (res + dp[m][i]) % mod;
        }


        writer.write(""+res);
        reader.close();
        writer.close();
    }
}
