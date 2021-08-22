package com.meituan.L006;

import java.io.*;

/**
 * meituan-006. 小团的神秘暗号
 * 小团深谙保密工作的重要性，因此在某些明文的传输中会使用一种加密策略，小团如果需要传输一个字符串 S ，则他会为这个字符串添加一个头部字符串和一个尾部字符串。
 * 头部字符串满足至少包含一个 “MT” 子序列，且以 T 结尾。尾部字符串需要满足至少包含一个 “MT” 子序列，且以 M 开头。
 * 例如 AAAMT 和 MAAAT 都是一个合法的头部字符串，而 MTAAA 就不是合法的头部字符串。
 * 很显然这样的头尾字符串并不一定是唯一的，因此我们还有一个约束，就是 S 是满足头尾字符串合法的情况下的最长的字符串。
 * 很显然这样的加密策略是支持解码的，给出一个加密后的字符串，请你找出中间被加密的字符串 S 。
 *
 * 格式：
 * 输入：
 * - 输入第一行是一个正整数 n ，表示加密后的字符串总长度。
 * - 输入第二行是一个长度为 n 的仅由大写字母组成的字符串 T 。
 * 输出：
 * - 输出仅包含一个字符串 S 。
 *
 * 示例：
 * 输入：
 *      10
 *      MMATSATMMT
 * 输出：SATM
 * 提示：
 *
 * 1 <= n <= 100000
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class XiaoTuanMysteryCode {
    /**
     * 方法：双指针
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //输入输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        //字符长度
        int n = Integer.parseInt(reader.readLine());
        //字符串
        String T = reader.readLine();

        //左边界
        int left = 0;
        //在T前已经有M
        boolean isM  = false;
        //从前往后
        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            //出现M
            if (c == 'M')
                isM = true;
            //已经出现M，找寻结尾T
            if (isM && c == 'T'){
                left = i+1;
                break;
            }
        }
        //右边界
        int right = 0;
        //在T后有M出现
        boolean isT = false;
        //从后往前
        for (int i = n - 1; i > 0; i--){
            char c = T.charAt(i);
            //出现T
            if (c == 'T')
                isT = true;
            //已经出现T，找寻开头M
            if (isT && c == 'M') {
                right = i;
                break;
            }
        }

        //截取所需部分
        writer.write(T.substring(left,right));

        reader.close();
        writer.close();
    }
}
