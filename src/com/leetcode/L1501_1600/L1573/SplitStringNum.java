package com.leetcode.L1501_1600.L1573;

import java.util.ArrayList;
import java.util.List;

/**
 * 1573. 分割字符串的方案数
 * 给你一个二进制串 s  （一个只包含 0 和 1 的字符串），我们可以将 s 分割成 3 个 非空 字符串 s1, s2, s3 （s1 + s2 + s3 = s）。
 * 请你返回分割 s 的方案数，满足 s1，s2 和 s3 中字符 '1' 的数目相同。
 * 由于答案可能很大，请将它对 10^9 + 7 取余后返回。
 *
 * 示例 1：
 * 输入：s = "10101"
 * 输出：4
 * 解释：总共有 4 种方法将 s 分割成含有 '1' 数目相同的三个子字符串。
 * "1|010|1"
 * "1|01|01"
 * "10|10|1"
 * "10|1|01"
 *
 * 示例 2：
 * 输入：s = "1001"
 * 输出：0
 *
 * 示例 3：
 * 输入：s = "0000"
 * 输出：3
 * 解释：总共有 3 种分割 s 的方法。
 * "0|0|00"
 * "0|00|0"
 * "00|0|0"
 *
 * 示例 4：
 * 输入：s = "100100010100110"
 * 输出：12
 *
 * 提示：
 * s[i] == '0' 或者 s[i] == '1'
 * 3 <= s.length <= 10^5
 */
public class SplitStringNum {
    //取余
    static final int mod = 1_000_000_007;

    /**
     * 数学问题
     *
     * 1、计算出字符串中‘1’的个数
     * 2、根据的‘1’的个数分情况
     *   (1)没有‘1’:将每两个‘0’之间看作一个空隙，即长度为n的字符串有n-1个空隙，若要分割字符串，可看作是在n-1个空隙中任意挑选两个空隙，即做C操作，（n-1）*(n-2)/2
     *   (2)‘1’的个数不能三等分:直接返回0
     *   (3)‘1’的个数能三等分:分割的次数与首字符串最后一个‘1’位置和中间字符串第一个‘1’位置之间的‘0’的个数、中间字符串最后一个‘1’位置和尾字符串第一个‘1’位置之间的‘0’的个数有关
     *   例：‘100100010100110‘：[0,3,7,9,12,13]
     *   首字符串最后一个‘1’位置：3
     *   中间字符串第一个‘1’位置：7
     *   中间字符串最后一个‘1’位置：9
     *   尾字符串第一个‘1’位置：12
     *   方案数=（7-3）*（12-9）=12
     *
     * @param s
     * @return
     */
    public int numWays(String s) {
        char[] chars = s.toCharArray();
        int  n = chars.length;
        //用于存储‘1’出现的索引
        List<Integer> indexList = new ArrayList<>();
        //记录‘1’的个数
        int count = 0;
        //遍历数组，记录‘1’的个数和索引位置
        for (int i = 0; i < n; i++){
            if (chars[i] == '1'){
                indexList.add(i);
                count++;
            }
        }
        //字符串没有‘1’的情况
        if(count == 0){
            return (int) ((long) (n - 1) * (n - 2) / 2 % mod);
        }
        //字符串‘1’的个数不够三等分情况
        if(count % 3 != 0){
            return 0;
        }
        //字符串‘1’够三等分的情况
        count = count/3;
        //首字符串最后出现‘1’的位置
        int l1 = indexList.get(count -1);
        //中间字符串第一次出现‘1’的位置
        int l2 = indexList.get(count);
        //中间字符串最后一次出现‘1’的位置
        int r1 = indexList.get(2*count - 1);
        //尾字符串第一次出现‘1’的位置
        int r2 = indexList.get(2*count);

        return (int) ((long) (l2 - l1) * (r2 - r1) % mod);
    }


}
