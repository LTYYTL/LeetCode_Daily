package com.meituan.L001;

import java.io.*;

/**
 * meituan-001. 小美的用户名
 * 小美是美团的前端工程师，为了防止系统被恶意攻击，小美必须要在用户输入用户名之前做一个合法性检查，一个合法的用户名必须满足以下几个要求：
 *
 * 用户名的首字符必须是大写或者小写字母。
 * 用户名只能包含大小写字母，数字。
 * 用户名需要包含至少一个字母和一个数字。
 * 如果用户名合法，请输出 "Accept"，反之输出 "Wrong"。
 *
 * 格式：
 * 输入：
 * - 输入第一行包含一个正整数 T，表示需要检验的用户名数量。
 * - 接下来有 T 行，每行一个字符串 s，表示输入的用户名。
 * 输出：
 * - 对于每一个输入的用户名 s，请输出一行，即按题目要求输出一个字符串。
 *
 * 示例：
 * 输入：
 *      5
 *      Ooook
 *      Hhhh666
 *      ABCD
 *      Meituan
 *      6666
 * 输出：
 *      Wrong
 *      Accept
 *      Wrong
 *      Wrong
 *      Wrong
 *
 * 提示：
 * 1 <= T <= 100
 * s 的长度不超过 20
 * 请注意，本题需要自行编写「标准输入」和「标准输出」逻辑，以及自行 import/include 需要的 library。了解书写规则
 */
public class XiaomeiUsername {

    /**
     * 方法一：模拟
     * @param s
     * @return
     */
    public static boolean check(String s){
        //记录首字母是否符合规则
        boolean first = false;
        //记录是否出现数字
        boolean num = false;
        //记录是否出现特殊符号
        boolean tage = true;
        //转换成数组
        char[] chars = s.toCharArray();
        //判断首字符
        if (('a'<=chars[0] && chars[0] <= 'z')||('A'<=chars[0] && chars[0] <= 'Z'))
            first = true;
        //首字符不满足，没有必要往下进行
        if (!first)
            return false;
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            //判断是否出现数组
            if ('0'<=c && c <= '9'){
                num = true;
            }else if (!('a'<=c && c <= 'z') && !('A'<=c && c <= 'Z'))//判断是否出现特殊字符
                tage = false;
        }
        return first && num && tage;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());
        while(T-- > 0){
            String s = reader.readLine();
            if(check(s)){
                System.out.println("Accept");
            }else{
                System.out.println("Wrong");
            }
        }

        reader.close();

    }

}
